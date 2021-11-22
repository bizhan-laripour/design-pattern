package com.decorator.classes;

public class Shekar extends MyDecorator{

    public Shekar(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 100;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "+ shekar";
    }
}
