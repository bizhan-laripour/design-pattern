package com.factory;

public class Mushroom extends ProductDecorator{

    public Mushroom(Product product){
        this.name = "mushroom";
        this.product = product;
        this.description = product.getDescription() + " and one set of "+ name + " added";

    }
    @Override
    public double cost() {
        return product.cost() + 4000;
    }


}
