package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {



    public static void main(String[] args) {
<<<<<<< HEAD
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Integer ii = Console.getIntegerInput("Enter an integer");
        //Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a integer", ii);
        //Console.println("The user input %s as a d", d);
=======
        SimpleMath simpleMath = new SimpleMath();

        double result = 1.0;

        Console.println("Welcome to my calculator!\n" +
                "1 for addition \n2 for subtraction\n3 for multiplication\n4 for division\n" +
                "5 for squaring \n6 for exponent\n7 for square root\n8 for inverse\n" +
                "9 for invert\n10 for logarithms\n11 for sine\n12 for cosine\n13 tan for tangent\n");

        Integer operation = Console.getIntegerInput("Enter the operation you would like to perform.");
        Double num1 = Console.getDoubleInput("Enter your first number.");

        switch(operation) {
            case 1:
                Double num2 = Console.getDoubleInput("Enter your second.");
                result = simpleMath.add(num1, num2);
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                num2 = Console.getDoubleInput("Enter your second number.");
                result = simpleMath.subtract(num1, num2);
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                num2 = Console.getDoubleInput("Enter your second number.");
                result = simpleMath.multiplication(num1, num2);
                System.out.println(num1 + " x " + num2 + " = " + result);
                break;
            case 4:
                num2 = Console.getDoubleInput("Enter your second number.");
                result = simpleMath.division(num1, num2);
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            case 5:
                System.out.println(num1 + " squared is " + result);
                break;
            case 6:
                num2 = Console.getDoubleInput("Enter your second number.");
                //simpleMath.exponent(num1, num2);
                System.out.println(num1 + " to the power of " + num2 + " = " + result);
                break;
            case 7:
                System.out.println("The square root of " + num1 + " is " + result);
                break;
            case 8:
                System.out.println("The inverse of " + num1 + " is " + result);
                break;
            case 9:
                System.out.println("The logarithm of " + num1 + " is " + result);
                break;
            case 10:
                System.out.println("The sine of " + num1 + " is " + result);
                break;
            case 11:
                System.out.println("The cosine of " + num1 + " is " + result);
                break;
            case 12:
                System.out.println("The tangent of " + num1 + " is " + result);
                break;
            default:
                System.out.println("Your input was incorrect please type one of the following:\n" +
                        "1 for addition \n2 for subtraction\n3 for multiplication\n4 for division\n" +
                        "5 for squaring \n6 for exponent\n7 for square root\n8 for inverse\n" +
                        "9 for invert\n10 for logarithms\n11 for sine\n12 for cosine\ntan for tangent\n");
                break;



        }


        //Double num1 = Console.getDoubleInput("Enter your first number.");
        //Double num2 = Console.getDoubleInput("Enter a double.");




>>>>>>> 5fc5379bcfd98a961ba3060a7a722a4d6924258b

    }

}

