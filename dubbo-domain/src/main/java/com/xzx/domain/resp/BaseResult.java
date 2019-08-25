package com.xzx.domain.resp;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class BaseResult<T> implements Serializable {
    private long errCode;
    private String errMes;
    private T data;
    private Exception e;
}
