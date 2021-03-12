package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        System.out.println("Test jednostkowy:");
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator();
        if(calculator.add(1,1)==2){
            System.out.println("test OK");
        }
        else {
            System.out.println("Error!");
        }

        System.out.println("Test - drugi test jednostkowy:");
        if(calculator.substract(1,1)==0){
            System.out.println("test OK");
        }
        else {
            System.out.println("Error!");
        }

    }
}
