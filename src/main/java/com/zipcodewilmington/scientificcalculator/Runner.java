package com.zipcodewilmington.scientificcalculator;

//
//import com.sun.java.util.jar.pack.Instruction;
//
//import javax.xml.transform.Result;

import java.util.zip.Deflater;

public class Runner {

    private Double result = 0.0;
    private Double x;
    private Double y;
    private String operator;
    private String calcType = "core";
    private Boolean isRunning = true;





    public void runner() {

       while(isRunning) {
           Console.println("Welcome to my calculator!");
           Console.println("Options go here?....Enter Q as operator to quit");
           calcType = Console.getStringInput("Enter \"core\" or \"scientific\" ***this is case sensitive*** ");
           x = Double.parseDouble(Console.getStringInput("Enter First number"));
           y = Double.parseDouble(Console.getStringInput("Enter Second number (if no second is needed enter 0)"));
           operator = Console.getStringInput("Operator");


           if (calcType.equals("core")) {
               Calculator calc = new Calculator();
               System.out.println("------Core Mode------");
           } else if (calcType.equals("Scientific")) {
               scientificCalculator calc = new scientificCalculator();
               System.out.println("------Scientific Mode------");
           } else {
               System.out.println("error: did not enter core or scientific");
           }

//loop through operator and print out aw

           switch (operator) {
               case "+":
                   System.out.println(calc.add(x , y));
                   break;
               case "-":
                   System.out.println(calc.subtract( x, y));
                   break;
               case "*":
                   System.out.println(calc.multiply(x, y);
                   break;
               case "/":
                   System.out.println(calc.multiply(x, y);
                   break;
               case "q":
                   isRunning = false;
                   break;
               default:
                   System.out.println("error: please enter valid operator ");
                   break;


           }
       }
    }

}
