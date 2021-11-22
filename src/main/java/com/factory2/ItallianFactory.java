package com.factory2;

public class ItallianFactory extends AbstractFactory{

    @Override
    public Pizza createPizza(String name) {
        if(name.equals("italian")){
            this.pizza = new ItalianPizza();
        }
        return pizza;
    }
}
