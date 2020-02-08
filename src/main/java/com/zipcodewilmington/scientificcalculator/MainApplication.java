package com.zipcodewilmington.scientificcalculator;

import static com.zipcodewilmington.scientificcalculator.EmmaTestMethods.*;
import static com.zipcodewilmington.scientificcalculator.Console.*;


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
                int curInt = 0;
                int pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Integer.parseInt(s);
                    System.out.println(Addition(pastInt, curInt));
                    pastInt = curInt;

                }

            } else if (s.equals("2")) {
                int curInt = 0;
                int pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Integer.parseInt(s);
                    System.out.println(Subtraction(pastInt, curInt));
                    pastInt = curInt;

                }
            } else if (s.equals("3")) {
                int curInt = 0;
                int pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Integer.parseInt(s);
                    System.out.println(Multiply(pastInt, curInt));
                    pastInt = curInt;

                }
            } else if (s.equals("4")) {
                int curInt = 0;
                int pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Integer.parseInt(s);
                    System.out.println(Divide(pastInt, curInt));
                    pastInt = curInt;

                }
            } else if (s.equals("5")) {
                int curInt = 0;
                int pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Integer.parseInt(s);
                    System.out.println(Square(pastInt, curInt));
                    pastInt = curInt;

                }
            } else if (s.equals("6")) {
                int curInt = 0;
                int pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Integer.parseInt(s);
                    System.out.println(Square_Root(pastInt, curInt));
                    pastInt = curInt;

                }
            } else if (s.equals("7")) {
                int curInt = 0;
                int pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Integer.parseInt(s);
                    System.out.println(Exponent(pastInt, curInt));
                    pastInt = curInt;

                }
            } else if (s.equals("8")) {
                int curInt = 0;
                int pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Integer.parseInt(s);
                    System.out.println(Inverse(pastInt, curInt));
                    pastInt = curInt;

                }
            } else if (s.equals("9")) {
                int curInt = 0;
                int pastInt = 0;

                while (!s.equals("x")) {
                    s = Console.getStringInput("Please enter a number\nEnter x when done");
                    if (s.equals("x")) {
                        break;
                    }
                    curInt = Integer.parseInt(s);
                    System.out.println(Pos_Neg(pastInt, curInt));
                    pastInt = curInt;

                }
            }
            else if (s.equals("a")) {
                //Clear Error
            }
            else if (s.equals("b")) {
                //Clear Display
            }
            else if (s.equals("c")) {
                //Back
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
                    else {
                        System.out.println("Please enter a valid response");
                    }
            }
//End Rotate Display
            else if(s.equals("2")) {
                Memory();
            }
        }
//End Scientific
        else if (s.equals("3")) {
            System.exit(0);
        }
        else {
            System.out.println("Please enter a valid response");
        }
        BasicMenu();
        s = Console.getStringInput("Please select an option");
    }


}



