package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {
    private Double num1 = 0.0;
    private Double num2 = 0.0;
    private Double result = 0.0;
//    private String userInput;

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    public static Double getDoubleInput(String prompt) {
        return null;
    }

    /*
    public void run() {

        userInput = Console.getStringInput("0");
        while (!userInput.equalsIgnoreCase("q")) {

            if (Core.validOperator(userInput) == 1) {
                switch (userInput.toUpperCase()) {
                    case "M+": {
                        //result = Core.memPlus(num1);
                        break;
                    }
                    case "MC": {
                        //result = Core.memClear(num1);
                        break;
                    }
                    case "MRC": {
                        result = Core.memRecal();
                        break;
                    }
                    case "SIN": {
                        result = Core.sine(num1);
                        break;
                    }
                    case "COS": {
                        result = Core.cosine(num1);
                        break;
                    }
                    case "TAN": {
                        result = Core.tangent(num1);
                        break;
                    }
                    case "ASIN": {
                        result = Core.invSine(num1);
                        break;
                    }
                    case "ACOS": {
                        result = Core.invCosine(num1);
                        break;
                    }
                    case "ATAN": {
                        result = Core.invTan(num1);
                        break;
                    }
                    case "LOG": {
                        result = Core.log(num1);
                        break;
                    }
                    case "LN": {
                        result = Core.ln(num1);
                        break;
                    }
                    case "E^X": {
                        result = Core.invLn(num1);
                        break;
                    }
                    case "10^X": {
                        result = Core.invLog(num1);
                        break;
                    }
                    case "!": {
                        result = Core.factorial(num1);
                        break;
                    }
                    case "C": {
                        result = Core.clear();
                        break;
                    }
                    case "SQ": {
                        result = Core.square(num1);
                        num1 = result;
                        break;
                    }
                    case "SQRT": {
                        result = Core.squareRoot(num1);
                        break;
                    }
                    case "INV": {
                        result = Core.inverse(num1);
                        break;
                    }
                    case "SIGN": {
                        result = Core.invertSign(num1);
                        break;
                    }
                    default:
                        result = 666.66;
                        break;
                }

            }

            else if (Core.validOperator(userInput) == 2) {
                switch (userInput.toUpperCase()) {
                    case "+": {
                        userInput = Console.getStringInput("+");
                        num2 = Double.parseDouble(userInput);
                        result = Core.add(num1, num2);
                        break;
                    }
                    case "-": {
                        userInput = Console.getStringInput("-");
                        num2 = Double.parseDouble(userInput);
                        result = Core.subtract(num1, num2);
                        break;
                    }
                    case "*": {
                        userInput = Console.getStringInput("*");
                        num2 = Double.parseDouble(userInput);
                        result = Core.multiply(num1, num2);
                        break;
                    }
                    case "/": {
                        userInput = Console.getStringInput("/");
                        num2 = Double.parseDouble(userInput);
                        result = Core.divide(num1, num2);
                        break;
                    }
                    case "EXP": {
                        userInput = Console.getStringInput("EXP");
                        num2 = Double.parseDouble(userInput);
                        result = Core.exponent(num1, num2);
                        break;
                    }
                    case "SWDR": {
                    }
                    case "SWD": {
                    }
                    default:
                        result = 666.66;
                        break;
                }
            }
            else {
                num1 = Double.parseDouble(userInput);
                result = num1;
            }

            userInput = Console.getStringInput(result.toString());
            num1 = result;
        }


    }*/
}
