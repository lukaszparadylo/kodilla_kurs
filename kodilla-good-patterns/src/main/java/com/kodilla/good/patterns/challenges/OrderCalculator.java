package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class OrderCalculator {

    public Double calculateOrder(Map<Product, Integer> productList){
        Double totalPrice = 0.0;
        for(Map.Entry<Product, Integer> i : productList.entrySet()){
            totalPrice += i.getKey().getProductPrice()*i.getValue();
        }
        return totalPrice;
    }
}
