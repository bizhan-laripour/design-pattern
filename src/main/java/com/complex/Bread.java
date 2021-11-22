package com.complex;

public class Bread extends ProductDecorator{

    public Bread(Product product){
        this.product = product;
        this.name = "braed";
    }

    @Override
    public String order() {
        return product.order() + " a set of "+this.name + " added";
    }
}
