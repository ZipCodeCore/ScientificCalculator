package mccann.kevin.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kevinmccann on 1/13/17.
 */
public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    String command;
    ArrayList<String> commandList = new ArrayList<String>(Arrays.asList("ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "SQUARE", "SQUAREROOT", "POWER", "INVERSE", "SINE", "COSINE", "TANGENT", "INVERSESIN", "INVERSECOS", "INVERSETAN", "LOG", "INVERSELOG", "LN", "INVERSELN", "FACTORIAL"));


    public double getNumInput() {
        System.out.println("Enter a number:");
        return scanner.nextDouble();
    }

    public displayCommands() {
        System.out.println("What operation would you like to perform?");
        System.out.println("ADD  SUBTRACT  MULTIPLY  DIVIDE");
        System.out.println("SQUARE   SQUAREROOT  POWER   INVERSE");
        System.out.println("SINE  COSINE  TANGENT  INVERSESIN  INVERSECOS  INVERSETAN");
        System.out.println("LOG  INVERSELOG  LN  INVERSELN");
        System.out.println("FACTORIAL");


    }

    public String getCommandInput() {
        while(!(commandList.contains(command))) {
            System.out.println("What operation would you like to perform?");
            System.out.println("ADD  SUBTRACT  MULTIPLY  DIVIDE");
            System.out.println("SQUARE   SQUAREROOT  POWER   INVERSE");
            System.out.println("SINE  COSINE  TANGENT  INVERSESIN  INVERSECOS  INVERSETAN");
            System.out.println("LOG  INVERSELOG  LN  INVERSELN");
            System.out.println("FACTORIAL");
            command = scanner.nextLine().toUpperCase();
            if (!(commandList.contains(command)))
                System.out.println("That's not an option!");
        }
        return command;
    }

}
