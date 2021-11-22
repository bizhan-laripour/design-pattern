package com.observer2;

public class MyObserver implements Observer, Display {

    private String message;

    public MyObserver(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(message);
    }

    @Override
    public void update(String message) {
        this.message = message;
        display();
    }
}
