package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        //Greeting
        Console.println("Welcome to my calculator!");
        while (true){

            //Variables
            int i = 0;
            double d = 0;


            String operator = "";

            //Ask for Integer or Double
            String s = Console.getStringInput("Please type A for Integer or B for Double");
            while(!s.equals("A")  && !s.equals("B")){
                Console.println("your input was " + s);
                s = Console.getStringInput("Invalid Input! Please type A for Integer or B for Double");
            }

//            public static int getNum() {
//                return null;
//            }

            //Update Variables
            if (s.equals("A")) {
               i = Console.getIntegerInput("Enter an integer");
               Console.println(i+ "");
            } else if (s.equals("B")) d = Console.getDoubleInput("Enter a double.");

            //Ask for operation
            operator = Console.getStringInput("Please type | A for Add | S for Subtract | M for Multiply | D for Divide");
            while(!operator.equals("A")  && !operator.equals("S")  && !operator.equals("M")  && !operator.equals("D")){
                Console.println("your input was " + operator);
                operator = Console.getStringInput("Invalid Input! Please type | A for Add | S for Subtract | M for Multiply | D for Divide");
            }

            if (operator.equals("A")) {
                //Add

                Console.println("Your operator is +");
            } else if (operator.equals("S")) {
                //Subtract
                Console.println("Your operator is -");
            } else if (operator.equals("M")) {
                //Multiply
                Console.println("Your operator is *");
            } else if (operator.equals("D")){
                //Divide
                Console.println("Your operator is /");
            }

            Console.println("Display:", i, operator);
            Console.println("Display:", d,operator);
        }
    }

}
