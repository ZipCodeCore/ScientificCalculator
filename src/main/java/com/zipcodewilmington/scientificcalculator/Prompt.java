package com.zipcodewilmington.scientificcalculator;

import sun.rmi.runtime.Log;

import javax.print.attribute.standard.MediaSize;

public class Prompt {
    private String inputOperation;
    private String previousOperation;
    private Double inputValue;
    private String message;
    private Display display = new Display();
    private Memory memory = new Memory();

    public Prompt()
    {
        inputOperation = "";
        previousOperation = "";
        inputValue = 0.0;
        message = "";
    }

    public void start() {
        display.update();
        parseInput(Console.getStringInput("> "));
    }

    public void parseInput(String s)
    {

        if(InputErrorHandler.validNumber(s))
        {
            display.setDisplay(Double.parseDouble(s));
        } else if(s.equalsIgnoreCase("menu"))
        {
            Console.println(Menu.callMenu());
        } else if(!InputErrorHandler.validOp(s))
        {
            Console.println("Invalid input, 'menu' will list commands");
        } else if(Operation.isSetting(s)) {
            if (s.equalsIgnoreCase("c")) {
                display.clear();
            } else if (s.equalsIgnoreCase("m")) {
                display.setDisplay(memory.getMemory());
            } else if (s.equalsIgnoreCase("m+")) {
                memory.setMemory(display.getDisplay());
            } else if (s.equalsIgnoreCase("mc")) {
                memory.setMemory(0.0);
            } else if (s.equalsIgnoreCase("rad")) {
                display.toggleRadians();
            }
        }

        else if(Operation.isUnary(s))
        {
            if(s.equalsIgnoreCase("inv"))
            {
                display.invSign();
            } else if(s.equalsIgnoreCase("sq"))
            {
                display.setDisplay(BasicMath.square(display.getDisplay()));
            } else if(s.equalsIgnoreCase("sqrt"))
            {
                display.setDisplay(BasicMath.squareroot(display.getDisplay()));
            } else if(s.equalsIgnoreCase("mode"))
            {
                display.setMode();
            } else if(s.equalsIgnoreCase("bin"))
            {
                display.setMode(Display.Modes.BINARY);
            } else if(s.equalsIgnoreCase("oct"))
            {
                display.setMode(Display.Modes.OCTAL);
            } else if(s.equalsIgnoreCase("dec"))
            {
                display.setMode(Display.Modes.DEC);
            } else if(s.equalsIgnoreCase("hex")) {
                display.setMode(Display.Modes.HEX);
            } else if(s.equalsIgnoreCase("log")) {
                display.setDisplay(Logarithm.Log(display.getDisplay()));
            } else if(s.equalsIgnoreCase("invlog")) {
                display.setDisplay(Logarithm.InvLog(display.getDisplay()));
            } else if(s.equalsIgnoreCase("nlog")) {
                display.setDisplay(Logarithm.NLog(display.getDisplay()));
            } else if(s.equalsIgnoreCase("invnlog")) {
                display.setDisplay(Logarithm.InvNLog(display.getDisplay()));
            } else if(s.equalsIgnoreCase("!")) {
                display.setDisplay(OtherFunctions.Fact(display.getDisplay()));
            } else if(s.equalsIgnoreCase("fib")) {
                display.setDisplay(OtherFunctions.Fibon(display.getDisplay()));
            } else if(s.equalsIgnoreCase("ftm")) {
                display.setDisplay(ConversionMath.feetToMeters(display.getDisplay()));
            } else if(s.equalsIgnoreCase("mtf")) {
                display.setDisplay(ConversionMath.metersToFeet(display.getDisplay()));
            } else if(s.equalsIgnoreCase("ptk")) {
                display.setDisplay(ConversionMath.poundsToKilos(display.getDisplay()));
            } else if(s.equalsIgnoreCase("ktp")) {
                display.setDisplay(ConversionMath.kilosToPounds(display.getDisplay()));
            } else if(s.equalsIgnoreCase("ctf")) {
                display.setDisplay(ConversionMath.celsiusToFahrenheit(display.getDisplay()));
            } else if(s.equalsIgnoreCase("ftc")) {
                display.setDisplay(ConversionMath.fahrenheitToCelsius(display.getDisplay()));
            }
        }

        display.update();
        parseInput(Console.getStringInput("> "));
    }
}
