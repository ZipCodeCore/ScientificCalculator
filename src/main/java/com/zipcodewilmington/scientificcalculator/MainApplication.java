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
            BasicMenu(s);
        }

        else if (s.equals("2")) {
            SciMenuHome(s);
        }

        else if (s.equals("3")) {
            System.exit(0);
        }
        else {
            System.out.println("Please enter a valid response");
            Greeting();
        }

    } //void main
} //main app







