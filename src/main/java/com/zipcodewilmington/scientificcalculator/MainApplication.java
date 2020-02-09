package com.zipcodewilmington.scientificcalculator;

import static java.lang.Integer.*;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {


        double input;
        double total = 0;
        double currentTotal = 0;
        int operand;
        Display display = new Display();
        Operations opp = new Operations();
        double firstDouble;
        boolean on = true;

        Console.println("Welcome to my calculator!");
        String name = Console.getStringInput("Please enter your name!");
        Console.println(name);
        String operandPrompt = "Choose an operand: + , - , * , / , x^2 , sqrt , x^x , 1/x, c, off";
        while (on){
            if(display.checkState){
                input = Console.getDoubleInput("Please enter a number:");
                total = input;
                display.checkState = false;
            }else {
                operand = Console.getOperand(operandPrompt);
                switch (operand){
                    case 100:
                        on = false;
                        break;
                    case 0:
                        display.clearDisplay();
                        break;
                    case 1:
                        currentTotal = opp.add(total, Console.getDoubleInput("Please enter a number:"));
                        display.displayValue(currentTotal);
                        total = currentTotal;
                        break;
                    case 2:
                        currentTotal = opp.subtract(total, Console.getDoubleInput("Please enter a number:"));
                        display.displayValue(currentTotal);
                        total = currentTotal;
                        break;
                    case 3:
                        currentTotal = opp.multiply(total, Console.getDoubleInput("Please enter a number:"));
                        display.displayValue(currentTotal);
                        total = currentTotal;
                        break;
                    case 4:
                        currentTotal = opp.divide(total, Console.getDoubleInput("Please enter a number:"));
                        display.displayValue(currentTotal);
                        total = currentTotal;
                        break;
                    case 5:
                        currentTotal = opp.square(total);
                        display.displayValue(currentTotal);
                        total = currentTotal;
                        break;
                    case 6:
                        currentTotal = opp.squareRoot(total);
                        display.displayValue(currentTotal);
                        total = currentTotal;
                        break;
                    case 7:
                        currentTotal = opp.exponent(total, Console.getDoubleInput("Please enter a number:"));
                        display.displayValue(currentTotal);
                        total = currentTotal;
                        break;
                    case 8:
                        currentTotal = opp.inverse(total);
                        display.displayValue(currentTotal);
                        total = currentTotal;
                        break;

                }

            }
        }
    }
}

