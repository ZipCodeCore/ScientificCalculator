package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

public class DegreesToRadians {
    Scanner scanner = new Scanner(System.in);
    String degreesRadians;

    public String degreesToRadians() {
        boolean D2R = true;

        while (D2R) {
            String userOperator = "";
            while(!userOperator.equals("degrees") || !userOperator.equals("radians")){
                System.out.println("Pick between degrees or radians");
                userOperator = scanner.nextLine();
                switch (userOperator){
                    case "degrees":
                        degreesRadians = "degrees";
                        break;
                    case "radians":
                        degreesRadians = "radians";
                        break;
                    default:
                        System.out.println("ERROR: Please enter \"degrees\" or \"radians\".");
                }
                }if(userOperator.equals("degrees") || userOperator.equals("radians")) break;
            }
        return degreesRadians;
    }
}