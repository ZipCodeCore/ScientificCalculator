package com.zipcodewilmington.scientificcalculator;

//
//import com.sun.java.util.jar.pack.Instruction;
//
//import javax.xml.transform.Result;

import java.sql.SQLOutput;
import java.util.zip.Deflater;

public class Runner {
    private String state = "";
    private Double result = 0.0;
    private Double x;
    private Double y;
    private String operator;
    private String calcType = "";
    private Boolean isRunning = true;
    private String displayType = "d"; // decimal hex oct binary
    Calculator calc;
    scientificCalculator sciCalc;






    public void runner() {


           Console.println("Welcome to my calculator!");
           while(isRunning) {

               calcType = Console.getStringInput("Enter \"c\" for core or \"s\" for scientific ***this is case sensitive*** ");
               //if calc type does not = c or s handle err
               if(calcType.equals("s") ) {
                   displayType = Console.getStringInput("Enter \"d\" for Decimal, \"h\" for Hexidecimal, \"h\" for Octal or \"b\" for Binary ***this is case sensitive*** ");
                   // if wrong type enter let user know it has defaulted to decimal
               }

               if (calcType.equals("c")) {
                   calc = new Calculator();
                   System.out.println("------Core Mode------ \n" + "Available Operations: " + "" +
                           "| Add: + |  Subtract: - | Multiply: * | Divide: / | Square Root: sqrt | Square: sq | Exponent: exp | Inverse: inv | Negate: neg |\n" );
               } else if (calcType.equals("s")) {
                   sciCalc = new scientificCalculator();
                   System.out.println("------Scientific Mode------ \n" + "Available Operations: \n " +
                           "Sine: sin |  Cosine: cos | Tangent: tan | ArcSin: asin | ArcCos: acos | ArcTan: atan | \n" + " Log: log | Inverse Log: invog | Natual Log: ln | Inverse Natual: invln | Factorial: factorial\n" );;
               } else {
                   System.out.println("error: did not enter c or s" );
                   //This needs to go back to start
               }

           Console.println("Enter q as operator to quit");
           x = Double.parseDouble(Console.getStringInput("Enter First number"));
           state += x;
               System.out.println(state);
           y = Double.parseDouble(Console.getStringInput("Enter Second number (if no second is needed enter 0)"));
           state += y;
               System.out.println(state);
           operator = Console.getStringInput("Operator");
           state += operator;
               System.out.println(state);


//loop through operator and print out aw

           switch (operator) {
               case "q":
                   isRunning = false;
                   break;
               case "+":
                   result =(calc.add(x , y));
                   break;
               case "-":
                   result =(calc.subtract( x, y));
                   break;
               case "*":
                   result =(calc.multiply(x, y));
                   break;
               case "/":
                   result =(calc.divide(x, y));
                   break;
               case "sqrt":
                   result =(calc.sqrt(x));
                   break;
               case "sq":
                   result =(calc.sq(x));
                   break;
               case "exp":
                   result =(calc.exp(x, y));
                   break;
               case "inv":
                   result =(calc.inv(x));
                   break;
               case "neg":
                   result =(calc.negate(x));
                   break;

//   //////////Scientific Methods

               case "sin":
                   result =(sciCalc.sine(x));
                   break;
               case "cos":
                   result =(sciCalc.cosine( x));
                   break;
               case "tan":
                   result =(sciCalc.tangent(x));
                   break;
               case "asin":
                   result =(sciCalc.arcSine(x));
                   break;
               case "acos":
                   result =(sciCalc.arcCos(x));
                   break;
               case "atan":
                   result =(sciCalc.arcTan(x));
                   break;
               case "log":
                   result =(sciCalc.log(x));
                   break;
               case "invlog":
                   result =(sciCalc.invLog(x));
                   break;
               case "ln":
                   result =(sciCalc.ln(x));
                   break;
               case "factorial":
                   result =(sciCalc.factorial(x));
                   break;
               default:
                   System.out.println ("error: please enter valid operator ");
                   break;
           }



            if (displayType != "d") {
                state = sciCalc.switchDisplayMode(displayType, x);
                System.out.println(state + " = " + result);
            } else {
                System.out.println(result);
            }

       }
    }

}
