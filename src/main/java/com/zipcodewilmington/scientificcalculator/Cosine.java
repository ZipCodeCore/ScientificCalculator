package com.zipcodewilmington.scientificcalculator;

public class Cosine {
    public Cosine() {
    }

    public Double cosine(double value) {
        if (value < 0) {
            return Math.cos(-value);
        } else {
            return Math.cos(value);
        }
    }
}
