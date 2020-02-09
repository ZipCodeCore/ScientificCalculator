package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 * James, Sandy and Zanetta version
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to Mr. Math!");
        Console.println("To see a valid list of commands, type 'menu' at any time");
        Console.println("When you are finish with Mr. Math, feel free to quit by entering ':q'");
  //      String s = Console.getStringInput("Enter a string");
  //      Integer i = Console.getIntegerInput("Enter an integer");
  //      Double d = Console.getDoubleInput("Enter a double.");

  //     Console.println("The user input %s as a string", s);
  //      Console.println("The user input %s as a integer", i);
  //      Console.println("The user input %s as a d", d);

        Display display = new Display();
        Prompt user = new Prompt();
        String userInput = "";

        do {
            display.update();
            userInput = Console.getStringInput(" ");
            if(userInput.equalsIgnoreCase("menu"))
            {
                Console.print(Menu.callMenu());
            }
            else if(!ValidOperations.isValid(userInput))
            {
                Console.println("Invalid input.  Check 'menu' for valid commands.");
            }
        } while(!userInput.equals(":q"));
    }
}