package com.trytecom.bir.recovery.entidade;

public class ResponseJson {
    private int code;
    private String error;
    private Object data;

    public static ResponseJson error(String message){
        ResponseJson response = new ResponseJson();
        response.setError(message);
        response.setCode(2);
        return response;
    }

    public static ResponseJson error(int code, String message){
        ResponseJson response = new ResponseJson();
        response.setError(message);
        response.setCode(code);
        return response;
    }

    public static ResponseJson ok(Object data){
        ResponseJson response = new ResponseJson();
        response.setData(data);
        return response;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
