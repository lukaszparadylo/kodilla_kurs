package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws RouteNotFoundException {

        List<Flight> flightList = new ArrayList();
        for(int i = 0; i<10; i++){
            flightList.add(new Flight("Airport "+i+1, "Arrival air port "+i+1));
        }
        Flight flight = new Flight("www", "aaa");
        FlightLogic flightLogic = new FlightLogic(flightList);
        try{
            System.out.println("The flight is available: "+flightLogic.findFlight(flight));
            //System.out.println("The flight is available: "+flightLogic.findFlight(flightList.get(1)));
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
