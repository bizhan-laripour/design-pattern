package com.observer2;

public class Main {

    public static void main(String[] args) {
        Subject subject = new MySubject();
        Observer observer = new MyObserver(subject);
        subject.setString("hello observer");
    }
}
