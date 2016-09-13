package dedeus.roberto.project1calculator;

import java.util.Scanner;
import static java.lang.Double.isInfinite;

/**
 * Created by robertodedeus on 9/11/16.
 */

public class UserInterface {

    CoreCalculator coreCalculator = new CoreCalculator();
    TrigCalculator trigCalculator = new TrigCalculator();
    LogCalculator logCalculator = new LogCalculator();
    CustomCalculator customCalculator = new CustomCalculator();

    State state = new State();
    Memory memory = new Memory();
    Scanner sc = new Scanner(System.in);

    public boolean checkError(){
        return Double.isNaN(state.getStateValue()) || isInfinite(state.getStateValue());
    }

    public void mainMenu(){
        if(checkError()){
            state.error("Error occurred. State value has been reset to zero.");
            output(Double.toString(state.getStateValue()));
            state.setStateValue(0);
        }

        output("-----");
        // outputStateValue call necessary to display the proper state mode
        output("Current state value: \t" + state.outputStateValue(state.getStateValue()));
        output("Current display mode: \t" + state.getStateMode());
        output("-----");

        char mainMenuPrompt = drawMainMenu();
        switch (mainMenuPrompt){
            case '1':
                mathMenu();
                break;
            case '2':
                trigMenu();
                break;
            case '3':
                logMenu();
                break;
            case '4':
                customFunctionsMenu();
                break;
            case '5':
                stateValueMenu();
                break;
            case '6':
                modeMenu();
                break;
            case '7':
                trigUnitMenu();
            case '8':
                manageMemoryMenu();
                break;
            case '9':
                exit();
                break;
            default:
                output("Invalid selection");
                break;
        }
    }

    private void mathMenu(){
        char mathMenuPrompt = drawMathMenu();
        switch (mathMenuPrompt){
            case 'A':
                output("addition");
                state.setStateValue(coreCalculator.addition(state.getStateValue(), promptOperand()));
                break;
            case 'B':
                output("subtraction");
                state.setStateValue(coreCalculator.subtraction(state.getStateValue(), promptOperand()));
                break;
            case 'C':
                output("multiplication");
                state.setStateValue(coreCalculator.multiplication(state.getStateValue(), promptOperand()));
                break;
            case 'D':
                output("division");
                state.setStateValue(coreCalculator.division(state.getStateValue(), promptOperand()));
                break;
            case 'E':
                output("square");
                state.setStateValue(coreCalculator.square(state.getStateValue()));
                break;
            case 'F':
                output("variable exponentiation");
                state.setStateValue(coreCalculator.variableExponentiation(state.getStateValue(), promptOperand()));
                break;
            default:
                output("Invalid selection");
                mathMenu();
                break;
        }
        mainMenu();
    }

    private void trigMenu(){
        double stateValueDegree = trigCalculator.normalizeToDegree(state.getTrigUnit(), state.getStateValue());
        double stateValueRadian = trigCalculator.normalizeToRadian(state.getTrigUnit(), state.getStateValue());
        char trigMenuPrompt = drawTrigMenu();
        switch (trigMenuPrompt){
            case 'G':
                output("sine");
                // takes radian
                state.setStateValue(trigCalculator.sine(stateValueRadian));
                break;
            case 'H':
                output("inverse sine");
                // takes degrees
                state.setStateValue(trigCalculator.inverseSine(stateValueDegree));
                break;
            case 'I':
                output("cosine");
                // takes radian
                state.setStateValue(trigCalculator.cosine(stateValueRadian));
                break;
            case 'J':
                output("inverse cosine");
                // take degree
                state.setStateValue(trigCalculator.inverseCosine(stateValueDegree));
                break;
            case 'K':
                output("tangent");
                // take radian
                state.setStateValue(trigCalculator.tangent(stateValueRadian));
                break;
            case 'L':
                output("inverse tangent");
                // takes degree
                state.setStateValue(trigCalculator.inverseTangent(stateValueDegree));
                break;
            default:
                output("Invalid selection");
                trigMenu();
                break;
        }
        mainMenu();
    }

    private void logMenu(){
        char logMenuPrompt = drawLogMenu();
        switch (logMenuPrompt){
            case 'M':
                output("log");
                state.setStateValue(logCalculator.log(state.getStateValue()));
                break;
            case 'N':
                output("inverse log");
                state.setStateValue(logCalculator.inverseLog(state.getStateValue()));
                break;
            case 'O':
                output("natural log");
                state.setStateValue(logCalculator.naturalLog(state.getStateValue()));
                break;
            case 'P':
                output("inverse natural log");
                state.setStateValue(logCalculator.inverseNaturalLog(state.getStateValue()));
                break;
            default:
                output("Invalid selection");
                logMenu();
                break;
        }
        mainMenu();
    }

    private void customFunctionsMenu(){
        char customFunctionPrompt = drawCustomFunctions();
        switch (customFunctionPrompt){
            case '1':
                output(customCalculator.getGreatestTribe());
                break;
            case '2':
                state.setStateValue(customCalculator.createRandomNumber());
                break;
            default:
                output("Invalid selection");
                customFunctionsMenu();
                break;
            }
        mainMenu();
    }

    private void stateValueMenu(){
        char stateValuePrompt = drawStateValueMenu();
        switch (stateValuePrompt){
            case '1':
                output("Get the state value");
                System.out.println(state.getStateValue());
                break;
            case '2':
                output("Change state value");
                state.setStateValue(promptOperand());
                break;
            case '3':
                output("Clear state value");
                state.clearStateValue();
                break;
            case '4':
                output("Set the state value to random");
                state.setStateValue(customCalculator.createRandomNumber());
                break;
            default:
                output("Invalid selection");
                stateValueMenu();
                break;
        }
        mainMenu();
    }

    private void modeMenu(){
        char modeMenuPrompt = drawDisplayModeMenu();
        switch(modeMenuPrompt){
            case '1':
                state.switchDisplayMode(State.StateMode.BINARY);
                break;
            case '2':
                state.switchDisplayMode(State.StateMode.OCTAL);
                break;
            case '3':
                state.switchDisplayMode(State.StateMode.DECIMAL);
                break;
            case '4':
                state.switchDisplayMode(State.StateMode.HEXADECIMAL);
                break;
            default:
                output("Invalid selection");
                modeMenu();
                break;
        }
        mainMenu();
    }

    private void trigUnitMenu(){
        output("-----");
        output("Current trig unit mode " + state.getTrigUnit());
        output("-----");

        char trigUnitPrompt = drawTrigUnitMenu();
        switch(trigUnitPrompt){
            case '1':
                state.switchUnitsMode(State.TrigUnit.RADIANS);
                break;
            case '2':
                state.switchUnitsMode(State.TrigUnit.DEGREES);
                break;
            default:
                output("Invalid selection");
                trigUnitMenu();
                break;
        }
        mainMenu();
    }

    private void manageMemoryMenu(){
        char manageMemoryPrompt = drawManageMemoryMenu();
        switch(manageMemoryPrompt){
            case '1':
                memory.setRecallValue(state.getStateValue());
                break;
            case '2':
                memory.clearRecallValue();
                break;
            case '3':
                state.setStateValue(memory.getRecallValue());
                break;
        }
        mainMenu();
    }

    private char exit(){
        output("State value is " + state.getStateValue());
        return '0';
    }

    private void output(String msg){
        System.out.println(msg);
    }

    private char drawMainMenu(){
        output("Main menu.");
        output("1. Basic math functions");
        output("2. Trig functions");
        output("3. Logarithmic functions");
        output("4. Custom functions");
        output("5. State value menu");
        output("6. Change state mode");
        output("7. Change trig unit");
        output("8. Manage memory");
        output("9. Exit");
        return sc.next().toUpperCase().charAt(0);
    }

    private char drawMathMenu(){
        output("Basic math operators.");
        output("A = Addition");
        output("B = Subtraction");
        output("C = Multiplication");
        output("D = Division");
        output("E = Square");
        output("F = Variable exponentiation");
        return sc.next().toUpperCase().charAt(0);
    }

    private char drawTrigMenu(){
        output("Trig operators.");
        output("G = Sine");
        output("H = Inverse Sine");
        output("I = Cosine");
        output("J = Inverse Cosine");
        output("K = Tangent");
        output("L = Inverse Tangent");
        return sc.next().toUpperCase().charAt(0);
    }

    private char drawLogMenu(){
        output("Logarithmic operators.");
        output("M = Log");
        output("N = Inverse Log");
        output("O = Natural Log");
        output("P = Inverse Natural Log");
        return sc.next().toUpperCase().charAt(0);
    }

    private char drawCustomFunctions(){
        output("Custom functions");
        output("1. Which tribe is the greatest tribe?");
        output("2. Set state value to random number");
        return sc.next().toUpperCase().charAt(0);
    }

    private char drawStateValueMenu(){
        output("State Value menu.");
        output("1. Get state value");
        output("2. Change State value");
        output("3. Clear the state value");
        output("4. Set state value to random number");
        return sc.next().toUpperCase().charAt(0);
    }

    private char drawDisplayModeMenu(){
        output("Display Mode menu.");
        output("1. Binary");
        output("2. Octal");
        output("3. Decimal");
        output("4. Hexadecimal");
        return sc.next().toUpperCase().charAt(0);
    }

    private char drawTrigUnitMenu(){
        output("Display Mode menu.");
        output("1. Degrees");
        output("2. Radians");
        return sc.next().toUpperCase().charAt(0);
    }

    private char drawManageMemoryMenu(){
        output("Manage Memory menu.");
        output("1. Add current state value to memory");
        output("2. Reset memory");
        output("3. Recall memory");
        return sc.next().toUpperCase().charAt(0);
    }

    private double promptOperand(){
        output("Enter operand: ");
        return sc.nextDouble();
    }
}