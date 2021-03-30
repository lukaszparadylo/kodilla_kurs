package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {
        try {
            return a / b;
        }catch (ArithmeticException e){
            System.out.println("Error "+e);
            return -1.0;
        }finally {
            System.out.println("Arithmetic try-catch-finally");
        }
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(1, 1);

        System.out.println(result);
    }
}