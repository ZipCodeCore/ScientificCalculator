package dedeus.roberto.project1calculator;

import java.util.Scanner;
import static java.lang.Double.isInfinite;

/**
 * Created by robertodedeus on 9/11/16.
 */

public class UserInterface {

    CoreCalculator coreCalculator = new CoreCalculator();
    State state = new State();
    Scanner sc = new Scanner(System.in);

    public boolean checkError(){
        return Double.isNaN(state.getStateValue()) || isInfinite(state.getStateValue());
    }

    public void mainMenu(){

        if(checkError()){
            output("Error occurred. State value has been reset to zero.");
            System.out.println(state.getStateValue());
            state.setStateValue(0);
        }

        output("-----");
        output("Current state value: \t" + state.outputStateValue(state.getStateValue()));
        output("Current display mode: \t" + state.getStateMode());
        output("-----");

        char mainMenuPrompt = drawMainMenu();

        switch (mainMenuPrompt){
            case '1':
                mathMenu();
                break;
            case '2':
                stateValueMenu();
                break;
            case '3':
                modeMenu();
                break;
            case '4':
                manageMemoryMenu();
                break;
            case '5':
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
                //state.setStateValue(coreCalculator.variableExponentiation(state.getStateValue(), promptOperand()));
                break;
            default:
                output("Invalid selection");
                mathMenu();
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
                state.setStateValue(0);
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

    private void manageMemoryMenu(){
        char manageMemoryPrompt = drawManageMemoryMenu();

    }

    private void output(String msg){
        System.out.println(msg);
    }

    private char drawMainMenu(){
        output("Main menu.");
        output("1. Do Math Stuff");
        output("2. State value options");
        output("3. Change State Mode");
        output("4. Manage Memory");
        output("5. Exit");
        return sc.next().toUpperCase().charAt(0);
    }

    private char drawMathMenu(){
        output("Math operators.");
        output("A = Addition");
        output("B = Subtraction");
        output("C = Multiplication");
        output("D = Division");
        output("E = Square");
        output("F = Variable exponentiation");
        return sc.next().toUpperCase().charAt(0);
    }

    private char drawStateValueMenu(){
        output("State Value menu.");
        output("1. Get state value");
        output("2. Change State value");
        output("3. Clear the state value");
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

    private char drawManageMemoryMenu(){
        output("Manage Memory menu.");
        output("1. Add current state to memory");
        output("2. Reset memory");
        output("3. Recall memory");
        return sc.next().toUpperCase().charAt(0);
    }

    private char exit(){
        output("State value is " + state.getStateValue());
        return '0';
    }

    private double promptOperand(){
        output("Enter operand: ");
        return sc.nextDouble();
    }
}
