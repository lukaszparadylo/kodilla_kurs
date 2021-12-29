package com.kodilla.good.patterns.challenges.foodToDoor;

import com.kodilla.good.patterns.challenges.Product;

import java.util.HashMap;
import java.util.Map;

public class Food2Door {
    public static void main(String[] args) {

        Map<Product, Integer> productsList = new HashMap<>();
        productsList.put(new Product(12.0,"Product 1","Product 1 description"),2);
        productsList.put(new Product(11.0,"Product 2","Product 2 description"),2);
        productsList.put(new Product(10.0,"Product 3","Product 3 description"),2);

        ExtraFoodShop extraFoodShop = new ExtraFoodShop("Extra food", "Extra food address");
        extraFoodShop.setProductsList(new ProductsListGenerator(100).getProductsList());
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("Gluten free", "Gluten free address");
        glutenFreeShop.setProductsList(new ProductsListGenerator(200).getProductsList());
        HealthyShop healthyShop = new HealthyShop("Healthy shop", "Healthy shop address");
        healthyShop.setProductsList(productsList);

        ShoppingProcessor shoppingProcessor = extraFoodShop;
        System.out.println(shoppingProcessor.companyInfo());
        shoppingProcessor.productInfo().entrySet()
                .stream().map(n->"Product name: "+n.getKey().getProductName() +" amount "+ n.getValue() )
                .forEach(System.out::println);
        boolean orderCompleted = shoppingProcessor.process("Product 51", 2);
        System.out.println("Order Completed "+orderCompleted);
    }
}
