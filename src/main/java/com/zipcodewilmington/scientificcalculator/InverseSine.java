package com.zipcodewilmington.scientificcalculator;

public class InverseSine {
    public InverseSine(){

    }
    public Double inverseSine(double value){
        if(value <= 1 && value >= -1){
            return Math.asin(value);
        } else {
            System.out.println("ERROR: Please enter a number between -1 and 1.");
            return null;
        }
    }
}
