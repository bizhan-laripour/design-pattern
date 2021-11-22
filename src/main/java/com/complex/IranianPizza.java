package com.complex;

public class IranianPizza extends Product{


    public IranianPizza(){
        this.name = "iranian pizza";
    }


    @Override
    public String order() {
        return " the "+ getName() + " ordered";
    }


}
