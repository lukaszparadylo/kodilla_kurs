package com.kodilla.good.patterns.challenges;

import java.util.Random;

public class Product {
    private Integer productId;
    private Double productPrice;
    private String productName;
    private String productDescription;

    public Product(Double productPrice, String productName, String productDescription) {
        Random random = new Random();
        this.productId = random.nextInt();
        this.productPrice = productPrice;
        this.productName = productName;
        this.productDescription = productDescription;
    }

    public Integer getProductId() {
        return productId;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }
}
