package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

public class DegreesToRadians {
    Scanner scanner = new Scanner(System.in);
    String[] degreesRadians = {"radians", "degrees"};

    public String degreesToRadians() {
        boolean D2R = true;
        String degreesRadians = "";
        while (D2R) {
            System.out.println("Pick between degrees or radians");
            String userOperator = scanner.nextLine();
            if (userOperator.equals("degrees")) {
                degreesRadians = "degrees";
                D2R = false;
            } else if (userOperator.equals("radians")) {
                degreesRadians = "radians";
                D2R = false;
            } else {
                System.out.println("ERROR: Please enter \"degrees\" or \"radians\".");
            }
        }
        return degreesRadians;
    }
}