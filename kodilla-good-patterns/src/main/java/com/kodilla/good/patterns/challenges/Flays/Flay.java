package com.kodilla.good.patterns.challenges.Flays;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Flay {
    Integer flyNumber;
    Integer flyTime;
    Integer flyPrice;
    Integer numberOfSeats;
    String destination;

    public Flay(Integer flyNumber, Integer flyTime, Integer flyPrice, Integer numberOfSeats, String destination) {
        this.flyNumber = flyNumber;
        this.flyTime = flyTime;
        this.flyPrice = flyPrice;
        this.numberOfSeats = numberOfSeats;
        this.destination = destination;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flay flay = (Flay) o;

        if (!flyNumber.equals(flay.flyNumber)) return false;
        if (!flyTime.equals(flay.flyTime)) return false;
        if (!flyPrice.equals(flay.flyPrice)) return false;
        if (!numberOfSeats.equals(flay.numberOfSeats)) return false;
        return destination.equals(flay.destination);
    }

    @Override
    public int hashCode() {
        int result = flyNumber.hashCode();
        result = 31 * result + flyTime.hashCode();
        result = 31 * result + flyPrice.hashCode();
        result = 31 * result + numberOfSeats.hashCode();
        result = 31 * result + destination.hashCode();
        return result;
    }
}
