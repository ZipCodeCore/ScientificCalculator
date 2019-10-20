package com.zipcodewilmington.scientificcalculator;

public class ScientificCalculator {


    //fields for storing results
    private Double doubleResult;
    private String stringResult;

    //Constructor
    public ScientificCalculator(){
        doubleResult = null;
        stringResult = "0";
    }

    //Scientific Operator functions
    public void square(Double x){
        try {

            if (x == 0) {                                              //Checks if there's already a number to work with
                x = Console.getDoubleInput("Square: ");
            }
            x = Console.getDoubleInput(x + " * ");
            this.setDoubleResult(x * x);
            this.setStringResult(Double.toString(x*x));

        }
        //for non-double inputs
        catch(Exception e){
            this.setDoubleResult(null);
            this.setStringResult("ERROR");
        }
    }

    public void squareRoot(Double x){
        try {
            if (x == 0) {
                x = Console.getDoubleInput("Sqaure Root: ");
            }

            x = Console.getDoubleInput(x + " ^ ");
            this.setDoubleResult(Math.sqrt(x));
            this.setStringResult(Double.toString(Math.sqrt(x)));

        }
        //for non double inputs
        catch(Exception e){
            this.setDoubleResult(null);
            this.setStringResult("ERROR");
        }
    }

    public void inverse(Double x){
        try {
            if (x == 0) {
                x = Console.getDoubleInput("First number: ");
            }

            Double y = Console.getDoubleInput(x + " * ");
            this.setDoubleResult(x * y);
            this.setStringResult(Double.toString(x * y));

        }
        //for non double inputs
        catch(Exception e){
            this.setStringResult("ERROR");
        }
    }

    public void switchSign(Double x){
        try {
            if (x == 0) {
                x = Console.getDoubleInput("First number: ");
            }

            Double y = Console.getDoubleInput(x + " / ");
            while(y == 0){
                y = Console.getDoubleInput("Please enter a non-zero denominator: ");
            }

            this.setDoubleResult(x / y);
            this.setStringResult(Double.toString(x / y));

        }
        //for non double inputs and division by zero.
        catch(Exception e){
            this.setStringResult("ERROR");
        }
    }

    public void sine(Double x){
        try {
            if (x == 0) {
                x = Console.getDoubleInput("First number: ");
            }

            Double y = Console.getDoubleInput(x + " / ");
            while(y == 0){
                y = Console.getDoubleInput("Please enter a non-zero denominator: ");
            }

            this.setDoubleResult(x / y);
            this.setStringResult(Double.toString(x / y));

        }
        //for non double inputs and division by zero.
        catch(Exception e){
            this.setStringResult("ERROR");
        }
    }

    public void cosine(Double x){
        try {
            if (x == 0) {
                x = Console.getDoubleInput("First number: ");
            }

            Double y = Console.getDoubleInput(x + " / ");
            while(y == 0){
                y = Console.getDoubleInput("Please enter a non-zero denominator: ");
            }

            this.setDoubleResult(x / y);
            this.setStringResult(Double.toString(x / y));

        }
        //for non double inputs and division by zero.
        catch(Exception e){
            this.setStringResult("ERROR");
        }
    }


    public void tangent(Double x){
        try {
            if (x == 0) {
                x = Console.getDoubleInput("First number: ");
            }

            Double y = Console.getDoubleInput(x + " / ");
            while(y == 0){
                y = Console.getDoubleInput("Please enter a non-zero denominator: ");
            }

            this.setDoubleResult(x / y);
            this.setStringResult(Double.toString(x / y));

        }
        //for non double inputs and division by zero.
        catch(Exception e){
            this.setStringResult("ERROR");
        }
    }

    public void inverseSine(Double x){
        try {
            if (x == 0) {
                x = Console.getDoubleInput("First number: ");
            }

            Double y = Console.getDoubleInput(x + " / ");
            while(y == 0){
                y = Console.getDoubleInput("Please enter a non-zero denominator: ");
            }

            this.setDoubleResult(x / y);
            this.setStringResult(Double.toString(x / y));

        }
        //for non double inputs and division by zero.
        catch(Exception e){
            this.setStringResult("ERROR");
        }
    }

    public void inverseCosine(Double x){
        try {
            if (x == 0) {
                x = Console.getDoubleInput("First number: ");
            }

            Double y = Console.getDoubleInput(x + " / ");
            while(y == 0){
                y = Console.getDoubleInput("Please enter a non-zero denominator: ");
            }

            this.setDoubleResult(x / y);
            this.setStringResult(Double.toString(x / y));

        }
        //for non double inputs and division by zero.
        catch(Exception e){
            this.setStringResult("ERROR");
        }
    }

    public void inverseTangent(Double x){
        try {
            if (x == 0) {
                x = Console.getDoubleInput("First number: ");
            }

            Double y = Console.getDoubleInput(x + " / ");
            while(y == 0){
                y = Console.getDoubleInput("Please enter a non-zero denominator: ");
            }

            this.setDoubleResult(x / y);
            this.setStringResult(Double.toString(x / y));

        }
        //for non double inputs and division by zero.
        catch(Exception e){
            this.setStringResult("ERROR");
        }
    }

    public void factorial(Double x){
        try {

            int i, fact = 1;

            for(i = 0; i <= x; i++) {

                if (x == 0) {
                    x = Console.getDoubleInput("Factorial: ");
                }

                fact = fact * i;
            }

            x = Console.getDoubleInput(x + " ! ");
            this.setDoubleResult(fact * i);
            this.setStringResult(Double.toString(x!));

        }
        //for non double inputs
        catch(Exception e){
            this.setDoubleResult(null);
            this.setStringResult("ERROR");
        }
    }


    //Getters and Setters for class fields

    public double getDoubleResult() {
        return doubleResult;
    }

    public void setDoubleResult(Double doubleResult) {
        this.doubleResult = doubleResult;
    }

    public String getStringResult() {
        return stringResult;
    }

    public void setStringResult(String stringResult) {
        this.stringResult = stringResult;
    }




}