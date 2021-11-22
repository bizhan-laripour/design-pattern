package com.observer2;

import java.util.ArrayList;
import java.util.List;

public class MySubject implements Subject{

    protected String message;

    protected List<Observer> observers;

    public MySubject(){
        observers = new ArrayList<>();
    }


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this.message);
        }
    }

    @Override
    public void setString(String message) {
        this.message = message;
        notifyObservers();
    }
}
