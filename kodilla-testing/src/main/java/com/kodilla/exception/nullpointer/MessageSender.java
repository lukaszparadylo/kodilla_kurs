package com.kodilla.exception.nullpointer;

public class MessageSender {

    public void sendMessageTo(User user, String message) throughs MessageNotSentException {
        if (user != null) {
            System.out.println("Sending message: " + message + " to: " + user.getName());
        }else {
            through new MessageNotSentException("Object User was null");
        }
    }
}
