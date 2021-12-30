package com.kodilla.good.patterns.challenges.flights;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ListOfFlights {
    public Map<Fly,LocalDateTime> generateFlights(Integer FlightsAmount){
        Map<Fly, LocalDateTime> flights = new HashMap<>();
        Random random = new Random();
        String [] tab = {"GDANSK","KRAKOW", "WROCLAW", "WARSZAWA", "BERLIN", "LONDYN", "NEW YORK"};
        for (int i = 0; i<FlightsAmount; i++) {
            LocalDateTime dateOfFly = LocalDateTime.of(random.nextInt(3) + 2021, random.nextInt(11) + 1,
                    random.nextInt(27) + 1, random.nextInt(23)+1, random.nextInt(59));
            Integer timeOfFlyInMinutes = random.nextInt(1000);
            flights.put(new Fly(random.nextInt(100000), timeOfFlyInMinutes, random.nextInt(1000),
                    600, tab[random.nextInt(6)]), dateOfFly);
        }
        return flights;
    }
}
