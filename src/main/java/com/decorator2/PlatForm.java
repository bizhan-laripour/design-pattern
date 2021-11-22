package com.decorator2;

public abstract class PlatForm {

    protected String message;

    protected String address;

    public abstract String sendMessage();

    public String getMessage() {
        return message;
    }

    public String getAddress() {
        return address;
    }
}
