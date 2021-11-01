package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


    public static void main(String[] args) {
        scientificCalc sc = new scientificCalc();
        //basicCalculator bc = new basicCalculator(); needs Tra's code, make sure to add params if he has them
        Calculator calc = new Calculator("0", sc, bc);
        Console.println("Welcome to my calculator!");
        calc.startCalc(0);
        //calc.displayOutput("2");

        BasicCalculator basicCalcObject = new BasicCalculator();
        while (true) {
            basicCalcObject.promptScreen();

            scientificCalc scientificCalcObject = new scientificCalc();
            scientificCalcObject.promptScreen();
    }
}
