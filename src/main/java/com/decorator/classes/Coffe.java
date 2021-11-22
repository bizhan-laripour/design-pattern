package com.decorator.classes;

public class Coffe extends Beverage{

    public Coffe(){
        description = "this is coffe";
    }

    @Override
    public double cost() {
        return 5000;
    }
}
