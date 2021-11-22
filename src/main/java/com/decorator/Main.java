package com.decorator;

import com.decorator.classes.*;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Coffe();
        beverage = new Ghand(beverage);
        beverage = new Ghand(beverage);
        beverage = new Shekar(beverage);

        System.out.println(beverage.getDescription() + " "+beverage.cost());
    }
}
