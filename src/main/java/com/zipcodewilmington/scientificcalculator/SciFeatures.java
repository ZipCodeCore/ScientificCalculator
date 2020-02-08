package com.zipcodewilmington.scientificcalculator;

import java.util.ArrayList;
import java.util.List;

public class SciFeatures {

    String displayMode;
    
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

    public void storeMemory() {
        List<Double> memory = new ArrayList<Double>;
    }


}
