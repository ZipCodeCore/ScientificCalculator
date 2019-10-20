package com.zipcodewilmington.scientificcalculator;

public class Factorial {
    public Factorial(){

    }

    public Double factorial(Double value1){
        double facto = 1;
        if(value1 instanceof Integer && value1 > 0){
            for(int i = 1; i <= value1; i++){
                facto = facto * i;
            }
            return facto;
        } else if (value1 <= 0) {
            System.out.println("ERROR: Cannot take a factorial of 0 or a negative integer");
            return null;
        } else {
            System.out.println("ERROR: Please enter an Integer for factorials");
            return null;
        }
    }
}

