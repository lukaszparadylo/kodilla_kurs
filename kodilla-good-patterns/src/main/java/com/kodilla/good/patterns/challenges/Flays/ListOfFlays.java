package com.kodilla.good.patterns.challenges.Flays;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ListOfFlays {

    public Map<Flay,LocalDateTime> generateFlays(Integer flaysAmount){
        Map<Flay, LocalDateTime> flays = new HashMap<>();
        Random random = new Random();
        String [] tab = {"GANSK","KRAKOW", "WROCLAW", "WARSZAWA", "BERLIN", "LONDYN", "NEW YORK"};
        for (int i = 0; i<flaysAmount; i++) {
            LocalDateTime dateOfFlay = LocalDateTime.of(random.nextInt(3) + 2021, random.nextInt(11) + 1,
                    random.nextInt(27) + 1, random.nextInt(23)+1, random.nextInt(59));
            Integer timeOfFlayInMinutes = random.nextInt(1000);
            flays.put(new Flay(random.nextInt(100000), timeOfFlayInMinutes, random.nextInt(1000),
                    600, tab[random.nextInt(6)]), dateOfFlay);
        }
        return flays;
    }
}
