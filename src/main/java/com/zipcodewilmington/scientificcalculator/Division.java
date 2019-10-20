package com.zipcodewilmington.scientificcalculator;

public class Division {
    public Division(){
    }

    public Double divide(double value1, double value2){
        if(value2 == 0){
            System.out.println("ERROR: Cannot divide by 0.");
            return null;
        } else {
            return value1 / value2;
        }
    }
}