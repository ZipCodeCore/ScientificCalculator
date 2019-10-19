package com.zipcodewilmington.scientificcalculator;

public class Calculator {

    private Double state;
    private Double lastInput;
    private Double display;
    public static final String[] OPERATORS = {"+", "-", "/", "=", "*", "sqrt", "sq",
                                        "sin", "cos", "tan", "asin", "acos", "atan",
                                        "exp", "10^", "log", "ln", "!", "inv", "sign"};
    public static final String[] COMMANDS = {"m+", "mc", "mrc", "clear", "deg", "rad"};// still need display modes
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

    public static String[] getOperators() {
        return OPERATORS;
    }

    public static String[] getCommands() {
        return COMMANDS;
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
