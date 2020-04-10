package com.mufeng.exception;

import java.io.Serializable;

/**
 * @description:
 * @author: mufeng
 * @create: 2020/4/8 11:13
 */
public class ResErr implements Serializable {
    private static final long serialVersionUID= 1L;
    private int errCode;
    private String errMsg;

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
