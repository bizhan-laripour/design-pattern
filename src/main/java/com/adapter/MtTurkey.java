package com.adapter;

public class MtTurkey implements Turkey{
    @Override
    public void sound() {
        System.out.println("ghod gohd");
    }

    @Override
    public void fly() {
        System.out.println("i cant fly and i am turkey");
    }
}
