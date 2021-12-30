package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
//
public class Main {
    public static void main(String[] args) {
        AirPorts airPorts = new AirPorts();
        airPorts.addAirportAndFlights("GDANSK",new ListOfFlights().generateFlights(100));
        airPorts.addAirportAndFlights("WARSZAWA",new ListOfFlights().generateFlights(200));
        airPorts.addAirportAndFlights("KRAKOW",new ListOfFlights().generateFlights(100));
        airPorts.addAirportAndFlights("WROCLAW",new ListOfFlights().generateFlights(50));
        airPorts.addAirportAndFlights("BERLIN",new ListOfFlights().generateFlights(300));
        airPorts.addAirportAndFlights("LONDYN",new ListOfFlights().generateFlights(300));
        airPorts.addAirportAndFlights("NEW YORK",new ListOfFlights().generateFlights(300));
        List<String> flightsListFromChosenAirport = airPorts.findAllFlightsFromChosenAirport("GDANSK");
        FlightMonitor.showFlights(flightsListFromChosenAirport);
        List<String> listOfFlyFromAirportToAirport = airPorts.findAllFlightsFromChosenAirportToChosenAirport("BERLIN", "WARSZAWA");
        FlightMonitor.showFlights(listOfFlyFromAirportToAirport);
        List<String>listOfFlightFromChosenCityThroughAnotherCityToChosenCity = airPorts.findAllFlightFromChosenCityThroughAnotherCityToChosenCity("WARSZAWA", "KRAKOW");
        FlightMonitor.showFlights(listOfFlightFromChosenCityThroughAnotherCityToChosenCity);
    }
}
