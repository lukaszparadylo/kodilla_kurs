package com.kodilla.good.patterns.challenges.flights;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class AirPorts {
    private Map<String, Map<Fly, LocalDateTime>> airportsNameAndFlights;

    public AirPorts() {
        this.airportsNameAndFlights = new HashMap<>();
    }

    public void addAirportAndFlights(String airportName, Map<Fly, LocalDateTime> Flights){
        Flights = Flights.entrySet().stream()
                .filter(n->n.getKey().destination!=airportName)
                .collect(Collectors.toMap(m->m.getKey(),m->m.getValue()));
        this.airportsNameAndFlights.put(airportName, Flights);
    }

    public List<String> findAllFlightsFromChosenAirport(String airportName){
        List<String> listOfFlights = this.airportsNameAndFlights.entrySet().stream()
                .filter(j->j.getKey()==airportName)
                .flatMap(n->n.getValue().entrySet().stream())
                .filter(m->m.getKey().destination!=airportName)
                .map(m->"Fly to: "+m.getKey().destination+" Date: "+m.getValue().toString()+" Fly time: " + m.getKey().flyTime.toString()+ " minutes")
                .collect(Collectors.toList());
            return listOfFlights;
    }

    public List<String> findAllFlightsFromChosenAirportToChosenAirport(String startAirport, String endAirport){
        List<String> listOfFlights = this.airportsNameAndFlights.entrySet().stream()
                .filter(i->i.getKey()==startAirport)
                .flatMap(j->j.getValue().entrySet().stream())
                .filter(n->n.getKey().destination==endAirport)
                .map(m->"Fly from "+startAirport+" to "+endAirport+" is: "+m.getKey().destination+" Date "+m.getValue()+" Fly time "+m.getKey().flyTime.toString())
                .collect(Collectors.toList());
        return listOfFlights;
    }

    public List<String> findAllFlightFromChosenCityTrowAnotherCityToChosenCity(String startAirport, String endAirport){
        List<String> listOfFlights = this.airportsNameAndFlights.entrySet().stream()
                .filter(i->i.getKey()==startAirport)
                .flatMap(j->j.getValue().entrySet().stream())
                .filter(n->n.getKey().destination!=endAirport)
                .map(g->g.getKey().destination)
                .collect(Collectors.toList());
        List<List<String>> listOfFlightThrowAnotherCity = new LinkedList<>();
        List<String> listOfFlightTemp;
        for (String i : listOfFlights){
            listOfFlightTemp = this.airportsNameAndFlights.entrySet().stream()
                    .filter(r->r.getKey()==i)
                    .flatMap(w->w.getValue().entrySet().stream())
                    .filter(t->t.getKey().destination!=startAirport)
                    .filter(o->o.getKey().destination==endAirport)
                    .map(m->"Fly from "+startAirport+" to "+endAirport+" throw "+i+" Date "+m.getValue()+" Fly time "+m.getKey().flyTime.toString())
                    .collect(Collectors.toList());
            listOfFlightThrowAnotherCity.add(listOfFlightTemp);
        }
        return listOfFlightThrowAnotherCity.stream().flatMap(l->l.stream()).collect(Collectors.toList());
    }
}
