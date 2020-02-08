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
		LOG,
		MATH,
		MODIFY,
		RECALL,
		RESET,
		STORE,
		SWITCH_DISP,
		SWITCH_DISP_TRIG,
		TOGGLE_NEGATIVE,
		TRIG,
		BAD_COMMAND
	}
	
	static {
		commandMap = new HashMap<>();
		Map<String, Command> tempMap = new HashMap<>();
		commandMap.put("Clear", Command.CLEAR);
		commandMap.put("Help", Command.HELP);
		commandMap.put("Info", Command.INFO);
		commandMap.put("Log", Command.LOG);
		commandMap.put("Math", Command.MATH);
		commandMap.put("Modify", Command.MODIFY);
		commandMap.put("Recall", Command.RECALL);
		commandMap.put("Reset", Command.RESET);
		commandMap.put("Store", Command.STORE);
		commandMap.put("Switch mode", Command.SWITCH_DISP);
		commandMap.put("Switch trig mode", Command.SWITCH_DISP_TRIG);
		commandMap.put("Toggle allow negative", Command.TOGGLE_NEGATIVE);
		commandMap.put("Trig", Command.TRIG);
		
		// Fill map with all the above commands, but in lower case and upper case (ie CLEAR/Clear/clear all will work)
		for (Entry<String, Command> i : commandMap.entrySet()) {
			tempMap.put(i.getKey().toLowerCase(), i.getValue());
			tempMap.put(i.getKey().toUpperCase(), i.getValue());
		}
		for (Entry<String, Command> i : tempMap.entrySet()) {
			commandMap.put(i.getKey(), i.getValue());
		}
	}
	
	public static void runCommand(String input) {
		if (commandMap != null && commandMap.containsKey(input)) {
			run(commandMap.get(input));
		}
		else {
			run(Command.BAD_COMMAND);
		}
	}
	
	private static void rePrompt() {
		 String input = Console.getStringInput("Enter a command to continue: ");
		 runCommand(input);
	}
	
	public static void run(Command cmd) {
		switch (cmd) {
			case BAD_COMMAND:
				Console.prln("Bad command! Please enter a valid command, or enter 'Help' to view a list of all commands.");
				rePrompt();
				return;
			case CLEAR:
				MainApplication.calc.clearDisplay();
				rePrompt();
				return;
			case HELP:
				Console.prln("Printing a list of all available commands: ");
				Set<String> uniques = new HashSet<>();
				for (Entry<String, Command> i : commandMap.entrySet()) {
					uniques.add(i.getKey().toUpperCase());
				}
				for (String s : uniques) {
					Console.prln(s);
				}
				return;
			case INFO:
				Console.prln("This calculator was made by Adam, Matt and Aarti! We hope you find it useful.");
				rePrompt();
				return;
			case LOG:
				rePrompt();
				return;
			case MATH:
				rePrompt();
				return;
			case MODIFY:
				rePrompt(); 
				return;
			case RECALL:
				rePrompt(); 
				return;
			case RESET:
				rePrompt(); 
				return;
			case STORE:
				rePrompt();
				return;
			case SWITCH_DISP:
				rePrompt(); 
				return;
			case SWITCH_DISP_TRIG:
				rePrompt(); 
				return;
			case TOGGLE_NEGATIVE:
				rePrompt(); 
				return;
			case TRIG:
				rePrompt(); 
				return;
			default:
				run(Command.BAD_COMMAND);
				return;
		}
	}
	
}
