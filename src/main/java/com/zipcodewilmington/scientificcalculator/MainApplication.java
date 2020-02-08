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
        double curTemp = 0.0;
        boolean byeFlag = false;
        double num1 = 0;
        double num = 0;
        double mem = 0;
        boolean skip = false;
        String ans = " " ;

        Console.println("==================================================");
        Console.println("!!!!Welcome to the Calculator Team 3!!!!");
        Console.println("==================================================");
        while(!byeFlag) {
            skip = false;
            curTemp = cur;
            Console.println("Current value: " + cur);

            String command = Console.getStringInput("Please enter a command! (Enter HELP for user manual) ");

            if (command.equalsIgnoreCase("add") || command.equalsIgnoreCase("subtract") ||
                    command.equalsIgnoreCase("multiply") || command.equalsIgnoreCase("divide")
                    || command.equalsIgnoreCase("exponent")) {

                if (ans.equals("N") || ans.equals(" ")) {
                    String input1 = Console.getStringInput("Please enter the 1st number: ");
                    num1 = Double.parseDouble(input1);
                }

                String input2 = Console.getStringInput("Please enter the 2nd number: ");
                double num2 = Double.parseDouble(input2);
                if (command.equalsIgnoreCase("add")) {
                    cur = c.add(num1, num2);
                } else if (command.equalsIgnoreCase("subtract")) {
                    cur = c.subtract(num1, num2);
                } else if (command.equalsIgnoreCase("multiply")) {
                    cur = c.multiply(num1, num2);
                } else if (command.equalsIgnoreCase("divide")) {
                    cur = c.divide(num1, num2);
                } else if (command.equalsIgnoreCase("exponent")) {
                    cur = c.exponent(num1, num2);
                }
            } else if (command.equalsIgnoreCase("help")) {
                Console.print("Here are the available commends:\n" +

                        printHelp("Add", "add") +
                        printHelp("Subtract", "subtract") +
                        printHelp("Multiply", "multiply") +
                        printHelp("Divide", "divide") +
                        printHelp("Exponent", "exponent") +
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
                        printHelp("Decimal to Binary", "toBin")
                );
            }else if(command.equalsIgnoreCase("+M")) {
                mem += cur;
                Console.println("OK! I added "+ cur +" to memory! Memory is now "+mem);
                skip = true;
            }else if(command.equalsIgnoreCase("clearM")) {
                mem = 0 ;
                Console.println("OK! I reset the memory, memory is now "+mem);
                skip = true;
            }else if(command.equalsIgnoreCase("showM")) {
                Console.println("M is "+mem);
                skip = true;
            }else if(command.equalsIgnoreCase("M")){
                mem = cur;
                Console.println("OK! Memory is now set to "+mem);
                skip = true;
            }else if(command.equalsIgnoreCase("BYE")){
                byeFlag = true;
                break;
            }else if(command.equalsIgnoreCase("zipcode")){
                Console.println("Cohort 6.0 is the BEST COHORT EVER!!!!!");
                skip = true;
            }else{
                if(ans.equalsIgnoreCase("N") || ans.equalsIgnoreCase(" ") || command.equalsIgnoreCase("set")) {
                    if (command.equalsIgnoreCase("neg") || command.equalsIgnoreCase("inv") ||
                            command.equalsIgnoreCase("sq") || command.equalsIgnoreCase("sqrt") ||
                            command.equalsIgnoreCase("sin") || command.equalsIgnoreCase("cos") ||
                            command.equalsIgnoreCase("tan") || command.equalsIgnoreCase("arcsin")
                            || command.equalsIgnoreCase("arccos")
                            || command.equalsIgnoreCase("arctan") ||
                            command.equalsIgnoreCase("log") || command.equalsIgnoreCase("log10X")
                            || command.equalsIgnoreCase("invlog")
                            || command.equalsIgnoreCase("invnatlog") ||
                            command.equalsIgnoreCase("ex") || command.equalsIgnoreCase("!")
                            || command.equalsIgnoreCase("toDeg")
                            || command.equalsIgnoreCase("toRad") ||
                            command.equalsIgnoreCase("toHex") || command.equalsIgnoreCase("toOct")
                            || command.equalsIgnoreCase("toBin") || command.equalsIgnoreCase("set")) {
                        String input = Console.getStringInput("Please enter a number: ");
                        num = Double.parseDouble(input);
                    }
                }

                if(command.equalsIgnoreCase("set")) {
                    cur = num;
                    skip = true;
                    num1 = cur;
                    ans = "Y";
                }else if(command.equalsIgnoreCase("neg")) {
                    cur = c.signSwitch(num);
                }else if(command.equalsIgnoreCase("inv")) {
                    cur = c.inverse(num) ;
                }else if(command.equalsIgnoreCase("sq")) {
                    cur = c.square(num) ;
                }else if(command.equalsIgnoreCase("sqrt")){
                    if(num == -1) {
                        result = "ERROR!!";
                    }
                    cur = c.squareRoot(num) ;
                }else if(command.equalsIgnoreCase("sin")){
                    cur = c.sin(num);
                }else if(command.equalsIgnoreCase("cos")){
                    cur = c.cos(num);
                }else if(command.equalsIgnoreCase("tan")){
                    cur = c.tangent(num);
                }else if(command.equalsIgnoreCase("arcsin")){
                    cur = c.InverseSin(num);
                }else if(command.equalsIgnoreCase("arccos")){
                    cur = c.InverseCos(num);
                }else if(command.equalsIgnoreCase("arctan")){
                    cur = c.InverseTangent(num);
                }else if(command.equalsIgnoreCase("log")){
                    cur = c.log(num);
                }else if(command.equalsIgnoreCase("log10X")) {
                    cur = c.log10X(num);
                }else if(command.equalsIgnoreCase("invlog")) {
                    cur = c.invLog(num);
                }else if(command.equalsIgnoreCase("ex")) {
                    cur = c.invNatLog(num);
                }else if(command.equalsIgnoreCase("!")) {
                    cur = c.factorial(num);
                }else if(command.equalsIgnoreCase("toDeg")) {
                    cur = c.toDegrees(num);
                }else if(command.equalsIgnoreCase("toRad")) {
                    cur = c.toRadians(num);
                }else if(command.equalsIgnoreCase("toHex")) {
                    result = c.DecimalToOther((int)num, 16);
                }else if(command.equalsIgnoreCase("toOct")) {
                    result = c.DecimalToOther((int)num, 8);
                }else if(command.equalsIgnoreCase("toBin")) {
                    result = c.DecimalToOther((int)num, 2);
                }else if(command.equalsIgnoreCase("always73")) {
                    if(cur>=1000){
                        cur = c.secretof73(num);
                    }else{
                        Console.println("Sorry, this only works if input is a 4-digit number!");
                        skip = true;
                    }
                }else{
                    Console.println("That's not a valid command!!");
                    skip = true;
                }
            }


            if( !skip ){
                //print result
                if(Double.isNaN(cur) || cur == Double.POSITIVE_INFINITY || cur == Double.NEGATIVE_INFINITY ) {
                    Console.println("ERROR!!! :(");
                    cur = curTemp;
                }else if(command.equalsIgnoreCase("toHex")){
                    Console.println("Decimal "+ (int)num +" is " + result + " in Hexadecimal!");
                    num1 = num;
                }else if(command.equalsIgnoreCase("toOct")){
                    Console.println("Decimal "+ (int)num +" is " + result + " in Octal!");
                    num1 = num;
                }else if(command.equalsIgnoreCase("toBin")){
                    Console.println("Decimal "+ (int)num +" is " + result + " in Binary!");
                    num1 = num;
                }else if(command.equalsIgnoreCase("always73")){
                    double a = c.multiply(num,10001);
                    double b = c.divide(a,137);
                    double cc = c.divide(b,num);

                    Console.println(num + " * 10001 = " + a );
                    Console.println(a+" / 137 = "+ b);
                    Console.println(b + " / "+num+" = " + (int)cc );
                    Console.println("Your result is " + (int)cur + " :)");

                }else{
                    Console.println("Your result is " + cur + " :)");
                }

                if(cur != curTemp && !Double.isNaN(cur)) {
                    Console.println("What do you want to do next?");
                    ans = Console.getStringInput("Keep the current number?(Y/N): ");
                    //if the ans is bad then it will run this loop
                    while (!ans.equalsIgnoreCase("Y") && !ans.equalsIgnoreCase("N") && !ans.equalsIgnoreCase("bye")){
                        ans = Console.getStringInput("Keep the current number?(Y/N): ");
                    }
                    if (ans.equalsIgnoreCase("Y")) {
                        num1 = cur;
                        num = cur;
                    } else if (ans.equalsIgnoreCase("N")) {
                        cur = 0;
                    } else if (ans.equalsIgnoreCase("bye")) {
                        byeFlag = true;
                        break;
                    }
                }
            }
            Console.println("==================================================");

        }
    }

    public static String printHelp(String description, String ops ){
        return String.format("%-27s%s\n", description, ops).replace(' ', '-');
    }
}
