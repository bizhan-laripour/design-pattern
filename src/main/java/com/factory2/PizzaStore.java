package com.factory2;

public class PizzaStore {

    private Pizza pizza;

    public Pizza createPizza(String name){

        if(name.equals("iranian")){
            pizza = new IranianPizza();
        }else if(name.equals("italian")){
            pizza = new ItalianPizza();
        }
        return pizza;
    }

}
