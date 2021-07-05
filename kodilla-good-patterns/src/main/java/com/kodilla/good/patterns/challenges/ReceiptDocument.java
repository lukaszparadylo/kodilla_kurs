package com.kodilla.good.patterns.challenges;

public class ReceiptDocument implements DocumentsSender{

    @Override
    public void sendDocument() {
        System.out.println("Receipt has been issued");
    }
}
