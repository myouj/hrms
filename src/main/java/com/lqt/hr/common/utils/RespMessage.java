package com.lqt.hr.common.utils;

public class RespMessage {

    private Integer code;
    private String message;
    private Object data;

    public static RespMessage SUCCESS = new RespMessage(200, null, null);

    public static RespMessage fail(String message){
        return new RespMessage(500, message, null);
    }

    public static RespMessage success(Integer code, String message, Object data){
        return new RespMessage(code, message, data);
    }

    public static RespMessage success(Integer code, Object data){
        return new RespMessage(code, null, data);
    }

    public static RespMessage success(String message, Object data){
        return new RespMessage(200, message, data);
    }

    public static RespMessage success(Object data){
        return new RespMessage(200, null, data);
    }

    public RespMessage(Integer code, String message, Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
