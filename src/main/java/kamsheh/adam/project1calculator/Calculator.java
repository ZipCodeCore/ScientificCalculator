package kamsheh.adam.project1calculator;
import java.util.Scanner;

/**
 * Created by adam on 9/11/16.
 */
public class Calculator {

    //Declare instance variables //////////
    private double state;
    private Scanner scanner = new Scanner(System.in);
    private boolean bool = true;
    private String trigUnits = "degree"; // <-- use this to switch between radians or degrees
    private double memory = 0;
    private Display display = new Display();
    private TrigOperations trig = new TrigOperations();
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
        this.display.prompt();
        while(bool) {
            System.out.println("\nNumeric Display: " + this.display.getDisplayMode());
            System.out.println("#######################");
            System.out.println("Display: " + this.display.displayNumeric(this.state));
            System.out.println("#######################\n");
            this.mainMenu();
        }
    }

    //Main menu with options for what calculation you want performed
    public void mainMenu() {
        this.display.printMainMenuOptions();
        //int input = scanner.nextInt();
        int input = this.display.getUserOption();
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
                System.out.println("Enter the following or hit return to toggle display mode:");
                System.out.println("binary");
                System.out.println("octal");
                System.out.println("decimal");
                System.out.println("hexadecimal");
                System.out.print("> ");
                String input2 = scanner.nextLine();
                if(input2.equals("")) {
                    this.display.switchDisplayMode();
                } else {
                    this.display.switchDisplayMode(input2);
                }

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

    public void setStateToMemory() {
        this.state = this.getMemory();
    }
    ////////////////////////////////

    // Operations menu ///////////////////
    public void operationsMenu() {
        this.display.printOperationsMenu();
        int input = this.display.getUserOption();
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
                bool = false;
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

    public void basicOperations() {
        this.display.printBasicOperationsMenu();
        int input = this.display.getUserOption();
        double value = 0;
        if(input > 4) {

        } else {
            System.out.print("Choose value: ");
            value = this.display.getUserValue();
        }
        System.out.println();
        switch (input) {
            case 1:
                this.display.printBasicOperation(this.state, value, '+', BasicOperations.add(this.state, value));
                this.changeState(BasicOperations.add(this.state, value));
                break;
            case 2:
                this.display.printBasicOperation(this.state, value, '-', BasicOperations.subtract(this.state, value));
                this.changeState(BasicOperations.subtract(this.state, value));
                break;
            case 3:
                this.display.printBasicOperation(this.state, value, '*', BasicOperations.multiply(this.state, value));
                this.changeState(BasicOperations.multiply(this.state, value));
                break;
            case 4:
                if(value==0) {
                    System.out.println("Error. Cannot divide by 0.");
                } else {
                    this.display.printBasicOperation(this.state, value, '/', BasicOperations.divide(this.state, value));
                    this.changeState(BasicOperations.divide(this.state, value));                }
                break;
            case 5:
                System.out.printf("square(%.2f) = %.2f", this.state, BasicOperations.square(this.state));
                this.changeState(BasicOperations.square(this.state));
                break;
            case 6:
                System.out.printf("sqrt(%.2f) = %.2f", this.state, BasicOperations.squareRoot(this.state));
                this.changeState(BasicOperations.squareRoot(this.state));
                break;
            case 7:
                System.out.printf("(%.2f)^%.2f = %.2f", this.state, value, BasicOperations.toThePower(this.state, value));
                this.changeState(BasicOperations.toThePower(this.state, value));
                break;
            case 8:
                System.out.printf("inverse(%.2f) = %.2f", this.state, BasicOperations.inverse(this.state));
                this.changeState(BasicOperations.inverse(this.state));
                break;
            case 9:
                System.out.println(BasicOperations.changeSign(this.state));
                this.changeState(BasicOperations.changeSign(this.state));
                break;
            case 10:
                System.out.printf("%.2f! = %.2f", this.state, this.factorial());
                break;
            case 11:
                System.out.printf("cbrt(%.2f) = %.2f", this.state, BasicOperations.cubedRoot(this.state));
                this.changeState(BasicOperations.cubedRoot(this.state));
                break;
            case 12:
                System.out.printf("cubed(%.2f) = %.2f", this.state, BasicOperations.cubed(this.state));
                this.changeState(BasicOperations.cubed(this.state));
            case 0:
                System.out.println("Exiting...");
                bool = false;
                break;
            default:
                System.out.println("You broke something. Enter a proper value.");
        }
    }

    public void trigMenu() {
        this.display.printTrigFunctionsMenu();
        int input = this.display.getUserOption();
        System.out.println();
        switch (input) {
            case 1:
                System.out.printf("sine(%.2f) = %.2f", this.state, trig.sine(this.state));
                this.changeState(trig.sine(this.state));
                break;
            case 2:
                System.out.printf("cosine(%.2f) = %.2f", this.state, trig.cosine(this.state));
                this.changeState(trig.cosine(this.state));
                break;
            case 3:
                System.out.printf("tangent(%.2f) = %.2f", this.state, trig.tangent(this.state));
                this.changeState(trig.tangent(this.state));
                break;
            case 4:
                System.out.printf("inv_sine(%.2f) = %.2f", this.state, trig.inverseSine(this.state));
                this.changeState(trig.inverseSine(this.state));
                break;
            case 5:
                System.out.printf("inv_cosine(%.2f) = %.2f", this.state, trig.inverseCosine(this.state));
                this.changeState(trig.inverseCosine(this.state));
                break;
            case 6:
                System.out.printf("inv_tangent(%.2f) = %.2f", this.state, trig.inverseTangent(this.state));
                this.changeState(trig.inverseTangent(this.state));
                break;
            case 7:
                trig.switchUnits();
                break;
            case 0:
                System.out.println("Exiting...");
                bool = false;
                break;
            default:
                System.out.println("You broke something. Enter a proper value.");
        }
    }

    public void logMenu() {
        this.display.printLogFunctionsMenu();
        int input = this.display.getUserOption();
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
            case 0:
                System.out.println("Exiting...");
                bool = false;
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
        this.state = Math.pow(Math.E, this.state);
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