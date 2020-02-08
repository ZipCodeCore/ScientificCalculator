package com.zipcodewilmington.scientificcalculator;

import sun.util.calendar.CalendarUtils;

public class MainApplication {
    public static void main(String[] args) {
        //Without this object instance, no methods below would run. THIS IS CRUCIAL.
        CoreFunctions coreFunctions = new CoreFunctions();
        Calculator calc = new Calculator(0.0);
        Console console = new Console();
        Console.println("Welcome to our calculator!");
        String calculatorChoice = console.pickCalculator();

        console.calcChoice(calculatorChoice);




        String number1 = console.getFirstInput();
        String operator = console.getOperatorInput();
        String number2 = console.getSecondInput();







        System.out.println(calc.getCurrentValue());



        Console.println("The user input %s as the first number.", number1);
        Console.println("The user input %s as the operator", operator);
        Console.println("The user input %s as the second number.", number2);
        Console.println("Exiting Calculator");

    }
}
