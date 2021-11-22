package com.observer2;

public interface Subject {

    public void addObserver(Observer observer);

    public void deleteObserver(Observer observer);

    void notifyObservers();

    void setString(String message);
}
