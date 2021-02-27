package com.zipcodewilmington.scientificcalculator;

public class NewCalculator {
   static MainApplication calculator = new MainApplication();

    public static void main(String[] args) {
        calculator.switchDisplayMode();
        calculator.switchDisplayMode();
        calculator.switchDisplayMode();
        calculator.switchDisplayMode("Hellow");
        calculator.switchDisplayMode("binary");
        calculator.switchDisplayMode();

        calculator.getMode();

        calculator.switchUnitsMode();
        calculator.switchUnitsMode("degrees");
        calculator.switchUnitsMode();
        calculator.switchUnitsMode();
        calculator.switchUnitsMode("radians");
        calculator.switchUnitsMode("Break me");
        calculator.switchUnitsMode();
        calculator.switchUnitsMode();

    }

}
