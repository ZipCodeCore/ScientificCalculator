package dedeus.roberto.project1calculator;

import java.util.Scanner;

/**
 * Created by robertodedeus on 9/11/16.
 */

public class UserInterface {

    CoreCalculator coreCalculator = new CoreCalculator();
    State state = new State();
    Scanner sc = new Scanner(System.in);

    public void output(String msg){
        System.out.println(msg);
    }

    public void mainMenu(){
        System.out.println("-----");
        System.out.println("Current state value: " + state.getStateValue());
        System.out.println("-----");

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

    public void mathMenu(){
        char mathMenuPrompt = drawMathMenu();
        double currentStateValue = state.getStateValue();

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
            default:
                output("Invalid selection");
                mathMenu();
                break;
        }
        mainMenu();
    }

    public void stateValueMenu(){
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

    public void modeMenu(){
        char modeMenuPrompt = drawDisplayModeMenu();
    }

    public void manageMemoryMenu(){
        char manageMemoryPrompt = drawManageMemoryMenu();

    }

    public char drawMainMenu(){
        output("Main menu.");
        output("1. Do Math Stuff");
        output("2. State value options");
        output("3. Change State Mode");
        output("4. Manage Memory");
        output("5. Exit");
        return sc.next().toUpperCase().charAt(0);
    }

    public char drawMathMenu(){
        output("Math operators.");
        output("A = Addition");
        output("B = Subtraction");
        output("C = Multiplication");
        output("D = Division");
        return sc.next().toUpperCase().charAt(0);
    }

    public char drawStateValueMenu(){
        output("State Value menu.");
        output("1. Get state value");
        output("2. Change State value");
        output("3. Clear the state value");
        return sc.next().toUpperCase().charAt(0);
    }

    public char drawDisplayModeMenu(){
        output("Display Mode menu.");
        output("1. Binary");
        output("2. Octal");
        output("3. Decimal");
        output("4. Hexadecimal");
        return sc.next().toUpperCase().charAt(0);
    }

    public char drawManageMemoryMenu(){
        output("Manage Memory menu.");
        output("1. Add current state to memory");
        output("2. Reset memory");
        output("3. Recall memory");
        return sc.next().toUpperCase().charAt(0);
    }

    public char exit(){
        output("State value is " + state.getStateValue());
        return '0';
    }

    public double promptOperand(){
        output("Enter operand: ");
        return sc.nextDouble();
    }
}
