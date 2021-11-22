package com.template;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Shekar extends MyDecorator{



    public Shekar(Drinking drinking){
        this.drinking = drinking;
    }

    @Override
    public void addDrinking() {

    }

    @Override
    public void addCondinent() {

    }
}
