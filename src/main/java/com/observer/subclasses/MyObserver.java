package com.observer.subclasses;

import com.observer.interfaces.Display;
import com.observer.interfaces.Observer;
import com.observer.interfaces.Subject;

public class MyObserver implements Observer , Display  {
    private String message;
    public MyObserver(Subject subject){
        subject.addObserver(this);
    }


    @Override
    public void update(String message) {
        this.message = message;
        display();
    }

    @Override
    public void display() {
        System.out.println(message);
    }
}
