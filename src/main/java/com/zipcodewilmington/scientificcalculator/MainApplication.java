package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

       /* Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d)*/
        Scanner scan = new Scanner(System.in);
        Integer choice;



        while(true) { // first while loop to verify valid input

            System.out.println("Please select between 1) Basic Calculator and 2) Scientific Calculator");
            choice = scan.nextInt();

            if(choice == 1) { // Option 1

                while (true) {  // second while loop to verify valid input
                    System.out.println("Please select from the options below\n 1) add \n 2) subtract\n 3) multiply \n 4) divison\n");
                    choice = scan.nextInt();

                    if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                        break;

                    }


                    else {
                        System.out.println("###############################");
                        System.out.println("# Please enter a valid option #");
                        System.out.println("###############################");
                        System.out.println();
                        continue;
                    }

                }//second loop
                break;
            }

            else if(choice == 2){ //Option 2

                while (true) {  // third while loop to verify valid input
                    System.out.println("Please select from the options below\n"+
                            "1) degree\n" +
                            "2) natural log\n" +
                            "3) base log\n" +
                            "4) inverse log\n" +
                            "5) square root\n" +
                            "6) inverse\n" +
                            "7) square\n" +
                            "8) exponent\n" +
                            "9) change sign\n" +
                            "10) sine\n" +
                            "11) cos\n" +
                            "12) tan\n" +
                            "13) inverseCosine\n" +
                            "14) inverseTangent\n" +
                            "15) inverseSine\n" +
                            "16) radian\n" +
                            "17) factorial\n" +
                            "18) fibonacci\n");
                    choice = scan.nextInt();

                    if (choice == 1 || choice == 2 || choice == 3 || choice == 4 ||choice == 5 || choice == 6 || choice == 7 || choice == 8) {
                        break;

                    }
                    else {
                        System.out.println("###############################");
                        System.out.println("# Please enter a valid option #");
                        System.out.println("###############################");
                        System.out.println();
                        continue;
                    }

                }//third loop ends here
                break;
            }
            else {
                System.out.println("###############################");
                System.out.println("# Please enter a valid option #");
                System.out.println("###############################");
                System.out.println();
                continue;

            }
        } // first loop


        /*while (true) {
            System.out.println("select from teh options below\n 1) add \n 2) subtract\n 3) multiply \n 4) divison\n");

            choice = scan.nextInt();
            if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                break;
            } else {
                System.out.println("Please enter a valid option");
                continue;
            }

        }*/


        System.out.println("Enter first number");
        Double input1 = scan.nextDouble();

        System.out.println("Enter second number");
        Double input2 = scan.nextDouble();


        BasicCalculator calc = new BasicCalculator();

        switch (choice) {
            case 1:
                System.out.println(calc.add(input1, input2));
                break;
            case 2:
                System.out.println(calc.subtract(input1, input2));
                break;
            case 3:
                System.out.println(calc.multiply(input1, input2));
                break;
            case 4:
                System.out.println(calc.divide(input1, input2));

        }


    }
}
