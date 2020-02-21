package com.zipcodewilmington.scientificcalculator.Utilities;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;

import com.zipcodewilmington.scientificcalculator.Application.MainApplication;

public class MathCommands 
{
	private static Map<String, Command> commandMap = new HashMap<String, Command>();
	
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
		RANDOM_NUM,
		CLEAR,
		TOGGLE_NEGATIVE,
		DISPLAY,
		EXIT,
		RANDOM_FLOAT,
		EXPRESSION
	}
	
	public static boolean commandExists(String cmd) {
		if (commandMap != null && commandMap.containsKey(cmd.toLowerCase())) {
			return true;
		}
		return false;
	}

	public static void runCommand(ArrayList<String> args) {
		if (commandMap != null && commandMap.containsKey(args.get(0).toLowerCase())) {
			run(commandMap.get(args.get(0).toLowerCase()), args);
		}
		else if (ConsoleCommands.commandExists(args.get(0).toLowerCase())) {
			ConsoleCommands.runCommand(args);
		}
		else if (DisplayModeCommands.commandExists(args.get(0).toLowerCase())) {
			DisplayModeCommands.runCommand(args);
		}
		else {
			run(Command.RETURN, args);
		}
	}
	
	public static ArrayList<String> prompt() {		
		String input = Util.getStringInput("Enter a MATH COMMAND to continue: ");
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
		String input = Util.getStringInput("Enter a MATH COMMAND to continue: ");
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
	
	
	private static void reprompt() {
		Util.prln("Value: " + MainApplication.calc.getDisplay());
		fullPrompt();
		return;	
	}

	public static void run(Command cmd, ArrayList<String> args) {
		switch (cmd) {
		case ADD:
			if (args.size() > 1) {
				float sum = 0;
				for (int i = 1; i < args.size(); i++) {	
					try {
						sum += Float.parseFloat(args.get(i));
					} catch (NumberFormatException e) {}
				}
				MainApplication.calc.add(sum);			
				reprompt();	
				return;
			}
			else {
				Util.prln("Not enough arguments!");
			}
			fullPrompt();
			return;
		case COSINE:					
			MainApplication.calc.cosine();			
			reprompt();		
			return;
		case DIVIDE:
			if (args.size() > 1) {				
				for (int i = 1; i < args.size(); i++) {						
					try {
						float denom = Float.parseFloat(args.get(i));			
						MainApplication.calc.div(denom);
					} catch (NumberFormatException e) { }					
				} 
				reprompt();
				return;
			}
			else {
				Util.prln("Not enough arguments!");
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
		case INVERSE:
			MainApplication.calc.inverse();
			reprompt();
			break;
		case INV_COSINE:
			MainApplication.calc.invCosine();			
			reprompt();		
			return;
		case INV_NAT_LOG:
			MainApplication.calc.invNatLog();			
			reprompt();		
			return;
		case INV_SINE:
			MainApplication.calc.invSin();			
			reprompt();		
			return;
		case INV_TANGENT:
			MainApplication.calc.invTangent();			
			reprompt();		
			return;
		case LOG:
			MainApplication.calc.log();			
			reprompt();		
			return;
		case MULTIPLY:
			if (args.size() > 1) {
				for (int i = 1; i < args.size(); i++) {						
					try {
						MainApplication.calc.mult(Float.parseFloat(args.get(i)));							
					} catch (NumberFormatException e) { }
				}
				reprompt();
				return;
			}
			else {
				Util.prln("Not enough arguments!");
			}
			fullPrompt();
			return;
		case RANDOM_NUM:
			if (args.size() > 2 && args.size() < 4) {
				handleRandomNum(args, new ArrayList<Integer>());
			}
			else if (args.size() > 2) {
				ArrayList<Integer> excluded = new ArrayList<>();
				for (int i = 3; i < args.size(); i++) {
					try {
						excluded.add(Integer.parseInt(args.get(i)));
					} catch (NumberFormatException e) { Util.prln("Expects extra numbers as additional arguments. Numbers after the initial bound arguments will be excluded from random generation."); }
				}
				handleRandomNum(args, excluded);
			}
			else {
				Util.prln("Wrong amount of arguments! Expecting at least 2 numbers - lower and upper bound (inclusive). \n You may also include extra numbers to exclude from random generation.");
			}
			fullPrompt();
			return;
		case RANDOM_FLOAT:
			float rand = ThreadLocalRandom.current().nextFloat();
			Util.prln("Randomly generated float (0-1): " + rand);
			fullPrompt();
			return;
		case RETURN:
			ConsoleCommands.fullPrompt();
			return;
		case SINE:
			MainApplication.calc.sin();			
			reprompt();		
			return;
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
				for (int i = 1; i < args.size(); i++) {						
					try {
						MainApplication.calc.subtract(Float.parseFloat(args.get(i)));							
					} catch (NumberFormatException e) { }
				}		
				reprompt();
				return;
			}
			else {
				Util.prln("Not enough arguments!");
			}
			fullPrompt();
			return;
		case TANGENT:
			MainApplication.calc.tangent();			
			reprompt();		
			return;
		case VAR_EXP:
			if (args.size() > 1) {
				for (int i = 1; i < args.size(); i++) {						
					try {
						MainApplication.calc.pow(Float.parseFloat(args.get(i)));								
					} catch (NumberFormatException e) { }
				}		
				reprompt();
				return;
			}
			else {
				Util.prln("Not enough arguments!");
			}
			fullPrompt();
			return;
		case CLEAR:
			MainApplication.calc.clearDisplay();
			reprompt();
			return;
		case TOGGLE_NEGATIVE:
			MainApplication.calc.toggleAllowNegatives();
			if (MainApplication.calc.allowingNegative()) {
				Util.prln("Calculator is allowing negative numbers again.");
			}
			else {
				Util.prln("Calculator will no longer show negative numbers.");
			}				
			reprompt(); 
			return;
		case DISPLAY:
			Util.prln("Value: " + MainApplication.calc.getDisplay());
			fullPrompt();
			return;	
		case INV_LOG:
			//TODO
		case NATURAL_LOG:
			//TODO
		case EXIT:
			System.exit(0);
		case EXPRESSION:
			if (args.size() > 1) {
				args.remove(0);
			}
			Double result = handleExpression(args);
			System.out.println("Result: " + result);
			fullPrompt();
			return;
		default:
			fullPrompt();
			return;		
		}
	}

	private static Double handleExpression(ArrayList<String> args) {
		Stack<String> ops  = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();

		for (int i = 0; i < args.size(); i++) {
			String s = args.remove(i);
			if      (s.equals("("))               ;
			else if (s.equals("+"))    ops.push(s);
			else if (s.equals("-"))    ops.push(s);
			else if (s.equals("*"))    ops.push(s);
			else if (s.equals("/"))    ops.push(s);
			else if (s.equals("sqrt")) ops.push(s);
			else if (s.equals(")")) {
				String op = ops.pop();
				double v = vals.pop();
				if      (op.equals("+"))    v = vals.pop() + v;
				else if (op.equals("-"))    v = vals.pop() - v;
				else if (op.equals("*"))    v = vals.pop() * v;
				else if (op.equals("/"))    v = vals.pop() / v;
				else if (op.equals("sqrt")) v = Math.sqrt(v);
				vals.push(v);
			}
			else vals.push(Double.parseDouble(s));
		}
		return vals.pop();
	}
	
	private static void handleRandomNum(ArrayList<String> args, ArrayList<Integer> excludedNums) {
		int lower;
		int higher;
		int timeOut = 1000;
		boolean generated = false;
		try {
			lower = Integer.parseInt(args.get(1));
			try {
				higher = Integer.parseInt(args.get(2));
				generated = true;
			} catch (NumberFormatException e) {
				Util.prln("Only integers accepted as arguments.");
				lower = 1;
				higher = 100;
				generated = false;
			}					
		} catch (NumberFormatException e) {					
			Util.prln("Only integers accepted as arguments.");
			lower = 1;
			higher = 100;
			generated = false;
		}
		if (generated) {
			int rand = ThreadLocalRandom.current().nextInt(lower, higher + 1);
			while (excludedNums.contains(rand) && timeOut > 0) { 
				rand = ThreadLocalRandom.current().nextInt(lower, higher + 1);
				timeOut--;
			}
			Util.prln("Randomly generated number (" + lower + "-" + higher + "): " + rand);
			fullPrompt();
		}
		else {
			int rand = ThreadLocalRandom.current().nextInt(lower, higher + 1);
			while (excludedNums.contains(rand) && timeOut > 0) { 
				rand = ThreadLocalRandom.current().nextInt(lower, higher + 1);
				timeOut--;
			}
			Util.prln("Randomly generated number (1-100)[default]: " + rand);
			fullPrompt();
		}	
	}

	static {
		commandMap = new HashMap<>();
		commandMap.put("sin", Command.SINE);
		commandMap.put("cos", Command.COSINE);
		commandMap.put("tan", Command.TANGENT);
		commandMap.put("arcsin", Command.INV_SINE);
		commandMap.put("arccos", Command.INV_COSINE);
		commandMap.put("arctan", Command.INV_TANGENT);
		commandMap.put("log", Command.LOG);
		commandMap.put("invnatlog", Command.INV_NAT_LOG);
		commandMap.put("add", Command.ADD);
		commandMap.put("subtract", Command.SUBTRACT);
		commandMap.put("minus", Command.SUBTRACT);
		commandMap.put("mult", Command.MULTIPLY);
		commandMap.put("multiply", Command.MULTIPLY);
		commandMap.put("divide", Command.DIVIDE);
		commandMap.put("sqrt", Command.SQRT);
		commandMap.put("square", Command.SQUARE);
		commandMap.put("inverse", Command.INVERSE);
		commandMap.put("varexp", Command.VAR_EXP);
		commandMap.put("power", Command.VAR_EXP);
		commandMap.put("pow", Command.VAR_EXP);
		commandMap.put("exponent", Command.VAR_EXP);
		commandMap.put("exp", Command.VAR_EXP);
		commandMap.put("signflip", Command.FLIP_SIGN);
		commandMap.put("flipsign", Command.FLIP_SIGN);
		commandMap.put("help", Command.HELP);
		commandMap.put("return", Command.RETURN);
		commandMap.put("factorial", Command.FACTORIAL);
		commandMap.put("random", Command.RANDOM_NUM);
		commandMap.put("clear", Command.CLEAR);		
		commandMap.put("togglenegative", Command.TOGGLE_NEGATIVE);
		commandMap.put("display", Command.DISPLAY);
		commandMap.put("exit", Command.EXIT);
		commandMap.put("randomfloat", Command.RANDOM_FLOAT);
		commandMap.put("expression", Command.EXPRESSION);


		// TODO
		//commandMap.put("invlog", Command.INV_LOG);
		//commandMap.put("naturallog", Command.NATURAL_LOG);
	}
	
}
