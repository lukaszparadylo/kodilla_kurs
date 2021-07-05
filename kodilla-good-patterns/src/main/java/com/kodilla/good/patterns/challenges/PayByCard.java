package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class PayByCard implements PayOutOrder{
    public static final boolean PAY_OUT = true;
    Map<Client,ProductOrderService> orderToPayOut;

    public PayByCard() {
        this.orderToPayOut = new HashMap<>();
    }


    @Override
    public boolean payOutOrder(Client client, Basket basket) {
        System.out.println("Pleas pay out the order");
        System.out.println("Bank Connection...");
        if(PAY_OUT == true){
            basket.showBasket();
            System.out.println("Transaction by card success!");
            return true;
        }else {
            System.out.println("First pay out the order");
            System.out.println("Transaction by card Filed!");
            return false;
        }
    }
}
