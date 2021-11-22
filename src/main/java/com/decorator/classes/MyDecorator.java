package com.decorator.classes;

public abstract class MyDecorator extends Beverage{

    protected Beverage beverage;

    public abstract String getDescription();
}
