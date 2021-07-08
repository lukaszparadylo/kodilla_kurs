package com.kodilla.good.patterns.challenges.flights;

public class Fly {
    Integer flyNumber;
    Integer flyTime;
    Integer flyPrice;
    Integer numberOfSeats;
    String destination;

    public Fly(Integer flyNumber, Integer flyTime, Integer flyPrice, Integer numberOfSeats, String destination) {
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

        Fly Fly = (Fly) o;

        if (flyNumber != null ? !flyNumber.equals(Fly.flyNumber) : Fly.flyNumber != null) return false;
        if (flyTime != null ? !flyTime.equals(Fly.flyTime) : Fly.flyTime != null) return false;
        if (flyPrice != null ? !flyPrice.equals(Fly.flyPrice) : Fly.flyPrice != null) return false;
        if (numberOfSeats != null ? !numberOfSeats.equals(Fly.numberOfSeats) : Fly.numberOfSeats != null)
            return false;
        return destination.equals(Fly.destination);
    }

    @Override
    public int hashCode() {
        return destination.hashCode();
    }
}
