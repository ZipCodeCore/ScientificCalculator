package com.zipcodewilmington.scientificcalculator;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        //Create a instance of Calculator
        Calculator c = new Calculator();
        NumberFormat nf = new DecimalFormat("0.#####################");
        String result = "";
        double cur = 0.0;
        double curTemp = 0.0;
        double mem = 0;
        int mode = 10;

        Console.println("==================================================");
        Console.println("!!!!Welcome to the Calculator Team 3!!!!");
        Console.println("==================================================");
        while(true) {
            curTemp = cur;
            if(mode != 10) {
                Console.println("[ "+modeName(mode)+" Mode ] (Any decimal point will be truncated)");
                Console.println("Current Value: " + c.DecimalToOther((int)cur,mode));
            }else {
                Console.println("Current Value: " + nf.format(cur));
            }

            String command = Console.getStringInput("Please enter a command! (Enter HELP for user manual) ");

            if (command.equalsIgnoreCase("add") || command.equalsIgnoreCase("sub") ||
                    command.equalsIgnoreCase("mul") || command.equalsIgnoreCase("div")
                    || command.equalsIgnoreCase("pow") || command.equalsIgnoreCase("set")) {


                double num1 = Console.getDoubleInput("Please enter a number: ");

                if (command.equalsIgnoreCase("add")) {
                    cur = c.add(cur, num1);
                } else if (command.equalsIgnoreCase("sub")) {
                    cur = c.subtract(cur, num1);
                } else if (command.equalsIgnoreCase("mul")) {
                    cur = c.multiply(cur, num1);
                } else if (command.equalsIgnoreCase("div")) {
                    cur = c.divide(cur, num1);
                } else if (command.equalsIgnoreCase("pow")) {
                    cur = c.exponent(cur, num1);
                } else if(command.equalsIgnoreCase("set")) {
                    cur = num1;
                    //num1 = cur;
                    //ans = "Y";
                }

            }else if(command.equalsIgnoreCase("useM")) {
                cur = mem;
            }else if(command.equalsIgnoreCase("M+")) {
                mem += cur;
                Console.println("OK! I added "+ nf.format(cur) +" to memory! Memory is now "+nf.format(mem));
            }else if(command.equalsIgnoreCase("clearM")) {
                mem = 0 ;
                Console.println("OK! I reset the memory, memory is now "+nf.format(mem));
            }else if(command.equalsIgnoreCase("showM")) {
                Console.println("M is "+nf.format(mem));
            }else if(command.equalsIgnoreCase("M")){
                mem = cur;
                Console.println("OK! Memory is now set to "+nf.format(mem));
            }else if(command.equalsIgnoreCase("BYE")){
                break;
            }else if(command.equalsIgnoreCase("zipcode")){
                Console.println("Cohort 6.0 is the BEST COHORT EVER!!!!!");
            }else{

                if(command.equalsIgnoreCase("neg")) {
                    cur = c.signSwitch(cur);
                }else if(command.equalsIgnoreCase("inv")) {
                    cur = c.inverse(cur) ;
                }else if(command.equalsIgnoreCase("sq")) {
                    cur = c.square(cur) ;
                }else if(command.equalsIgnoreCase("sqrt")){
                    cur = c.squareRoot(cur) ;
                }else if(command.equalsIgnoreCase("sin")){
                    cur = c.sin(cur);
                }else if(command.equalsIgnoreCase("cos")){
                    cur = c.cos(cur);
                }else if(command.equalsIgnoreCase("tan")){
                    cur = c.tangent(cur);
                }else if(command.equalsIgnoreCase("arcsin")){
                    cur = c.InverseSin(cur);
                }else if(command.equalsIgnoreCase("arccos")){
                    cur = c.InverseCos(cur);
                }else if(command.equalsIgnoreCase("arctan")){
                    cur = c.InverseTangent(cur);
                }else if(command.equalsIgnoreCase("ln")){
                    cur = c.log(cur);
                }else if(command.equalsIgnoreCase("log10")) {
                    cur = c.log10X(cur);
                }else if(command.equalsIgnoreCase("invlog")) {
                    cur = c.invLog(cur);
                }else if(command.equalsIgnoreCase("ex")) {
                    cur = c.invNatLog(cur);
                }else if(command.equalsIgnoreCase("!")) {
                    cur = c.factorial(cur);
                }else if(command.equalsIgnoreCase("toDeg")) {
                    cur = c.toDegrees(cur);
                }else if(command.equalsIgnoreCase("toRad")) {
                    cur = c.toRadians(cur);
                }else if(command.equalsIgnoreCase("toHex")) {
                    result = c.DecimalToOther((int)cur, 16);
                }else if(command.equalsIgnoreCase("toOct")) {
                    result = c.DecimalToOther((int)cur, 8);
                }else if(command.equalsIgnoreCase("toBin")) {
                    result = c.DecimalToOther((int)cur, 2);
                }else if(command.equalsIgnoreCase("always73")) {
                    if(cur<1000){
                        Console.println("Sorry, this only works if input is a 4-digit number!");
                    }
                }else if(command.equalsIgnoreCase("c")){
                    cur = 0;
                }else if(command.equalsIgnoreCase("isPrime")||command.equalsIgnoreCase("mode16")||
                        command.equalsIgnoreCase("mode10")|| command.equalsIgnoreCase("mode8")||
                        command.equalsIgnoreCase("mode2")||command.equalsIgnoreCase("mode2")) {

                }else{
                    Console.println("That's not a valid command!!");
                }
            }



                //print result
                if(Double.isNaN(cur) || cur == Double.POSITIVE_INFINITY || cur == Double.NEGATIVE_INFINITY ) {
                    Console.println("ERROR!!! :(");
                    cur = curTemp;
                }else if(command.equalsIgnoreCase("toHex")){
                    Console.println("Decimal "+ (int)cur +" is " + result + " in Hexadecimal!");
                }else if(command.equalsIgnoreCase("toOct")){
                    Console.println("Decimal "+ (int)cur +" is " + result + " in Octal!");
                }else if(command.equalsIgnoreCase("toBin")){
                    Console.println("Decimal "+ (int)cur +" is " + result + " in Binary!");
                }else if(command.equalsIgnoreCase("always73")){
                    double a = c.multiply(cur,10001);
                    double b = c.divide(a,137);
                    double cc = c.divide(b,cur);

                    Console.println(cur + " * 10001 = " + a );
                    Console.println(a+" / 137 = "+ b);
                    Console.println(b + " / "+cur+" = " + cc );
                    cur = c.secretof73(cur);
                    Console.println("Your result is " + nf.format(cur) + " :)");

                }else if(command.equalsIgnoreCase("isPrime")) {
                    if(c.isPrime(cur))
                        Console.println((int)cur + " is a prime");
                    else{
                        Console.println(nf.format(cur) + " is not a prime");
                    }
                }else if(command.equalsIgnoreCase("mode10")){
                    mode = 10;
                    Console.println("Ok! Switched to mode "+mode);
                }else if(command.equalsIgnoreCase("mode16")){
                    mode = 16;
                    Console.println("Ok! Switched to mode "+mode);
                }else if(command.equalsIgnoreCase("mode8")){
                    mode = 8;
                    Console.println("Ok! Switched to mode "+mode);
                }else if(command.equalsIgnoreCase("mode2")){
                    mode = 2;
                    Console.println("Ok! Switched to mode "+mode);
                }else if (command.equalsIgnoreCase("help")) {
                    Console.print("Here are the available commends:\n" +
                            printHelp("Set Value", "set") +
                            printHelp("Clear Value", "c") +
                            printHelp("Add", "add") +
                            printHelp("Subtract", "sub") +
                            printHelp("Multiply", "mul") +
                            printHelp("Divide", "div") +
                            printHelp("Exponent", "pow") +
                            printHelp("Switch Sign", "neg") +
                            printHelp("Inverse", "inv") +
                            printHelp("Sine", "sin") +
                            printHelp("Cosine", "cos") +
                            printHelp("Tangent", "tan") +
                            printHelp("Inverse Sine", "arcsin") +
                            printHelp("Inverse Cosine", "arccon") +
                            printHelp("Inverse Tangent", "arctan") +
                            printHelp("Logarithm", "log10") +
                            printHelp("Inverse Log", "invlog") +
                            printHelp("Natural Log ", "ln") +
                            printHelp("Inverse Natural Log", "ex") +
                            printHelp("Inverse number", "inv") +
                            printHelp("Square", "sq") +
                            printHelp("Square Root", "sqrt") +
                            printHelp("Factorial", "!") +
                            printHelp("Degree to Radian", "toRad") +
                            printHelp("Radian to Degree", "toDeg") +
                            printHelp("Hexadecimal Mode", "mode16") +
                            printHelp("Decimal Mode", "mode10") +
                            printHelp("Octal Mode", "mode8") +
                            printHelp("Binary Mode", "mode2") +
                            printHelp("Set memory", "M") +
                            printHelp("Add value to memory", "M+") +
                            printHelp("Show value in memory", "showM")+
                            printHelp("Use the value in memory", "useM")+
                            printHelp("Clear memory", "clearM")
                    );
                }else{
                    String d = "";
                    if(mode != 10) { d =  "decimal "; }
                    Console.println("Your "+d+"result is " + nf.format(cur) + " :)");
                }

            Console.println("==================================================");

        }
    }

    public static String printHelp(String description, String ops ){
        return String.format("%-27s%s\n", description, ops).replace(' ', '-');
    }
    public static String modeName(int radix){
        if(radix == 10){
            return "Decimal";
        }else if(radix == 2){
            return "Binary";
        }else if(radix == 8){
            return "Octal";
        }else if(radix ==16){
            return "Hexadecimal";
        }
        return "Not Possible";
    }
}
