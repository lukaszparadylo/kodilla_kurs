package com.kodilla.good.patterns.challenges.foodToDoor;

import com.kodilla.good.patterns.challenges.Product;

import java.util.Map;

public interface ShoppingProcessor {
    boolean process(String productName, Integer amount);
    String companyInfo();
    Map<Product,Integer> productInfo();
}
