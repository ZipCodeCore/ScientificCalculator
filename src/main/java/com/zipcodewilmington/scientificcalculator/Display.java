package com.zipcodewilmington.scientificcalculator;

public class Display {
    private Double currentValue;
    private String currentOperation;
    private Boolean error;
    private enum Modes { BINARY, OCTAL, DEC, HEX }
    private Modes mode;

    public Display()
    {
        currentValue = 0.0;
        mode = Modes.DEC;
        error = false;
        // currentOperation
    }

    public void update()
    {
        String output;

        if(error) {
            output = "ERR";
        }
        else if(mode == Modes.BINARY)
        {

        }
        else if(mode == Modes.OCTAL)
        {

        }
        else if(mode == Modes.DEC)
        {
            output = Double.toString(currentValue);
        }
        else if(mode == Modes.HEX)
        {

        }

//        Console.println(output);
    }

    public void clear() {
        currentValue = 0.0;
        update();
    }

    public Double invSign() {
        return currentValue * -1.0;
    }
}