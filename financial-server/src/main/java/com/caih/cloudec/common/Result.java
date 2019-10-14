package com.caih.cloudec.common;

import java.io.Serializable;

/**
 * 操作结果集
 */
public class Result implements Serializable {

    public static final String SUCCESS = "0000";
    public static final String FAILURE = "-1";

    private static final long serialVersionUID = 5576237395711742681L;

    private boolean success = false;

    private String code = "";

    private String codeMsg ="";

    private Object obj = null;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeMsg() {
        return codeMsg;
    }

    public void setCodeMsg(String codeMsg) {
        this.codeMsg = codeMsg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

}
