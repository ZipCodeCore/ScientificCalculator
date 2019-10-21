package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        //String s = Console.getStringInput("Enter a string");
        //Integer i = Console.getIntegerInput("Enter an integer");
        //Double d = Console.getDoubleInput("Enter a double.");

        //Console.println("The user input %s as a string", s);
        //Console.println("The user input %s as a integer", i);
        //Console.println("The user input %s as a d", d);


        /*
         * class creation variables
         * */
        ////////////////////////
        CoreFeatures basic = new CoreFeatures();
        ScientificFeatures science = new ScientificFeatures();
        boolean turnOn = true;
        boolean switchMode;
        boolean scientificCal;
        int mode;
        int toDo;
        double x;
        double y;
        int toDo2;

        while(turnOn){
            switchMode = true;
            toDo = Console.corePrompt();

            switch (toDo) {
                case 1 :
                    x = Console.getDoubleInput("What is your X value?");
                    y = Console.getDoubleInput("What is your Y value?");
                    Console.print(x + " + " + y + " = ");
                    System.out.println(basic.addition(x, y));
                    break;
                case 2 :
                    x = Console.getDoubleInput("What is your X value?");
                    y = Console.getDoubleInput("What is your Y value?");
                    Console.print(x + " - " + y + " = ");
                    System.out.println(basic.subtraction(x, y));
                    break;
                case 3 :
                    x = Console.getDoubleInput("What is your X value?");
                    y = Console.getDoubleInput("What is your Y value?");
                    Console.print(x + " * " + y + " = ");
                    System.out.println(basic.multiplication(x, y));
                    break;
                case 4 :
                    x = Console.getDoubleInput("What is your X value?");
                    y = Console.getDoubleInput("What is your Y value?");
                    Console.print(x + " / " + y + " = ");
                    System.out.println(basic.division(x, y));
                    break;
                case 5 :
                    x = Console.getDoubleInput("What is your X value?");
                    y = Console.getDoubleInput("What is your Y value?");
                    Console.print(x + " ^" + y + " = ");
                    System.out.println(basic.exponentiation(x, y));
                    break;
                case 6 :
                    x = Console.getDoubleInput("What is your X value?");
                    Console.print(x + " ^2" + " = ");
                    System.out.println(basic.square(x));
                    break;
                case 7 :
                    x = Console.getDoubleInput("What is your X value?");
                    Console.print("SquareRoot( " + x + " )" +" = ");
                    System.out.println(basic.squareRoot(x));
                    break;
                case 8 :
                    x = Console.getDoubleInput("What is your X value?");
                    Console.print("1/" + x + " = ");
                    System.out.println(basic.inverse(x));
                    break;
                case 9 :
                    ///////SWITCH TO SCIENTIFIC CALCULATOR/////////
                    //////////////////////////////////////////////
                    Console.println("Welcome to the Rho SQUAD Scientific Calculator");

                    while(switchMode){
                        scientificCal = true;
                        mode = Console.switchMode();
                        while(scientificCal){
                            toDo2 = Console.scientificPrompt();
                            switch(toDo2){
                                case 1:
                                    x = Console.getDoubleInput("What is your X value?");
                                    Console.print("sin (" + x + ") = ");
                                    System.out.println(mode == 1 ?  science.sine(x) : science.sine(science.switchMode(x)));
                                    break;
                                case 2:
                                    x = Console.getDoubleInput("What is your X value?");
                                    Console.print("cos (" + x + ") = ");
                                    System.out.println(mode == 1 ?  science.cosine(x) : science.cosine(science.switchMode(x)));
                                    break;
                                case 3:
                                    x = Console.getDoubleInput("What is your X value?");
                                    Console.print("tan (" + x + ") = ");
                                    System.out.println(mode == 1 ?  science.tangent(x) : science.tangent(science.switchMode(x)));
                                    break;
                                case 4:
                                    x = Console.getDoubleInput("What is your X value?");
                                    Console.print("Inverse sin (" + x + ") = ");
                                    System.out.println(mode == 1 ?  science.inverseSine(x) : science.inverseSine(science.switchMode(x)));
                                    break;
                                case 5:
                                    x = Console.getDoubleInput("What is your X value?");
                                    Console.print("Inverse cos (" + x + ") = ");
                                    System.out.println(mode == 1 ?  science.inverseCosine(x) : science.inverseCosine(science.switchMode(x)));
                                    break;
                                case 6:
                                    x = Console.getDoubleInput("What is your X value?");
                                    Console.print("Inverse tan (" + x + ") = ");
                                    System.out.println(mode == 1 ?  science.inverseTangent(x) : science.inverseTangent(science.switchMode(x)));
                                    break;
                                case 7:
                                    x = Console.getDoubleInput("What is your X value?");
                                    Console.print("log (" + x + ") = ");
                                    System.out.println(mode == 1 ?  science.log(x) : science.log(science.switchMode(x)));
                                    break;
                                case 8:
                                    x = Console.getDoubleInput("What is your X value?");
                                    Console.print("Inverse log (" + x + ") = ");
                                    System.out.println(mode == 1 ?  science.inverseLog(x) : science.inverseLog(science.switchMode(x)));
                                    break;
                                case 9:
                                    x = Console.getDoubleInput("What is your X value?");
                                    Console.print("ln (" + x + ") = ");
                                    System.out.println(mode == 1 ?  science.ln(x) : science.ln(science.switchMode(x)));
                                    break;
                                case 10:
                                    x = Console.getDoubleInput("What is your X value?");
                                    Console.print("Inverse ln (" + x + ") = ");
                                    System.out.println(mode == 1 ?  science.inverseNaturalLog(x) : science.inverseNaturalLog(science.switchMode(x)));
                                    break;
                                case 11:
                                    x = Console.getDoubleInput("What is your X value?");
                                    Console.print("Factorial of " + x + " is ");
                                    System.out.println(mode == 1 ?  science.factorial(x) : science.factorial(science.switchMode(x)));
                                    break;
                                case 12:
                                    scientificCal = false;
                                    break;
                                case 13:
                                    switchMode = false;
                                    scientificCal = false;
                                    break;
                                case 14:
                                    switchMode = false;
                                    scientificCal = false;
                                    turnOn = false;
                                    break;
                                default:
                                    System.out.println("Not an option\nPlease try again\n");
                                    break;
                            }
                        }
                    }

                    break;
                case 10 :
                    turnOn = false;
                    break;
                default :
                    System.out.println("Not an option\nPlease try again\n");
                    break;
            }
        }
    }
}
