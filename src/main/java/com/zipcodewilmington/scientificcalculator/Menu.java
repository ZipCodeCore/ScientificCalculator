package com.zipcodewilmington.scientificcalculator;

public class Menu
{
    public void Menu(){
    }

    public static String callMenu()
    {
        BoxMaker menuBox = new BoxMaker(120);

        return menuBox.draw(
                String.format("%-100s", "c           | Resets the display to 0"),
                String.format("%-100s", "m           | Store display to memory"),
                String.format("%-100s", "m+          | Recall stored memory as user input"),
                String.format("%-100s", "mc          | Reset memory to 0"),
                String.format("%-100s", "inv         | Invert the sign of the display value"),
                String.format("%-100s", "bin         | Set mode to binary"),
                String.format("%-100s", "oct         | Set mode to octal"),
                String.format("%-100s", "dec         | Set mode to decimal"),
                String.format("%-100s", "hex         | Set mode to hexadecimal"),
                String.format("%-100s", "mode        | Invert the sign of the display value"),
                String.format("%-100s", "+           | Adds the display value to next input"),
                String.format("%-100s", "-           | Subtracts the next input from display value"),
                String.format("%-100s", "*           | Multiplies display value with next input"),
                String.format("%-100s", "/           | Divides display value by next input"),
                String.format("%-100s", "exp         | Display value to power of next input"),
                String.format("%-100s", "sq          | Display value multiplied by itself"),
                String.format("%-100s", "sqrt        | Square root of display value"));
    }
}
