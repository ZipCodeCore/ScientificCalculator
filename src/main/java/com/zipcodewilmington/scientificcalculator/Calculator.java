package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;

public class Calculator {


    private Double currentNumber;
    private String state; //display

    public Double getCurrentNumber() {
        return currentNumber;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setCurrentNumber(Double currentNumber) {
        this.currentNumber = currentNumber;
    }

    public Calculator() {
        currentNumber = 0.0;
        state = "";
    }

    public  void parse(String [] input){


        String operator = input[input.length-1];

        if(input.length == 3) {
            Double x = Double.valueOf(input[0]);
            Double y = Double.valueOf(input[1]);
            switch (operator) {
                case "+":
                    add(x, y);
                    break;
                case "-":
                    subtract(x, y);
                    break;
                case "*":
                    multiply(x, y);
                    break;
                case "/":
                    divide(x, y);
                    break;
                case "exp":
                    exp(x, y);
                    break;
                default:
                    System.out.println("Not a valid operator for core calculator");
            }
        }
            else if(input.length == 2){
            Double x = Double.valueOf(input[0]);
                switch (operator) {
                    case "+":
                        add(x);
                        break;
                    case "-":
                        subtract(x);
                        break;
                    case "*":
                        multiply(x);
                        break;
                    case "/":
                        divide(x);
                        break;
                    case "sqrt":
                        sqrt(x);
                        break;
                    case "sq":
                        sq(x);
                        break;
                    case "exp":
                        exp(x);
                        break;
                    case "inv":
                        inv(x);
                        break;
                    case "neg":
                        negate(x);
                        break;
                    default:
                        System.out.println("Not a valid operator for core calculator");

                }
        } else if(input.length == 1){
            switch (operator) {
                case "sqrt":
                     sqrt();
                    break;
                case "sq":
                     sq();
                    break;
                case "inv":
                     inv();
                    break;
                case "neg":
                     negate();
                    break;
                default:
                    System.out.println("Not a valid operator for core calculator");
            }
        }
            else{
            System.out.println("Try again suckah");
        }
            state = String.valueOf(currentNumber);
        //System.out.println(state);

    }



    public void add (Double a, Double b){
        currentNumber = a + b;
    }

    public void add (Double a){
        currentNumber +=  a;
    }

    public void subtract (Double a, Double b){
        currentNumber = a - b;
    }

    public void subtract (Double a){
        currentNumber -= a;
    }

    public void multiply(Double a, Double b){
        currentNumber = a * b;

    }

    public void multiply(Double a){
        currentNumber *= a;
    }

    public void divide(Double a, Double b) {
        currentNumber = a / b;
    }

    public void divide(Double a) {
        currentNumber /= a;
    }

    public void sqrt(Double a){

        currentNumber = Math.sqrt(a);
    }

    public void sqrt(){

        currentNumber = Math.sqrt(currentNumber);
    }

    public void sq(Double a){
        currentNumber = Math.pow(a, (double)2);
    }

    public void sq(){
        currentNumber = Math.pow(currentNumber, (double)2);
    }

    public void exp(Double a, Double b){
        currentNumber = Math.pow(a, b);
    }

    public void exp(Double a){
        currentNumber = Math.pow(currentNumber, a);
    }

    //inverse
    public void inv(Double a){

        currentNumber = 1 / a;
    }

    public void inv(){

        currentNumber = 1 / currentNumber;
    }

    //if positive currentNumber = neg / if neg return pos
    public Double negate(Double a){
        return a * (-1);
    }

    public Double negate(){
        return currentNumber * (-1);
    }



}