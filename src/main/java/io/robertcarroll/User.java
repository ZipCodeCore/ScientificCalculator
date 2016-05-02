package io.robertcarroll;

import java.util.Scanner;

public class User {

    public double inputNumber() {
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    public String inputCommand() {
        System.out.println("Enter a command: (type 'help' for command list)");
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    public int inputDisplayMode(){
        System.out.println("Which mode would you like?\n0: I don't know\n1: BINARY\n2: OCTAL\n3: DECIMAL\n4: HEXADECIMAL");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
