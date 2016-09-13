package Ragonese.Ken.ScientificCalculator;

import java.util.Scanner;

public class ScientificCalculator {
    public static Display display = new Display();
    public static Scanner scanner = new Scanner(System.in);
    public static Executor executor = new Executor();
    public static AdvancedFunctions advancedFunctions = new AdvancedFunctions();
    public static BasicFunctions basicFunctions = new BasicFunctions();
    public static TrigFunctions trigFunctions = new TrigFunctions();
    public static Mode mode = new Mode();
    public static Memory memory = new Memory();

    public static boolean powerStatus = true;
    public static double mostRecentValue = 0;
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
        int command = scanner.nextInt();
        switch(command){
            case 1:
                display.basicFunctions();
                basicFunctions.basicFunctions();
                break;
            case 2:
                display.advancedFunctions();
                advancedFunctions.advancedFunctions();
                break;
            case 3:
                display.trigFunctions();
                trigFunctions.trigFunctions();
                break;
            case 4:
                display.modeMenu();
                mode.modeMenu();
                break;
            case 5:
                display.memoryMenu();
                memory.memoryMenu();
                break;
            case 6:
                display.clearDisplay();
                mostRecentValue = 0;
                break;
            case 7:
                mostRecentValue = executor.invertSign(mostRecentValue);
                break;
            case 8:
                display.help();
                break;
            case 9:
                powerStatus = false;
                break;
            default:
                System.out.println("*****************************");
                System.out.println("Function name not recognized.");
                System.out.println("*****************************");
        }
    }
    public static void valueInput(){
        System.out.println("Input a value");
        secondNumber = scanner.nextDouble();
    }
}