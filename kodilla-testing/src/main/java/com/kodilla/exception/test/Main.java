package com.kodilla.exception.test;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws RouteNotFoundException {

        List<Flight> flightList = new ArrayList();
        for(int i = 0; i<10; i++){
            flightList.add(new Flight("Airport "+i+1, "Arrival air port "+i+1));
        }
        FlightLogic flightLogic = new FlightLogic(flightList);
        try{
            System.out.println("The flight is available: "+flightLogic.findFlight("flight"));
            //System.out.println("The flight is available: "+flightLogic.findFlight(flightList.get(1)));
        }catch (RouteNotFoundException e){
            System.out.println(e);
        }
    }
}
