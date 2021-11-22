package com.complex;

public class Mushroom extends ProductDecorator{

    public Mushroom(Product product){
        this.product = product;
        this.name = "mushroom";
    }

    @Override
    public String order() {
        return product.order()+" one set of "+ getName() +" added";
    }
}
