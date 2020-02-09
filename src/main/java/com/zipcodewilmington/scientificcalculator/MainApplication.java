package com.zipcodewilmington.scientificcalculator;

import static java.lang.Integer.*;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static int firstInt;
    public static int secondInt;
    public static double firstDouble;
    public static double secondDouble;
    public static boolean on = true;

    public static void main(String[] args) {

        Operations op = new Operations();
        ScientificCalc sciCalc = new ScientificCalc();
        //sciCalc.displayMode = "decimal";
        //sciCalc.unitsMode = "Degrees";

        Console.println("Welcome to my calculator!" + "\n" + "Let's do some stuff!");
        String name = Console.getStringInput("Please enter your name!");
        Console.println(name);
        firstDouble = Console.getDoubleInput("Please enter a number:");
        String operandPrompt = "Choose an operand: + , - , * , / , x^2 , sqrt , x^x , 1/x, c";
        while(on) {
        Console.getOperand(operandPrompt);
        }
    }
}

