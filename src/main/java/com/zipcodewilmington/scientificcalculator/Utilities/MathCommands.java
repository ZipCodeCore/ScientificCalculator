package com.zipcodewilmington.scientificcalculator.Utilities;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;

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
		RETURN,
		FACTORIAL,
		SINE,
		COSINE,
		TANGENT,
		INV_SINE,
		INV_COSINE,
		INV_TANGENT,
		LOG,
		INV_LOG,
		NATURAL_LOG,
		INV_NAT_LOG,
		RANDOM_NUM
	}

	static {
		commandMap = new HashMap<>();
		Map<String, Command> tempMap = new HashMap<>();
		commandMap.put("Sin", Command.SINE);
		commandMap.put("Cos", Command.COSINE);
		commandMap.put("Tan", Command.TANGENT);
		commandMap.put("Arcsin", Command.INV_SINE);
		commandMap.put("Arccos", Command.INV_COSINE);
		commandMap.put("Arctan", Command.INV_TANGENT);
		commandMap.put("Log", Command.LOG);
		commandMap.put("InvLog", Command.INV_LOG);
		commandMap.put("NaturalLog", Command.NATURAL_LOG);
		commandMap.put("InvNatLog", Command.INV_NAT_LOG);
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
		commandMap.put("Factorial", Command.FACTORIAL);
		commandMap.put("Random", Command.RANDOM_NUM);
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
		if (MainApplication.calc.isInErrorMode()) {
			ConsoleCommands.errorPrompt();
			return;
		}
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
		switch (cmd) {
		case ADD:
			if (args.size() > 1) {
				int sum = 0;
				try {
					for (int i = 1; i < args.size(); i++) {						
						sum += Integer.parseInt(args.get(i));
					}
					MainApplication.calc.add(sum);			
					reprompt();
				} catch (NumberFormatException e) {
					//e.printStackTrace();
					Console.prln("That's not a number...");
				}
			}
			else {
				Console.prln("Not enough arguments!");
			}
			fullPrompt();
			return;
		case COSINE:
			//TODO
		case DIVIDE:
			if (args.size() > 1) {
				try {
					for (int i = 1; i < args.size(); i++) {						
						int denom = Integer.parseInt(args.get(i));
						MainApplication.calc.div(denom);
					}		
					reprompt();
				} catch (NumberFormatException e) {
					//e.printStackTrace();
					Console.prln("That's not a number...");
				}
			}
			else {
				Console.prln("Not enough arguments!");
			}
			fullPrompt();
			return;
		case FACTORIAL:
			MainApplication.calc.factorial();							
			reprompt();
			return;
		case FLIP_SIGN:
			MainApplication.calc.flipSign();
			reprompt();
			return;	
		case HELP:
			Console.prln("Printing a list of all available commands in this menu: ");
			ArrayList<String> uniques = new ArrayList<>();
			for (Entry<String, Command> i : commandMap.entrySet()) {
				if (!uniques.contains(i.getKey().toUpperCase())) {
					uniques.add(i.getKey().toUpperCase());
				}
			}
			Collections.sort(uniques);
			for (String s : uniques) {
				Console.prln(s);
			}
			fullPrompt();
			return;
		case INVERSE:
			MainApplication.calc.inverse();
			reprompt();
			break;
		case INV_COSINE:
			//TODO
		case INV_LOG:
			//TODO
		case INV_NAT_LOG:
			//TODO
		case INV_SINE:
			//TODO
		case INV_TANGENT:
			//TODO
		case LOG:
			//TODO
		case MULTIPLY:
			if (args.size() > 1) {
				try {
					for (int i = 1; i < args.size(); i++) {						
						MainApplication.calc.mult(Integer.parseInt(args.get(i)));							
					}		
					reprompt();
				} catch (NumberFormatException e) {
					//e.printStackTrace();
					Console.prln("That's not a number...");
				}
			}
			else {
				Console.prln("Not enough arguments!");
			}
			fullPrompt();
			return;
		case NATURAL_LOG:
			//TODO
		case RANDOM_NUM:
			if (args.size() > 2 && args.size() < 4) {
				try {
					int lower = Integer.parseInt(args.get(1));
					int higher = Integer.parseInt(args.get(2));
					int rand = ThreadLocalRandom.current().nextInt(lower, higher + 1);
					Console.prln("Randomly generated number (" + lower + "-" + higher + "): " + rand);
					fullPrompt();
				} catch (NumberFormatException e) {
					//e.printStackTrace();
					Console.prln("That's not a number...");
				}
			}
			else {
				Console.prln("Wrong amount of arguments! Expecting 2 numbers, lower and upper bound (inclusive).");
			}
			fullPrompt();
			return;
		case RETURN:
			ConsoleCommands.fullPrompt();
			return;
		case SINE:
			//TODO
		case SQRT:
			MainApplication.calc.sqRt();
			reprompt();
			break;
		case SQUARE:
			MainApplication.calc.square();
			reprompt();
			break;
		case SUBTRACT:
			if (args.size() > 1) {
				try {
					for (int i = 1; i < args.size(); i++) {						
						MainApplication.calc.subtract(Integer.parseInt(args.get(i)));							
					}		
					reprompt();
				} catch (NumberFormatException e) {
					//e.printStackTrace();
					Console.prln("That's not a number...");
				}
			}
			else {
				Console.prln("Not enough arguments!");
			}
			fullPrompt();
			return;
		case TANGENT:
			//TODO
		case VAR_EXP:
			if (args.size() > 1) {
				try {
					for (int i = 1; i < args.size(); i++) {						
						MainApplication.calc.pow(Integer.parseInt(args.get(i)));							
					}		
					reprompt();
				} catch (NumberFormatException e) {
					//e.printStackTrace();
					Console.prln("That's not a number...");
				}
			}
			else {
				Console.prln("Not enough arguments!");
			}
			fullPrompt();
			return;
		default:
			fullPrompt();
			return;		
		}
	}
	
	private static void reprompt() {
		Console.prln("Value: " + MainApplication.calc.getDisplay());
		fullPrompt();
		return;	
	}
	
}
