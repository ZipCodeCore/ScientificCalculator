package com.zipcodewilmington.scientificcalculator;

public class Calculator {

    private Double state;
    private Double lastImport;
    private Memory memory;
    private Trig trig;


    public void Calculator() {

        this.state = 0;
        this.lastImport = 0;
        this.memory = new Memory();
        this.trig = new Trig();

    }

    // Getters

    public Double getState() {
        return state;
    }

    public Double getLastImport() {
        return lastImport;
    }

    // Setters

    public void setState(Double state) {
        this.state = state;
    }

    public void setLastImport(Double lastImport) {
        this.lastImport = lastImport;
    }

    // Helper Methods


    private void throwError() {

    }

    private void clearCalculator() {

    }

    // Input Methods

    public void inputLoop() {
        Double input = Console.getDoubleInput("");
        Console.println(input);
    }

    public void handleOperator() {

    }
}
