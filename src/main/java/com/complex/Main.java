package com.complex;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ProductEnum> productEnums = new ArrayList<>();
        productEnums.add(ProductEnum.BREAD);
        productEnums.add(ProductEnum.MUSHROOM);
        AbstractFactory product = new IranianPizzaStore(productEnums);
        System.out.println(product.order());

    }
}
