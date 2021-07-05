package com.kodilla.good.patterns.challenges;

public class DeliverToDesiredPostOffice implements DeliveryService{

    @Override
    public void deliverProducts() {
        System.out.println("The order wil be deliver to the desired post office");
    }
}
