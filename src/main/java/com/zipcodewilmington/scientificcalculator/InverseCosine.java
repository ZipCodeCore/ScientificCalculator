package com.zipcodewilmington.scientificcalculator;

public class InverseCosine {

    public InverseCosine(){
    }
    public Double inverseCosine(double value){
        if(value <= 1 && value >= -1){
            return Math.acos(value);
        } else {
            System.out.println("ERROR: Please enter a number between -1 and 1.");
            return null;
        }
    }
}
