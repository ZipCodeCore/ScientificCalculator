package com.zipcodewilmington.scientificcalculator;

import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;


public class Calculator {

    private Boolean running;
    private Double lastInput;
    private Double display;
    public static final String[] UNARYOPERATORS = {"sqrt", "sq",
                                        "sin", "cos", "tan", "asin", "acos", "atan",
                                        "exp", "10^", "log", "ln", "!", "inv", "sign"};
    public static final String[] BINARYOPERATORS = {"+", "-", "/", "*", "^", "logb"};
    public static final String[] COMMANDS = {"m+", "mc", "mrc", "mr", "last", "clear", "deg", "rad", "mode", "bin", "oct", "dec", "hex", "stats", "quit", "q", "?", "help", "man"};// still need display modes

    private Memory memory;
    private TrigFunctions trig;

    public static Map<String, String> MANUAL = new HashMap<>();

    enum dMode {
        BINARY, OCTAL, DECIMAL, HEXADECIMAL
    };
    private dMode displayMode;



    public Calculator() {
        this.running = false;
        this.lastInput = 0.0;
        this.display = 0.0;
        this.memory = new Memory();
        this.trig = new TrigFunctions();
        this.displayMode = dMode.DECIMAL;

        MANUAL.put("+", "Addition (binary operator): Enter a number, then +, then another number");
        MANUAL.put("-", "Subtraction (binary operator): Enter a number, then -, then another number");
        MANUAL.put("*", "Multiplication (binary operator): Enter a number, then *, then another number");
        MANUAL.put("/", "Division (binary operator): Enter a number, then /, then another number");
        MANUAL.put("logb", "Logarithm, base b (binary operator): Enter a number, then logb, then the desired base");
        MANUAL.put("^", "Exponentiation (binary operator): Enter a base, then ^, then an exponent");
        MANUAL.put("sin", "Sine (unary operator): Enter a number, then sin. Select unit mode with deg or rad");
        MANUAL.put("cos", "Cosine (unary operator): Enter a number, then cos. Select unit mode with deg or rad");
        MANUAL.put("tan", "Tangent (unary operator): Enter a number, then tan. Select unit mode with deg or rad");
        MANUAL.put("asin", "Inverse Sine (unary operator): Enter a number, then asin. Select unit mode with deg or rad");
        MANUAL.put("acos", "Inverse Cosine (unary operator): Enter a number, then acos. Select unit mode with deg or rad");
        MANUAL.put("atan", "Inverse Tangent (unary operator): Enter a number, then atan. Select unit mode with deg or rad");
        MANUAL.put("rad", "Select unit mode: radians");
        MANUAL.put("deg", "Select unit mode: degrees");
        MANUAL.put("sq", "Square (unary operator): Enter a number, then sq");
        MANUAL.put("sqrt", "Square root (unary operator): Enter a number, then sqrt");
        MANUAL.put("exp", "Natural (base e) exponentiation (unary operator): Enter a number, then exp");
        MANUAL.put("10^", "Base-10 exponentiation (unary operator): Enter a number, then 10^");
        MANUAL.put("ln", "Natural (base e) logarithm (unary operator): Enter a number, then ln");
        MANUAL.put("log", "Base-10 logarithm (unary operator): Enter a number, then log");
        MANUAL.put("!", "Factorial (unary operator): Enter an integer, then !");
        MANUAL.put("inv", "Inversion/reciprocal (unary operator): Enter a number, then inv");
        MANUAL.put("sign", "Change sign (unary operator): Enter a number, then sign");
        MANUAL.put("m+", "Memory add: store the most recent result in memory");
        MANUAL.put("mr", "Memory recall: recall stored value from memory (also: 'mrc')");
        MANUAL.put("mrc", "Memory recall: recall stored value from memory (also: 'mr')");
        MANUAL.put("mc", "Memory clear: clear stored value from memory");
        MANUAL.put("last", "Return second-to-last result to the display");
        MANUAL.put("clear", "Clear calculator display and storage (not memory)");
        MANUAL.put("stats", "Statistical analysis mode - enter data set and get 1-variable descriptive statistics");
        MANUAL.put("mode", "Change display mode (toggle binary -> octal -> decimal -> hexadecimal)");
        MANUAL.put("bin","Change display mode to binary");
        MANUAL.put("oct","Change display mode to octal");
        MANUAL.put("dec","Change display mode to decimal");
        MANUAL.put("hex","Change display mode to hexadecimal");
        MANUAL.put("?", "Help: a list of commands (also 'help')");
        MANUAL.put("help", "Help: a list of commands (also '?')");
        MANUAL.put("quit", "Quit (also 'q')");
        MANUAL.put("q", "Quit (also 'quit')");
        MANUAL.put("man", "Manual - you're using it. Kinda meta");
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

    public dMode getDisplayMode() {
        return displayMode;
    }

    // Setters

    public void setLastInput(Double lastInput) {
        this.lastInput = lastInput;
    }

    public void setDisplay(Double display) {
        this.display = display;
    }

    public void setDisplayMode(dMode displayMode) { // choose display mode directly
        this.displayMode = displayMode;
    }

    public void setDisplayMode() { // step through display modes
        int current = this.displayMode.ordinal();
        this.displayMode = dMode.values()[(current + 1)%dMode.values().length];
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

        Console.println("Calculator on: normal mode. ?/help for help, q to quit");
        inputLoop();
    }

    public void showHelp() {
        Console.println("Available commands (case insensitive):");
        Console.println(String.join(", ",Calculator.COMMANDS));
        Console.println("Available operators:");
        Console.println(String.join(", ",Calculator.BINARYOPERATORS));
        Console.println(String.join(", ",Calculator.UNARYOPERATORS));
        Console.println("Use 'man' for further help");
    }

    public String man(String command) {
        if (Arrays.asList(Calculator.COMMANDS).contains(command) || Arrays.asList(Calculator.UNARYOPERATORS).contains(command) || Arrays.asList(Calculator.BINARYOPERATORS).contains(command)) {
            return this.MANUAL.get(command);
        } else {
            return "Command not found";
        }
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
        //Console.println("%s (command)", command);
        switch (command) {
            case "q" :
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
                this.lastInput = this.display;
                this.display = this.memory.memoryRecall();
                break;
            case "last":
                this.display = this.lastInput;
                this.lastInput = 0.0;
                break;
            case "?":
            case "help":
                this.showHelp();
                break;
            case "man":
                Console.println("Command or Operator? ");
                String manInput = Console.getInput();
                String helpContents = this.man(manInput);
                Console.println(helpContents);
                break;
            case "stats":
                Console.println("Statistics Mode: enter data, 'q' to analyze");
                Statistics1Var stats = new Statistics1Var(); // create stats object

                Double[] input = Console.getDoubleList(); // get new data

                if (input.length > 0) {
                    stats.setData(input); // apply the data
                    stats.calculateStatistics(); // calculate the statistics
                    Console.println(stats.getOutput()); // output the result
                } else {
                    throwError();
                }
                break;
            case "mode":
                setDisplayMode();
                break;
            case "bin":
                setDisplayMode(dMode.BINARY);
                break;
            case "oct":
                setDisplayMode(dMode.OCTAL);
                break;
            case "dec":
                setDisplayMode(dMode.DECIMAL);
                break;
            case "hex":
                setDisplayMode(dMode.HEXADECIMAL);
                break;
        }
        return "";
    }

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
                     result = 1.0;
                    for (Double i = 2.0; i <= this.display; i++) {
                        result *= i;

                    }
                this.display = result;
                }

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
            case "logb" :
                Console.println("log_%s(%s)", Double.toString(input), Double.toString(this.display));
                this.lastInput = this.display;
                display = Math.log(display) / Math.log(input);
                break;
        }

        Console.println(Double.toString(this.display));
        return "";
    }


}
