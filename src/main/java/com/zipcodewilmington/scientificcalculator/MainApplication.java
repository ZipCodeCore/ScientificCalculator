package com.zipcodewilmington.scientificcalculator;


import static com.zipcodewilmington.scientificcalculator.Console.*;
import static com.zipcodewilmington.scientificcalculator.Basic.*;
import static com.zipcodewilmington.scientificcalculator.Sci.*;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        String s = Greeting();
        if (s.equals("1")) {
            BasicMenu();
//Basic Menu
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
                    if(pastInt == 0) {
                        System.out.println(curInt);
                    }
                    else{
                        System.out.println(add(pastInt, curInt));
                    }

                    pastInt = curInt;

                }
                BasicMenu();
                s = Console.getStringInput("Please select an option");
            }
            else if (s.equals("2")) {
                //-
                double curInt = 0;
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
                    else{
                        System.out.println(subtract(pastInt, curInt));
                    }

                    pastInt = curInt;

                }
                BasicMenu();
                s = Console.getStringInput("Please select an option");
            }
            else if (s.equals("3")) {
                //*
                double curInt = 0;
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
                    else{
                        System.out.println(multiply(pastInt, curInt));
                    }

                    pastInt = curInt;

                }
                BasicMenu();
                s = Console.getStringInput("Please select an option");
            }
            else if (s.equals("4")) {
                //divide
                double curInt = 0;
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
                    else{
                        System.out.println(divide(pastInt, curInt));
                    }

                    pastInt = curInt;

                }
                BasicMenu();
                s = Console.getStringInput("Please select an option");
            }
            else if (s.equals("5")) {
                //square
                double curInt = 0;
                s = Console.getStringInput("Please enter a number");
                curInt = Double.parseDouble(s);
                System.out.println(square(curInt));
                BasicMenu();
                s = Console.getStringInput("Please select an option");
            }
            else if (s.equals("6")) {
                //square root
                double curInt = 0;
                s = Console.getStringInput("Please enter a number");
                curInt = Double.parseDouble(s);
                System.out.println(squareRoot(curInt));
                BasicMenu();
                s = Console.getStringInput("Please select an option");
            }
            else if (s.equals("7")) {
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
                BasicMenu();
                s = Console.getStringInput("Please select an option");
            }
            else if (s.equals("8")) {
                //inverse
                double curInt = 0;
                s = Console.getStringInput("Please enter a number");
                curInt = Double.parseDouble(s);
                System.out.println(inverse(curInt));
                BasicMenu();
                s = Console.getStringInput("Please select an option");
            }
            else if (s.equals("9")) {
                //sign change
                double curInt = 0;
                s = Console.getStringInput("Please enter a number");
                curInt = Double.parseDouble(s);
                System.out.println(signChange(curInt));
                BasicMenu();
                s = Console.getStringInput("Please select an option");
            }
            else if (s.equals("a")) {
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
                BasicMenu();
                s = Console.getStringInput("Please select an option");
            }
            //End Basic
        }//end greeting option 1 (basic)

//Start Scientific
        else if (s.equals("2")) {
            SciMenuHome();
            s = Console.getStringInput("Please select an option");
            //Start Rotate Display
            if (s.equals("1")) {
                RotateDisplay();
                s = Console.getStringInput("Please select an option");
                if (s.equals("1")) {
                    //bin
                    int curInt = 0;
                    s = Console.getStringInput("Please enter a number");
                    curInt = Integer.parseInt(s);
                    System.out.println(switchDisplayModeToBinary(curInt));
                    RotateDisplay();
                    s = Console.getStringInput("Please select an option");
                }
                else if (s.equals("2")) {
                    //oct
                    int curInt = 0;
                    s = Console.getStringInput("Please enter a number");
                    curInt = Integer.parseInt(s);
                    System.out.println(switchDisplayModeToOctal(curInt));
                    RotateDisplay();
                    s = Console.getStringInput("Please select an option");
                }
                else if (s.equals("3")) {
                    //dec
                    int curInt = 0;
                    s = Console.getStringInput("Please enter a number");
                    curInt = Integer.parseInt(s);
                    System.out.println(switchDisplayModeToDecimal(curInt));
                    RotateDisplay();
                    s = Console.getStringInput("Please select an option");
                }
                else if (s.equals("4")) {
                    //hex
                    int curInt = 0;
                    s = Console.getStringInput("Please enter a number");
                    curInt = Integer.parseInt(s);
                    System.out.println(switchDisplayModeToHexadecimal(curInt));
                    RotateDisplay();
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
                    SciMenuHome();
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
                    RotateDisplay();
                    s = Console.getStringInput("Please select an option");
                }
            }

//End Rotate Display
//Start Memory
            else if (s.equals("2")) {
                Memory();
                s = Console.getStringInput("Please select an option");
                if (s.equals("1")) {
                    //M+
                    float curInt = 0;
                    s = Console.getStringInput("Please enter a number");
                    curInt = Float.parseFloat(s);
                    System.out.println(memPlus(curInt));
                    Memory();
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
                    SciMenuHome();
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
                    Memory();
                    s = Console.getStringInput("Please select an option");
                }
            }
//End Memory
//Start Trig
            else if (s.equals("3")) {
                TrigFunctions();
                s = Console.getStringInput("Please select an option");
                if (s.equals("1")) {
                    //sin
                    float curInt = 0;
                    s = Console.getStringInput("Please enter a number");
                    curInt = Float.parseFloat(s);
                    System.out.println(sine(curInt));
                    TrigFunctions();
                    s = Console.getStringInput("Please select an option");
                }
                else if (s.equals("2")) {
                    //cos
                    float curInt = 0;
                    s = Console.getStringInput("Please enter a number");
                    curInt = Float.parseFloat(s);
                    System.out.println(cosine(curInt));
                    TrigFunctions();
                    s = Console.getStringInput("Please select an option");
                }
                else if (s.equals("3")) {
                    //tan
                    float curInt = 0;
                    s = Console.getStringInput("Please enter a number");
                    curInt = Float.parseFloat(s);
                    System.out.println(tangent(curInt));
                    TrigFunctions();
                    s = Console.getStringInput("Please select an option");
                }
                else if (s.equals("4")) {
                    //arcsin
                    float curInt = 0;
                    s = Console.getStringInput("Please enter a number");
                    curInt = Float.parseFloat(s);
                    System.out.println(inverseSine(curInt));
                    TrigFunctions();
                    s = Console.getStringInput("Please select an option");
                }
                else if (s.equals("5")) {
                    //arccos
                    float curInt = 0;
                    s = Console.getStringInput("Please enter a number");
                    curInt = Float.parseFloat(s);
                    System.out.println(inverseCosine(curInt));
                    TrigFunctions();
                    s = Console.getStringInput("Please select an option");
                }
                else if (s.equals("6")) {
                    //arctan
                    float curInt = 0;
                    s = Console.getStringInput("Please enter a number");
                    curInt = Float.parseFloat(s);
                    System.out.println(inverseTangent(curInt));
                    TrigFunctions();
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
                    SciMenuHome();
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
                    TrigFunctions();
                    s = Console.getStringInput("Please select an option");
                }
            }
//End Trig
//Start Mode Change
            else if (s.equals("4")) {
                ModeChange();
                s = Console.getStringInput("Please select an option");
                if (s.equals("1")) {
                    //deg
                    float curInt = 0;
                    s = Console.getStringInput("Please enter a number");
                    curInt = Float.parseFloat(s);
                    System.out.println(inverseTangent(curInt));
                }
                else if (s.equals("2")) {
                    //rad
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
                    ModeChange();
                    s = Console.getStringInput("Please select an option");
                }
            }
//End Mode Change
//Start Log Function
            else if (s.equals("5")) {
                LogFunctions();
                s = Console.getStringInput("Please select an option");
                if (s.equals("1")) {
                    //log
                    float curInt = 0;
                    s = Console.getStringInput("Please enter a number");
                    curInt = Float.parseFloat(s);
                    System.out.println(logarithm(curInt));
                    LogFunctions();
                    s = Console.getStringInput("Please select an option");
                }
                else if (s.equals("2")) {
                    //inverse log
                    float curInt = 0;
                    s = Console.getStringInput("Please enter a number");
                    curInt = Float.parseFloat(s);
                    System.out.println(inverseLogarithm(curInt));
                    LogFunctions();
                    s = Console.getStringInput("Please select an option");
                }
                else if (s.equals("3")) {
                    //ln
                    float curInt = 0;
                    s = Console.getStringInput("Please enter a number");
                    curInt = Float.parseFloat(s);
                    System.out.println(naturalLogarithm(curInt));
                    LogFunctions();
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
                    SciMenuHome();
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
                    LogFunctions();
                    s = Console.getStringInput("Please select an option");
                }
            }
//End Log Function
//Start Factorial Function
            else if (s.equals("6")) {
                //Factorial Functions
                int curInt = 0;
                s = Console.getStringInput("Please enter a number");
                curInt = Integer.parseInt(s);
                System.out.println(factorial(curInt));
                SciMenuHome();
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
                SciMenuHome();
                s = Console.getStringInput("Please select an option");
            }
        }

//End Scientific

        else if (s.equals("3")) {
            System.exit(0);
        }
        else {
            System.out.println("Please enter a valid response");
            Greeting();
        }



    } //void main
} //main app







