package com.complex;

public class ItalianPizza extends Product{


    public ItalianPizza(){
        this.name = "italian pizza";
    }

    @Override
    public String order() {
        return "the "+this.name +" ordered";
    }
}
