package Kim;

/**
 * Created by andykim on 1/14/17.
 */
import sun.rmi.runtime.Log;

import java.util.Scanner;
import java.lang.Math;

public class Display {
    public static void main(String[] args) {

        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        ExponentialOperators exponentialOperators = new ExponentialOperators();
        LogFunctions logFunctions = new LogFunctions();
        TrigOperators trigOperators = new TrigOperators();

        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to do?");
        String choice = input.next();
        System.out.println("Enter first number");
        double firstNumber = input.nextLong();
        System.out.println("Enter second number");
        double secondNumber = input.nextDouble();


        switch (choice) {

            case "square" :
                exponentialOperators.square(firstNumber);
                break;

            case "squareRoot" :
                exponentialOperators.squareRoot(firstNumber);
                break;

            case "inversePower" :
                exponentialOperators.inversePower(firstNumber);
                break;

            case "log" :
                logFunctions.log(firstNumber);
                break;

            case "inverseLog" :
                logFunctions.inverseLog(firstNumber);
                break;

            case "naturalLog" :
                logFunctions.naturalLog(firstNumber);
                break;

            case "inverseNaturalLog" :
                logFunctions.inverseNaturalLog(firstNumber);
                break;

            case "sin" :
                trigOperators.sin(firstNumber);
                break;

            case "inverseSin" :
                trigOperators.inverseSin(firstNumber);
                break;

            case "cos" :
                trigOperators.cos(firstNumber);
                break;

            case "inverseCos" :
                trigOperators.inverseCos(firstNumber);
                break;

            case "tan" :
                trigOperators.tan(firstNumber);
                break;

            case "inverseTan" :
                trigOperators.inverseTan(firstNumber);
                break;

            case "add":
                arithmeticOperators.add(firstNumber, secondNumber);
                break;

            case "subtract" :
                arithmeticOperators.subtract(firstNumber, secondNumber);
                break;

            case "multiply" :
                arithmeticOperators.multiply(firstNumber, secondNumber);
                break;

            case "divide" :
                arithmeticOperators.divide(firstNumber, secondNumber);
                break;

            case "toPower" :
                exponentialOperators.toPower(firstNumber, secondNumber);
                break;

            case "pi" :
                System.out.println(Math.PI);
                break;

            case "clear" :
                System.out.println(0);
                break;


        }





    }
}
