package com.zipcodewilmington.scientificcalculator;

public class Logarithm {
    public Logarithm(){
    }
    public Double logarithm(double value){
        if(value <= 0){
            System.out.println("ERROR: Please enter a number larger than 0.");
            return null;
        } else {
            return Math.log(value);
        }
    }
}
