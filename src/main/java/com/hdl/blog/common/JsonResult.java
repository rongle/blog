package com.hdl.blog.common;

import java.util.Map;

public class JsonResult<T> {
    private Integer code;
    private String message;
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public JsonResult() {
    }

    public JsonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public JsonResult(ResultStatus resultStatus) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public JsonResult(ResultStatus resultStatus, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public JsonResult<T> success(){
        JsonResult<T> jsonResult = new JsonResult<>();
        jsonResult.setCode(ResultStatus.SUCCESS.getErrorCode());
        jsonResult.setMessage(ResultStatus.SUCCESS.getErrorMsg());
        return jsonResult;
    }

    public JsonResult<T> success(T data){
        JsonResult<T> jsonResult = new JsonResult<>();
        jsonResult.setCode(ResultStatus.SUCCESS.getErrorCode());
        jsonResult.setMessage(ResultStatus.SUCCESS.getErrorMsg());
        jsonResult.setData(data);
        return jsonResult;
    }
}
