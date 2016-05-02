package io.michaelcarroll;

import java.util.Scanner;

/**
 * Prompts user to enter a command and prompts user to enter a number
 */

public class User {

    public String getCommandFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a command: ");
        return input.next();
    }

    public double getNumberFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        return input.nextDouble();
    }
}
