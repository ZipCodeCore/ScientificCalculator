package io.brianabbott;

import java.util.Scanner;

/**
 * Created by brianabbott on 4/29/16.
 */
public class Display {
    private double currentValue = 0;
    private double priorValue = 0;
    private String displayString="";
    private double memory;
    private boolean errorStatus = false;
    private boolean calculatorOn = true;

    Scanner input = new Scanner(System.in);

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public double getPriorValue() {
        return priorValue;
    }

    public void setPriorValue(double priorValue) {
        this.priorValue = priorValue;
    }

    public void takeInput(){
        if(input.hasNextDouble()){
            currentValue = input.nextDouble();
        }
        if(input.hasNext()){

        }




    }

    public void updateDisplay(String currentVal){

        System.out.println("\033[H\033[2J");

    }

    public void storeMemory(double value){
        memory = currentValue;
    }

    public void resetMemory(){
        memory = 0;
    }

    public void clearDisplay(){
        currentValue = 0;
        errorStatus = false;
    }

}
