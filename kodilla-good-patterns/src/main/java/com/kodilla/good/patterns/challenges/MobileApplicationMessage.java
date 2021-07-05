package com.kodilla.good.patterns.challenges;

public class MobileApplicationMessage  implements MessageSender{
    @Override
    public void sendMessage() {
        System.out.println("Message hat been send to your mobile application");
    }
}
