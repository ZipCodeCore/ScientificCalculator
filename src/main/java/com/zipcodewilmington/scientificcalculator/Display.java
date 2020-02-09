package com.zipcodewilmington.scientificcalculator;

import javax.swing.*;
import java.io.DataInput;

public class Display {
    private int displayWidth;
    private BoxMaker displayBox;
    private Double currentValue;
//    private String currentOperation;  Moving to input
    public enum Modes { BINARY, OCTAL, DEC, HEX }
    private Modes mode;
    private Boolean isRadians;
    Boolean error;

    public Display()
    {
        currentValue = 0.0;
        mode = Modes.DEC;
        displayWidth = 50;
        displayBox = new BoxMaker(displayWidth);
        isRadians = false;
        error = false;
    }

    public void setDisplay(Double inputValue)
    {
        if (inputValue.isNaN() || inputValue.isInfinite())
        {
            error = true;
        }
        else {
            currentValue = inputValue;
        }
    }

    public Double getDisplay()
    {
        return currentValue;
    }

    // Future implimentation, running out of time to format correctly with DEG/RAD and
    // BINARY/OCTAL/HEX left-justification on display
    public void setDisplayWidth(int newWidth)
    {
        displayWidth = newWidth;
    }

    public String update()
    {
        String output;
        String radianLine = "";
        String valueLine = "";
        String baseLine = "";

        if(error)
        {
            radianLine = String.format("%-46s", "ERR");
            valueLine = "ERR ";
            baseLine = String.format("%-46s","ERR");
            output = displayBox.draw(radianLine, valueLine, baseLine);
            return output;
        }

        if(isRadians == true)
        {
            radianLine = String.format("%-46s", "RAD");
        }
        else
        {
            radianLine = " ";
        }


        // This needs to be fixed
        if(mode == Modes.BINARY)
        {
            baseLine = String.format("%-46s", "BIN");
            valueLine = Integer.toBinaryString(currentValue.intValue()) + " ";
        }
        else if(mode == Modes.OCTAL)
        {
            baseLine = String.format("%-46s", "OCTAL");
            valueLine = Integer.toOctalString(currentValue.intValue()) + " ";
        }
        else if(mode == Modes.DEC)
        {
            if(currentValue % 1 == 0) // No decimal
            {
                valueLine = Integer.toString(currentValue.intValue()) + " ";
            }
            else
            {
                valueLine = Double.toString(currentValue) + " ";
            }
        }
        else if(mode == Modes.HEX)
        {
            baseLine = String.format("%-46s", "HEX");
            valueLine = Integer.toHexString(currentValue.intValue()) + " ";
        }

        output = displayBox.draw(radianLine, valueLine, baseLine);
        Console.println("%s", output);
        return output;
    }

    public void setMode(Modes newMode)
    {
        mode = newMode;
    }

    public void setMode() {
        switch (mode)
        {
            case DEC:
                setMode(Modes.BINARY);
                break;
            case BINARY:
                setMode(Modes.OCTAL);
                break;
            case OCTAL:
                setMode(Modes.HEX);
                break;
            case HEX:
                setMode(Modes.DEC);
                break;
        }

        // Considering updating currentVal here, but makes math more difficult
        // since Math assumes decimal math.
    }

    public Modes getMode()
    {
        return mode;
    }

    public void clear() {
        currentValue = 0.0;
        error = false;
        isRadians = false;
        mode = Modes.DEC;
        // Send a command to input to remove last operation and last value input
    }

    public void invSign()
    {
        currentValue *= -1.0;
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

    public void toggleRadians()
    {
        isRadians = !isRadians;
    }

    public Boolean getIsRadians()
    {
        return isRadians;
    }

    // Make a toggle to switch from normal notation to scientific notation
}