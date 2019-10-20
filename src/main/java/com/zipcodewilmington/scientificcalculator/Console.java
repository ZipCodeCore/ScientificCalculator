package com.zipcodewilmington.scientificcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static String printNum(Double outNum, Calculator.dMode mode) {
        if (mode == Calculator.dMode.DECIMAL) {
            return Double.toString(outNum);
        } else if (mode == Calculator.dMode.HEXADECIMAL){
            double n = outNum.doubleValue();
            return "";
//            return n.toHexString();
        }

        return "";
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getInput() {
        Console.print("> ");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase(); //get input from user

        return Console.cleanInput(input);
    }

    public static Double getNumber() {
        String input = getInput();
        while (true) {
            if (input.matches("-?\\d+(\\.\\d+)?")) break;
            /*else if (input.matches("mrc") || input.matches("mr")){
              return this.memory.memoryRecall();
            }*/
            else {
                println("Enter a number");
                input = getInput();
            }
        }
        return Double.valueOf(input);
    }

    public static Double[] getDoubleList() {
        ArrayList<Double> numbers = new ArrayList<Double>();

        String input = getInput();
        while (true) {
            if (input.matches("-?\\d+(\\.\\d+)?")) {
                numbers.add(Double.valueOf(input));
            } else if (input.equals("q")) {
                break;
            } else {
                println("Enter a number (blank to end)");
            }
            input = getInput();
        }

        return numbers.toArray(new Double[numbers.size()]);
    }


    public static String cleanInput(String userInput) {
        // three/four legit options: was input a command, operator (unary or binary), or number (checked by regEx)?
        if (Arrays.asList(Calculator.COMMANDS).contains(userInput) || Arrays.asList(Calculator.UNARYOPERATORS).contains(userInput) || Arrays.asList(Calculator.BINARYOPERATORS).contains(userInput) || userInput.matches("-?\\d+(\\.\\d+)?")) {
            return userInput;
        } else if (userInput.equals("")) {
            return "0";
        } else{
            return "ERR";
        }
    }
}
