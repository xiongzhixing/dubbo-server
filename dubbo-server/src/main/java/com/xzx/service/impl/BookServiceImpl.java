package com.xzx.service.impl;

import com.xzx.api.service.BookService;
import com.xzx.common.error.ErrCode;
import com.xzx.dao.domain.BookDO;
import com.xzx.domain.resp.BaseResult;
import com.xzx.domain.resp.BookBo;
import com.xzx.dao.mapper.BookMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service("bookService")
public class BookServiceImpl implements BookService {
    private Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);
    @Autowired
    private BookMapper bookMapper;
    @Override
    public BaseResult<List<BookBo>> queryBookList() {
        BaseResult<List<BookBo>> resp = new BaseResult<>();
        try{
            List<BookDO> bookDOList =  this.bookMapper.searchAll();
            if(bookDOList == null || bookDOList.size() == 0){
                return resp;
            }
            List<BookBo> bookBoList = new ArrayList<>(4);
            bookDOList.stream().filter(Objects::nonNull).forEach(temp -> {
                BookBo bookBo = new BookBo();
                BeanUtils.copyProperties(temp,bookBo);
                bookBoList.add(bookBo);
            });
            resp.setData(bookBoList);
            return resp;
        }catch (Exception e){
            logger.error("BookServiceImpl#queryBookList catch a excepion",e);
            return ErrCode.error(resp,ErrCode.ERR_CATCH_EXCEPTION,e.getMessage(),e);
        }
    }
}
