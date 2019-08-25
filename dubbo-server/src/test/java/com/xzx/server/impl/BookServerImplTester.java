package com.xzx.server.impl;

import com.alibaba.fastjson.JSON;
import com.xzx.api.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServerImplTester extends BaseTest {
    @Autowired
    private BookService bookService;

    @Test
    public void test1(){
        System.out.println(JSON.toJSONString(this.bookService.queryBookList()));
    }
}
