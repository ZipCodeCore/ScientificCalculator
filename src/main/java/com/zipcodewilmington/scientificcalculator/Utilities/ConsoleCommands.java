package com.zipcodewilmington.scientificcalculator.Utilities;

import java.util.*;
import java.util.Map.Entry;

import com.zipcodewilmington.scientificcalculator.Application.MainApplication;

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
		DISPLAY,
		ERROR
	}
	
	public static void fullPrompt() {
		
		// If in error mode, we are forcing a clear of the display
		if (MainApplication.calc.isInErrorMode()) {
			errorPrompt();
			return;
		}
		
		// Otherwise, get some input for a console command
		String input = Util.getStringInput("Enter a CONSOLE COMMAND to continue: ");
		
		// Split the input into an array of seperate strings (this splits by spaces)
        String[] splited = input.split("\\s+");
        
        // Save the strings to an arraylist so we can pass it around more easily
        ArrayList<String> argus = new ArrayList<>();
        for (String s : splited) {
        	argus.add(s);
        }
        
        // Loop to check for input
        // If input is not entered, this waits for more
        while (argus.size() < 1) {
        	argus = prompt(MenuType.CONSOLE);
        }
        
        // Once we have at least 1 string of input, run a command
        runCommand(argus);
	}

	public static void runCommand(ArrayList<String> args) {		
		if (commandMap != null && commandMap.containsKey(args.get(0).toLowerCase())) {
			run(commandMap.get(args.get(0).toLowerCase()), args);
		}
		else if (MathCommands.commandExists(args.get(0).toLowerCase())) {
			MathCommands.runCommand(args);
		}
		else if (DisplayModeCommands.commandExists(args.get(0).toLowerCase())) {
			DisplayModeCommands.runCommand(args);
		}
		else if (args.size() > 1 && args.get(0).toLowerCase().equals("best") && args.get(1).toLowerCase().equals("programmer")) {
			Util.prln("Nobles");
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
			case ERROR:
				inptCmd = "Error Mode - Please Clear the Display: ";
			default:
				inptCmd = "Enter a CONSOLE COMMAND to continue: ";
				break;
		}
		String input = Util.getStringInput(inptCmd);
        String[] splited = input.split("\\s+");
        ArrayList<String> argus = new ArrayList<>();
        for (String s : splited) {
        	argus.add(s);
        }
        return argus;
	}
	
	public static void errorPrompt() {
		String input = Util.getStringInput("Error Mode - Please Clear the Display: ");		
        while (!input.toLowerCase().equals("clear")) {
        	input = Util.getStringInput("Error Mode - Please Clear the Display: ");
        }
        run(Command.CLEAR, null);
	}

	public static void promptMath() {
		if (MainApplication.calc.isInErrorMode()) {
			errorPrompt();
			return;
		}
		String input = Util.getStringInput("Enter a MATH COMMAND to continue: ");
        String[] splited = input.split("\\s+");
        ArrayList<String> argus = new ArrayList<>();
        for (String s : splited) {
        	argus.add(s);
        }
        while (argus.size() < 1) {
        	argus = prompt(MenuType.MATH);
        }
        runCommand(argus);
	}
	
	public static void promptDispSwitch() {
		if (MainApplication.calc.isInErrorMode()) {
			errorPrompt();
			return;
		}
		String input = Util.getStringInput("Enter a DISPLAY MODE to continue: ");
        String[] splited = input.split("\\s+");
        ArrayList<String> argus = new ArrayList<>();
        for (String s : splited) {
        	argus.add(s);
        }
        while (argus.size() < 1) {
        	argus = prompt(MenuType.DISPLAY);
        }
        runCommand(argus);
	}
	
	public static void run(Command cmd, ArrayList<String> args) {
		switch (cmd) 
		{		
			case BAD_COMMAND:
				Util.prln("Bad command! Please enter a valid command, or enter 'Help' to view a list of all commands.");
				fullPrompt();
				return;
			case CLEAR:
				MainApplication.calc.clearDisplay();
				run(Command.DISPLAY, null);
				return;
			case HELP:
				Util.prln("Printing a list of all available commands in this menu: ");
				ArrayList<String> uniques = new ArrayList<>();
				for (Entry<String, Command> i : commandMap.entrySet()) {				
					uniques.add(i.getKey().toUpperCase());				
				}
				Collections.sort(uniques);
				for (String s : uniques) {
					Util.prln(s);
				}
				fullPrompt();
				return;
			case INFO:
				Util.prln("This calculator was made by Aarti, Adam, and Matt! We hope you find it useful.");
				fullPrompt();
				return;
			case RECALL:
				Util.prln("Stored Memory Value: " + MainApplication.calc.getStoredVal());
				fullPrompt(); 
				return;
			case RESET:
				MainApplication.calc.totalReset();
				Util.prln("Reset all calculator values! Display mode is now DECIMAL/DEGREES.");
				run(Command.DISPLAY, null); 
				return;
			case STORE:
				MainApplication.calc.incStoredVal(MainApplication.calc.getDisplayVal());
				Util.prln("Stored " + MainApplication.calc.getDisplayVal() + " in memory");
				fullPrompt();
				return;
			case SWITCH_DISP_TRIG:
				MainApplication.calc.toggleTrigMode();
				Util.prln("Trig Mode switched to " + MainApplication.calc.getTrigModeStr());
				fullPrompt(); 
				return;
			case TOGGLE_NEGATIVE:
				MainApplication.calc.toggleAllowNegatives();
				if (MainApplication.calc.allowingNegative()) {
					Util.prln("Calculator is allowing negative numbers again.");
				}
				else {
					Util.prln("Calculator will no longer show negative numbers.");
				}				
				fullPrompt(); 
				return;
			case EXIT:
				System.exit(0);
				return;
			case DISPLAY:
				Util.prln("Value: " + MainApplication.calc.getDisplay());
				fullPrompt();
				return;	
			case MATH:
				MathCommands.fullPrompt();
				return;
			case SWITCH_DISP:
				DisplayModeCommands.fullPrompt();
				return;
			default:
				run(Command.BAD_COMMAND, null);
				return;
		}
	}
	
	static {
		commandMap = new HashMap<>();
		commandMap.put("clear", Command.CLEAR);
		commandMap.put("help", Command.HELP);
		commandMap.put("info", Command.INFO);
		commandMap.put("math", Command.MATH);
		commandMap.put("recall", Command.RECALL);
		commandMap.put("reset", Command.RESET);
		commandMap.put("store", Command.STORE);
		commandMap.put("switchmode", Command.SWITCH_DISP);
		commandMap.put("switchtrig", Command.SWITCH_DISP_TRIG);
		commandMap.put("togglenegative", Command.TOGGLE_NEGATIVE);
		commandMap.put("display", Command.DISPLAY);
		commandMap.put("exit", Command.EXIT);
	}
	
}
