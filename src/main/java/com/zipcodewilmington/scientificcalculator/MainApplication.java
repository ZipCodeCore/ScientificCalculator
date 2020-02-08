package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        //Create a instance of Calculator
        Calculator c = new Calculator();
        String result = "";
        double cur = 0.0;
        boolean byeFlag = false;
        double num1 = 0;
        String ans = "N" ;


        Console.println("!!!!Welcome to the Calculator Team 3!!!!");
        while(!byeFlag){
            Console.println("Current value: " + cur);
            String comment = Console.getStringInput("Please enter a comment! (Enter HELP for user manual) ");

            if(comment.equals("add") || comment.equals("subtract") || comment.equals("multiply") || comment.equals("divide") || comment.equals("exponent")) {

                if(ans.equals("N")) {
                    String input1 = Console.getStringInput("Please enter the 1st number: ");
                    num1 = Double.parseDouble(input1);
                }

                String input2 = Console.getStringInput("Please enter the 2nd number: ");
                double num2 = Double.parseDouble(input2);
                if (comment.equals("add")) {
                    cur = c.add(num1, num2);
                } else if (comment.equals("subtract")) {
                    cur = c.subtract(num1, num2);
                } else if (comment.equals("multiply")) {
                    cur = c.multiply(num1, num2);
                } else if (comment.equals("divide")) {
                    if(num2 == 0) {
                        result = "ERROR!!" ;
                    }
                    cur = c.divide(num1, num2);
                } else if (comment.equals("exponent")) {
                    cur = c.exponent(num1, num2);
                }
            }else if(comment.equalsIgnoreCase("help")){
                Console.print("Here are the available commends:\n" +
                        printHelp("Sine", "sin") +
                        printHelp("Cosine", "cos") +
                        printHelp("Tangent", "tan") +
                        printHelp("Inverse Sine", "arcsin") +
                        printHelp("Inverse Cosine", "arccon") +
                        printHelp("Inverse Tangent", "arctan") +
                        printHelp("Logarithm", "log") +
                        printHelp("Inverse Log", "10to") +
                        printHelp("Natural Log ", "ln") +
                        printHelp("Inverse Natural Log", "ex") +
                        printHelp("Inverse number", "inv") +
                        printHelp("Square", "sq") +
                        printHelp("Square Root", "sqrt") +
                        printHelp("Factorial", "!") +
                        printHelp("Degree to Radian", "toRad") +
                        printHelp("Radian to Degree", "toDeg") +
                        printHelp("Decimal to Hexadecimal", "toHex") +
                        printHelp("Decimal to Octal", "toOct") +
                        printHelp("Decimal to Binary", "toBin") +
                        printHelp("Clear Value", "reset")
                );
            }else if(comment.equalsIgnoreCase("BYE")){
                byeFlag = true;
            }else{
                String input = Console.getStringInput("Please enter a number:");
                double num = Double.parseDouble(input);

                if(comment.equals("sq")) {
                    cur = c.square(num) ;
                }else if(comment.equals("sqrt")){
                    if(num == -1) {
                        result = "ERROR!!";
                    }
                    cur = c.squareRoot(num) ;
                }else if(comment.equals("sin")){
                    cur = c.sin(num);
                }else if(comment.equals("cos")){
                    cur = c.cos(num);
                }else if(comment.equals("tan")){
                    cur = c.tangent(num);
                }else if(comment.equals("arcsin")){
                    cur = c.InverseSin(num);
                }else if(comment.equals("arccos")){
                    cur = c.InverseCos(num);
                }else if(comment.equals("arctan")){
                    cur = c.InverseTangent(num);
                }else if(comment.equals("log")){
                    cur = c.log(num);
                }else if(comment.equals("log10X")) {
                    cur = c.log10X(num);
                }else if(comment.equals("log")) {
                    cur = c.invLog(num);
                }else if(comment.equals("log")) {
                    cur = c.invNatLog(num);
                }else if(comment.equals("!")) {
                    cur = c.factorial(num);
                }else if(comment.equals("log")) {
                    cur = c.log(num);
                }else if(comment.equals("toDeg")) {
                    cur = c.toDegrees(num);
                }else if(comment.equals("toRad")) {
                    cur = c.toRadians(num);
                }else if(comment.equals("toHex`")) {
                    result = c.DecimalToOther((int)num, 16);
                }else if(comment.equals("toOct")) {
                    result = c.DecimalToOther((int)num, 8);
                }else if(comment.equals("toBin")) {
                    result = c.DecimalToOther((int)num, 1);
                }
            }
            //print result
            result = cur + "";
            Console.println("Your result is " + result + " :)");
            Console.println("What do you want to do next?");
            ans = Console.getStringInput("Keep the current number?(Y/N): ");
            if(ans.equalsIgnoreCase("Y")){
                num1 = cur;
            }
            else{
                cur = 0;
            }
        }
    }

    public static String printHelp(String description, String ops ){
        return String.format("%-27s%s\n", description, ops).replace(' ', '-');
    }
}
