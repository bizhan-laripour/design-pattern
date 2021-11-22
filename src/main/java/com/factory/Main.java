package com.factory;

public class Main {

    public static void main(String[] args) {
        Product product = new IranianPizza();
        product = new Mushroom(product);
        product = new Bread(product);
        product.prepare();
    }
}
