package com.factory;

public class IranianPizza extends Product{


    public IranianPizza(){
        this.name = "iranian pizza";
        this.description = bake()+ cut()+ deliver();

    }

    @Override
    public double cost() {
        return 25000;
    }


}
