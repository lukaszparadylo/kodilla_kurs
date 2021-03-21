package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public class Continent {
    Set<Country> countryList;

    public Continent(){
        countryList = new HashSet<>();
    }
    public void addCountry(Set<Country> country){
        this.countryList = country;
    }
    public Set<Country> getCountryList() {
        return countryList;
    }
}
