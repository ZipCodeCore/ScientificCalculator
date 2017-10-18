package ibikunle.tolani;

import java.util.Scanner;

import static ibikunle.tolani.Calculations.answer;//importing a static variable from my class Calculations

/**
 * Created by tolaniibikunle on 1/16/17.
 */
public class NumberFromUser {
    static double input1, input2;
    static String choice;


    public static void promptFirstNumberFromUser() {
        Scanner generateFirstNumber = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        input1 = generateFirstNumber.nextDouble();

    }

    public static void promptTextFromUser() {
        Scanner generateFirstOperator = new Scanner(System.in);
        System.out.println("Enter a operator : ");
         choice = generateFirstOperator.nextLine();
    }
    public static void promptSecondNumberFromUser(){
        Scanner generateSecondNumber = new Scanner(System.in);
        System.out.println("Enter a second Number");
        input2 = generateSecondNumber.nextDouble();
    }
    public static void getSolution(){
        input1= answer;
        System.out.println(answer);
        Scanner getResult = new Scanner(System.in);
        System.out.println("Enter a operator : ");
        choice= getResult.nextLine();
        promptSecondNumberFromUser();
        Display.choose(NumberFromUser.choice);
    }
}
