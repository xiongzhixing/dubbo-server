package com.xzx.dao.mapper;

import com.xzx.dao.domain.BookDO;
import java.util.List;

public interface BookMapper {

    List<BookDO> searchAll();
}