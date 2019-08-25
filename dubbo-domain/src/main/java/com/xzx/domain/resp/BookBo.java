package com.xzx.domain.resp;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookBo implements Serializable {
    private Long bookId;
    private String name;
    private Integer number;
}
