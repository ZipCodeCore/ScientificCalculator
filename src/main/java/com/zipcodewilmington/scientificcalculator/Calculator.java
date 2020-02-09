package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

public class Calculator {

    public Double operator;
    public Double firstOption;
    public Double secondOption;
    public Double ans;
    public String stringAns;

    public Calculator() {

    }

    public Double setAns(Double ans) {
        this.ans = ans;
        return ans;
    }

    public Double getAns() {
        return this.ans;
    }

    public Double getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        Double userInput = scanner.nextDouble();
        return userInput;
    }

    public void setFirstInput(Double input){
        firstOption = input;
    }

    public void setSecondOptionInput(Double input){
       secondOption = input;
    }

    public void setOperator(Double input){
        operator = input;
    }

    public Double chooseCalc() {
        return null;
    }

    public Double getFirstNumber() {
        return firstOption;
    }

    public Double getSecondNumber() {
        return secondOption;
    }

}























/*
public class Calculator {
    Double currentValue;
    Double memory;
    Double currentDisplay;
    boolean appropriateInput;
    Double answer;

    public Calculator(Double newCurrentValue) {
        currentValue = newCurrentValue;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    */
/*public Double convertToDouble() {
        String number1 = Double.parseDouble();
        return answer;
    }*//*


    public boolean checkIfAppropriate(boolean isAppropriate) {
        if (appropriateInput) {
            return appropriateInput;
        } else {
            return appropriateInput = false;
        }
    }

    */
/*public getCurrentAnswer() {

    }*//*


    public Double updateCurrentValue() {
        currentValue = answer;
        return currentValue;
    }

}*/
