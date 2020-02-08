package com.zipcodewilmington.scientificcalculator.Application;

import com.zipcodewilmington.scientificcalculator.Calculator.Calculator;
import com.zipcodewilmington.scientificcalculator.Utilities.ConsoleCommands;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
	
	public final static Calculator calc;
	
    public static void main(String[] args) {
        
    	Console.println("Welcome to my calculator!");
        String input = Console.getStringInput("Enter a command to continue: ");
        ConsoleCommands.runCommand(input);
    }
    
    static {
    	calc = new Calculator();
    }
}
