package kamsheh.adam.project1calculator;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by adam on 9/11/16.
 */
public class Calculator {

    //Declare instance variables //////////
    private double state;
    private Scanner scanner = new Scanner(System.in);
    private boolean bool = true;
    private String trigMode = "degree"; // <-- use this to switch between radians or degrees
    private double memory = 0;
    //////////////////////////////////////

    //Constructor ///////////////////////
    public Calculator() {
        this.state = 0.0;
    }
    //Constructor
    public Calculator(double state) {
        this.state = state;
    }
    ////////////////////////////////////

    //This method controls the flow of execution for the calculator
    public void runCalculator() {
        this.prompt();
        while(bool) {
            System.out.println("--------------------");
            System.out.println("State:\t" + this.state);
            System.out.println("--------------------");
            System.out.println("\n");
            this.mainMenu();
        }
    }

    //Prompt
    public void prompt() {
        System.out.println("###################################");
        System.out.print("# You have entered The Calculator #\n");
        System.out.println("###################################");
    }

    // Main Menu //////////////////////////
    public void printMenuOptions() {
        System.out.println("Please type an the number corresponding to the option below:");
        System.out.println("-----------------");
        System.out.println("1: Operations");
        System.out.println("2: Clear Display");
        System.out.println("3: Change State");
        System.out.println("4: Change mode (no functionality yet)");
        System.out.println("0: Exit Calculator\n");
        System.out.print("Enter number: ");
    }

    //Main menu with options for what calculation you want performed
    public void mainMenu() {
        this.printMenuOptions();
        int input = scanner.nextInt();
        System.out.println("\n--------------\n");
        switch (input) {
            case 1:
                this.operationsMenu();
                break;
            case 2:
                this.clearDisplay();
                break;
            case 3:
                System.out.print("Select new value: ");
                double newState = scanner.nextInt();
                this.changeState(newState);
                break;
            case 4:
                //this.changeMode(); <-- Doesn't exist yet
                System.out.println("Change mode function not created yet");
                break;
            case 0:
                bool = false;
                break;
            default:
                System.out.println("Error, you did not enter an option from the list.");
        }
    }
    //////////////////////////////////

    // Memory Functions /////////////
    public void addToMemory() {
        this.memory = this.state;
    }

    public void clearMemory() {
        this.memory = 0.0;
    }

    public double getMemory() {
        return this.memory;
    }
    ////////////////////////////////

    // Operations menu ///////////////////
    public void printOperationsMenu() {
        System.out.println("Please type a number corresponding to the option below:");
        System.out.println("1: Basic operations");
        System.out.println("2: Trigonometric functions");
        System.out.println("3: Logarithmic functions");
        System.out.println("0: Exit Calculator");
    }

    public void operationsMenu() {
        this.printOperationsMenu();
        System.out.print("Enter number corresponding to option: ");
        int input = scanner.nextInt();
        System.out.println("\n--------------\n");
        switch (input) {
            case 1:
                this.basicOperations();
                break;
            case 2:
                this.trigMenu();
                break;
            case 3:
                this.trigMenu();
                break;
            case 0:
                this.logMenu();
                break;
            default:
                System.out.println("You broke something...");
        }
    }
    ////////////////////////////////////

    public double getState() {
        return this.state;
    }

    //Set state to 0.0
    public void clearDisplay() {
        System.out.println("Display has been cleared.");
        this.state = 0;
    }

    public void changeState(double newState) {
        this.state = newState;
    }

    public String displayError() {
        return "Err";
    }

    public void printBasicOperations() {
        System.out.println("Please choose a basic operation: ");
        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        System.out.println("5: Square");
        System.out.println("6: Square Root");
        System.out.println("7: Exponentiation");
        System.out.println("8: Inverse");
        System.out.println("9: Change sign");
        System.out.println("10: Factorial");
        System.out.println("0: Back to main menu");
    }

    public void basicOperations() {
        this.printBasicOperations();
        System.out.print("\nChoose basic operation: ");
        int input = scanner.nextInt();
        System.out.print("Choose value: ");
        double value = scanner.nextDouble();
        System.out.println();
        switch (input) {
            case 1:
                System.out.println(this.state + " + " + value + " = " + this.add(value));
                break;
            case 2:
                System.out.println(this.state + " - " + value + " = " + this.subtract(value));
                break;
            case 3:
                System.out.println(this.state + " * " + value + " = " + this.multiply(value));
                break;
            case 4:
                System.out.println(this.state + " / " + value + " = " + this.divide(value));
                break;
            case 5:
                System.out.println(this.state + "square(" + this.state + ") = " + this.square());
                break;
            case 6:
                System.out.println(this.state + "sqrt(" + this.state + ") = " + this.squareRoot());
                break;
            case 7:
                System.out.println(this.state + "(" + this.state + ")^" + value + " = " + this.toThePower(value));
                break;
            case 8:
                System.out.println(this.state + "inverse(" + this.state + ") = " + this.inverse());
                break;
            case 9:
                System.out.println(this.changeSign());
                break;
            case 10:
                System.out.println(this.state + "! = " + this.factorial());
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("You broke something. Enter a proper value.");
        }
    }

    // Basic Operations ///////////////////////////
    public double add(double value) {
        this.state += value;
        return this.state;
    }

    public double subtract(double value) {
        this.state -= value;
        return this.state;
    }

    public double multiply(double value) {
        this.state *= value;
        return this.state;
    }

    public double divide(double value) {
        if(value == 0.0) {
            System.out.println("Cannot divide by 0.");
            return -99;
        }
        this.state /= value;
        return this.state;
    }

    public double square() {
        this.state = Math.pow(this.state, 2.0);
        return this.state;
    }

    public double squareRoot() {
        this.state = Math.sqrt(this.state);
        return this.state;
    }

    public double toThePower(double value) {
        this.state = Math.pow(this.state, value);
        return this.state;
    }

    public double inverse() {
        this.state = 1 / this.state;
        return this.state;
    }

    public double changeSign() {
        this.state *= -1;
        return this.state;
    }
    //////////////////////////////////////////

    public void printTrigFunctions() {
        System.out.println("Please choose a basic operation: ");
        System.out.println("1: Sine");
        System.out.println("2: Cosine");
        System.out.println("3: Tangent");
        System.out.println("4: Inverse Sine");
        System.out.println("5: Inverse Cosine");
        System.out.println("6: Inverse Tangent");
    }

    public void trigMenu() {
        this.printTrigFunctions();
        System.out.print("\nChoose Trig function: ");
        int input = scanner.nextInt();
        System.out.println();
        switch (input) {
            case 1:
                System.out.println("sine(" + this.state + ") = " + this.sine());
                break;
            case 2:
                System.out.println("cosine(" + this.state + ") = " + this.cosine());
                break;
            case 3:
                System.out.println("tangent(" + this.state + ") = " + this.tangent());
                break;
            case 4:
                System.out.println("InverseSine(" + this.state + ") = " + this.inverseSine());
                break;
            case 5:
                System.out.println("InverseCosine(" + this.state + ") = " + this.inverseCosine());
                break;
            case 6:
                System.out.println("InverseTangent(" + this.state + ") = " + this.inverseTangent());
                break;
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("You broke something. Enter a proper value.");
        }
    }

    // Trig Functions ///////////////////////
    public double sine() {
        this.state = Math.sin(this.state);
        return this.state;
    }

    public double cosine() {
        this.state = Math.cos(this.state);
        return this.state;
    }

    public double tangent() {
        this.state = Math.tan(this.state);
        return this.state;
    }

    public double inverseSine() {
        this.state = Math.asin(this.state);
        return this.state;
    }

    public double inverseCosine() {
        this.state = Math.acos(this.state);
        return this.state;
    }

    public double inverseTangent() {
        this.state = Math.atan(this.state);
        return this.state;
    }
    /////////////////////////////////////////

    public void printLogFunctions() {
        System.out.println("Please choose a basic operation: ");
        System.out.println("1: Logarithm");
        System.out.println("2: Inverse Logarithm");
        System.out.println("3: Natural Log");
        System.out.println("4: Inverse Natural Log");
    }

    public void logMenu() {
        this.printLogFunctions();
        System.out.print("\nChoose Trig function: ");
        int input = scanner.nextInt();
        System.out.println();
        switch (input) {
            case 1:
                System.out.println("log(" + this.state + ") = " + this.log());
                break;
            case 2:
                System.out.println("InvLog(" + this.state + ") = " + this.inverseLog());
                break;
            case 3:
                System.out.println("ln(" + this.state + ") = " + this.naturalLog());
                break;
            case 4:
                System.out.println("Invln(" + this.state + ") = " + this.inverseNaturalLog());
                break;
            default:
                System.out.println("You broke something. Enter a proper value.");
        }
    }

    // Logarithmic Functions ///////////////
    public double log() {
        this.state = Math.log(this.state);
        return this.state;
    }

    public double inverseLog() {
        this.state = Math.pow(10, this.state);
        return this.state;
    }

    public double naturalLog() {
        this.state = Math.log1p(this.state);
        return this.state;
    }

    public double inverseNaturalLog() {
        return this.state;
    }
    ////////////////////////////////////////

    public double factorial() {
        double factorial = 1;
        for(int i=1; i<=this.state; i++) {
            factorial *= i;
        }
        this.state = factorial;
        return this.state;
    }
}

