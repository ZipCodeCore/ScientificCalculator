package com.zipcodewilmington.scientificcalculator;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);

    }

    //Following methods take a value (num1) for the log equations.
    //Logarithms
    public static double logarithm(double num1) {
        double newNum = Math.log10(num1);
        System.out.println(newNum);
        return newNum;
    }
    //Inverted Logs
    public double invLog(double num1) {
        double newNum = Math.pow(10,num1);
        System.out.println(newNum);
        return newNum;
    }
    //Natural Logs
    public double natLog(double num1) {
        double newNum = Math.log(num1);
        System.out.println(newNum);
        return newNum;
    }
    //Inverted Natural Logs
    public double invNatLog(double num1) {
        double newNum = Math.pow(Math.E,num1);
        System.out.println(newNum);
        return newNum;
    }

}
