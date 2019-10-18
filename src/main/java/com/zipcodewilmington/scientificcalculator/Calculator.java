package com.zipcodewilmington.scientificcalculator;

public class Calculator {

    private Double state;
    private Double lastInput;
    private Double display;
//    private Memory memory;
//    private Trig trig;


    public Calculator() {

        state = 0.0;
        lastInput = 0.0;
        display = 0.0;
//        this.memory = new Memory();
//        this.trig = new Trig();

    }

    // Getters

    public Double getState() {
        return state;
    }

    public Double getLastInput() {
        return lastInput;
    }

    // Setters

    public void setState(Double state) {
        this.state = state;
    }

    public void setLastInput(Double lastImport) {
        this.lastInput = lastInput;
    }

    // Helper Methods


    private void throwError() {

    }

    private void clearCalculator() {

    }

    // Input Methods

    public void inputLoop() {
        Double input = Console.getDoubleInput("");

        this.lastInput = this.display;
        this.display = input;

        Console.println("%s (%s)", Double.toString(this.display), Double.toString(this.lastInput));

        // need to do this only until the previous input was an operator
        this.inputLoop();
    }

    public void handleOperator() {

    }
}
