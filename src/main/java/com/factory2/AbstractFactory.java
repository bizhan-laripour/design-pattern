package com.factory2;

public abstract class AbstractFactory {

    protected Pizza pizza;



    public abstract Pizza createPizza(String name);
}
