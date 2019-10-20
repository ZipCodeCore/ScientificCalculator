package com.zipcodewilmington.scientificcalculator;

public class NaturalLogarithm {
    public NaturalLogarithm(){
    }
    public Double naturalLogarithm(Double value){
        if(value <= 0){
            System.out.println("ERROR: Please enter a number larger than 0.");
            return null;
        } else {
            return (-Math.log((1-value)/value));
        }
    }
}