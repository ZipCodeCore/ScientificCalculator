package com.zipcodewilmington.scientificcalculator;

public class Prompt {
    private String inputOperation;
    private String previousOperation;
    private Double inputValue;
    private String message;


    public Prompt()
    {
        inputOperation = "";
        previousOperation = "";
        inputValue = 0.0;
        message = "";
    }

    public String getMessage()
    {
        return message;
    }
    public Double getInputValue(Double val)
    {
        return inputValue;
    }

    public void input(String in, Double displayValue)
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
            if(ValidOperations.isValid(in))
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
