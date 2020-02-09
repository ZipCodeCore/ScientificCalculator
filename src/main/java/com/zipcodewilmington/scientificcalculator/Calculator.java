package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    double firstVal ;
    double secondVal ;
    double savedVal ;
    double displayVal ;

    public Calculator(double firstValIn, double secondValIn, double displayValIn, double savedValIn) {
        this.firstVal = firstValIn;
        this.secondVal = secondValIn;
        this.displayVal = displayValIn;
        this.savedVal = savedValIn;
    }
}
