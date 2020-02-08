package com.zipcodewilmington.scientificcalculator;

public class Memory {
    private static Double value;

    public Memory() {
        value = 0.0;
    }

    public static Double getMemory() {
        return value;
    }

    public static void setMemory(Double input) {
        value = input;
    }

    public static void resetMemory() {
        value = 0.0;
    }
}