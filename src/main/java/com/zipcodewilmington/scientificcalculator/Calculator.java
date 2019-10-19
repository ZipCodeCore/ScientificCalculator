package com.zipcodewilmington.scientificcalculator;

import java.util.Arrays;

public class Calculator {

    private Boolean running;
    private Double lastInput;
    private Double display;
    public static final String[] UNARYOPERATORS = {"sqrt", "sq",
                                        "sin", "cos", "tan", "asin", "acos", "atan",
                                        "exp", "10^", "log", "ln", "!", "inv", "sign"};
    public static final String[] BINARYOPERATORS = {"+", "-", "/", "*", "^"};
    public static final String[] COMMANDS = {"m+", "mc", "mrc", "mr", "clear", "deg", "rad", "quit", "?", "help"};// still need display modes

    private Memory memory;
    private TrigFunctions trig;


    public Calculator() {
        this.running = false;
        this.lastInput = 0.0;
        this.display = 0.0;
        this.memory = new Memory();
        this.trig = new TrigFunctions();
    }

    // Getters

    public Double getLastInput() {
        return this.lastInput;
    }

    public Double getDisplay() {
        return this.display;
    }

    public TrigFunctions getTrig() {
        return this.trig;
    }

    // Setters

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
    }

    public void clearCalculator() {
        Console.println("0");
        this.lastInput = 0.0;
        this.display = 0.0;
    }

    public void run() {
        this.running = true;
        inputLoop();
    }

    public void showHelp() {
        Console.println("Available commands (case insensitive):");
        Console.println(String.join(", ",Calculator.COMMANDS));
        Console.println("Available operators:");
        Console.println(String.join(", ",Calculator.BINARYOPERATORS));
        Console.println(String.join(", ",Calculator.UNARYOPERATORS));
    }

    // Input Methods
    private void inputLoop() {
        String input;

        while (this.running) {
            // need to do this only until the previous input was an operator
            input = Console.getInput();

            if (input.matches("-?\\d+(\\.\\d+)?")) { //regEx to check whether it's a number or not
                this.lastInput = this.display;
                this.display = Double.valueOf(input);
                Console.println("%s (%s)", Double.toString(this.display), Double.toString(this.lastInput));
            } else if (Arrays.asList(Calculator.COMMANDS).contains(input)){
                handleCommands(input);
            } else if (Arrays.asList(Calculator.UNARYOPERATORS).contains(input)) {
                handleOperator(input);
            } else if (Arrays.asList(Calculator.BINARYOPERATORS).contains(input)) {
                handleBinaryOperator(input);
            } else { //error
                this.throwError();
            }
        }
    }

    public String handleCommands(String command) {
        Console.println("%s (command)", command);
        switch (command) {
            case "quit" :
                this.running = false;
                break;
            case "clear":
                clearCalculator();
                break;
            case "deg":
                this.trig.degreeMode();
                break;
            case "rad":
                this.trig.radianMode();
                break;
            case "m+":
                this.memory.memoryPlus(display);
                break;
            case "mc":
                this.memory.memoryClear();
                break;
            case "mr":
            case "mrc":
                this.lastInput = display;
                display = memory.memoryRecall();
                break;
            case "?":
            case "help":
                this.showHelp();
                break;
        }
        return "";
    }

    /*,  "!", "sign"};*/
    public String handleOperator(String operator) {
        Console.println("%s (%f)", operator, this.display);
        Double result = 0.0;
        switch (operator) {
            case "sin":
                result = this.trig.sin(this.display);
                this.display = result;
                break;
            case "cos":
                result = this.trig.cos(this.display);
                this.display = result;
                break;
            case "tan":
                result = this.trig.tan(this.display);
                this.display = result;
                break;
            case "asin":
                result = this.trig.arcSin(this.display);
                this.display = result;
                break;
            case "acos":
                result = this.trig.arcCos(this.display);
                this.display = result;
                break;
            case "atan":
                result = this.trig.arcTan(this.display);
                this.display = result;
                break;
            case "sqrt":
                result = Math.sqrt(this.display);
                this.display = result;
                break;
            case "sq":
                result = this.display * this.display;
                this.display = result;
                break;
            case "exp":
                result = Math.exp(this.display);
                this.display = result;
                break;
            case "10^":
                result = Math.pow(10, this.display);
                this.display = result;
                break;
            case "log":
                result = Math.log(this.display);
                this.display = result;
                break;
            case "ln":
                result = Math.log1p(this.display);
                this.display = result;
                break;
            case "!":
                if(this.display == Math.floor(this.display)){
                    System.out.println(Math.floor(this.display));
                    System.out.print("Yes it is");
                } else {
                    System.out.print("nope");
                }
                this.display = result;
                break;
            case "inv":
                result = (1.0 / this.display);
                this.display = result;
                break;
            case "sign":
                this.display *=  -1.0;

                break;
        }
        Console.println(Double.toString(this.display));
        return Double.toString(display);
    }

    /* "+", "-", "/", "*", "^" */
    public String handleBinaryOperator(String operator) {
        Double input = Console.getNumber();

        switch (operator) {
            case "+" :
                Console.println("%s + %s", Double.toString(this.display), Double.toString(input));
                this.lastInput = this.display;
                display += input;
                break;
            case "-" :
                Console.println("%s - %s", Double.toString(this.display), Double.toString(input));
                this.lastInput = this.display;
                display -= input;
                break;
            case "/" :
                Console.println("%s / %s", Double.toString(this.display), Double.toString(input));
                this.lastInput = this.display;
                display /= input;
                break;
            case "*" :
                Console.println("%s * %s", Double.toString(this.display), Double.toString(input));
                this.lastInput = this.display;
                display *= input;
                break;
            case "^" :
                Console.println("%s ^ %s", Double.toString(this.display), Double.toString(input));
                this.lastInput = this.display;
                display = Math.pow(display, input);
                break;
        }

        Console.println(Double.toString(this.display));
        return "";
    }


}
