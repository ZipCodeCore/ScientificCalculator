package com.zipcodewilmington.scientificcalculator.Utilities;

import java.util.*;
import java.util.Map.Entry;

import com.zipcodewilmington.scientificcalculator.Application.*;
import com.zipcodewilmington.scientificcalculator.Calculator.Calculator.DisplayMode;
import com.zipcodewilmington.scientificcalculator.Utilities.ConsoleCommands.Command;

public class DisplayModeCommands 
{
	private static Map<String, Mode> commandMap = new HashMap<>();
	
	public enum Mode {
		BINARY,
		OCTAL,
		DECIMAL,
		HEXADECIMAL,
		RETURN,
		HELP
	}
	
	public static boolean commandExists(String cmd) {
		if (commandMap != null && commandMap.containsKey(cmd.toLowerCase())) {
			return true;
		}
		return false;
	}

	public static void runCommand(ArrayList<String> args) {
		if (commandMap != null && commandMap.containsKey(args.get(0).toLowerCase())) {
			run(commandMap.get(args.get(0).toLowerCase()));
		}
		else {
			run(Mode.RETURN);
		}
	}
	
	public static ArrayList<String> prompt() {
		String input = Util.getStringInput("Enter a DISPLAY MODE to continue: ");
        String[] splited = input.split("\\s+");
        ArrayList<String> argus = new ArrayList<>();
        for (String s : splited) {
        	argus.add(s);
        }
        return argus;
	}
	
	public static void fullPrompt() {
		String input = Util.getStringInput("Enter a DISPLAY MODE to continue: ");
        String[] splited = input.split("\\s+");
        ArrayList<String> argus = new ArrayList<>();
        for (String s : splited) {
        	argus.add(s);
        }
        while (argus.size() < 1) {
        	argus = DisplayModeCommands.prompt();
        }
        DisplayModeCommands.runCommand(argus);
	}

	public static void run(Mode cmd) {
		switch (cmd) 
		{
			case BINARY:
				MainApplication.calc.setDisplayMode(DisplayMode.BINARY);
				Util.prln("Calculator switched to BINARY mode.");
				ConsoleCommands.run(Command.DISPLAY, null);
				return;
			case DECIMAL:
				MainApplication.calc.setDisplayMode(DisplayMode.DECIMAL);
				Util.prln("Calculator switched to DECIMAL mode.");
				ConsoleCommands.run(Command.DISPLAY, null);
				return;
			case HEXADECIMAL:
				MainApplication.calc.setDisplayMode(DisplayMode.HEXADECIMAL);
				Util.prln("Calculator switched to HEXADECIMAL mode.");
				ConsoleCommands.run(Command.DISPLAY, null);
				return;
			case OCTAL:
				MainApplication.calc.setDisplayMode(DisplayMode.OCTAL);
				Util.prln("Calculator switched to OCTAL mode.");
				ConsoleCommands.run(Command.DISPLAY, null);
				return;
			case RETURN:
				ConsoleCommands.fullPrompt();
				return;
			case HELP:
				Util.prln("Printing a list of all available commands in this menu: ");
				ArrayList<String> uniques = new ArrayList<>();
				for (Entry<String, Mode> i : commandMap.entrySet()) {				
					uniques.add(i.getKey().toUpperCase());				
				}
				Collections.sort(uniques);
				for (String s : uniques) {
					Util.prln(s);
				}
				fullPrompt();
				return;
			default:
				fullPrompt();
				return;
		}
	}
	
	static {
		commandMap = new HashMap<>();
		commandMap.put("binary", Mode.BINARY);
		commandMap.put("octal", Mode.OCTAL);
		commandMap.put("decimal", Mode.DECIMAL);
		commandMap.put("hexadecimal", Mode.HEXADECIMAL);
		commandMap.put("return", Mode.RETURN);
		commandMap.put("help", Mode.HELP);
	}
	
}
