package com.kodilla.good.patterns.challenges;

public class EmailMessage implements MessageSender {

    @Override
    public void sendMessage() {
        System.out.println("Email hat been send");
    }
}
