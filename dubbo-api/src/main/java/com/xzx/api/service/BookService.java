package com.xzx.api.service;

import com.xzx.domain.resp.BaseResult;
import com.xzx.domain.resp.BookBo;

import java.util.List;

public interface BookService {
    /**
     * 查询列表
     * @return
     */
    BaseResult<List<BookBo>> queryBookList();
}
