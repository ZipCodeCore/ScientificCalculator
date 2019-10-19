package com.zipcodewilmington.scientificcalculator;

public class Sine{
    public Sine(){
    }
    public Double sine(double value){
        if(value < 0){
            return Math.sin(-value)
        } else {
            return Math.sin(value);
        }
}
