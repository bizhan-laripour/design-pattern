package com.template;

public abstract class Drinking {

    public final void prepare(){
        boilWater();
        addDrinking();
        pureCup();
        addCondinent();
    }

    public void boilWater(){
        System.out.println("boil water");
    }

    public void pureCup(){
        System.out.println("pure cup");
    }

    public abstract void addDrinking();

    public abstract void addCondinent();
}
