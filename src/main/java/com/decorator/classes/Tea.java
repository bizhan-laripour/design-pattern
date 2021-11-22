package com.decorator.classes;

public class Tea extends Beverage{


    public Tea(){
        description = "this is tea description";
    }

    @Override
    public double cost() {
        return 2000;
    }
}
