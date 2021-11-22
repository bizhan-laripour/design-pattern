package com.observer;

import com.observer.subclasses.SChedular;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer();
        SChedular sChedular = new SChedular();
        timer.schedule(sChedular , 0 , 2000);
    }
}
