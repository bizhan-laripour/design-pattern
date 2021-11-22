package com.complex;

import java.util.List;

public abstract class AbstractFactory{

    protected Product product;
    protected List<ProductEnum> names;

    public String order(){
        product = getProduct();
       return product.order();
    }

    public abstract Product getProduct();
}
