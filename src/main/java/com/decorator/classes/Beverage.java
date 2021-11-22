package com.decorator.classes;

public abstract class Beverage {

    protected String description;


    public abstract double cost();


    public String getDescription() {
        return description;
    }
}
