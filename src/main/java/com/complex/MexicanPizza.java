package com.complex;

public class MexicanPizza extends Product{

    public MexicanPizza(){
        this.name = "mexican pizza";
    }

    @Override
    public String order() {
        return "the "+this.name + " ordered";
    }
}
