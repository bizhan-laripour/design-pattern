package com.decorator2;

public class FaceBook extends PlatformDecorator{

    public FaceBook(PlatForm platForm){
        this.platForm = platForm;
        this.address = "http://facebook.com";
        this.message = platForm.getMessage();
    }

    @Override
    public String sendMessage() {
        return platForm.sendMessage()+ " \n"+ "the content "+platForm.getMessage() +" sent to "+this.getAddress();
    }
}
