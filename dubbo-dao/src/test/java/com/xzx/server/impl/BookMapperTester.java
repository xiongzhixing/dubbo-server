package com.xzx.server.impl;

import com.alibaba.fastjson.JSON;
import com.xzx.dao.mapper.BookMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BookMapperTester extends BaseTest {
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void test1(){
        System.out.println(JSON.toJSONString(this.bookMapper.searchAll()));
    }
}
