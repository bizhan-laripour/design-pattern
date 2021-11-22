package com.adapter;

public class Main {

    public static void main(String[] args) {
        Duck duck = new MalaredDuck();
//        duck.fly();
//        duck.quake();

        Turkey turkey = new MtTurkey();
//        turkey.fly();
//        turkey.sound();

        Duck d = new TurkeyAdapter(turkey);
        d.quake();
        d.fly();
    }
}
