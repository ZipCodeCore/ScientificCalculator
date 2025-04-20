package com.zipcodewilmington.scientificcalculator;

import sun.lwawt.macosx.CPrinterDevice;

import java.security.Principal;

public class Calculator {
    String output;
    String calcState;
    Integer retries;
    scientificCalc sc;
    BasicCalculator bc;

    public Calculator(String op, scientificCalc scienCalc, BasicCalculator basicCalc) {
        output = op;
        calcState = null;
        retries = 0;
        sc = scienCalc;
        bc = basicCalc;

    }

    public void startCalc(Integer retries) {
        Console.println("Please enter 1 for a Basic Calculator or 2 for a Scientific Calculator.");
        String i = Console.getStringInput("Enter an integer!");
        if (i.equals("1")) {
            Console.println("This calculator does the following:");
            Console.println("add, subtract, multiply, divide, calculate the square,");
            Console.println("take the square root, variable exponentiation,");
            Console.println("take the inverse, switch signs, average, and counting down/up.");
            setCalcState(i);
        } else if (i.equals("2")) {
            Console.println("This calculator does the following:");
            Console.println("switch displays, commit to memory, clear memory, ine, cosine,");
            Console.println("tangent, inverse sine, inverse cosine, inverse tangent, switch units,");
            Console.println("log, inverse log, natural log, inverse of natural log, and factorials.");
            setCalcState(i);
        } else if (retries < 5) {
            Console.println("User input %s is invalid.", i);
            retries += 1;
            startCalc(retries);
        } else {
            Console.println("User input %s is invalid.", i);
            Console.println("User has surpassed max number of retries.");
        }
    }

    /* public void displayOutput(String outResult) {
        output = outResult;
        //Console.println(outResult);
    } */

    public void setCalcState(String inputReceived){
        calcState = inputReceived;
        if (inputReceived == null ? "2" == null : inputReceived.equals("2"))
            sc.promptScreen();
        else {
            bc.promptScreen();
        }

    }

    public void clear() {
        String clearer = "";
        for (int i = 0; i < 70; i++) {
            clearer += "\n";
        }
        System.out.println(clearer);

    }


}

