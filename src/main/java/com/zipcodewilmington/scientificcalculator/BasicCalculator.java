package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class BasicCalculator {

    public static void addition ( double num1, double num2) {
        Scanner console = new Scanner (System.in);
        System.out.println( " Please, enter two numbers for addition : ");
        System.out.print( " First number is : ");
        num1 = console.nextDouble();
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
        System.out.print( " Second number is : ");
        num2 = console.nextDouble();
        //double result = num1+ num2;
        double result = add(num1, num2);
        System.out.println("The subtraction between" + num1 + " and " + num2 +
                " is : " + result) ;
    }

    public static double add ( double num1, double num2) {
        return num1 + num2 ;
    }


    public static void subtraction ( double num1, double num2) {

        Scanner console = new Scanner (System.in);
        System.out.println( " Please, enter two numbers for subtraction : ");
        System.out.print( " First number is : ");
        num1 = console.nextDouble();
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
        System.out.print( " Second number is : ");
        num2 = console.nextDouble();
        //double result = num1 - num2;
        double result = subst (num1,num2);
        System.out.println(" The subtraction between" + num1 + " and " + num2 +
                " is : " + result) ;

    }

    public static double subst ( double num1, double num2) {
        return num1 - num2 ;
    }



    public static void division ( double num1, double num2) {

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


    public static double div ( double num1, double num2) {
        return num1/num2 ;
    }



    public static void multiply ( double num1, double num2) {

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

    public static double multi ( double num1, double num2) {
        return num1 * num2 ;
    }



    public static void square ( double num1) {

        Scanner console = new Scanner (System.in);
        System.out.println( " Please, enter a number and let's find its square : ");
        System.out.print( " The chosen number is : ");
        num1 = console.nextDouble();
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
        //double result = num1 * num1;
        double result = sqr(num1);
        System.out.println("The square of " + num1 +
                " is : " + result ) ;

    }

    public static double sqr ( double num1) {
        return num1 * num1 ;
    }


    public static void squareRoot ( double num1) {
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

    public static double sqroot ( double num1) {
        return Math.sqrt(num1) ;
    }




    public static void exponential ( double num1, double num2) {

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

    public static double exponent ( double num1, double num2) {
        return Math.pow( num1, num2) ;
    }



    public static void inverse ( double value3,double num2) {
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

    public static double inv ( double value3, double num2) {
        return (value3/num2) ;
    }




    public static void switchTheSign ( double num1) {

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

    public static double SignNumb (double num1) {
        return Math.abs(num1) ;
    }



    public static void average ( double num1, double num2) {
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

    public static double avg (double num1, double num2, double value1) {
        return (num1/num2)/ (value1) ;
    }



    public static void countdown ( double num1, double increment) {
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

    public static double countDown (double num1, double increment) {
        return num1 - increment  ;
    }


}
