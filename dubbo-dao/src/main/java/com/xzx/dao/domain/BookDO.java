package com.xzx.dao.domain;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDO implements Serializable{
    private Long bookId;
    private String name;
    private Integer number;
}