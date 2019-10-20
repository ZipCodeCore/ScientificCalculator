package com.zipcodewilmington.scientificcalculator;

public class Sqrt {

    public Sqrt() {
    }

    public Double sqrt(double value) {
        if (value <= 0) {
            System.out.println("ERROR: Please enter a positive number.");
            return null;
        } else {
            return Math.sqrt(value);
        }
    }
}
