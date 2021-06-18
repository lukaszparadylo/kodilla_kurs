package com.kodilla.good.patterns.challenges;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .flatMap(n->n.getValue().stream())
                .map(s-> s = s+"!")
                .forEach(System.out::print);
    }
}
