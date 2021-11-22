package com.decorator.classes;

public class Ghand  extends MyDecorator{

    public Ghand(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 200;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + ghand";
    }
}
