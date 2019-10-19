package com.zipcodewilmington.scientificcalculator;

public class Division {
    private double value1;
    private double value2
    public Division(){
    }

    public Double divide(double value1, double value2){
        if(value2 == 0){
            System.out.println("Invalid entry. Cannot divide by 0");
            return null;
        } else {
            return value1 / value2;
        }
    }
}