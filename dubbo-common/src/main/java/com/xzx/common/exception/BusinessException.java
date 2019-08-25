package com.xzx.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BusinessException extends Exception{
    /**
     *  返回码
     */
    private String errCode ;
    /**
     * 异常对应的描述信息
     */
    private String messsage;


}
