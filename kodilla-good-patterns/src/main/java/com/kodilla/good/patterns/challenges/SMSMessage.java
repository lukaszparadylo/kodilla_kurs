package com.kodilla.good.patterns.challenges;

public class SMSMessage implements MessageSender{
    @Override
    public void sendMessage() {
        System.out.println("SMS message hat been send");
    }
}
