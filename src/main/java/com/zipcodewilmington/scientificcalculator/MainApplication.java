package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 * James, Sandy and Zanetta version
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to Mr. Math!");
  //      String s = Console.getStringInput("Enter a string");
  //      Integer i = Console.getIntegerInput("Enter an integer");
  //      Double d = Console.getDoubleInput("Enter a double.");

  //     Console.println("The user input %s as a string", s);
  //      Console.println("The user input %s as a integer", i);
  //      Console.println("The user input %s as a d", d);

        Display display = new Display();
        Prompt menu = new Prompt();
        String userInput = "";
        String message;
        do {
            display.update();
            userInput = Console.getStringInput(" ");
            menu.input(userInput);
            message = menu.getMessage();
        } while(!userInput.equals(":q"));
    }
}