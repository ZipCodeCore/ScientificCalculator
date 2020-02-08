package com.zipcodewilmington.scientificcalculator;


import static com.zipcodewilmington.scientificcalculator.Console.*;
import static com.zipcodewilmington.scientificcalculator.Basic.*;

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
                double curInt = 0;
                double pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Double.parseDouble(s);
                    System.out.println(add(pastInt, curInt));
                    pastInt = curInt;

                }

            } else if (s.equals("2")) {
                double curInt = 0;
                double pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Double.parseDouble(s);
                    System.out.println(Subtraction(pastInt, curInt));
                    pastInt = curInt;

                }
            } else if (s.equals("3")) {
                double curInt = 0;
                double pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Double.parseDouble(s);
                    System.out.println(Multiply(pastInt, curInt));
                    pastInt = curInt;

                }
            } else if (s.equals("4")) {
                double curInt = 0;
                double pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Double.parseDouble(s);
                    System.out.println(Divide(pastInt, curInt));
                    pastInt = curInt;

                }
            } else if (s.equals("5")) {
                double curInt = 0;
                double pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Double.parseDouble(s);
                    System.out.println(Square(pastInt, curInt));
                    pastInt = curInt;

                }
            } else if (s.equals("6")) {
                double curInt = 0;
                double pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Double.parseDouble(s);
                    System.out.println(Square_Root(pastInt, curInt));
                    pastInt = curInt;

                }
            } else if (s.equals("7")) {
                double curInt = 0;
                double pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Double.parseDouble(s);
                    System.out.println(Exponent(pastInt, curInt));
                    pastInt = curInt;

                }
            } else if (s.equals("8")) {
                double curInt = 0;
                double pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Double.parseDouble(s);
                    System.out.println(Inverse(pastInt, curInt));
                    pastInt = curInt;

                }
            } else if (s.equals("9")) {
                double curInt = 0;
                double pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Double.parseDouble(s);
                    System.out.println(Pos_Neg(pastInt, curInt));
                    pastInt = curInt;

                }
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
                Greeting();
            }
            else if (s.equals("d")) {
                //Main Menu
                Greeting();
            }
            else if (s.equals("e")) {
                //Exit
                ExitCalc();
            }
            else {
                System.out.println("Please enter a valid response");
            }
            //End Basic
        }

//Start Scientific
        else if (s.equals("2")) {
            SciMenuHome();
            s = Console.getStringInput("Please select an option");
 //Start Rotate Display
            if(s.equals("1")) {
                RotateDisplay();
                s = Console.getStringInput("Please select an option");
                    if(s.equals("1")) {
                        //bin
                    }
                    else if(s.equals("2")){
                        //oct
                    }
                    else if(s.equals("3")){
                        //dec
                    }
                    else if(s.equals("4")){
                        //hex
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
                        Greeting();
                    }
                    else if (s.equals("e")) {
                        //Exit
                        ExitCalc();
                    }
                    else {
                        System.out.println("Please enter a valid response");
                    }
            }
//End Rotate Display
//Start Memory
            else if(s.equals("2")) {
                Memory();
                s = Console.getStringInput("Please select an option");
                if(s.equals("1")) {
                    //M+
                }
                else if(s.equals("2")){
                    //MC
                }
                else if(s.equals("3")){
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
                }
                else if (s.equals("d")) {
                    //Main Menu
                    Greeting();
                }
                else if (s.equals("e")) {
                    //Exit
                    ExitCalc();
                }
                else {
                    System.out.println("Please enter a valid response");
                }
            }
//End Memory
//Start Trig
            else if(s.equals("3")) {
                TrigFunctions();
                s = Console.getStringInput("Please select an option");
                if(s.equals("1")) {
                    //sin
                }
                else if(s.equals("2")){
                    //cos
                }
                else if(s.equals("3")){
                    //tan
                }
                else if(s.equals("4")){
                    //arcsin
                }
                else if(s.equals("5")){
                    //arccos
                }
                else if(s.equals("6")){
                    //arctan
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
                    Greeting();
                }
                else if (s.equals("e")) {
                    //Exit
                    ExitCalc();
                }
                else {
                    System.out.println("Please enter a valid response");
                }
            }
//End Trig
//Start Mode Change
            else if(s.equals("4")) {
                ModeChange();
                s = Console.getStringInput("Please select an option");
                if(s.equals("1")) {
                    //deg
                }
                else if(s.equals("2")){
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
                }
                else if (s.equals("d")) {
                    //Main Menu
                    Greeting();
                }
                else if (s.equals("e")) {
                    //Exit
                    ExitCalc();
                }
                else {
                    System.out.println("Please enter a valid response");
                }
            }
//End Mode Change
//Start Log Function
            else if(s.equals("5")) {
                LogFunctions();
                s = Console.getStringInput("Please select an option");
                if(s.equals("1")) {
                    //log
                }
                else if(s.equals("2")){
                    //inverse log
                }
                else if(s.equals("3")){
                    //ln
                }
                else if(s.equals("4")){
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
                    Greeting();
                }
                else if (s.equals("e")) {
                    //Exit
                    ExitCalc();
                }
                else {
                    System.out.println("Please enter a valid response");
                }
            }
//End Log Function
//Start Factorial Function
            else if(s.equals("6")) {
                //Factorial Functions
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
            }
            else if (s.equals("d")) {
                //Main Menu
                Greeting();
            }
            else if (s.equals("e")) {
                //Exit
                ExitCalc();
            }
            else {
                System.out.println("Please enter a valid response");
            }
        }
//End Scientific
        else if (s.equals("3")) {
            System.exit(0);
        }
        else {
            System.out.println("Please enter a valid response");
        }
        Greeting();
        s = Console.getStringInput("Please select an option");
    }


}



