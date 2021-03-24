package com.kodilla.stream.array;
import java.util.Arrays;


public interface ArrayOperations {
    static double getAverage(int[] numbers){
        Arrays.stream(numbers)
                .filter(n->n>0)
                .forEach(System.out::println);
        return Arrays.stream(numbers)
                .filter(n->n>0)
                .average().getAsDouble();
    }
}

