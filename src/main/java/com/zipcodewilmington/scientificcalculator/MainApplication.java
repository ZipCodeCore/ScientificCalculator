package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        Integer operation;
        Integer choice;
        Integer choice2;
        Double result;
        Double num1 = 1.0;
        Boolean binary;
        Boolean octal;
        Boolean hex;
        Boolean decimal;
        Boolean degrees;
        Boolean radians;


        SimpleMath simpleMath = new SimpleMath();
        LogFunctions logFunctions = new LogFunctions();
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        SwitchDisplay switchDisplay = new SwitchDisplay();

        Console.println("Welcome to my calculator!\n");

        do {
            Console.println("Please type one of the following options:\n" +
                                    "1 = switchDisplay to change calculator to Binary, Octal, Decimal (normal), or Hexadecimal.\n" +
                                    "2 = switchUnits to change between radians and degrees.\n" +
                                    "3 = turn calculator off completely.\n" +
                                    "4 = the calculator cause....  that's really what you need.\n");
            choice = Console.getIntegerInput("Enter the choice you would like to make.");

            if (choice == 1) {
                Console.println("Pick one of the following please:\n");

                do {
                    Console.println( "1 = Binary\n" +
                                            "2 = Octal\n" +
                                            "3 = Decimal\n" +
                                            "4 = Hex\n");
                    choice2 = Console.getIntegerInput("");
                    if (choice2 == 1) {
                        binary = true;
                        octal = false;
                        decimal = false;
                        hex = false;
                    } else if (choice2 == 2) {
                        binary = false;
                        octal = true;
                        decimal = false;
                        hex = false;
                    } else if (choice2 == 3) {
                        binary = false;
                        octal = false;
                        decimal = true;
                        hex = false;
                    } else if (choice2 == 4) {
                        binary = false;
                        octal = false;
                        decimal = false;
                        hex = true;
                    } else {
                        choice2 = 5;
                        Console.println("You have entered something incorrectly");
                    }
                } while (choice2 != 1 && choice2 != 2 && choice2 != 3 && choice2 != 4);

            } else if (choice == 2) {

                Console.println("Pick one of the following please:\n");
                do {
                    Console.println(  "1 = Radians\n" +
                                              "2 = Degrees\n");
                    choice2 = Console.getIntegerInput("");
                    if (choice2 == 1) {
                        radians = true;
                        degrees = false;
                    } else if (choice2 == 2) {
                        radians = false;
                        degrees = true;
                    } else {
                        Console.println("You have entered something incorrectly");
                    }
                } while (choice2 != 1 && choice2 != 2);

            } else if (choice == 3) {

                Console.println("SHUTTING DOOOWWNNNNNN!!!!!!");

            } else if (choice == 4) {
                Console.println("0 will exit you out of the Calculator!!!!\n" +
                        "1 for addition                         2 for subtraction\n" +
                        "3 for multiplication                   4 for division\n" +
                        "5 for squaring                         6 for exponent\n" +
                        "7 for square root                      8 for inverse\n" +
                        "9 for invert                           10 for logarithms\n" +
                        "11 for natural logarithms              12 for inverse logarithms\n" +
                        "13 for inverse natural logarithms      14 for sine\n" +
                        "15 for cosine                          16 for tangent\n" +
                        "17 for arcsine                         18 for arccosine\n" +
                        "19 for arctangent                      20 for factorial\n" +
                        "Any other number for HELLLPPPPPPP");

                do {

                    operation = Console.getIntegerInput("Enter the operation you would like to perform.");
                    if (operation != 0 ) {
                        num1 = Console.getDoubleInput("Enter your first number.");
                    }

                    switch (operation) {
                        case 1:
                            Double num2 = Console.getDoubleInput("Enter your second number.");
                            result = simpleMath.add(num1, num2);
                            System.out.println(num1 + " + " + num2 + " = " + result);
                            break;
                        case 2:
                            num2 = Console.getDoubleInput("Enter your second number.");
                            result = simpleMath.subtract(num1, num2);
                            System.out.println(num1 + " - " + num2 + " = " + result);
                            break;
                        case 3:
                            num2 = Console.getDoubleInput("Enter your second number.");
                            result = simpleMath.multiplication(num1, num2);
                            System.out.println(num1 + " x " + num2 + " = " + result);
                            break;
                        case 4:
                            num2 = Console.getDoubleInput("Enter your second number.");
                            if (num2 != 0) {
                                result = simpleMath.division(num1, num2);
                                System.out.println(num1 + " / " + num2 + " = " + result);
                            } else {
                                System.out.println("ERrER EeRRrRROO--OOOrrRR!?!?!");
                            }
                            break;
                        case 5:
                            result = simpleMath.square(num1);
                            System.out.println(num1 + " squared is " + result);
                            break;
                        case 6:
                            num2 = Console.getDoubleInput("Enter your second number.");
                            result = simpleMath.expo(num1, num2);
                            System.out.println(num1 + " to the power of " + num2 + " = " + result);
                            break;
                        case 7:
                            result = simpleMath.squareRoot(num1);
                            System.out.println("The square root of " + num1 + " is " + result);
                            break;
                        case 8:
                            result = simpleMath.inverse(num1);
                            if (num1 != 0) {
                                System.out.println("The inverse of " + num1 + " is " + result);
                            } else {
                                System.out.println("ERrER EeRRrRROO--OOOrrRR!?!?!");
                            }
                            break;
                        case 9:
                            result = simpleMath.invertSign(num1);
                            if (num1 != 0) {
                                System.out.println("The invert of " + num1 + " is " + result);
                            } else {
                                System.out.println("ERrER EeRRrRROO--OOOrrRR!?!?!");
                            }
                            break;
                        case 10:
                            result = logFunctions.log(num1);
                            System.out.println("The logarithm of " + num1 + " is " + result);
                            break;
                        case 11:
                            result = logFunctions.naturalLog(num1);
                            System.out.println("The natural logarithm of " + num1 + " is " + result);
                            break;
                        case 12:
                            result = logFunctions.inverseLog(num1);
                            System.out.println("The inverse logarithm of " + num1 + " is " + result);
                            break;
                        case 13:
                            result = logFunctions.inverseNaturalLog(num1);
                            System.out.println("The inverse natural logarithm of " + num1 + " is " + result);
                        case 14:
                            result = scientificFunctions.sin(num1);
                            System.out.println("The sine of " + num1 + " is " + result);
                            break;
                        case 15:
                            result = scientificFunctions.cos(num1);
                            System.out.println("The cosine of " + num1 + " is " + result);
                            break;
                        case 16:
                            result = scientificFunctions.tan(num1);
                            System.out.println("The tangent of " + num1 + " is " + result);
                            break;
                        case 17:
                            result = scientificFunctions.asin(num1);
                            System.out.println("The arcsine of " + num1 + " is " + result);
                            break;
                        case 18:
                            result = scientificFunctions.acos(num1);
                            System.out.println("The arccosine of " + num1 + " is " + result);
                            break;
                        case 19:
                            result = scientificFunctions.atan(num1);
                            System.out.println("The arctangent of " + num1 + " is " + result);
                            break;
                        case 20:
                            result = scientificFunctions.factorial(num1);
                            System.out.println("The factorial of " + num1 + " is " + result);
                            break;
                        default:
                            System.out.println("Your input was incorrect please type one of the following:\n" +
                                    "0 will exit you out of the Calculator!!!!\n" +
                                    "1 for addition                         2 for subtraction\n" +
                                    "3 for multiplication                   4 for division\n" +
                                    "5 for squaring                         6 for exponent\n" +
                                    "7 for square root                      8 for inverse\n" +
                                    "9 for invert                           10 for logarithms\n" +
                                    "11 for natural logarithms              12 for inverse logarithms\n" +
                                    "13 for inverse natural logarithms      14 for sine\n" +
                                    "15 for cosine                          16 for tangent\n" +
                                    "17 for arcsine                         18 for arccosine\n" +
                                    "19 for arctangent                      20 for factorial\n");
                            break;
                    }


                } while (operation != 0);
            } else {
                choice = 5;
                Console.println("SOMETHING WROOoNNNNNGGGGgggggg!!!!");
            }
        } while (choice != 3);
    }

}

