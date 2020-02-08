package com.zipcodewilmington.scientificcalculator.Utilities;

import java.util.*;
import java.util.Map.Entry;

import com.zipcodewilmington.scientificcalculator.Application.*;

public class ConsoleCommands 
{
	private static Map<String, Command> commandMap = new HashMap<>();
	
	public enum Command {
		CLEAR,
		HELP,
		INFO,
		MATH,
		RECALL,
		RESET,
		STORE,
		SWITCH_DISP,
		SWITCH_DISP_TRIG,
		TOGGLE_NEGATIVE,
		BAD_COMMAND,
		EXIT,
		DISPLAY
	}
	
	public enum MenuType {
		CONSOLE,
		MATH,
		DISPLAY
	}
	
	static {
		commandMap = new HashMap<>();
		Map<String, Command> tempMap = new HashMap<>();
		commandMap.put("Clear", Command.CLEAR);
		commandMap.put("Help", Command.HELP);
		commandMap.put("Info", Command.INFO);
		commandMap.put("Math", Command.MATH);
		commandMap.put("Recall", Command.RECALL);
		commandMap.put("Reset", Command.RESET);
		commandMap.put("Store", Command.STORE);
		commandMap.put("Switchmode", Command.SWITCH_DISP);
		commandMap.put("Switchtrig", Command.SWITCH_DISP_TRIG);
		commandMap.put("Togglenegative", Command.TOGGLE_NEGATIVE);
		commandMap.put("Display", Command.DISPLAY);
		commandMap.put("Exit", Command.EXIT);
		
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
		else if (args.size() > 1 && args.get(0).equals("best") && args.get(1).equals("programmer")) {
			Console.prln("Nobles");
			fullPrompt();
		}
		else {
			run(Command.BAD_COMMAND, args);
		}
	}
	
	public static ArrayList<String> prompt(MenuType type) {
		String inptCmd;
		switch (type) {
			case CONSOLE:
				inptCmd = "Enter a CONSOLE COMMAND to continue: ";
				break;
			case DISPLAY:
				inptCmd = "Enter a DISPLAY MODE to continue: ";
				break;
			case MATH:
				inptCmd = "Enter a MATH COMMAND to continue: ";
				break;
			default:
				inptCmd = "Enter a CONSOLE COMMAND to continue: ";
				break;
		}
		String input = Console.getStringInput(inptCmd);
        String[] splited = input.split("\\s+");
        ArrayList<String> argus = new ArrayList<>();
        for (String s : splited) {
        	argus.add(s);
        }
        return argus;
	}
	
	public static void fullPrompt() {
		String input = Console.getStringInput("Enter a CONSOLE COMMAND to continue: ");
        String[] splited = input.split("\\s+");
        ArrayList<String> argus = new ArrayList<>();
        for (String s : splited) {
        	argus.add(s);
        }
        while (argus.size() < 1) {
        	argus = ConsoleCommands.prompt(MenuType.CONSOLE);
        }
        ConsoleCommands.runCommand(argus);
	}

	public static void promptMath() {
		String input = Console.getStringInput("Enter a MATH COMMAND to continue: ");
        String[] splited = input.split("\\s+");
        ArrayList<String> argus = new ArrayList<>();
        for (String s : splited) {
        	argus.add(s);
        }
        while (argus.size() < 1) {
        	argus = ConsoleCommands.prompt(MenuType.MATH);
        }
        ConsoleCommands.runCommand(argus);
	}
	
	public static void promptDispSwitch() {
		String input = Console.getStringInput("Enter a DISPLAY MODE to continue: ");
        String[] splited = input.split("\\s+");
        ArrayList<String> argus = new ArrayList<>();
        for (String s : splited) {
        	argus.add(s);
        }
        while (argus.size() < 1) {
        	argus = ConsoleCommands.prompt(MenuType.DISPLAY);
        }
        ConsoleCommands.runCommand(argus);
	}
	
	public static void run(Command cmd, ArrayList<String> args) {
		switch (cmd) 
		{		
			case BAD_COMMAND:
				Console.prln("Bad command! Please enter a valid command, or enter 'Help' to view a list of all commands.");
				fullPrompt();
				return;
			case CLEAR:
				MainApplication.calc.clearDisplay();
				run(Command.DISPLAY, null);
				return;
			case HELP:
				Console.prln("Printing a list of all available commands: ");
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
			case INFO:
				Console.prln("This calculator was made by Aarti, Adam, and Matt! We hope you find it useful.");
				fullPrompt();
				return;
			case RECALL:
				Console.prln("Stored Memory Value: " + MainApplication.calc.getStoredVal());
				fullPrompt(); 
				return;
			case RESET:
				MainApplication.calc.totalReset();
				Console.prln("Reset all calculator values! Display mode is now DECIMAL/DEGREES.");
				run(Command.DISPLAY, null); 
				return;
			case STORE:
				if (args.size() > 1) {
					try {
						int inc = Integer.parseInt(args.get(1));					
						MainApplication.calc.incStoredVal(inc);
						Console.prln("Stored " + inc + " in memory");
					} catch (NumberFormatException e) { 
						//e.printStackTrace(); 
						Console.prln("That's not a number...");
					}
				}
				else {
					Console.prln("Nothing to store. Please enter a second argument!");
				}
				fullPrompt();
				return;
			case SWITCH_DISP_TRIG:
				MainApplication.calc.toggleTrigMode();
				Console.prln("Trig Mode switched to " + MainApplication.calc.getTrigModeStr());
				fullPrompt(); 
				return;
			case TOGGLE_NEGATIVE:
				MainApplication.calc.toggleAllowNegatives();
				if (MainApplication.calc.allowingNegative()) {
					Console.prln("Calculator is allowing negative numbers again.");
				}
				else {
					Console.prln("Calculator will no longer show negative numbers.");
				}				
				fullPrompt(); 
				return;
			case EXIT:
				System.exit(0);
				return;
			case DISPLAY:
				Console.prln("Value: " + MainApplication.calc.getDisplay());
				fullPrompt();
				return;	
			case MATH:
				//TODO
				return;
			case SWITCH_DISP:
				DisplayModeCommands.fullPrompt();
				return;
			default:
				run(Command.BAD_COMMAND, null);
				return;
		}
	}
	
}
