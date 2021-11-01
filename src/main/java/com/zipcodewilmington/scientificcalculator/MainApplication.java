package com.zipcodewilmington.scientificcalculator;


import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


    static double currentNumber;
    static double secondNumber;
    static double undefined;
    static String mathToPerform;

//so much code, switchunitmode has 2 methods, unsure what to do with that.
    //program is not looping properly

    public static void main(String[] args) {

        startup();

    }
        public static void startup () {

            if (currentNumber == 0) {
                Console.println("Welcome to our calculator!");
                currentNumber = getUserInput();
                printNumber(currentNumber);

            }
            if(mathToPerform != null) {
                getsecondinput();
                printNumber(doMath(currentNumber,secondNumber));
            }
            System.out.println("Please select a mode you wish to use");
            modeselection();
        }


    public static void modeselection() {
        System.out.println("Core Features or Scientific");
        Scanner scanner = new Scanner(System.in);
        String selection = String.valueOf(scanner.nextLine());
        if (selection.equalsIgnoreCase("core features")) {
            coreFeatures();
        } else if (selection.equalsIgnoreCase("Scientific")) {
            scienceFunctions();
        }
        startup();
    }

    public static void getsecondinput(){
        if(secondNumber == undefined) {
            secondNumber = getUserInput();
        }
    }

    public static Void setMathToPerform(String input) {
        mathToPerform = input;
        getsecondinput();
        return null;
    }


    public static double doMath(double input1, double input2) {
       double solution = 0;
        if(mathToPerform == "+") {
            solution = CoreFeatures.addition(input1,input2);
        }
        if(mathToPerform == "-") {
            solution = CoreFeatures.subtraction(input1,input2);
        }
        if(mathToPerform == "*") {
            solution = CoreFeatures.multiplication(input1,input2);
        }
        if(mathToPerform == "/") {
            solution = CoreFeatures.division(input1,input2);
        }
        if(mathToPerform == "exponents") {
            solution = CoreFeatures.exponents(input1,input2);
        }
        return solution;
    }

    public static void coreFeatures() {
        System.out.println("clearDisplay  currrentDisplay  basicOperation\n" +
                " square  squareRoot  exponents  invert  +/-");
        Scanner scanner = new Scanner(System.in);
        String selection = String.valueOf(scanner.nextLine());
        userChoice(selection);
    }
    public static void userChoice(String selection) {
        if (selection.equalsIgnoreCase("cleardisplay")) {
            MainApplication.currentNumber = 0;
            startup();
        } else if (selection.equalsIgnoreCase("currentdisplay")) {
            System.out.println(MainApplication.currentNumber);
            startup();
        } else if (selection.equalsIgnoreCase("basicoperation")) {
            basicoperations();
        } else if (selection.equalsIgnoreCase("square")) {
            printNumber(CoreFeatures.square(currentNumber));
        } else if (selection.equalsIgnoreCase("squareroot")) {
            printNumber(CoreFeatures.squareroot(currentNumber));
        } else if (selection.equalsIgnoreCase("exponents")) {
            setMathToPerform("exponents");
        } else if (selection.equalsIgnoreCase("invert")) {
            printNumber(CoreFeatures.invert(currentNumber));
        } else if (selection.equalsIgnoreCase("+/-")) {
            printNumber(CoreFeatures.flip(currentNumber));
        } else {
            System.out.println("Invalid Choice, Please try again");
            coreFeatures();
        }

    }

    public static void basicoperations() {
        System.out.println("Please enter an operation to use.");
        Scanner scanner = new Scanner(System.in);
        String selection = String.valueOf(scanner.nextLine());
        if(selection.equals("+")){
            setMathToPerform("+");
        }else if(selection.equals("-")){
            setMathToPerform("-");
        }else if(selection.equals("*")){
            setMathToPerform("*");
        }else if(selection.equals("/")){
            setMathToPerform("/");
        }else {
            System.out.println("invalid choice, please choose again");
            basicoperations();
        }
    }

    public static void scienceFunctions() {
        System.out.println("memory  sin   cosine  tangent  inversesin\n" +
                            "inversecosine  inversetangent  log  inverselog\n" +
                            "naturallog  inversenaturallog  factorialfunction\n" +
                            "switchunitmode");
        Scanner scanner = new Scanner(System.in);
        String selection = String.valueOf(scanner.nextLine());
        scienceChoice(selection);
    }

    public static void scienceChoice(String choice){

        if (choice.equalsIgnoreCase("memory")) {
            scientificFunctions.memoryFunction(currentNumber);
        }else if(choice.equalsIgnoreCase("sin")){
            printNumber(scientificFunctions.sin(currentNumber));
        }else if(choice.equalsIgnoreCase("cosine")){
            printNumber(scientificFunctions.cosin(currentNumber));
        }else if(choice.equalsIgnoreCase("tangent")){
            printNumber((scientificFunctions.tangent(currentNumber)));
        }else if(choice.equalsIgnoreCase("inversesin")){
            printNumber(scientificFunctions.inverseSin(currentNumber));
        }else if(choice.equalsIgnoreCase("inversecosine")){
            printNumber(scientificFunctions.inverseCosin(currentNumber));
        }else if(choice.equalsIgnoreCase("inversetangent")){
            printNumber(scientificFunctions.inverseTangent(currentNumber));
        }else if(choice.equalsIgnoreCase("log")){
            printNumber(scientificFunctions.log(currentNumber));
        }else if(choice.equalsIgnoreCase("inverselog")){
            printNumber(scientificFunctions.inversLog(currentNumber));
        }else if(choice.equalsIgnoreCase("naturallog")){
            printNumber(scientificFunctions.naturalLog(currentNumber));
        }else if(choice.equalsIgnoreCase("inversenaturallog")){
            printNumber(scientificFunctions.inverseNaturalLog(currentNumber));
        }else if(choice.equalsIgnoreCase("factorialfunction")){
            printNumber(scientificFunctions.factorialFunction(currentNumber));
        }else if(choice.equalsIgnoreCase("switchunitmode")){
  //          scientificFunctions.switchUnitsMode();
        }
    }


    public static double getUserInput() {
        System.out.println("Please input a number");
        Scanner scanner = new Scanner(System.in);
        double userInput = Double.valueOf(scanner.nextLine());
        return userInput;
    }
    public static void printNumber(double output){
        currentNumber = output;

        if (Math.round(output) != output) {
            double roundOff = Math.round(output * 10000.0) / 10000.0;
            System.out.println(roundOff);
        }else {
            System.out.println(modeSelection(Math.round(output)));
        }
    }

    public static String modeSelection(Long standard){
        int modified = standard.intValue();

        if(scientificFunctions.currentdisplayMode().equalsIgnoreCase("binary")){
            return Integer.toBinaryString(modified);
        }else if (scientificFunctions.currentdisplayMode().equalsIgnoreCase("octal")){
            return Integer.toOctalString(modified);
        }else if (scientificFunctions.currentdisplayMode().equalsIgnoreCase("hexadecimal")){
            return Integer.toHexString(modified);
        }else{
            return Long.toString(standard);
        }

    }



}


