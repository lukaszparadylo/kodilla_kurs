package com.kodilla.good.patterns.challenges;

public class InvoiceDocument implements DocumentsSender{
    @Override
    public void sendDocument() {
        System.out.println("Invoice had been deliver");
    }
}
