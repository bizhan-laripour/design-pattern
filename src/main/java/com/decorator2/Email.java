package com.decorator2;

public class Email extends PlatForm{

    public Email(String message){
        this.address = "http://gmail.com";
        this.message = message;
    }

    @Override
    public String sendMessage() {
        return "sending email to the email:"+getAddress() + "with content :" + getMessage();
    }
}
