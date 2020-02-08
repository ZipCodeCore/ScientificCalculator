package com.zipcodewilmington.scientificcalculator;

public class Memory {
    private Double value;

    public Memory() {
        value = 0.0;
    }

    public Double getMemory() {
        return value;
    }

    public void setMemory(Double input) {
        this.value = input;
    }

    public void resetMemory() {
        this.value = 0.0;
    }
}