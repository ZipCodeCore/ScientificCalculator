package com.zipcodewilmington.scientificcalculator;

public class Fibonacci {

    public static String fibonacci(Double num1){
        Double maxNumber = num1;
        Integer previousNumber = 0;
        Integer nextNumber = 1;
        String fiboString = "";

        for (int i = 1; i <= maxNumber; i++){
            fiboString += " " + previousNumber;
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
        return fiboString;
    }
}
