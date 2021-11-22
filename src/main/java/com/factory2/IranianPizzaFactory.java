package com.factory2;

public class IranianPizzaFactory extends AbstractFactory{


    @Override
    public Pizza createPizza(String name) {
        if(name.equals("iranian")){
            pizza = new IranianPizza();
        }
        return pizza;
    }
}
