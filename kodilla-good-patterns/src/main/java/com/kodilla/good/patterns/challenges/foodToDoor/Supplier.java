package com.kodilla.good.patterns.challenges.foodToDoor;

import com.kodilla.good.patterns.challenges.Product;

import java.util.HashMap;
import java.util.Map;

public class Supplier implements ShoppingProcessor{
    protected Map<Product, Integer>productsList;
    protected String supplierAddress;
    protected String shopName;

    public Supplier() {
        productsList = new HashMap<>();
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public String getShopName() {
        return shopName;
    }
    public Map<Product, Integer> getProductsList() {
        return productsList;
    }
    public void setProductsList(Map<Product, Integer> productsList) {
        this.productsList = productsList;
    }
    @Override
    public boolean process(String product, Integer amount) {
        System.out.println("Shop name: "+getShopName());
        for (Map.Entry<Product, Integer> i : this.productsList.entrySet()){
            if(i.getKey().getProductName()==product){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    @Override
    public String companyInfo() {
        return this.shopName + " " + this.supplierAddress;
    }
    @Override
    public Map<Product, Integer> productInfo() {
        return this.productsList;
    }
}
