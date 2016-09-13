package Ragonese.Ken.ScientificCalculator;

import java.util.Scanner;

public class ScientificCalculator {
    public static Display display = new Display();
    public static Scanner scanner = new Scanner(System.in);
    public static Executor executor = new Executor();
    public static AdvancedFunctions advancedFunctions = new AdvancedFunctions();
    public static BasicFunctions basicFunctions = new BasicFunctions();
    public static TrigFunctions trigFunctions = new TrigFunctions();
    public static LogFunctions logFunctions = new LogFunctions();
    public static Mode mode = new Mode();
    public static Memory memory = new Memory();

    public static boolean powerStatus = true;
    public static double mostRecentValue = 0;
    public static double firstNumber;
    public static double secondNumber;
    public static double valueInMemory;

    public static void main(String[] args) {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        scientificCalculator.compute();
    }
    public void compute(){
        while (powerStatus) {
            display.homePrompt();
            homePrompt();
        }
    }
    public void homePrompt(){
        String commandString = scanner.next();
        if(commandString.equals("1")) {
            display.basicFunctions();
            basicFunctions.basicFunctions();
        }
        else if(commandString.equals("2")) {
            display.advancedFunctions();
            advancedFunctions.advancedFunctions();
        }
        else if(commandString.equals("3")){
            display.trigFunctions();
            trigFunctions.trigFunctions();
        }
        else if(commandString.equals("4")){
            display.logFunctions();
            logFunctions.logFunctions();
        }
        else if(commandString.equals("5")){
            display.modeMenu();
            mode.modeMenu();
        }
        else if(commandString.equals("6")){
            display.memoryMenu();
            memory.memoryMenu();
        }
        else if(commandString.equals("7")){
            display.clearDisplay();
            mostRecentValue = 0;
        }
        else if(commandString.equals(("8"))){
            mostRecentValue = executor.invertSign(mostRecentValue);
        }
        else if(commandString.equals("9")) {
            display.help();
        }
        else if(commandString.equals("0")){
            powerStatus = false;
        }
        else{
            System.out.println("*****************************");
            System.out.println("Function name not recognized.");
            System.out.println("*****************************");
        }

    }
    public static boolean useMostRecent(){
        if(mostRecentValue !=0) {
            System.out.println("Use most recent value?");
            System.out.println("y/n");
            if (scanner.next().equals("y")) {
                return true;
            }
        }
        return false;
    }
    public static void xValueIsMostRecent(){
        System.out.println("Input the second value");
        secondNumber = scanner.nextDouble();
    }
    public static void notUsingMostRecent(){
        System.out.println("Input the first value");
        firstNumber = scanner.nextDouble();
        System.out.println("Input the second value");
        secondNumber = scanner.nextDouble();
    }
}