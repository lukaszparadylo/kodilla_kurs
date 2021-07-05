package com.kodilla.good.patterns.challenges;

import java.util.Random;

public class Client {
    private Integer clientId;
    private String clientName;
    private String clientSurname;
    private Integer numberOfStars;
    private String clientAddress;


    public Client(String clientName, String clientSurname, Integer numberOfStars, String clientAddress) {
        Random random = new Random();
        this.clientId = random.nextInt(10000);
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.numberOfStars = numberOfStars;
        this.clientAddress = clientAddress;
    }

    public Integer getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public Integer getNumberOfStars() {
        return numberOfStars;
    }

    public String getClientAddress() {
        return clientAddress;
    }
}
