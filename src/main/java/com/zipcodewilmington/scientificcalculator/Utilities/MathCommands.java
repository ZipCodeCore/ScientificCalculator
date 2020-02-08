package com.zipcodewilmington.scientificcalculator.Utilities;

import java.util.*;
import java.util.Map.Entry;

import com.zipcodewilmington.scientificcalculator.Application.*;

public class MathCommands 
{
	private static Map<String, Command> commandMap = new HashMap<>();
	
	public enum Command {
		ADD,
		SUBTRACT,
		DIVIDE,
		MULTIPLY,
		SQRT,
		SQUARE,
		INVERSE,
		VAR_EXP,
		FLIP_SIGN,
		HELP,
		RETURN
	}
	

	
	static {
		commandMap = new HashMap<>();
		Map<String, Command> tempMap = new HashMap<>();
		commandMap.put("Add", Command.ADD);
		commandMap.put("Subtract", Command.SUBTRACT);
		commandMap.put("Minus", Command.SUBTRACT);
		commandMap.put("Mult", Command.MULTIPLY);
		commandMap.put("Multiply", Command.MULTIPLY);
		commandMap.put("Divide", Command.DIVIDE);
		commandMap.put("Sqrt", Command.SQRT);
		commandMap.put("Square", Command.SQUARE);
		commandMap.put("Inverse", Command.INVERSE);
		commandMap.put("Varexp", Command.VAR_EXP);
		commandMap.put("Signflip", Command.FLIP_SIGN);
		commandMap.put("Help", Command.HELP);
		commandMap.put("Return", Command.RETURN);
		// Fill map with all the above commands, but in lower case and upper case (ie CLEAR/Clear/clear all will work)
		for (Entry<String, Command> i : commandMap.entrySet()) {
			tempMap.put(i.getKey().toLowerCase(), i.getValue());
			tempMap.put(i.getKey().toUpperCase(), i.getValue());
		}
		for (Entry<String, Command> i : tempMap.entrySet()) {
			commandMap.put(i.getKey(), i.getValue());
		}
	}
	
	public static void runCommand(ArrayList<String> args) {
		if (commandMap != null && commandMap.containsKey(args.get(0))) {
			run(commandMap.get(args.get(0)), args);
		}
		else {
			run(Command.RETURN, args);
		}
	}
	
	public static ArrayList<String> prompt() {		
		String input = Console.getStringInput("Enter a MATH COMMAND to continue: ");
        String[] splited = input.split("\\s+");
        ArrayList<String> argus = new ArrayList<>();
        for (String s : splited) {
        	argus.add(s);
        }
        return argus;
	}
	
	public static void fullPrompt() {
		String input = Console.getStringInput("Enter a MATH COMMAND to continue: ");
        String[] splited = input.split("\\s+");
        ArrayList<String> argus = new ArrayList<>();
        for (String s : splited) {
        	argus.add(s);
        }
        while (argus.size() < 1) {
        	argus = MathCommands.prompt();
        }
        MathCommands.runCommand(argus);
	}

	public static void run(Command cmd, ArrayList<String> args) {
		switch (cmd) 
		{
			case ADD:
				if (args.size() > 1) {
					int sum = 0;
					try {
						for (int i = 1; i < args.size() - 1; i++) {						
							sum += Integer.parseInt(args.get(i));						
						}
						MainApplication.calc.add(sum);			
						ConsoleCommands.run(ConsoleCommands.Command.DISPLAY, null);
					} catch (NumberFormatException e) {
						//e.printStackTrace();
						Console.prln("That's not a number...");
					}
				}
				else {
					Console.prln("Not enough arguments!");
				}
				break;
			case DIVIDE:
				break;
			case FLIP_SIGN:
				break;
			case HELP:
				break;
			case INVERSE:
				break;
			case MULTIPLY:
				break;
			case RETURN:
				break;
			case SQRT:
				break;
			case SQUARE:
				break;
			case SUBTRACT:
				break;
			case VAR_EXP:
				break;
			default:
				break;
		}
	}
	
}
