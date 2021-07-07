package com.kodilla.good.patterns.challenges.Flays;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AirPorts {
    private Map<String, Map<Flay, LocalDateTime>> airportsNameAndFlays;

    public AirPorts() {
        this.airportsNameAndFlays = new HashMap<>();
    }

    public void addAirportAndFlays(String airportName, Map<Flay, LocalDateTime> flays){
        this.airportsNameAndFlays.put(airportName, flays);
    }

    public List<String> findAllFlaysFromChosenAirport(String airportName){

        List<String> noElements = new LinkedList<>();
        if(this.airportsNameAndFlays.containsKey(airportName)){
            List<String> listOfFlays = this.airportsNameAndFlays.entrySet().stream()
                    .flatMap(n->n.getValue().entrySet().stream())
                    .map(m->"Flay to: "+m.getKey().destination+" Date: "+m.getValue().toString()+" Fly time: " + m.getKey().flyTime.toString()+ " minutes")
                    .collect(Collectors.toList());
            return listOfFlays;
        }else {
            noElements.add("There is no element, wrong name of airport");
            return noElements;
        }
    }
}
