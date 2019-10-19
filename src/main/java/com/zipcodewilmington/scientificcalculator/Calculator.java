package com.zipcodewilmington.scientificcalculator;

import java.util.Arrays;

public class Calculator {

    private Double state;
    private Double lastInput;
    private Double display;
    public static final String[] OPERATORS = {"+", "-", "/", "=", "*", "sqrt", "sq",
                                        "sin", "cos", "tan", "asin", "acos", "atan",
                                        "exp", "10^", "log", "ln", "!", "inv", "sign"};
    public static final String[] COMMANDS = {"m+", "mc", "mrc", "clear", "deg", "rad", "quit", ""};// still need display modes

    private Memory memory;
    private TrigFunctions trig;


    public Calculator() {

        state = 0.0;
        lastInput = 0.0;
        display = 0.0;
        this.memory = new Memory();
        this.trig = new TrigFunctions();

    }

    // Getters

    public Double getState() {
        return this.state;
    }

    public Double getLastInput() {
        return this.lastInput;
    }

    public Double getDisplay() {
        return this.display;
    }

    // Setters

    public void setState(Double state) {
        this.state = state;
    }

    public void setLastInput(Double lastInput) {
        this.lastInput = lastInput;
    }

    public void setDisplay(Double display) {
        this.display = display;
    }

    // Helper Methods


    public void throwError() {
        Console.println("ERR");
        this.lastInput = 0.0;
        this.display = 0.0;
        this.state = 0.0;
    }

    public void clearCalculator() {
        Console.println("0");
        this.lastInput = 0.0;
        this.display = 0.0;
        this.state = 0.0;
    }

    // Input Methods

    public void inputLoop() {
        String input = Console.getInput("");

        while (!input.equals("quit")) {


            if (input.matches("-?\\d+(\\.\\d+)?")) { //regEx to check whether it's a number or not
                this.lastInput = this.display;
                this.display = Double.valueOf(input);

                Console.println("%s (%s)", Double.toString(this.display), Double.toString(this.lastInput));
            } else if (Arrays.asList(Calculator.COMMANDS).contains(input)){
                Console.println("%s (command)", input);
                switch (input) {
                    case "clear":
                        clearCalculator();
                        break;
                    case "deg":
                        trig.degreeMode();
                        break;
                    case "rad":
                        trig.radianMode();
                        break;
                    case "m+":
                        memory.memoryPlus(0.0);
                        break;
                    case "mc":
                        break;
                    case "mrc":

                        break;
                }
            } else if (Arrays.asList(Calculator.OPERATORS).contains(input)) {
                handleOperator(input);
            } else { //error
                this.throwError();
            }
            // need to do this only until the previous input was an operator
            input = Console.getInput("");
        }
    }

    public String handleOperator(String operator) {
        Console.println("%s (%f)", operator, this.display);
        Double result = 0.0;
        switch (operator) {
            case "+":

                break;

            case "sin":
                result = trig.sin(this.display);
                this.display = result;
                break;
            case "cos":
                result = trig.cos(this.display);
                this.display = result;
                break;
            case "tan":
                result = trig.tan(this.display);
                this.display = result;
                break;
            case "asin":
                result = trig.arcSin(this.display);
                this.display = result;
                break;
            case "acos":
                result = trig.arcCos(this.display);
                this.display = result;
                break;
            case "atan":
                result = trig.arcTan(this.display);
                this.display = result;
                break;


        }
        Console.println(Double.toString(this.display));
        return "";
    }
}
