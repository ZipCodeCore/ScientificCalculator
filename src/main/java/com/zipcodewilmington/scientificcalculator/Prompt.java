package com.zipcodewilmington.scientificcalculator;

import java.util.ArrayList;
import java.util.*;

public class Prompt {
    private String inputOperation;
    private String previousOperation;
    private Double inputValue;
    private String message;
    private List<String> validOperations = new ArrayList<String>();

    public Prompt()
    {
        inputOperation = "";
        previousOperation = "";
        inputValue = 0.0;
        message = "";
        validOperations.add("+");
        validOperations.add("-");
        validOperations.add("*");
        validOperations.add("/");
        validOperations.add("exp");
        validOperations.add("sq");
        validOperations.add("sqrt");
    }

    public String callMenu()
    {
        BoxMaker menuBox = new BoxMaker(120);

        return menuBox.draw(
                String.format("%-100s", "OPERATION   | DESCRIPTION"),
                String.format("%-100s", "+           | Adds the display value to next input"),
                String.format("%-100s", "-           | Subtracts the next input from display value"),
                String.format("%-100s", "*           | Multiplies display value with next input"),
                String.format("%-100s", "/           | Divides display value by next input"),
                String.format("%-100s", "exp         | Display value to power of next input"),
                String.format("%-100s", "sq          | Display value multiplied by itself"),
                String.format("%-100s", "sqrt        | Square root of display value"));
    }

    public String getMessage()
    {
        return message;
    }
    public Double getInputValue(Double val)
    {
        return inputValue;
    }

    public void input(String in)
    {
        Boolean isANumber = true;

        try
        {
            Double num = Double.parseDouble(in);
        }
        catch (NumberFormatException error)
        {
            isANumber = false;
        }

        if(isANumber)
        {
            inputValue = Double.parseDouble(in);
        }
        else
        {
            if(validOperations.contains(in))
            {
                previousOperation = inputOperation;
                inputOperation = in;
            }
            else // Throw error
            {
                message = "Invalid user input";
            }
        }
    }
}
