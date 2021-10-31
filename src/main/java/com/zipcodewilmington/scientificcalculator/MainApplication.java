package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


    public static void main(String[] args) {
        Calculator calc = new Calculator("0");
        Console.println("Welcome to my calculator!");
        calc.startCalc(0);
        calc.displayOutput("2");

    }
}
