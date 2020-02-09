package com.zipcodewilmington.scientificcalculator;

public class AskNumber {

    // Ask for a Double

    public static double askDouble() {
        double d = 0;
        d = Console.getDoubleInput("Enter a double.");
        return d;
    }

    // Ask for an Operator
    public static String getOperation() {
        String operator = "";
        String operation = "";
        operator = Console.getStringInput("What would you like to do?\nPlease type one of the following \nAdd  Subtract  Multiply  Divide  Remainder Clear");
        while(!operator.equalsIgnoreCase("Add")  && !operator.equalsIgnoreCase("Subtract")  && !operator.equalsIgnoreCase("Multiply")  && !operator.equalsIgnoreCase("Divide") && !operator.equalsIgnoreCase("Remainder") && !operator.equalsIgnoreCase("Clear")){
            Console.println("You selected " + operator);
            operator = Console.getStringInput("Invalid Input! Please type one of the following \nAdd  Subtract  Multiply  Divide  Remainder Clear");
        }
        return operator;
    }


    // Ask for a Number
//    public static String askNumType() {
//        String a = "";
//        a = Console.getStringInput("Please type A for Integer or B for Double");
//        while(!a.equals("A")  && !a.equals("B")){
//            Console.println("your input was " + a);
//            a = Console.getStringInput("Invalid Input! Please type A for Integer or B for Double");
//        }
//       return a;
//    }

//    // Ask for an Int
//    public static int askInt() {
//        int i = 0;
//        i = Console.getIntegerInput("Enter an integer");
//        Console.println(i+ "");
//        return i;
//    }



//    //Variables
//    int i = 0;
//    double d = 0;
//    String operator = "";
//    String a = "";
//    String b = "";
//    int total = 0;
//
//    //AskNumber.askNumType();
//    //AskNumber.askInt();
//    //AskNumber.val1
//
//
//
//    //Ask for operation
//    operator = Console.getStringInput("Please type | A for Add | S for Subtract | M for Multiply | D for Divide");
//            while(!operator.equals("A")  && !operator.equals("S")  && !operator.equals("M")  && !operator.equals("D")){
//        Console.println("your input was " + operator);
//        operator = Console.getStringInput("Invalid Input! Please type | A for Add | S for Subtract | M for Multiply | D for Divide");
//    }
//
//            if (operator.equals("A")) { //Add
//        b  = Console.getStringInput("Please type A for Integer or B for Double");
//        while(!a.equals("A")  && !a.equals("B")){
//            Console.println("your input was " + a);
//            a = Console.getStringInput("Invalid Input! Please type A for Integer or B for Double");
//        }
//     if (operator.equals("A")) { //Add
//
//    } else if (operator.equals("S")) { //Subtract
//        //Subtract
//        Console.println("Your operator is -");
//    } else if (operator.equals("M")) { //Multiply
//        //Multiply
//        Console.println("Your operator is *");
//    } else if (operator.equals("D")){ //Divide
//        //Divide
//        Console.println("Your operator is /");
//    }

}
