package com.adapter;

public class MalaredDuck implements Duck{
    @Override
    public void quake() {
        System.out.println("quake");
    }

    @Override
    public void fly() {
        System.out.println("i am duck and i can fly");
    }
}
