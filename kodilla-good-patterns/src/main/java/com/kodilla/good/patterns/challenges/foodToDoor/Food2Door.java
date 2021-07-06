package com.kodilla.good.patterns.challenges.foodToDoor;

import com.kodilla.good.patterns.challenges.Product;

import java.util.Map;

public class Food2Door {
    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.setProductsList(new ProductsListGenerator(100).getProductsList());
        extraFoodShop.setShopName("Extra food");
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        glutenFreeShop.setProductsList(new ProductsListGenerator(200).getProductsList());
        glutenFreeShop.setShopName("Gluten Free");
        HealthyShop healthyShop = new HealthyShop();
        healthyShop.setProductsList(new ProductsListGenerator(300).getProductsList());
        healthyShop.setShopName("Healthy shop");

        ShoppingProcessor shoppingProcessor = glutenFreeShop;
        System.out.println(shoppingProcessor.companyInfo());
        shoppingProcessor.productInfo().entrySet()
                .stream().map(n->"Product name: "+n.getKey().getProductName() +" amount "+ n.getValue() )
                .forEach(System.out::println);
        boolean orderCompleted = shoppingProcessor.process("Product 31", 2);
        System.out.println("Order Completed "+orderCompleted);
    }
}
