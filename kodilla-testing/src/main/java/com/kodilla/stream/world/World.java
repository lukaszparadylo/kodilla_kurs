package com.kodilla.stream.world;

import com.kodilla.stream.invoice.simple.SimpleItem;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class World {
    Set<Continent> continentsList;

    public World(){
        continentsList = new HashSet<>();
    }
    public void addContinent(Continent continent){
        this.continentsList.add(continent);
    }
    public BigDecimal getPeopleQuantity(){
        BigDecimal people = continentsList.stream()
                .flatMap(e->e.getCountryList().stream())
                .map(s->s.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("People list in "+this.getClass().getSimpleName()+": "+people);

         return people;
    }
}
