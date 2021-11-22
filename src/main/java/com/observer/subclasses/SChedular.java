package com.observer.subclasses;

import com.observer.interfaces.Observer;
import com.observer.interfaces.Subject;

import java.util.TimerTask;

public class SChedular extends TimerTask {

    private Observer observer;

    private Subject subject;

    public SChedular(){
        subject = new Messager();
        observer = new MyObserver(subject);
    }

    @Override
    public void run() {
        subject.setString(randomString(20));
    }




    private String randomString(int length){
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }
}
