package com.observer.interfaces;

public interface Subject {

    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers();

    void setString(String message);
}
