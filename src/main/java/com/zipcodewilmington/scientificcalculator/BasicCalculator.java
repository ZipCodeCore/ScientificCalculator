package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class BasicCalculator {
    private Double state = 0.0;
    static private Scanner prompt = new Scanner(System.in);

    public void promptScreen() {
        System.out.println("Result: " + state.toString() + "\n\n");

        System.out.println("Choose your basic function");//
        System.out.println("1. ADD, 2. SUBTRACT, 3. DIVIDE, 4. MULTIPLY 5. SQUARE");
        System.out.println("6. SQUAREROOT, 7. EXPONENTIAL, 8. INVERSE, 9. SWITCHTHESIGN, 10. AVERAGE 11. COUNTDOWN");


       String functionPrompt = prompt.nextLine();
       while (functionPrompt.length() == 0) {
           functionPrompt = prompt.nextLine();
       }
        int function = Integer.valueOf(functionPrompt);

        if (function == 1) {
            System.out.print( " Second number is : ");
            Double num2 = prompt.nextDouble();
            state = addition(state, num2);
        } else if (function == 2) {
            System.out.print( " Second number is : ");
            Double num2 = prompt.nextDouble();
            state = subtraction(state, num2);
        } else if (function == 3) {
            System.out.print( " Second number is : ");
            Double num2 = prompt.nextDouble();
            state = division(state, num2);
        } else if (function == 4) {
           System.out.print( " Second number is : ");
            Double num2 = prompt.nextDouble();
            state = multiply(state, num2);
        } else if (function == 5) {
            state = square(state);
        } else if (function == 6) {
            state = squareRoot(state);
        } else if (function == 7) {
            System.out.print( " Second number is : ");
            Double num2 = prompt.nextDouble();
            state = exponential(state, num2);
        } else if (function == 8) {
            state = inverse(state);
        } else if (function == 9) {
            state = switchTheSign(state);
        } else if (function == 10){
            System.out.print( " Second number is : ");
            Double num2 = prompt.nextDouble();
            state = average(state, num2);
        } else if (function == 11){
            state = countdown(state);
        }
  //      return Calculator();

    }

    public Double addition(Double num1, Double num2) {
        return num1 + num2;
    }

    public double add ( double num1, double num2) {
        return num1 + num2 ;
    }


    public double subtraction ( double num1, double num2) {
        return num1 - num2;
    }

    public double subst ( double num1, double num2) {
        return num1 - num2 ;
    }

    public double division ( double num1, double num2) {return num1 / num2 ;}

    public double div ( double num1, double num2) {
        return num1/num2 ;
    }

    public double multiply ( double num1, double num2) {return num1 * num2 ;}

    public double multi ( double num1, double num2) { return num1 * num2 ;}

    public double square ( double num1) { return num1 * num1 ;}

    public double squareRoot ( double num1) { return Math.sqrt(num1) ;}

    public double sqroot ( double num1) {return Math.sqrt(num1) ;}

    public double exponential ( double num1, double num2) { return Math.pow( num1, num2) ;}

    public double exponent ( double num1, double num2) { return Math.pow( num1, num2) ;}

    public double inverse (double num2) {return (1/num2) ;}

    public double inv (double num2) {return (1/num2) ;}

    public double switchTheSign ( double num1) { return num1 * -1;}

    public double SignNumb (double num1) { return num1 * -1;}

    public double average ( double num1, double num2) { return (num1/num2)/ (2);}

    public double avg (double num1, double num2, double value1) { return (num1/num2)/ (2);}

    public double countdown ( double num1) {return num1 - 1;}

    public double countDown (double num1) {return num1 - 1;}

    }



