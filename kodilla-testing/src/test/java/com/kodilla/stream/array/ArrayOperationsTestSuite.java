package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class ArrayOperationsTestSuite {
    private int[] numbers;
    private int[] numbersGenerator(int elementsNumber){
        numbers = new int[elementsNumber];
        Random random = new Random();
        for (int i = 0; i<elementsNumber; i++){
            numbers[i] = random.nextInt(1000);
        }
        return numbers;
    }
    @Test
    public void testGetAverage(){

        double averageExpected = ArrayOperations.getAverage(numbersGenerator(20));
        int sum = 0;
        for (int i = 0; i<this.numbers.length; i++){
            sum += this.numbers[i];
        }
        double average = sum/this.numbers.length;
        Assertions.assertEquals(average, averageExpected, 1.0);
    }
}
