package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.ScannerCalculator.*;

/**
 * Created by leon on 2/9/18.
 */
public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //while loop to keep the program running until the user exits
        while (true) {
            //list of options for the user to choose from
            System.out.println("Group Orile Calculator Version 1.0");
            System.out.println("Curret value: " + displayValue);
            System.out.println("Choose operation");
            System.out.println("1- Get current value");
            System.out.println("2- Clear display");
            System.out.println("3- Change display value");
            System.out.println("4- Add");
            System.out.println("5- Subtract");
            System.out.println("6- Multiply");
            System.out.println("7- Divide");
            System.out.println("8- Square^2");
            System.out.println("9- SquareRt");
            System.out.println("0- Exit");

            // a case statement to handle the user's choice as an integer
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    getCurrentValue();
                    break;
                case 2:
                    clearDisplay();
                    break;
                case 3:
                    System.out.println("Enter new value: ");
                    double newValue = scanner.nextDouble();
                    changeDisplayValue(newValue);
                    break;
                case 4:
                    double addValue = scanner.nextDouble();
                    add(addValue);
                    break;
                case 5:
                    double subtractValue = scanner.nextDouble();
                    subtract(subtractValue);
                    break;
                case 6:
                    double multValue = scanner.nextDouble();
                    multiply(multValue);
                    break;
                case 7:
                    double divValue = scanner.nextDouble();
                    divide(divValue);
                    break;
                case 8:
                    double squareValue = scanner.nextDouble();
                    square(squareValue);
                    break;
                case 9:
                    double squareRtValue = scanner.nextDouble();
                    squareRoot(squareRtValue);
                    break;
                case 0:
                    System.out.println("Exiting the calculator");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid please try again");
            }
        }


    }
}

//branch test
//another branch test
//Something to commit