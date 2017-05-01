package banuelos.aurora;

import java.util.Scanner;

/**
 * Created by aurorabanuelos on 4/29/17.
 */


public class Calculator {

    MathEquations equation = new MathEquations();
    double result;

    Scanner in = new Scanner(System.in);
    double firstOperand;
    double secondOperand;
    String opCode;



        public void print () {


        System.out.println("Enter first number: ");
        firstOperand = in.nextDouble();
        System.out.println("Operators available are add, subtract, multiply, divide, " +
                "exponent, square, squareroot, inverse, switch sign");
        System.out.println("Enter operator: ");
        opCode = in.next();
        if(opCode.equalsIgnoreCase("square") || opCode.equalsIgnoreCase("squareroot")
                || opCode.equalsIgnoreCase("inverse") || opCode.equalsIgnoreCase("switchsign")) {
            return;
        }
        System.out.println("Enter second number: ");
        secondOperand = in.nextDouble();


    }


public void calculate() {

    String operator = opCode;

    switch (operator.toLowerCase()){
        case "add":
            result = equation.add(firstOperand, secondOperand);
            System.out.println("Answer: " + result);
            break;

        case "subtract":
            result = equation.subtract(firstOperand, secondOperand);
            System.out.println("Answer: " + result);
            break;

        case "multiply":
            result = equation.multiply(firstOperand, secondOperand);
            System.out.println("Answer: " + result);
            break;

        case "divide":
            result = equation.divide(firstOperand, secondOperand);
            System.out.println(!Double.isNaN(result) ? "Answer: " + result : "Error");
            break;

        case "exponent":
            result = equation.exponent(firstOperand, secondOperand);
            System.out.println(!Double.isNaN(result) ? "Answer: " + result : "Error");
            break;

        case "square":
            result = equation.square(firstOperand);
            System.out.println("Answer: " + result);
            break;

        case "squareroot":
            result = equation.squareRoot(firstOperand);
            System.out.println(!Double.isNaN(result) ? "Answer: " + result : "Error");
            break;

        case "inverse":
            result = equation.inverse(firstOperand);
            System.out.println(!Double.isNaN(result) ? "Answer: " + result : "Error");
            break;

        case "switchsign":
            result = equation.switchSign(firstOperand);
            System.out.println("Answer: " + result);
            break;

        default:

    }
}


//    public double getResult(){
//            return result;
//    }



}
