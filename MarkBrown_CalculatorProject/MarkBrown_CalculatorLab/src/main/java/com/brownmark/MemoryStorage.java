package com.brownmark;


public class MemoryStorage {


    private double storedOperand;
    private int calculationCount;


    public MemoryStorage () {}


    public void resetStorage () {storedOperand = 0;}
    public void resetCalculationCount () {calculationCount = 0;}


    public int returnCalculationCount() {return calculationCount;}
    public void incrementCalculationCount() {calculationCount++;}


    public double returnStoredNumber() {return storedOperand;}
    public void pushNumberToStorage(double result) {storedOperand = result;}


}
