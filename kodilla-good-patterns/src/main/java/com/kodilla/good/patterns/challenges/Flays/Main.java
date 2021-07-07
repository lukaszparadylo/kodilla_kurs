package com.kodilla.good.patterns.challenges.Flays;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AirPorts airPorts = new AirPorts();
        airPorts.addAirportAndFlays("GDANSK",new ListOfFlays().generateFlays(100));
        List<String> flayList = airPorts.findAllFlaysFromChosenAirport("GDANSK");
        for (String i : flayList){
            System.out.println(i);
        }
    }
}
