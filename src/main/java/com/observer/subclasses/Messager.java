package com.observer.subclasses;

import com.observer.interfaces.Observer;
import com.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class Messager implements Subject {

    private String message;

    private List<Observer> observerList;

    @Override
    public void addObserver(Observer observer) {
        observerList = new ArrayList<>();
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }

    @Override
    public void setString(String message) {
        this.message = message;
        notifyObservers();
    }
}
