package com.xzx.domain.dto;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDTO implements Serializable{
    private Long bookId;
    private String name;
    private Integer number;
}
