package com.template;

public class Tea extends Drinking{



    @Override
    public void addDrinking() {
        System.out.println("add coffee");
    }

    @Override
    public void addCondinent() {
        System.out.println("add lemon");
    }
}
