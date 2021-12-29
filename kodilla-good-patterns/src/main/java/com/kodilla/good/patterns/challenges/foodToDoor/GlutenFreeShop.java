package com.kodilla.good.patterns.challenges.foodToDoor;

import com.kodilla.good.patterns.challenges.Product;

import java.util.Map;

public class GlutenFreeShop extends Supplier{
    public GlutenFreeShop(String name, String address) {
        super(name,address);
    }
    @Override
    public void setProductsList(Map<Product, Integer> productsList) {
        super.setProductsList(productsList);
    }
    @Override
    public boolean process(String product, Integer amount) {
        return super.process(product, amount);
    }

    @Override
    public String companyInfo() {
        return super.companyInfo();
    }

    @Override
    public Map<Product, Integer> productInfo() {
        return super.productInfo();
    }
}
