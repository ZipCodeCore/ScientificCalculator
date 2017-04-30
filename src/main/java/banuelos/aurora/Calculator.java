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
        System.out.println("Operators available are add, subtract, multiply, divide");
        System.out.println("Enter operator: ");
        opCode = in.next();
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
            System.out.println("Answer: " + result);
            break;

        default:

    }
}


//    public double getResult(){
//            return result;
//    }



}
