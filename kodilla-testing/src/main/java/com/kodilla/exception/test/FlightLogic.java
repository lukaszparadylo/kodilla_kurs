package com.kodilla.exception.test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightLogic {

    Map<String, Boolean> airportAllowed;

    public FlightLogic(List<Flight> flightList) {
        airportAllowed = new HashMap<>();
        for (Flight i : flightList){
            this.airportAllowed.put(i.getArrivalAirport(), true);
        }
    }
    public Boolean findFlight(String airportName) throws RouteNotFoundException{
        Boolean flyOrNot = false;

        if(this.airportAllowed.containsKey(airportName)){
            flyOrNot = this.airportAllowed.containsKey(airportName);
        }
        if(flyOrNot == false){
            throw new RouteNotFoundException("There is no flight to "+airportName+" ");
        }
        return flyOrNot;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightLogic that = (FlightLogic) o;

        return airportAllowed.equals(that.airportAllowed);
    }
    @Override
    public int hashCode() {
        return airportAllowed.hashCode();
    }
}
