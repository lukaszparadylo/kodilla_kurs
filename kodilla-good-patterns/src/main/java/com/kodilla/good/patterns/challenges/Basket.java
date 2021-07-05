package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<Product, Integer> listOfTheProducts;

    public Basket() {
        this.listOfTheProducts = new HashMap<>();
    }

    public void addToBasket(Product product, Integer amount){
        this.listOfTheProducts.put(product, amount);
    }
    public void showBasket(){
        System.out.println("---Your basket---");
        for(Map.Entry<Product, Integer> i : listOfTheProducts.entrySet()){
            System.out.println(i.getKey().getProductName()+" "+i.getKey().getProductPrice()+ " "+ i.getValue());
        }
    }
    public Double getBasketValue(){
        return new OrderCalculator().calculateOrder(this.listOfTheProducts);
    }
}
