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
            toDo = Console.corePrompt();

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
                    ///////SWITCH TO SCIENTIFIC CALCULATOR/////////
                    //////////////////////////////////////////////

                    break;
                case 10 :
                    turnOn = false;
                    break;
                default :
                    System.out.println("Not an option\nPlease try again\n");
                    Console.getStringInput("");
                    break;

            }

        }



    }
}
