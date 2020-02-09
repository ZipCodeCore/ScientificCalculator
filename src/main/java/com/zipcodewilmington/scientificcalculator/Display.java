package com.zipcodewilmington.scientificcalculator;

public class Display {
    private Double currentValue;
    private String currentOperation;
    private Boolean error;
    public enum Modes { BINARY, OCTAL, DEC, HEX }
    private Modes mode;

    public Display()
    {
        currentValue = 0.0;
        mode = Modes.DEC;
        error = false;
        // currentOperation
    }

    public void setDisplay(Double inputValue)
    {
        currentValue = inputValue;
    }

    public Double getDisplay()
    {
        return currentValue;
    }

    public String update()
    {
        String output = "";

        if(error) {
            output = "ERR";
        }
        else if(mode == Modes.BINARY)
        {
            output = Integer.toBinaryString(currentValue.intValue());
            currentValue = Double.parseDouble(output);
        }
        else if(mode == Modes.OCTAL)
        {
            output = Integer.toOctalString(currentValue.intValue());
            currentValue = Double.parseDouble(output);
        }
        else if(mode == Modes.DEC)
        {
            if(currentValue % 1 == 0) // No decimal
            {
                output = Integer.toString(currentValue.intValue());
            }
            else
            {
                output = Double.toString(currentValue);
            }
        }
        else if(mode == Modes.HEX)
        {
            output = Integer.toHexString(currentValue.intValue());
            currentValue = Double.parseDouble(output);
        }

        Console.println("%s", output);
        return output;
    }

    public void setMode(Modes newMode)
    {
        mode = newMode;
    }

    public void clear() {
        currentValue = 0.0;
        update();
    }

    public Double invSign()
    {
        return currentValue * -1.0;
    }

    public Double absoluteValue()
    {
        if(currentValue < 0)
        {
            return currentValue * -1;
        }
        else
        {
            return currentValue;
        }
    }
}