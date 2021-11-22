package com.decorator2;


public class WhatsApp extends PlatformDecorator {

    public WhatsApp(PlatForm platForm){
        this.platForm = platForm;
        this.address = "http://whatsapp.com";
        this.message = platForm.getMessage();
    }

    @Override
    public String sendMessage() {
        return platForm.sendMessage() + "\n " + "the content :"+ platForm.getMessage() + " sent to :"+this.getAddress();
    }


}
