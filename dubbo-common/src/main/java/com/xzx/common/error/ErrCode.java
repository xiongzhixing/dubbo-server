package com.xzx.common.error;

import com.xzx.domain.resp.BaseResult;

/**
 * 全局错误码
 */
public class ErrCode {
    public final static int ERR_PARAM_INVALID = 301;
    public final static int ERR_BIZ_DATA_EXCEPTION = 401;
    public final static int ERR_RPC_INVOKE_FAIL = 402;
    public final static int ERR_CATCH_EXCEPTION = 403;

    public static <T extends BaseResult> T error(T resp, long errCode, String errMessage,Exception e){
        resp.setErrCode(errCode);
        resp.setErrMes(errMessage);
        resp.setE(e);
        return resp;
    }



}
