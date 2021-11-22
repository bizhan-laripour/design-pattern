package com.complex;

import java.util.List;

public class IranianPizzaStore extends AbstractFactory{

    public IranianPizzaStore(List<ProductEnum> names){
        this.names = names;
    }



    @Override
    public Product getProduct() {
        product = new IranianPizza();
        for(ProductEnum productEnum : names){
            if(productEnum.name().equals(ProductEnum.BREAD.name())){
                product = new Bread(product);
            }else if(productEnum.name().equals(ProductEnum.MUSHROOM.name())){
                product = new Mushroom(product);
            }
        }

        return product;
    }
}
