package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
import static com.zipcodewilmington.scientificcalculator.Utilities.*;
import static com.zipcodewilmington.scientificcalculator.Basic.*;
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


    public static void RunCalc(){
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("1 - Basic | 2 - Scientific | 3 - Exit");


        if (s.equals("1")) {
            BasicMenu();
        }

        else if (s.equals("2")) {
            SciMenuHome();
        }

        else if (s.equals("xxx")) {
            System.exit(0);
        }
        else {
            System.out.println("Please enter a valid response");
            RunCalc();
        }
    }


    public static void BasicMenu() {
        System.out.printf("%-10s %-10s %-10s", "1 - Add |", "2 - Subtract |", "3 - Multiply \n");
        System.out.printf("%-10s %-10s %-10s", "4 - Divide |", "5 - Square |", "6 - Square Root \n");
        System.out.printf("%-10s %-10s %-10s", "7 - Exponent |", "8 - Inverse |", "9 - Pos <--> Neg \n");
        ForAllMenus();
        String s = Console.getStringInput("Please select an option");
        if (s.equals("1")) {
            //+
            double curInt;
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
            BasicMenu();
        }

        else if (s.equals("2")) {
            //-
            double curInt;
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
            BasicMenu();
        }
        else if (s.equals("3")) {
            //*
            double curInt;
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
            BasicMenu();
        }
        else if (s.equals("4")) {
            //divide
            double curInt;
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
            BasicMenu();
        }
        else if (s.equals("5")) {
            //square
            double curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Double.parseDouble(s);
            System.out.println(square(curInt));
            BasicMenu();
        }
        else if (s.equals("6")) {
            //square root
            double curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Double.parseDouble(s);
            System.out.println(squareRoot(curInt));
            BasicMenu();
        }
        else if (s.equals("7")) {
            //exponent
            double curInt;
            double pastInt = 0;

            while (!s.equals("x")) {
                s = Console.getStringInput("Please enter a number\nEnter x when done");
                if (s.equals("x")) {
                    break;
                }
                curInt = Double.parseDouble(s);
                if(pastInt == 0) {
                    System.out.println(curInt);
                }
                else {
                    System.out.println(exponent(pastInt, curInt));
                }


                pastInt = curInt;

            }
            BasicMenu();
        }
        else if (s.equals("8")) {
            //inverse
            double curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Double.parseDouble(s);
            System.out.println(inverse(curInt));

        } else if (s.equals("9")) {
            //sign change
            double curInt;
            s = Console.getStringInput("Please enter a positive or negative number");
            curInt = Double.parseDouble(s);
            System.out.println(signChange(curInt));
            BasicMenu();
        } else if (s.equals("a")) {
            //Clear Error
            s = "";
            BasicMenu();
        } else if (s.equals("b")) {
            //Clear Display
            s = "";
            BasicMenu();
        } else if ((s.equals("c")) || ((s.equals("d")))) {
            //Back
            RunCalc();

        } else if (s.equals("e")) {
            //Exit
            ExitCalc();
        } else {
            System.out.println("Please enter a valid response");
            BasicMenu();

        }

        
    }

    public static void SciMenuHome(){
        System.out.println("Rotate Display - 1");
        System.out.println("Memory - 2");
        System.out.println("Trig Functions - 3");
        System.out.println("Mode Change - 4");
        System.out.println("Log Functions - 5");
        System.out.println("Factorial Functions - 6");
        System.out.println("Utilities - 7");
        ForAllMenus();

       String s = Console.getStringInput("Please select an option");
        //Start Rotate Display
        if (s.equals("1")) {
            RotateDisplay();
        }
        else if (s.equals("2")) {
            Memory();
        }
        else if (s.equals("3")) {
            TrigFunctions();
        }
        else if (s.equals("4")) {
            ModeChange();
        }
        else if (s.equals("5")) {
            LogFunctions();
        }
        else if (s.equals("6")) {
            //Factorial Functions
            int curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Integer.parseInt(s);
            System.out.println(factorial(curInt));
            SciMenuHome();
        }
        else if (s.equals("7")) {
            Utilities();
        }

        else if (s.equals("a")) {
            //Clear Error
            s = "";
            SciMenuHome();
        }
        else if (s.equals("b")) {
            //Clear Display
            s = "";
            SciMenuHome();
        }
        else if (s.equals("c")) {
            //Back
            RunCalc();

        }
        else if (s.equals("d")) {
            //Main Menu
            RunCalc();

        }
        else if (s.equals("e")) {
            //Exit
            ExitCalc();
        }
        else {
            System.out.println("Please enter a valid response");
            SciMenuHome();

        }

    }

    public static void RotateDisplay(){
        System.out.println("Binary - 1");
        System.out.println("Octal - 2");
        System.out.println("Decimal - 3");
        System.out.println("Hexadecimal - 4");
        ForAllMenus();

        String s = Console.getStringInput("Please select an option");
        if (s.equals("1")) {
            //bin
            int curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Integer.parseInt(s);
            System.out.println(switchDisplayModeToBinary(curInt));
            RotateDisplay();
        }
        else if (s.equals("2")) {
            //oct
            int curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Integer.parseInt(s);
            System.out.println(switchDisplayModeToOctal(curInt));
            RotateDisplay();
        }
        else if (s.equals("3")) {
            //dec
            int curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Integer.parseInt(s);
            System.out.println(switchDisplayModeToDecimal(curInt));
            RotateDisplay();
        }
        else if (s.equals("4")) {
            //hex
            int curInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Integer.parseInt(s);
            System.out.println(switchDisplayModeToHexadecimal(curInt));
            RotateDisplay();
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
            SciMenuHome();

        }
        else if (s.equals("d")) {
            //Main Menu
            RunCalc();

        }
        else if (s.equals("e")) {
            //Exit
            ExitCalc();
        }
        else {
            System.out.println("Please enter a valid response");
            RotateDisplay();

        }
        RotateDisplay();

    }
    public static void Memory() {
        System.out.println("M+ - 1");
        System.out.println("MC - 2");
        System.out.println("MRC - 3");
        ForAllMenus();

        String s = Console.getStringInput("Please select an option");
        if (s.equals("1")) {
            //M+
            float curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(memPlus(curInt));
            Memory();
            memoryStatus = "stored";

        } else if (s.equals("2")) {
            //MC

            memClear();
            Memory();
            memoryStatus = "not stored";

        }

        else if (s.equals("3")) {
            //MRC

            if (memoryStatus.equals("stored")) {
                System.out.println(memNum);
                Memory();
            } else {
                System.out.println("No memory stored!");
                Memory();
            }

        }
        else if (s.equals("a")) {
            //Clear Error
            s = "";
            Memory();
        }
        else if (s.equals("b")) {
            //Clear Display
            s = "";
            Memory();
        }
        else if (s.equals("c")) {
            //Back
            SciMenuHome();

        }
        else if (s.equals("d")) {
            //Main Menu
            RunCalc();

        }
        else if (s.equals("e")) {
            //Exit
            ExitCalc();
        }
        else {
            System.out.println("Please enter a valid response");
            Memory();

        }

    }
    public static void TrigFunctions(){
        System.out.println("Sin - 1");
        System.out.println("Cos - 2");
        System.out.println("Tan - 3");
        System.out.println("Arcsin - 4");
        System.out.println("Arccos - 5");
        System.out.println("Arctan - 6");
        ForAllMenus();

        String s = Console.getStringInput("Please select an option");
        if (s.equals("1")) {
            //sin
            float curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(sine(curInt));
            TrigFunctions();

        }
        else if (s.equals("2")) {
            //cos
            float curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(cosine(curInt));
            TrigFunctions();
        }
        else if (s.equals("3")) {
            //tan
            float curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(tangent(curInt));
            TrigFunctions();
        }
        else if (s.equals("4")) {
            //arcsin
            float curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(inverseSine(curInt));
            TrigFunctions();
        }
        else if (s.equals("5")) {
            //arccos
            float curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(inverseCosine(curInt));
            TrigFunctions();
        }
        else if (s.equals("6")) {
            //arctan
            float curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(inverseTangent(curInt));
            TrigFunctions();
        }
        else if (s.equals("a")) {
            //Clear Error
            s = "";
            TrigFunctions();
        } else if (s.equals("b")) {
            //Clear Display
            s = "";
            TrigFunctions();
        } else if (s.equals("c")) {
            //Back
            SciMenuHome();

        } else if (s.equals("d")) {
            //Main Menu
            RunCalc();

        } else if (s.equals("e")) {
            //Exit
            ExitCalc();
        } else {
            System.out.println("Please enter a valid response");
            

        }
        TrigFunctions();
    }
    public static void ModeChange(){
        System.out.println("Rotate Degrees - 1");
        System.out.println("Rotate Radius - 2");
        ForAllMenus();

        String s = Console.getStringInput("Please select an option");
        if (s.equals("1")) {
            //deg
            float curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            ModeChange();
        }
        else if (s.equals("2")) {
            //rad
            float curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            ModeChange();
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
            SciMenuHome();

        }
        else if (s.equals("d")) {
            //Main Menu
            RunCalc();

        }
        else if (s.equals("e")) {
            //Exit
            ExitCalc();
        }
        else {
            System.out.println("Please enter a valid response");
            ModeChange();

        }
        ModeChange();

    }
    public static void LogFunctions(){
        System.out.println("Log10 - 1");
        System.out.println("10^x - 2");
        System.out.println("Ln - 3");
        System.out.println("e^x - 4");
        ForAllMenus();

        String s = Console.getStringInput("Please select an option");
        if (s.equals("1")) {
            //log
            float curInt;

            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(logarithm(curInt));

        }
        else if (s.equals("2")) {
            //inverse log
            float curInt;
            float pastInt = 0;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);

            if (pastInt == 0) {
                System.out.println(curInt);
            } else {
                System.out.println(inverseLogarithm(pastInt, curInt));
            }

            pastInt = curInt;


        }
        else if (s.equals("3")) {
            //ln
            float curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Float.parseFloat(s);
            System.out.println(naturalLogarithm(curInt));

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
            SciMenuHome();

        }
        else if (s.equals("d")) {
            //Main Menu
           RunCalc();

        }
        else if (s.equals("e")) {
            //Exit
            ExitCalc();
        }
        else {
            System.out.println("Please enter a valid response");
            LogFunctions();

        }
        LogFunctions();
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

    public static void Utilities(){
        System.out.println("Temp (F to C) - 1");
        System.out.println("Temp (C to F) - 2");
        System.out.println("Temp (F to K) - 3");
        System.out.println("Temp (K to F) - 4");
        System.out.println("Temp (C to K) - 5");
        System.out.println("Temp (K to C) - 6");
        ForAllMenus();

        String s = Console.getStringInput("Please select an option");
        if (s.equals("1")) {
            //F to C
            double curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Double.parseDouble(s);
            System.out.println(switchFtoC(curInt));
            Utilities();
        }
        else if (s.equals("2")) {
            //C to F
            double curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Double.parseDouble(s);
            System.out.println(switchCtoF(curInt));
            Utilities();
        }
        else if (s.equals("3")) {
            //F to K
            double curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Double.parseDouble(s);
            System.out.println(switchFtoK(curInt));
            Utilities();
        }
        else if (s.equals("4")) {
            //K to F
            double curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Double.parseDouble(s);
            System.out.println(switchKtoF(curInt));
            Utilities();
        }
        else if (s.equals("5")) {
            //C to K
            double curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Double.parseDouble(s);
            System.out.println(switchCtoK(curInt));
            Utilities();
        }
        else if (s.equals("6")) {
            //K to C
            double curInt;
            s = Console.getStringInput("Please enter a number");
            curInt = Double.parseDouble(s);
            System.out.println(switchKtoC(curInt));
            Utilities();
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
            SciMenuHome();

        }
        else if (s.equals("d")) {
            //Main Menu
            RunCalc();

        }
        else if (s.equals("e")) {
            //Exit
            ExitCalc();
        }
        else {
            System.out.println("Please enter a valid response");
            Utilities();

        }
        SciMenuHome();
    }


    }

