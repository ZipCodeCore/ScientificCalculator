package com.zipcodewilmington.scientificcalculator;

public class InverseLogarithm {
    public InverseLogarithm() {
    }
    public Double inverseLogarithm(double value){
        if(value <= 0){
            System.out.println("ERROR: Please enter a number larger than 0.");
            return null;
        } else {
            return Math.pow(10,value);
        }
    }
}
