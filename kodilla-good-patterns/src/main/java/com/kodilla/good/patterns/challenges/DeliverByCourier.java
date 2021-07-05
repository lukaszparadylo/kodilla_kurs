package com.kodilla.good.patterns.challenges;

public class DeliverByCourier implements DeliveryService{

    @Override
    public void deliverProducts() {
        System.out.println("Your Order will be deliver by Courier");
    }
}
