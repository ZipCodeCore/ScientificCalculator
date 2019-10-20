package com.zipcodewilmington.scientificcalculator;

public class Inverse {

    public Inverse(){
    }

    public Double inverse(Double value){
        if(value == 0){
            System.out.println("ERROR: Cannot have an inverse of 0.");
            return null;
        } else {
            return 1/value;
        }
    }
}
