package com.zipcodewilmington.scientificcalculator.Utilities;

public class Util 
{
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int sub(int left, int right) {
		return left - right;
	}
	
	public static int mult(int num1, int num2) {
		return num1 * num2;
	}
	
	public static float div(float numerator, float denominator) {
		return numerator / denominator;
	}
	
	public static int div(int numerator, int denominator) {
		return (int)div((float)numerator, (float)denominator);
	}
	
	public static float square(float num) {
		return num * num;
	}
	
	public static float squareRoot(float num) {
		return (float) Math.sqrt(num);
	}
	
	public static int squareRoot(int num) {
		return (int)squareRoot((float)num);
	}
	
	public static double varExp(double base, double exp) {
		return Math.pow(base, exp);
	}
	
	public static int varExp(int base, int exp) {
		return (int)Math.pow((double)base, (double)exp);
	}
	
	public static int inverse(int toInverse) {
		return div(1, toInverse);
	}
	
	public static int flipSign(int num) {
		return -num;
	}
	
	public static String returnErr() {
		return "Err";
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
}
