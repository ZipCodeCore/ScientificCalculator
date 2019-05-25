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
    private String calcType = "";
    private Boolean isRunning = true;
    Calculator calc;
    scientificCalculator sciCalc;




    public void runner() {


           Console.println("Welcome to my calculator!");
           while(isRunning) {

               calcType = Console.getStringInput("Enter \"c\" for core or \"s\" for scientific ***this is case sensitive*** ");


               if (calcType.equals("c")) {
                   calc = new Calculator();
                   System.out.println("------Core Mode------ " + "Available Operations: " + "" +
                           "| Add: + |  Subtract: - | Multiply: * | Divide: / | Square Root: sqrt | Square: sq | Exponent: exp | Inverse: inv | Negate: neg |\n" );
               } else if (calcType.equals("s")) {
                   sciCalc = new scientificCalculator();
                   System.out.println("------Scientific Mode------");
               } else {
                   System.out.println("error: did not enter c or s" ); //This needs to go back to start
               }

           Console.println("Enter q as operator to quit");
           x = Double.parseDouble(Console.getStringInput("Enter First number"));
           y = Double.parseDouble(Console.getStringInput("Enter Second number (if no second is needed enter 0)"));
           operator = Console.getStringInput("Operator");




//loop through operator and print out aw

           switch (operator) {
               case "q":
                   isRunning = false;
                   break;
               case "+":
                   System.out.println(calc.add(x , y));
                   break;
               case "-":
                   System.out.println(calc.subtract( x, y));
                   break;
               case "*":
                   System.out.println(calc.multiply(x, y));
                   break;
               case "/":
                   System.out.println(calc.divide(x, y));
                   break;
               case "sqrt":
                   System.out.println(calc.sqrt(x));
                   break;
               case "sq":
                   System.out.println(calc.sq(x));
                   break;
               case "exp":
                   System.out.println(calc.exp(x, y));
                   break;
               case "inv":
                   System.out.println(calc.inv(x));
                   break;
               case "neg":
                   System.out.println(calc.negate(x));
                   break;

//   //////////Scientific Methods
               case "sin":
                   System.out.println(sciCalc.sine(x));
                   break;
               case "cos":
                   System.out.println(sciCalc.cosine( x));
                   break;
               case "tan":
                   System.out.println(sciCalc.tangent(x));
                   break;
               case "asin":
                   System.out.println(sciCalc.arcSine(x));
                   break;
               case "acos":
                   System.out.println(sciCalc.arcCos(x));
                   break;
               case "atan":
                   System.out.println(sciCalc.arcTan(x));
                   break;
               case "log":
                   System.out.println(sciCalc.log(x));
                   break;
               case "invlog":
                   System.out.println(sciCalc.invLog(x));
                   break;
               case "ln":
                   System.out.println(sciCalc.ln(x));
                   break;
               case "factorial":
                   System.out.println(sciCalc.factorial(x));

               default:
                   System.out.println("error: please enter valid operator ");
                   break;


           }
       }
    }

}
