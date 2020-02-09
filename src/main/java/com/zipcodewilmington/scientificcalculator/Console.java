package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.Basic.*;
import static com.zipcodewilmington.scientificcalculator.EmmaTestMethods.Addition;
import static com.zipcodewilmington.scientificcalculator.Sci.*;
import static com.zipcodewilmington.scientificcalculator.Sci.factorial;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
    public static Integer getIntInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer userInput = scanner.nextInt();
        return userInput;
    }




    public static void BasicMenu(String s) {
        System.out.printf("%-10s %-10s %-10s", "1 - Add |", "2 - Subtract |", "3 - Multiply \n");
        System.out.printf("%-10s %-10s %-10s", "4 - Divide |", "5 - Square |", "6 - Square Root \n");
        System.out.printf("%-10s %-10s %-10s", "7 - Exponent |", "8 - Inverse |", "9 - Pos <--> Neg \n");
        ForAllMenus();
        s = Console.getStringInput("Please select an option");
        if (s.equals("1")) {
            //+
            double curInt = 0;
            double pastInt = 0;

            while (!s.equals("x")) {
                s = Console.getStringInput("Please enter a number\nEnter x when done");
                if (s.equals("x")) {
                    break;
                }
                curInt = Double.parseDouble(s);
                if (pastInt == 0) {
                    System.out.println(curInt);
                } else {
                    System.out.println(add(pastInt, curInt));
                }

                pastInt = curInt;

            }
            BasicMenu(s);
            s = Console.getStringInput("Please select an option");
        } else if (s.equals("2")) {
            //-
            double curInt = 0;
            double pastInt = 0;

            while (!s.equals("x")) {
                s = Console.getStringInput("Please enter a number\nEnter x when done");
                if (s.equals("x")) {
                    break;
                }
                curInt = Double.parseDouble(s);
                if (pastInt == 0) {
                    System.out.println(curInt);
                } else {
                    System.out.println(subtract(pastInt, curInt));
                }

                pastInt = curInt;

            }
            BasicMenu(s);
            s = Console.getStringInput("Please select an option");
        } else if (s.equals("3")) {
            //*
            double curInt = 0;
            double pastInt = 0;

            while (!s.equals("x")) {
                s = Console.getStringInput("Please enter a number\nEnter x when done");
                if (s.equals("x")) {
                    break;
                }
                curInt = Double.parseDouble(s);
                if (pastInt == 0) {
                    System.out.println(curInt);
                } else {
                    System.out.println(multiply(pastInt, curInt));
                }

                pastInt = curInt;

            }
            BasicMenu(s);
            s = Console.getStringInput("Please select an option");
        } else if (s.equals("4")) {
            //divide
            double curInt = 0;
            double pastInt = 0;

            while (!s.equals("x")) {
                s = Console.getStringInput("Please enter a number\nEnter x when done");
                if (s.equals("x")) {
                    break;
                }
                curInt = Double.parseDouble(s);
                if (pastInt == 0) {
                    System.out.println(curInt);
                } else {
                    System.out.println(divide(pastInt, curInt));
                }

                pastInt = curInt;

            }
            BasicMenu(s);
            s = Console.getStringInput("Please select an option");
        } else if (s.equals("5")) {
            //square
            double curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Double.parseDouble(s);
            System.out.println(square(curInt));
            BasicMenu(s);
            s = Console.getStringInput("Please select an option");
        } else if (s.equals("6")) {
            //square root
            double curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Double.parseDouble(s);
            System.out.println(squareRoot(curInt));
            BasicMenu(s);
            s = Console.getStringInput("Please select an option");
        } else if (s.equals("7")) {
            //exponent
            double curInt = 0;
            double pastInt = 0;

            while (!s.equals("x")) {
                s = Console.getStringInput("Please enter a number\nEnter x when done");
                if (s.equals("x")) {
                    break;
                }
                curInt = Double.parseDouble(s);
                System.out.println(exponent(pastInt, curInt));
                pastInt = curInt;

            }
            BasicMenu(s);
            s = Console.getStringInput("Please select an option");
        } else if (s.equals("8")) {
            //inverse
            double curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Double.parseDouble(s);
            System.out.println(inverse(curInt));
            BasicMenu(s);
            s = Console.getStringInput("Please select an option");
        } else if (s.equals("9")) {
            //sign change
            double curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Double.parseDouble(s);
            System.out.println(signChange(curInt));
            BasicMenu(s);
            s = Console.getStringInput("Please select an option");
        } else if (s.equals("a")) {
            //Clear Error
            s = "";

        } else if (s.equals("b")) {
            //Clear Display
            s = "";
        } else if ((s.equals("c")) || ((s.equals("d")))) {
            //Back
            Greeting();
            s = Console.getStringInput("Please select an option");
        } else if (s.equals("e")) {
            //Exit
            ExitCalc();
        } else {
            System.out.println("Please enter a valid response");
            BasicMenu(s);
            s = Console.getStringInput("Please select an option");
        }
        Greeting();
    }

    public static void SciMenuHome(String s){
        System.out.println("Rotate Display - 1");
        System.out.println("Memory - 2");
        System.out.println("Trig Functions - 3");
        System.out.println("Mode Change - 4");
        System.out.println("Log Functions - 5");
        System.out.println("Factorial Functions - 6");
        ForAllMenus();

        s = Console.getStringInput("Please select an option");
        //Start Rotate Display
        if (s.equals("1")) {
            RotateDisplay(s);
        }
        else if (s.equals("2")) {
            Memory(s);
        }
        else if (s.equals("3")) {
            TrigFunctions(s);
        }
        else if (s.equals("4")) {
            ModeChange(s);
        }
        else if (s.equals("5")) {
            LogFunctions(s);
        }
        else if (s.equals("6")) {
            //Factorial Functions
            int curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Integer.parseInt(s);
            System.out.println(factorial(curInt));
            SciMenuHome(s);
            s = Console.getStringInput("Please select an option");
        }
//End Factorial Function
        else if (s.equals("a")) {
            //Clear Error
            s = "";
        }
        else if (s.equals("b")) {
            //Clear Display
            s = "";
        }
        else if (s.equals("c")) {
            //Back
            Greeting();
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("d")) {
            //Main Menu
            Greeting();
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("e")) {
            //Exit
            ExitCalc();
        }
        else {
            System.out.println("Please enter a valid response");
            SciMenuHome(s);
            s = Console.getStringInput("Please select an option");
        }
    }

    public static void RotateDisplay(String s){
        System.out.println("Binary - 1");
        System.out.println("Octal - 2");
        System.out.println("Decimal - 3");
        System.out.println("Hexadecimal - 4");
        ForAllMenus();

        s = Console.getStringInput("Please select an option");
        if (s.equals("1")) {
            //bin
            int curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Integer.parseInt(s);
            System.out.println(switchDisplayModeToBinary(curInt));
            RotateDisplay(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("2")) {
            //oct
            int curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Integer.parseInt(s);
            System.out.println(switchDisplayModeToOctal(curInt));
            RotateDisplay(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("3")) {
            //dec
            int curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Integer.parseInt(s);
            System.out.println(switchDisplayModeToDecimal(curInt));
            RotateDisplay(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("4")) {
            //hex
            int curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Integer.parseInt(s);
            System.out.println(switchDisplayModeToHexadecimal(curInt));
            RotateDisplay(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("a")) {
            //Clear Error
            s = "";
        }
        else if (s.equals("b")) {
            //Clear Display
            s = "";
        }
        else if (s.equals("c")) {
            //Back
            SciMenuHome(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("d")) {
            //Main Menu
            Greeting();
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("e")) {
            //Exit
            ExitCalc();
        }
        else {
            System.out.println("Please enter a valid response");
            RotateDisplay(s);
            s = Console.getStringInput("Please select an option");
        }
    }
    public static void Memory(String s){
        System.out.println("M+ - 1");
        System.out.println("MC - 2");
        System.out.println("MRC - 3");
        ForAllMenus();

        s = Console.getStringInput("Please select an option");
        if (s.equals("1")) {
            //M+
            float curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(memPlus(curInt));
            Memory(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("2")) {
            //MC
        }
        else if (s.equals("3")) {
            //MRC
        }
        else if (s.equals("a")) {
            //Clear Error
            s = "";
        }
        else if (s.equals("b")) {
            //Clear Display
            s = "";
        }
        else if (s.equals("c")) {
            //Back
            SciMenuHome(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("d")) {
            //Main Menu
            Greeting();
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("e")) {
            //Exit
            ExitCalc();
        }
        else {
            System.out.println("Please enter a valid response");
            Memory(s);
            s = Console.getStringInput("Please select an option");
        }
    }
    public static void TrigFunctions(String s){
        System.out.println("Sin - 1");
        System.out.println("Cos - 2");
        System.out.println("Tan - 3");
        System.out.println("Arcsin - 4");
        System.out.println("Arccos - 5");
        System.out.println("Arctan - 6");
        ForAllMenus();

        s = Console.getStringInput("Please select an option");
        if (s.equals("1")) {
            //sin
            float curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(sine(curInt));
            TrigFunctions(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("2")) {
            //cos
            float curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(cosine(curInt));
            TrigFunctions(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("3")) {
            //tan
            float curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(tangent(curInt));
            TrigFunctions(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("4")) {
            //arcsin
            float curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(inverseSine(curInt));
            TrigFunctions(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("5")) {
            //arccos
            float curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(inverseCosine(curInt));
            TrigFunctions(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("6")) {
            //arctan
            float curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(inverseTangent(curInt));
            TrigFunctions(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("a")) {
            //Clear Error
            s = "";
        } else if (s.equals("b")) {
            //Clear Display
            s = "";
        } else if (s.equals("c")) {
            //Back
            SciMenuHome(s);
            s = Console.getStringInput("Please select an option");
        } else if (s.equals("d")) {
            //Main Menu
            Greeting();
            s = Console.getStringInput("Please select an option");
        } else if (s.equals("e")) {
            //Exit
            ExitCalc();
        } else {
            System.out.println("Please enter a valid response");
            TrigFunctions(s);
            s = Console.getStringInput("Please select an option");
        }
    }
    public static void ModeChange(String s){
        System.out.println("Rotate Degrees - 1");
        System.out.println("Rotate Radius - 2");
        ForAllMenus();

        s = Console.getStringInput("Please select an option");
        if (s.equals("1")) {
            //deg
            float curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(inverseTangent(curInt));
            ModeChange(s);
        }
        else if (s.equals("2")) {
            //rad
            float curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(inverseTangent(curInt));
            ModeChange(s);
        }
        else if (s.equals("a")) {
            //Clear Error
            s = "";
        }
        else if (s.equals("b")) {
            //Clear Display
            s = "";
        }
        else if (s.equals("c")) {
            //Back
            SciMenuHome(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("d")) {
            //Main Menu
            Greeting();
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("e")) {
            //Exit
            ExitCalc();
        }
        else {
            System.out.println("Please enter a valid response");
            ModeChange(s);
            s = Console.getStringInput("Please select an option");
        }
    }
    public static void LogFunctions(String s){
        System.out.println("Log - 1");
        System.out.println("Inverse Log - 2");
        System.out.println("Ln - 3");
        System.out.println("e^x - 4");
        ForAllMenus();

        s = Console.getStringInput("Please select an option");
        if (s.equals("1")) {
            //log
            float curInt = 0;

            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(logarithm(curInt));
            LogFunctions(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("2")) {
            //inverse log
            float curInt = 0;
            float pastInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);

            if (pastInt == 0) {
                System.out.println(curInt);
            } else {
                System.out.println(inverseLogarithm(pastInt, curInt));
            }

            pastInt = curInt;

            LogFunctions(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("3")) {
            //ln
            float curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(naturalLogarithm(curInt));
            LogFunctions(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("4")) {
            //e^x
        }
        else if (s.equals("a")) {
            //Clear Error
            s = "";
        }
        else if (s.equals("b")) {
            //Clear Display
            s = "";
        }
        else if (s.equals("c")) {
            //Back
            SciMenuHome(s);
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("d")) {
            //Main Menu
            Greeting();
            s = Console.getStringInput("Please select an option");
        }
        else if (s.equals("e")) {
            //Exit
            ExitCalc();
        }
        else {
            System.out.println("Please enter a valid response");
            LogFunctions(s);
            s = Console.getStringInput("Please select an option");
        }
        Greeting();
    }
    public static void ForAllMenus() {
        System.out.println("Clear Error - a");
        System.out.println("Clear Display - b");
        System.out.println("Back - c");
        System.out.println("Main Menu - d");
        System.out.println("Exit - e");
    }

    public static void ExitCalc(){
        System.exit(0);
    }

    public static String Greeting(){
        Console.println("Welcome to my calculator!");
        String choice = Console.getStringInput("1 - Basic | 2 - Scientific | 3 - Exit");
        return choice;
    }


    }

