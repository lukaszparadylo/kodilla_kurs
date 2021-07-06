package com.kodilla.good.patterns.challenges.foodToDoor;

import com.kodilla.good.patterns.challenges.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductsListGenerator {
    Map<Product, Integer> productsList;

    public ProductsListGenerator(Integer amount) {
        productsList = new HashMap<>();
        for(int i = 0; i<amount; i++){
            productsList.put(new Product((double) (i+1), "Product "+i+1, "Good product "+1),i+10);
        }
    }
    public Map<Product, Integer> getProductsList() {
        return productsList;
    }
}
