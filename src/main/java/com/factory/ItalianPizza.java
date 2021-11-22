package com.factory;

public class ItalianPizza extends Product{


    public ItalianPizza(){
        this.name = "italian pizza";
        this.description = bake()+ cut()+ deliver();
    }

    @Override
    public double cost() {
        return 50000;
    }

}
