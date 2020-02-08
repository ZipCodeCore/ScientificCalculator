package com.zipcodewilmington.scientificcalculator;

import java.util.ArrayList;

import static java.lang.Math.*;

public class SciFeatures {

    public SciFeatures(){
    }

    String unitsMode;
    String displayMode;
    ArrayList<Double> memory;


    public void switchDisplayMode() {
        if (displayMode.equals("binary")) {
            displayMode = "octal";
        } else if (displayMode.equals("octal")) {
            displayMode = "decimal";
        } else if (displayMode.equals("decimal")) {
            displayMode = "hexadecimal";
        } else {
            displayMode = "binary";
        }
    }

    public void switchDisplayMode(String mode) {
        displayMode = mode;
    }

    public void storeMemory(double a) {
        memory.set(0, a);
    }

    public void clearMemory() {
        memory.set(0, null);
    }

    public double memoryRecall() {
        return memory.get(0);
    }

    public double sine(double a) {
        return sin(a);
    }

    public double cosine(double a) {
        return cos(a);
    }

    public double tangent(double a) {
        return tan(a);
    }

    public double sineInverse(double a) {
        return asin(a);
    }

    public double cosineInverse(double a) {
        return acos(a);
    }

    public double tangentInverse(double a) {
        return atan(a);
    }

    public void switchUnitsMode() {
        if (unitsMode.equals("Degrees")) {
            unitsMode = "Radians";
        }
        else {
            displayMode = "Degrees";
        }
    }

}
