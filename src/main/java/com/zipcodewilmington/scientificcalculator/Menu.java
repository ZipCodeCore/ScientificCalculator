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
                String.format("%-100s", "m           | Remember display"),
                String.format("%-100s", "m+          | Store memory"),
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
                String.format("%-100s", "sqrt        | Square root of display value"),
                String.format("%-100s", "rad         | Use Radians for Trigonometry"),
                String.format("%-100s", "sin         | Sine of display value"),
                String.format("%-100s", "cos         | Cosine of display value"),
                String.format("%-100s", "tan         | Tangent of display value"),
                String.format("%-100s", "invsin      | Inverse sine of display value"),
                String.format("%-100s", "invcos      | Inverse cosine of display value"),
                String.format("%-100s", "invtan      | Inverse tangent of display value"),
                String.format("%-100s", "log         | Log of display value"),
                String.format("%-100s", "invlog      | Inverse log of display value"),
                String.format("%-100s", "nlog        | N-log of display value"),
                String.format("%-100s", "invnlog     | Inverse N-log of display value"),
                String.format("%-100s", "!           | Factorial of display value"),
                String.format("%-100s", "fib         | Fibonacci of display value"),
                String.format("%-100s", "mtf         | Meters to feet"),
                String.format("%-100s", "ftm         | Feet to meters"),
                String.format("%-100s", "ktp         | Kilograms to pounds"),
                String.format("%-100s", "ptk         | Pounds to kilograms"),
                String.format("%-100s", "ctf         | Celsius to Farenheit"),
                String.format("%-100s", "ftc         | Farenheit to Celsius"));
    }
}
