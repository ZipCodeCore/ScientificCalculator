package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        //String s = Console.getStringInput("Enter a string");
        //Integer i = Console.getIntegerInput("Enter an integer");
        //Double d = Console.getDoubleInput("Enter a double.");

        //Console.println("The user input %s as a string", s);
        //Console.println("The user input %s as a integer", i);
        //Console.println("The user input %s as a d", d);


        /*
        * class creation variables
        * */
        ////////////////////////
        CoreFeatures basic = new CoreFeatures();
        boolean turnOn = true;
        int toDo;
        double x;
        double y;

        while(turnOn){
            toDo = Console.getIntegerInput("What sup bitch! what do you want \n" +
                    "Choose your option: \n" +
                    "1 - Addition \n" +
                    "2 - Subtraction \n" +
                    "3 - Multiplication \n" +
                    "4 - Division \n" +
                    "5 - Exponential \n" +
                    "6 - Square \n" +
                    "7 - Square Root \n" +
                    "8 - Inverse \n" +
                    "9 - Scientific Calculator \n" +
                    "10 - Turn off Calculator \n");

            switch (toDo) {
                case 1 :
                    x = Console.getDoubleInput("What is your X value?");
                    y = Console.getDoubleInput("What is your Y value?");
                    Console.print(x + " + " + y + " = ");
                    System.out.println(basic.addition(x, y));
                    Console.getStringInput("");
                    break;
                case 2 :
                    x = Console.getDoubleInput("What is your X value?");
                    y = Console.getDoubleInput("What is your Y value?");
                    Console.print(x + " - " + y + " = ");
                    System.out.println(basic.subtraction(x, y));
                    Console.getStringInput("");
                    break;
                case 3 :
                    x = Console.getDoubleInput("What is your X value?");
                    y = Console.getDoubleInput("What is your Y value?");
                    Console.print(x + " * " + y + " = ");
                    System.out.println(basic.multiplication(x, y));
                    Console.getStringInput("");
                    break;
                case 4 :
                    x = Console.getDoubleInput("What is your X value?");
                    y = Console.getDoubleInput("What is your Y value?");
                    Console.print(x + " / " + y + " = ");
                    System.out.println(basic.division(x, y));
                    Console.getStringInput("");
                    break;
                case 5 :
                    x = Console.getDoubleInput("What is your X value?");
                    y = Console.getDoubleInput("What is your Y value?");
                    Console.print(x + " ^" + y + " = ");
                    System.out.println(basic.exponentiation(x, y));
                    Console.getStringInput("");
                    break;
                case 6 :
                    x = Console.getDoubleInput("What is your X value?");
                    Console.print(x + " ^2" + " = ");
                    System.out.println(basic.square(x));
                    Console.getStringInput("");
                    break;
                case 7 :
                    x = Console.getDoubleInput("What is your X value?");
                    Console.print("SquareRoot( " + x + " )" +" = ");
                    System.out.println(basic.squareRoot(x));
                    Console.getStringInput("");
                    break;
                case 8 :
                    x = Console.getDoubleInput("What is your X value?");
                    Console.print("1/" + x + " = ");
                    System.out.println(basic.inverse(x));
                    Console.getStringInput("");
                    break;
                case 9 :

                    break;
                case 10 :
                    turnOn = false;
                    break;
                default :
                    System.out.println("Not an option");
                    break;

            }

        }



    }
}
