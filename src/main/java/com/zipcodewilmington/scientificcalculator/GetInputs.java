package com.zipcodewilmington.scientificcalculator;

public class GetInputs {

    public Double getx(double x){
        try {
            if (x == 0) {
                x = Console.getDoubleInput("First number: ");
            }
            return x;
        }
        catch(Exception e) {
            return x;
        }
    }
}
