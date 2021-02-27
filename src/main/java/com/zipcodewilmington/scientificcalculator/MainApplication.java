package com.zipcodewilmington.scientificcalculator;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public MainApplication(double num1,double num2) {

    }

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);

    }

    /* //Test method used to check that test class was working
    public static double addNum(double num1, double num2) {
        double sumOf = num1 + num2;
        System.out.println(sumOf);
        return sumOf;
    }

     */

    //Takes a value for num2 for the log equation. num1 is not used in this case
    public static double logarithm(double num1, double num2) {
        double newNum = Math.log10(num2);
        System.out.println(newNum);
        return newNum;
    }
    public double invLog(double num1, double num2) {
        double newNum = Math.pow(10,num2);
        System.out.println(newNum);
        return newNum;
    }
    public double natLog(double num1, double num2) {
        double newNum = Math.log(num2);
        System.out.println(newNum);
        return newNum;
    }
    public double invNatLog(double num1, double num2) {
        double newNum = Math.pow(Math.E,num2);
        System.out.println(newNum);
        return newNum;
    }


}
