package com.zipcodewilmington.scientificcalculator;

public class BasicCalculator {

    //fields for storing results
    private Double doubleResult;
    private String stringResult;

    //Constructor
    public BasicCalculator(){
        doubleResult = null;
        stringResult = "0";
    }

    //Basic Operator functions
    public void add(Double x){
        try {

            if (x == 0) {                                              //Checks if there's already a number to work with
                x = Console.getDoubleInput("First number: ");
            }

            Double y = Console.getDoubleInput(x + " + ");
            this.setDoubleResult(x + y);
            this.setStringResult(Double.toString(x+y));

        }
        //for non-double inputs
        catch(Exception e){
            this.setDoubleResult(null);
            this.setStringResult("ERROR");
        }
    }

    public void subtract(Double x){
        try {
            if (x == 0) {
                x = Console.getDoubleInput("First number: ");
            }

            Double y = Console.getDoubleInput(x + " - ");
            this.setDoubleResult(x - y);
            this.setStringResult(Double.toString(x - y));

        }
        //for non double inputs
        catch(Exception e){
            this.setDoubleResult(null);
            this.setStringResult("ERROR");
        }
    }

    public void multiply(Double x){
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

    public void divide(Double x){
        try {
            if (x == 0) {
                x = Console.getDoubleInput("First number: ");
            }

            Double y = Console.getDoubleInput(x + " / ");
            this.setDoubleResult(x / y);
            this.setStringResult(Double.toString(x / y));

        }
        //for non double inputs and division by zero.
        catch(Exception e){
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
