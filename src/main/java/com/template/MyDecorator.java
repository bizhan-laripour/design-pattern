package com.template;

public abstract class MyDecorator extends Drinking {

    protected Drinking drinking;

    public abstract void addDrinking();


    public abstract void addCondinent();
}
