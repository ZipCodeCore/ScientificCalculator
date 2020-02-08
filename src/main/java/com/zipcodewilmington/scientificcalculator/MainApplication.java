package com.zipcodewilmington.scientificcalculator;

import static com.zipcodewilmington.scientificcalculator.EmmaTestMethods.*;
import static com.zipcodewilmington.scientificcalculator.Console.*;


/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("1 - Basic | 2 - Scientific | 3 - Exit");
        if(s.equals("1")) {
            BasicMenu();

            s = Console.getStringInput("Please select an option");
            if(s.equals("1")){
                int curInt = 0;
                int pastInt = 0;
                s = Console.getStringInput("Please enter a number\nEnter x when done");
                while(!s.equals("x")){
                    System.out.print("Please enter a number\nEnter x when done");
                    curInt = Integer.parseInt(s);
                    System.out.println(Addition(pastInt, curInt));
                    pastInt = curInt;

                }
            }
//            else if(s.equals("2")) {
//                s = Console.getStringInput(" Enter in following format \n a a a a \n Press enter when done");
//                String resString = s;
//                System.out.println((Addition(resString));
//            }
//            else if(s.equals("3")) {
//                s = Console.getStringInput(" Enter in following format \n a a a a \n Press enter when done");
//                String resString = s;
//                System.out.println((Addition(resString)));
//            }
        }
        else if(s.equals("2")) {
            SciMenu();
            s = Console.getStringInput("Please select an option");

        }
        else if(s.equals("3")) {
            System.exit(0);
        }
        else {
            System.out.println("Please enter a valid response");
        }


    }
}
