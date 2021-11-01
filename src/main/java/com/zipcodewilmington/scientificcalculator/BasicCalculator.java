package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class BasicCalculator {
    private Double state = 0.0;
    static private Scanner prompt = new Scanner(System.in);

    public void promptScreen() {
        System.out.println("Result: " + state.toString() + "\n\n");

        System.out.println("Choose your scientific function");//
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
//        } else if (function == 3) {
//            return division();
//        } else if (function == 4) {
//            return multiply();
        } else if (function == 5) {
            state = square(state);
        }
//        } else if (function == 6) {
//            return squareRoot();
//        } else if (function == 7) {
//            return exponential();
//        } else if (function == 8) {
//            return inverse();
//        } else if (function == 9) {
//            return switchTheSign();
//        } else if (function == 10){
//            return average();
//        } else if (function == 11){
//            return countdown();
//        }
//        return Calculator();

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



    public void division ( double num1, double num2) {

        Scanner console = new Scanner (System.in);
        System.out.println( " Please, enter two numbers for division : ");
        System.out.print( " First number : ");
        num1 = console.nextDouble();
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
        System.out.print( " Second number : ");
        num2 = console.nextDouble();
        if ( num2 == 0 ) {
            throw new ArithmeticException(" Err! No Division by Zero.");
            //System.out.print("\033[H\033[2J");
            //System.out.flush();
        }
        else {
            //double result = num1 /num2;
            double result = div(num1,num2);
            System.out.println("The division of " + num1 + " by " + num2 +
                    " is : " + result);
        }

    }


    public double div ( double num1, double num2) {
        return num1/num2 ;
    }



    public void multiply ( double num1, double num2) {

        Scanner console = new Scanner (System.in);
        System.out.println( " Please, enter two numbers for multiplication : ");
        System.out.print( " First number : ");
        num1 = console.nextDouble();
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
        System.out.print( " Second number : ");
        num2 = console.nextDouble();
        //double result = num1 * num2;
        double result = multi(num1,num2);
        System.out.println("The multiplication between" + num1 + " and " + num2 +
                " is : " + result);
    }

    public double multi ( double num1, double num2) {
        return num1 * num2 ;
    }

    public Double square ( double num1) {
        double result = sqr(num1);
        return result;
    }

    public double sqr ( double num1) {
        return num1 * num1 ;
    }


    public void squareRoot ( double num1) {
        Scanner console = new Scanner (System.in);
        System.out.println( " Please, enter a number and let's find its square root: ");
        System.out.print( " The chosen number is : ");
        num1 = console.nextDouble();
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
        //double result = Math.sqrt(num1);
        double result = sqroot(num1);
        System.out.println(" The square root of " + num1 +
                " is : " + result) ;

    }

    public double sqroot ( double num1) {
        return Math.sqrt(num1) ;
    }




    public void exponential ( double num1, double num2) {

        Scanner console = new Scanner (System.in);
        System.out.println( " Please, enter a number and its power : ");
        System.out.print( " The Chosen number is : ");
        num1 = console.nextDouble();
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
        System.out.print( " The power is : ");
        num2 = console.nextDouble();
        //double result = Math.pow( num1, num2);
        double result = exponent( num1, num2);
        System.out.println( num1 + " exponential of " + num2 +
                " is : " + result);
    }

    public double exponent ( double num1, double num2) {
        return Math.pow( num1, num2) ;
    }



    public void inverse ( double value3,double num2) {
        value3 = 1;
        Scanner console = new Scanner (System.in);
        System.out.println( " Please, enter a number and its inverse : ");
        System.out.print( " The Chosen number is : ");
        num2 = console.nextDouble();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if ( num2 == 0 ) {
            throw new ArithmeticException (" Err! No Division by Zero.");
            //System.out.print("\033[H\033[2J");
            //System.out.flush();
        } else {
            //double result = (value3/num2);
            double result = (value3/num2);
            System.out.println("The inverse of " + num2 +
                    " is : " + result);
        }
    }

    public double inv ( double value3, double num2) {
        return (value3/num2) ;
    }




    public void switchTheSign ( double num1) {

        Scanner console = new Scanner(System.in);
        System.out.println(" Please, enter a number and let's switch its sign: ");
        System.out.print(" The chosen number is : ");
        num1 = console.nextDouble();
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
        //double result = Math.abs(num1);
        double result = SignNumb (num1);
        System.out.println(" The new value of " + num1 +
                " is : " + result);
    }

    public double SignNumb (double num1) {

        return Math.abs(num1) ;
    }



    public void average ( double num1, double num2) {
        double value1 = 2 ;
        Scanner console = new Scanner (System.in);
        System.out.println( " Please, enter two numbers for multiplication : ");
        System.out.print( " First number : ");
        num1 = console.nextDouble();
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
        System.out.print( " Second number : ");
        num2 = console.nextDouble();
        if ( num2 == 0 ) {
            throw new ArithmeticException(" Err! No Division by Zero.");
            //System.out.print("\033[H\033[2J");
            //System.out.flush();
        } else {
            //double result = (num1/num2)/ (value1) ;
            double result = avg (num1, num2, value1);
            System.out.println("The average of " + num1 + " and " + num2 +
                    " is : " + result);
        }

    }

    public double avg (double num1, double num2, double value1) {

        return (num1/num2)/ (value1) ;
    }



    public void countdown ( double num1, double increment) {
        increment = 1 ;
        Scanner console = new Scanner (System.in);
        System.out.println( " Please, enter a number for multiplication : ");
        System.out.print( " First number : ");
        num1 = console.nextDouble();
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
        // double result = num1 - increment ;
        double result = countDown ( num1, increment);
        System.out.println("The countdown of " + num1 +
                " is : " + result);
    }

    public double countDown (double num1, double increment) {
        return num1 - increment  ;
    }


}
