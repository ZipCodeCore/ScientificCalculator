package com.zipcodewilmington.scientificcalculator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    InputChecker inputCheck = new InputChecker();
    //create an array that includes all of the available operators
    String[] operators = {"add", "subtract", "multiply", "divide", "exponent", "square", "square root", "factorial",
            "inverse", "invert", "sin", "cos,", "tan", "inverse sin", "inverse cos",
            "inverse tan", "log", "inverse log", "natural log", "inverse natural log", "return"};
    //turn that array into a string
    List<String> operatorsList = Arrays.asList(operators);
    //create an array of each operation that requires two values
    String[] need2Values = {"add", "subtract", "multiply", "divide", "exponent"};
    //turn that array into a string
    List<String> need2ValuesList = Arrays.asList(need2Values);

    public Calculator() {
    }

    public void runCalculator() {
        boolean returnToMainMenu = true;
        while (returnToMainMenu) {
            System.out.println("Choose your Operator\nType \"cmd\" for commands.");
            String userOperator = scanner.nextLine();
            //ask the user for a operator
            while (!operatorsList.contains(userOperator)) {
                //provide a list of commands
                if (userOperator.equals("cmd")) {
                    System.out.println("*\"add\" - + - Addition*");
                    System.out.println("*\"subtract\" - - - Subtraction*");
                    System.out.println("*\"multiply\" - * - Multiplication*");
                    System.out.println("*\"divide\" - / - Division*");
                    System.out.println("*\"exponent\" - x^y - Exponential*");
                    System.out.println("*\"square\" - x^2 - Squared*");
                    System.out.println("*\"square root\" - √ -Square Root*");
                    System.out.println("*\"factorial\" - !x - Factorial*");
                    System.out.println("*\"inverse\" - 1/x - Inverse*");
                    System.out.println("*\"invert\" - +- - Invert*");
                    System.out.println("*\"sin\" - sin(x) - Sine*");
                    System.out.println("*\"cos\" - cos(x) - Cosine*");
                    System.out.println("*\"tan\" - tan(x) - Tangent*");
                    System.out.println("*\"inverse sin\" - sin(x)^-1 - Inverse Sine*");
                    System.out.println("*\"inverse cos\" - cos(x)^-1 - Inverse Cosine*");
                    System.out.println("*\"inverse tan\" - tan(x)^-1 - Inverse Tangent*");
                    System.out.println("*\"log\" - log(x) - Logarithm*");
                    System.out.println("*\"inverse log\" - 10^x - Inverse Logarithm*");
                    System.out.println("*\"natural log\" - ln(x) - Natural Logarithm*");
                    System.out.println("*\"inverse natural log\" - e^x - Inverse Natural Logarithm*");
                    //give an option to exit the calculator and go back to the main menu
                    System.out.println("*\"return\" - e^x - Return to Main Menu*");
                    //check if operator is correct, and break the loop
                } else if (operatorsList.contains(userOperator)) {
                    break;
                    //return an error if operator is not correct, and return to top of loop
                } else {
                    System.out.println("ERROR: Invalid command\n");
                }
                System.out.println("Choose your Operator\nType \"cmd\" for commands.");
                userOperator = scanner.nextLine();
            }
            if(userOperator.equals("return")){
                break;
            }

                //ask the user for a value
                    System.out.println("Enter your value");
                    String userValueAsString = scanner.nextLine();
                    boolean correctInput = false;
                    //run a while loop that checks if a proper number was entered
                    while(!correctInput) {
                            correctInput = inputCheck.isNumeric(userValueAsString);
                            if(correctInput) break;
                            System.out.println("Enter your value");
                            userValueAsString = scanner.nextLine();

                    }
                    Double userValue1 = Double.parseDouble(userValueAsString);

                if (need2ValuesList.contains(userOperator)) {
                    //ask for a second value
                    System.out.println("Enter your second value");
                    String userValue2AsString = scanner.nextLine();
                    correctInput = false;
                    //run a while loop that checks if a proper number was entered
                    while(!correctInput) {
                        correctInput = inputCheck.isNumeric(userValueAsString);
                        if(correctInput) break;
                        System.out.println("Enter your second value");
                        userValueAsString = scanner.nextLine();
                    }
                    Double userValue2 = Double.parseDouble(userValue2AsString);

                    //run the need2value operators INSIDE the if statement
                    switch (userOperator) {
                        case "add":
                            Addition add = new Addition();
                            Double sum = add.add(userValue1, userValue2);
                            System.out.println(userValue1 + " + " + userValue2 + " = " + sum);
                            break;
                        case "subtract":
                            Subtraction subtract = new Subtraction();
                            Double difference = subtract.subtract(userValue1, userValue2);
                            System.out.println(userValue1 + " - " + userValue2 + " = " + difference);
                            break;
                        case "multiply":
                            Multiplication multiply = new Multiplication();
                            Double product = multiply.multiply(userValue1, userValue2);
                            System.out.println(userValue1 + " * " + userValue2 + " = " + product);
                            break;
                        case "divide":
                            Division divide = new Division();
                            Double quotient = divide.divide(userValue1, userValue2);
                            if (quotient != null) {
                                System.out.println(userValue1 + " / " + userValue2 + " = " + quotient);
                            }
                            break;
                        case "exponent":
                            Exponent exponent = new Exponent();
                            Double powerOf = exponent.exponent(userValue1, userValue2);
                            System.out.println(userValue1 + " ^ " + userValue2 + " = " + powerOf);
                            break;
                    }
                } else if (!need2ValuesList.contains(userOperator)) {
                    switch (userOperator) {
                        case "square":
                            Squared squared = new Squared();
                            Double powerOf = squared.squared(userValue1);
                            System.out.println(userValue1 + " ^2 = " + powerOf);
                            break;
                        case "square root":
                            Sqrt sqrt = new Sqrt();
                            Double squareRoot = sqrt.sqrt(userValue1);
                            if (squareRoot != null)
                                System.out.println("√" + userValue1);
                            break;
                        case "factorial":
                            Factorial factorial = new Factorial();
                            Double facto = factorial.factorial(userValue1);
                            System.out.println("!" + userValue1 + " = " + facto);
                            break;
                        case "inverse":
                            Inverse inverse = new Inverse();
                            Double inversed = inverse.inverse(userValue1);
                            if (inverse != null)
                                System.out.println("1/" + userValue1 + " = " + inversed);
                            break;
                        case "invert":
                            Invert invert = new Invert();
                            Double inverted = invert.invert(userValue1);
                            System.out.println(userValue1 + " inverted = " + inverted);
                            break;
                        case "sin":
                            Sine sine = new Sine();
                            Double sin = sine.sine(userValue1);
                            System.out.println("sin(" + userValue1 + ") = " + sin);
                            break;
                        case "cos":
                            Cosine cosine = new Cosine();
                            Double cos = cosine.cosine(userValue1);
                            System.out.println("cos(" + userValue1 + ") = " + cos);
                            break;
                        case "tan":
                            Tangent tangent = new Tangent();
                            Double tan = tangent.tangent(userValue1);
                            System.out.println("tan(" + userValue1 + ") = " + tan);
                            break;
                        case "inverse sin":
                            InverseSine inverseSine = new InverseSine();
                            Double inverseSin = inverseSine.inverseSine(userValue1);
                            System.out.println("sin(" + userValue1 + ")^-1 = " + inverseSin);
                            break;
                        case "inverse cos":
                            InverseCosine inverseCosine = new InverseCosine();
                            Double inverseCos = inverseCosine.inverseCosine(userValue1);
                            System.out.println("cos(" + userValue1 + ")^-1 = " + inverseCos);
                            break;
                        case "inverse tan":
                            InverseTangent inverseTangent = new InverseTangent();
                            Double inverseTan = inverseTangent.inverseTangent(userValue1);
                            System.out.println("tan(" + userValue1 + ")^-1 = " + inverseTan);
                            break;
                        case "log":
                            Logarithm logarithm = new Logarithm();
                            Double log = logarithm.logarithm(userValue1);
                            if (log != null)
                                System.out.println("Log(" + userValue1 + ") = " + log);
                            break;
                        case "inverse log":
                            InverseLogarithm inverseLogarithm = new InverseLogarithm();
                            Double inverseLog = inverseLogarithm.inverseLogarithm(userValue1);
                            if (inverseLog != null)
                                System.out.println("10^" + userValue1 + " = " + inverseLog);
                            break;
                        case "natural log":
                            NaturalLogarithm naturalLogarithm = new NaturalLogarithm();
                            Double naturalLog = naturalLogarithm.naturalLogarithm(userValue1);
                            if(naturalLog != null)
                                System.out.println("ln(" + userValue1 + ") = " + naturalLog);
                            break;
                        case "inverse natural log":
                            InverseNaturalLogarithm inverseNaturalLogarithm = new InverseNaturalLogarithm();
                            Double inverseNatLog = inverseNaturalLogarithm.inverseNaturalLogarithm(userValue1);
                            System.out.println("(e^" + userValue1 + " = " + inverseNatLog);
                            break;
                    }
                }
            }
        }
    }