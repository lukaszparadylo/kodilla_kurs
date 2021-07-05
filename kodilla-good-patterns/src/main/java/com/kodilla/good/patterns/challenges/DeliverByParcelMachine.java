package com.kodilla.good.patterns.challenges;

public class DeliverByParcelMachine implements DeliveryService{

    @Override
    public void deliverProducts() {
        System.out.println("Your Order will be deliver to the parcel machine");
    }
}
