package com.zipcodewilmington.scientificcalculator;

public class BasicMath {
    // two operator methods
    public static Double addition (Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo);
    }
    public static Double subtraction (Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }
    public static Double multiplication (Double numberOne, Double numberTwo) {
            return numberOne * numberTwo;
    }
    public static Double division (Double numberOne, Double numberTwo) {
            return numberOne / numberTwo;
    }
        public static Double exponent (Double numberOne, Double numberTwo){
            return Math.pow(numberOne, numberTwo);
    }
    // one operator methods

    public static Double square (Double numberOne) {
        return numberOne * numberOne;
    }
    public static Double squareroot (Double numberOne){
        return (Math.sqrt(numberOne));
    }
    public static Double inverse(Double numberOne){
        return 1/numberOne;
    }


    }




