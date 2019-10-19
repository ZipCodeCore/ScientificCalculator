package com.zipcodewilmington.scientificcalculator;

public class Tangent {
    public Tangent() {
    }

    public Double tangent(double value) {
        if (value < 0) {
            return Math.tan(-value);
        } else {
            return Math.tan(value);
        }
    }
}