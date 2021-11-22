package com.factory;

public class Cheess extends ProductDecorator {

    public Cheess(Product product) {
        this.product = product;
        this.name = "cheess";
        this.description = product.getDescription() + " and one set of "+ name+ " is added";;
    }

    @Override
    public double cost() {
        return product.cost() + 8000;
    }

}
