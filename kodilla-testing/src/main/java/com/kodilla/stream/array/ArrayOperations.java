package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        if(Arrays.stream(numbers).sum()!=0.0){
            Arrays.stream(numbers).forEach(System.out::println);
            return Arrays.stream(numbers).average().getAsDouble();
        }
        else return 0.0;
    }
}
