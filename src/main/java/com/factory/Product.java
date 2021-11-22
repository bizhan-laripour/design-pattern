package com.factory;

public abstract class Product {

    protected String name;

    protected String description;


    public abstract double cost();


    public String getDescription(){
        return description;
    }

    public void prepare(){
        System.out.println(getDescription()+"\n");
        System.out.println("-------------------------------------------------------------");
    }

    public String bake(){
        return "the "+name +" is in bake process | \n";
    }

    public String cut(){
        return "the " + name + " is cutting now | \n";
    }

    public String deliver(){
        return  "the  " + name + " is delivered to the deliverer | \n";
    }




}
