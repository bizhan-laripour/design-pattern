package com.decorator2;

public class Main {

    public static void main(String[] args) {
        PlatForm platForm = new Email("i am decorator");
        platForm = new FaceBook(platForm);
        platForm = new FaceBook(platForm);
        platForm = new WhatsApp(platForm);
        platForm = new FaceBook(platForm);
        platForm = new WhatsApp(platForm);
        System.out.println(platForm.sendMessage());

    }
}
