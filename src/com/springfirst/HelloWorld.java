package com.springfirst;

public class HelloWorld {
    private String message;
    public void setMessage(String msg) {
        this.message = msg;
    }
    public String getMessage() {
        System.out.println("message:" + this.message);
        return this.message;
    }

}
