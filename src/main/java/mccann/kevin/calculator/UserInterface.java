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

    public void displaySettingsChoice() {
        System.out.println("What would you like to do? 1) CALCULATE 2) CHANGE DISPLAY");
        Scanner calcOrChgDisplay = new Scanner(System.in);
        int choice = calcOrChgDisplay.nextInt();
        if(choice == 2)
            displaySettings();
    }

    public void displaySettings() {
        System.out.println("Choose a display mode (or cycle to next display mode with any other input):");
        System.out.println("1) DECIMAL 2) OCTAL 3) HEX 4) BINARY");
        Scanner displaySettings = new Scanner(System.in);
        Display display = new Display();
        int choice = displaySettings.nextInt();
        switch (choice) {
            case 1:
                display.switchDisplayMode(DisplayMode.DECIMAL);
                break;
            case 2:
                display.switchDisplayMode(DisplayMode.OCTAL);
                break;
            case 3:
                display.switchDisplayMode(DisplayMode.HEX);
                break;
            case 4:
                display.switchDisplayMode(DisplayMode.BINARY);
                break;
            default:
                display.switchDisplayMode();
                break;
        }
    }


    public double getNumInput() {
        System.out.println("Enter a number:");
        return scanner.nextDouble();
    }

    public void displayCommands() {
        System.out.println("Choose one of the following operations:");
        System.out.println("ADD  SUBTRACT  MULTIPLY  DIVIDE");
        System.out.println("SQUARE   SQUAREROOT  POWER   INVERSE");
        System.out.println("SINE  COSINE  TANGENT  INVERSESIN  INVERSECOS  INVERSETAN");
        System.out.println("LOG  INVERSELOG  LN  INVERSELN");
        System.out.println("FACTORIAL    M+    MC    MRC");
    }

    public String getCommandInput() {
            do {
            displayCommands();
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine().toUpperCase();}
            while(!(commandList.contains(command)));
        return command;}


}
