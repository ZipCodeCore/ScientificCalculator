package com.zipcodewilmington.scientificcalculator;

public class Factorial {
    public Factorial(){

    }

    public Double factorial(Double value1){
        double facto = 1;
        for(int i = 1; i <= value1; i++){
                facto = facto * i;
            }
            return facto;
        }
    }
}

