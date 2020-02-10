package com.zipcodewilmington.scientificcalculator;

import static java.lang.Integer.*;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static double total = 0;
    public static double currentTotal = 0;
    public static void main(String[] args) {
        
        double input;
        int operand;
        Display display = new Display();
        Operations opp = new Operations();
        ScientificCalc sci = new ScientificCalc();
        boolean on = true;

        Console.println("Welcome to Mav!");
        String name = Console.getStringInput("Please enter your name!");
        Console.println(name);
        while (on){
            if(display.checkState){
                display.update(0);
                input = Console.getDoubleInput("Please enter a number:");
                total = input;
                currentTotal = input;
                display.checkState = false;
            }else {
                operand = Console.getOperand("Enter an operator:");
                switch (operand){
                    case 100:
                        on = false;
                        break;
                    case 0:
                        display.clearDisplay();
                        break;
                    case 1:
                        if(!Display.error) {
                            currentTotal = opp.add(total, Console.getDoubleInput("Please enter a number:"));
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 2:
                        if(!Display.error) {
                            currentTotal = opp.subtract(total, Console.getDoubleInput("Please enter a number:"));
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 3:
                        if(!Display.error) {
                            currentTotal = opp.multiply(total, Console.getDoubleInput("Please enter a number:"));
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 4:
                        if(!Display.error) {
                            currentTotal = opp.divide(total, Console.getDoubleInput("Please enter a number:"));
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 5:
                        if(!Display.error) {
                            currentTotal = opp.square(total);
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 6:
                        if(!Display.error) {
                            currentTotal = opp.squareRoot(total);
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 7:
                        if(!Display.error) {
                            currentTotal = opp.exponent(total, Console.getDoubleInput("Please enter a number:"));
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 8:
                        if(!Display.error) {
                            currentTotal = opp.inverse(total);
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 9:
                        if(!Display.error) {
                            currentTotal = opp.switchSign(total);
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 10:
                        if(!Display.error) {
                            currentTotal = sci.sine(total);
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 11:
                        if(!Display.error) {
                            currentTotal = sci.cose(total);
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 12:
                        if(!Display.error) {
                            currentTotal = sci.tangent(total);
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 13:
                        if(!Display.error) {
                            currentTotal = sci.inverseSin(total);
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 14:
                        if(!Display.error) {
                            currentTotal = sci.inverseCos(total);
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 15:
                        if(!Display.error) {
                            currentTotal = sci.inverseTan(total);
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 16:
                        if(!Display.error) {
                            currentTotal = sci.logarithm(total);
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 17:
                        if(!Display.error) {
                            currentTotal = sci.inverseLog(total);
                            display.update( currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 18:
                        if(!Display.error) {
                            currentTotal = sci.naturalLog(total);
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 19:
                        if(!Display.error) {
                            currentTotal = sci.inverseNaturalLog(total);
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 20:
                        if(!Display.error) {
                            currentTotal = sci.factorial(total);
                            display.update(currentTotal);
                            total = currentTotal;
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 21:
                        if(!Display.error) {
                            ScientificCalc.memoryAddDouble();
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 22:
                        if(!Display.error) {
                            ScientificCalc.memoryReset();
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 23:
                        if(!Display.error) {
                            display.update(ScientificCalc.getMemoryDouble());
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 24:
                        if(!Display.error) {
                            display.changeNumberDisplay();
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 25:
                        if(!Display.error) {
                            String mode = Console.getStringInput("Enter mode: (Deci, Hexa, Binary, Octal");
                            display.changeNumberDisplay(mode);
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 26:
                        if(!Display.error) {
                            display.changeUnitDisplay();
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 27:
                        if(!Display.error) {
                            String unit = Console.getStringInput("Enter mod: rad, deg");
                            display.changeUnitDisplay(unit);
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 28:
                        if(!Display.error) {
                            if(sci.isPrime(total)){
                                System.out.println("It's a prime!");
                            }else {
                                System.out.println("It's not a prime!");
                            }
                        }else{
                            Display.displayErr();
                        }
                        break;
                    case 29:
                        if(!Display.error) {
                            double principal = Console.getDoubleInput("Enter principal:");
                            double interest = Console.getDoubleInput("Enter interest:");
                            double yearInterest = sci.yearlyInterest(principal, interest);
                            display.update(yearInterest);
                        }else{
                            Display.displayErr();
                        }
                        break;
                }

            }
        }
    }
}

