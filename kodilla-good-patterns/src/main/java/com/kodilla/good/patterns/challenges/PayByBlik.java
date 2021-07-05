package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class PayByBlik implements PayOutOrder{
    public static final boolean PAY_OUT = true;
    Map<Client,ProductOrderService> orderToPayOut;

    public PayByBlik() {
        this.orderToPayOut = new HashMap<>();
    }

    @Override
    public boolean payOutOrder(Client client, Basket basket) {
        basket.showBasket();
        System.out.println("Basket value is: "+ basket.getBasketValue());
        System.out.println("Pleas pay out the order");
        System.out.println("Blik Connection...");
        if(PAY_OUT == true){

            System.out.println("Transaction success!");
            return true;
        }else {
            System.out.println("First pay out the order");
            System.out.println("Transaction Filed!");
            return false;
        }
    }

}
