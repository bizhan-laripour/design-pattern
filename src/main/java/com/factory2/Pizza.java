package com.factory2;

public abstract class Pizza {

    String name;

    public void prepare(){
        System.out.println("i am general and i am in prepare mode");
    }

    public void cut(){
        System.out.println("i am cut method");
    }

    public void bake(){
        System.out.println("i am bake method");
    }

    public void create(){
        prepare();
        cut();
        bake();
    }

    public void setName(String name) {
        this.name = name;
    }
}
