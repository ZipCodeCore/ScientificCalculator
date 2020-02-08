package com.zipcodewilmington.scientificcalculator.Utilities;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Util 
{
	public static float square(float num) {
		return num * num;
	}
	
	public static float squareRoot(float num) {
		return (float) Math.sqrt(num);
	}
	
	public static int squareRoot(int num) {
		return (int)squareRoot((float)num);
	}

	public static float sine(float num) {
		return (float) Math.sin(num);
	}
	
	public static float cosine(float num) {
		return (float) Math.cos(num);
	}
	
	public static float tangent(float num) {
		return (float) Math.tan(num);
	}
	
	public static float invSine(float num) {
		return (float) Math.asin(num);
	}
	
	public static float invCosine(float num) {
		return (float) Math.acos(num);
	}
	
	public static float invTangent(float num) {
		return (float) Math.atan(num);
	}
	
	public static float toRadians(float num) {
		return (float) Math.toRadians(num);
	}
	
	public static double log(double num) {
		return Math.log(num);
	}
	
	public static double inverseNaturalLog(double num) {
		return Math.expm1(num) + 1;
	}
	
	public static int factorial(int n) 
    {   	
		return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }

	public static Double getDoubleInput(String prompt) {
		Scanner scanner = new Scanner(System.in);
	    Util.println(prompt);
	    String userInput = scanner.nextLine();
	    try {
	    	return Double.parseDouble(userInput); 
	    } catch (NumberFormatException e) { e.printStackTrace(); }
	    return 0.0;
	}

	public static Integer getIntegerInput(String prompt) {
		Scanner scanner = new Scanner(System.in);
	    Util.println(prompt);
	    String userInput = scanner.nextLine();
	    try {
	    	return Integer.parseInt(userInput); 
	    } catch (NumberFormatException e) { e.printStackTrace(); }
	    return 0;
	}

	public static String getStringInput(String prompt) {
		Scanner scanner = new Scanner(System.in);
	    Util.println(prompt);
	    String userInput = scanner.nextLine();
	    return userInput;
	}

	public static void print(String output, Object... args) {
	    System.out.printf(output, args);
	}

	public static void println(String output, Object... args) {
	    print(output + "\n", args);
	}

	public static void prln(String print) {
		System.out.println(print);
	} 
}
