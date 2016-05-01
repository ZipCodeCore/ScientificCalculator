package io.minlee;

import java.util.Scanner;

/**
 * Created by minlee on 4/29/16.
 */
public class Interface {

    private static double displayValue;
    private static String memoryMode = "";
    private static double memoryValue;
    ScientificCalculator calc = new ScientificCalculator();
    Display displayMode = new Display(Display.DisplayType.DECIMAL);//Display is default for decimal
    private static String[] userOptions = {"Enter an option",
                                              "1:   Clear display to 0",
                                              "2:   Change display to specified value",
                                              "3:   Add",
                                              "4:   Subtract",
                                              "5:   Multiply",
                                              "6:   Divide",
                                              "7:   Square",
                                              "8:   Square Root",
                                              "9:   Variable Exponentiation",
                                              "10:  Inverse",
                                              "11:  Invert",
                                              "12:  Sine",
                                              "13:  Inverse Sine",
                                              "14:  Cosine",
                                              "15:  Inverse Cosine",
                                              "16:  Tangent",
                                              "17:  Inverse Tangent",
                                              "18:  Log",
                                              "19:  Inverse Log",
                                              "20:  Ln",
                                              "21:  Inverse Natural Log",
                                              "22:  Factorial",
                                              "23:  Toggle Display Mode",
                                              "24:  Enter Display Mode (BINARY, OCTAL, DECIMAL, HEXADECIMAL)",
                                              "25:  Access Memory Options",
                                              "26:  Toggle Degrees or Radians",
                                              "27:  Enter Choose Angle (DEGREES or RADIANS)",
                                              "28:  Calculate Compound Interest",
                                              "29:  Print out Menu Again",
                                              "0:   Close calculator"};

    private static String[] userHistory = new String[10];
    private static int userCommandCounter = 0;

    public void displayUserOptions(){
        for(int i = 0; i < userOptions.length; i++){
            System.out.println(userOptions[i]);
        }
    }

    public void callCorrectFeature(int userCommand){
        switch (userCommand) {
            case 1: //Clear display to 0
                clearDisplayValue();
                break;
            case 2:// Change display to specified value
                double newUserIput = readUserDoubleInput();
                setDisplayValue(newUserIput);
                break;
            case 3://Add to display value
                double addValue = readUserDoubleInput();
                displayValue = calc.calculateSum(displayValue, addValue);
                break;
            case 4://Subtract to display value
                double subtractValue = readUserDoubleInput();
                displayValue = calc.calculateSubtraction(displayValue, subtractValue);
                break;
            case 5://Multiply to display value
                double multiplyValue = readUserDoubleInput();
                displayValue = calc.calculateMultiplication(displayValue, multiplyValue);
                break;
            case 6://Divide to display value
                double divideValue = readUserDoubleInput();
                displayValue = calc.calculateDivision(displayValue, divideValue);
                break;
            case 7://Square display value
                displayValue = calc.calculateSquare(displayValue);
                break;
            case 8://Square root display value
                displayValue = calc.calculateSquareRoot(displayValue);
                break;
            case 9://Variable Exponentiation by input
                double expValue = readUserDoubleInput();
                displayValue = calc.calculateVariaableExponentiation(displayValue, expValue);
                break;
            case 10://Inverse the display value
                displayValue = calc.calculateInverse(displayValue);
                break;
            case 11://Invert the display value
                displayValue = calc.calculateInvert(displayValue);
                break;
            case 12://Calculate Sine
                displayValue = calc.calculateSine(displayValue);
                break;
            case 13://Calculate Inverse Sin
                displayValue = calc.calculateInverseSine(displayValue);
                break;
            case 14://Calculate Cosine
                displayValue = calc.calculateCosine(displayValue);
                break;
            case 15://Calculate Inverse Cosine
                displayValue = calc.calculateInverseCosine(displayValue);
                break;
            case 16://Calculate Tangent
                displayValue = calc.calculateTangent(displayValue);
                break;
            case 17://Calculate Inverse Tangent
                displayValue = calc.calculateInverseTangent(displayValue);
                break;
            case 18://Calculate Log
                displayValue = calc.calculateLog(displayValue);
                break;
            case 19://Calculate Inverse Log
                displayValue = calc.calculateInverseLog(displayValue);
                break;
            case 20://Calculate Ln
                displayValue = calc.calculateNaturalLog(displayValue);
                break;
            case 21://Calculate Inverse Natural Log
                displayValue = calc.calculateInverseNaturalLog(displayValue);
                break;
            case 22://Factorial
                displayValue = calc.calculateFactorial(displayValue);
                break;
            case 23://Toggle Display Mode
                displayMode.switchDisplayMode();
                break;
            case 24://Choose Display Mode
                System.out.println("Enter a Mode (BINARY, OCTAL, DECIMAL, HEXADECIMAL:");
                chooseDisplayMode();
                break;
            case 25://Access Memory Options
                System.out.println("Enter a Mode (M+ to add new, MC to reset, MRC to recall to display):");
                callCorrectMemoryFeature();
                break;
            case 26://Toggle Degrees or Radians
                switchUnitsMode();
                break;
            case 27://Enter Choose Angle (DEGREES or RADIANS)
                System.out.println("Enter Choose Angle (DEGREES or RADIANS):");
                String angleOption = readUserString();
                switchUnitsMode(angleOption);
                break;
            case 28://Calculate Compound Interest
                int interest;

                break;
            case 29://Print out User History
                printUserHistory();
                break;
        }
    }
    public void printUserHistory(){

    }
    public void switchUnitsMode(){
        boolean isInRadians = calc.getIsInRadians();
        if(isInRadians){
            calc.setIsInRadians(false);
            displayValue = calc.convertRadiansToDegrees(displayValue);
            System.out.println("Converted to Degrees");
        }
        else{
            calc.setIsInRadians(true);
            displayValue = calc.convertDegreesToRadians(displayValue);
            System.out.println("Converted to Radians");
        }
    }
    public void switchUnitsMode(String angleOption){
        boolean isInRadians = calc.getIsInRadians();
        if(angleOption.equals("DEGREES")){
            if(isInRadians){
                displayValue = calc.convertRadiansToDegrees(displayValue);
            }
            calc.setIsInRadians(false);
            System.out.println("Converted to Degrees");
        }
        else if(angleOption.equals("RADIANS")){
            if(!isInRadians){
                displayValue = calc.convertDegreesToRadians(displayValue);
            }
            calc.setIsInRadians(true);
            System.out.println("Converted to Radians");
        }
        else{
            System.out.println("Did not enter a correct type, no changes to angle type");
        }
    }
    public void callCorrectMemoryFeature(){
        String memoryOption = readUserString();
        if(memoryOption.equals("M+")){
            setMemoryValue();
            System.out.println("Entered to memory");
        }
        else if(memoryOption.equals("MC")){
            setMemoryValue(0);
            System.out.println("Memory reset to 0");
        }
        else if(memoryOption.equals("MRC")){
            setDisplayValue(memoryValue);
            System.out.println("Display value set to Memory");
        }
        else{
            System.out.println("Did not enter a correct type, no changes to memory");
        }
    }

    public void setMemoryValue(){
        memoryValue = readUserDoubleInput();
    }
    public void setMemoryValue(double reset){
        memoryValue = reset;
    }

    public void chooseDisplayMode(){
        String newDisplaytype = readUserString();
        displayMode.switchDisplayMode(newDisplaytype);
    }

    public void runCalculator(){
        displayUserOptions();
        displayDisplayValue();
        int userCommand = 1;
        while(userCommand != 0){
            userCommand = readUserCommand();
            callCorrectFeature(userCommand);
            displayDisplayValue();
            checkForErrors(displayValue);
        }
        System.out.println("Calculator closed");

    }
    public void displayDisplayValue(){
        System.out.println("Display Value: "+ displayMode.getCorrectDisplay(displayValue));
    }

    public String readUserString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Command:");
        String userString = input.nextLine();
        return userString;
    }

    public int readUserCommand(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Command:");
        int userCommand = input.nextInt();
        return userCommand;
    }
    public double readUserDoubleInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Value:");
        Double userValue = input.nextDouble();
        return userValue;
    }

    public void checkForErrors(double displayValue){
        if(displayValue != displayValue){
            System.out.println("ERROR - Choose Command #2 to reset display value");
        }
        if(Double.isInfinite(displayValue)){
            System.out.println("ERROR - Choose Command #2 to reset display value");
        }
    }

    public void setDisplayValue(double userInputValue){
        displayValue = userInputValue;
    }
    public void clearDisplayValue(){
        setDisplayValue(0);
    }
    public double getDisplayValue(){
        return displayValue;
    }
    public static void main(String[] args){
        Interface userInterface = new Interface();
        System.out.println("Welcome to Calculator!");
        userInterface.runCalculator();
    }




}
