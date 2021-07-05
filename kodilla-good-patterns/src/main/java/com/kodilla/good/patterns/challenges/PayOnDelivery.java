package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class PayOnDelivery implements PayOutOrder{
    public static final boolean PAY_OUT = true;
    Map<Client,ProductOrderService> orderToPayOut;

    public PayOnDelivery() {
        this.orderToPayOut = new HashMap<>();
    }

    @Override
    public boolean payOutOrder(Client client, Basket basket) {
        System.out.println("Pleas pay the order on delivery");
        return true;
    }
}
