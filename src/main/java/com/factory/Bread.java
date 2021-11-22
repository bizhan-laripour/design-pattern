package com.factory;

public class Bread extends ProductDecorator{


    public Bread(Product product){
        this.product = product;
        this.name = "bread";
        this.description = product.getDescription() + " and one "+ name +" added";

    }

    @Override
    public double cost() {
        return product.cost() + 2000;
    }


}
