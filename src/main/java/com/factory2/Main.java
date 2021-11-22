package com.factory2;

public class Main {

    public static void main(String[] args) {
        AbstractFactory pizzaStore = new IranianPizzaFactory();

        pizzaStore.createPizza("iranian").create();

    }
}
