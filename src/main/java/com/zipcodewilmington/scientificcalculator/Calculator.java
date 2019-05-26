package com.zipcodewilmington.scientificcalculator;

public class Calculator extends Console
{
    private String userInput;
    private boolean isWaitingForNumInput;
    public Calculator() {
        userInput = "";
        isWaitingForNumInput = false;

    }

    public void run() {

        while (!userInput.equals("Q"));
        {
            getUserInput();
        }

    }

    private void getUserInput(){
        userInput = getStringInput("");
        userInput = userInput.toUpperCase();
    }

    private void checkUserInput()
    {

        // if user entered a number
        //  call core.changeDisplay();
        // else if user entered a operator / command (Example: sine)
        //  call core.changeDisplay(Extended.sine(core.getDisplay()));
        // else if user entered a double-side operator (Example: addition)
        //  isWaitingForNumInput = true;
        // else if user entered switch mode command
        // {
        //      if user entered mode option
        //          Extended.switchMode(userInput);
        //      else
        //          Extended.switchMOdeRotate();
        // }
        // else if user entered emptyString
        //      do nothing;
        // else
        //      print invalid command error
        //

    }

}
