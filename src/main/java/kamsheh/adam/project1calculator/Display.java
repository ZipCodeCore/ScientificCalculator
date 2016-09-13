package kamsheh.adam.project1calculator;
import com.sun.corba.se.impl.io.TypeMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by adam on 9/11/16.
 */
public class Display {

    public enum DisplayMode {
        BINARY, OCTAL, DECIMAL, HEXADECIMAL;
    }

    private Scanner scanner = new Scanner(System.in);
    private DisplayMode displayMode = DisplayMode.DECIMAL;

    public DisplayMode getDisplayMode() {
        return this.displayMode;
    }

    public void switchDisplayMode() {
        DisplayMode current = this.displayMode;
        switch (current) {
            case BINARY:
                this.displayMode = DisplayMode.OCTAL;
                break;
            case OCTAL:
                this.displayMode = DisplayMode.DECIMAL;
                break;
            case DECIMAL:
                this.displayMode = DisplayMode.HEXADECIMAL;
                break;
            case HEXADECIMAL:
                this.displayMode = DisplayMode.BINARY;
                break;
            default:
        }
    }

    public void switchDisplayMode(String mode) {
        DisplayMode nMode = DisplayMode.valueOf(mode.toUpperCase());
        switch (nMode) {
            case BINARY:
                this.displayMode = DisplayMode.BINARY;
                break;
            case OCTAL:
                this.displayMode = DisplayMode.OCTAL;
                break;
            case DECIMAL:
                this.displayMode = DisplayMode.DECIMAL;
                break;
            case HEXADECIMAL:
                this.displayMode = DisplayMode.HEXADECIMAL;
                break;
            default:
        }
    }

    public String displayNumeric(double value) {
        switch (this.displayMode) {
            case BINARY:
                return this.toBinary(value);
            case OCTAL:
                return this.toOctal(value);
            case DECIMAL:
                return "" + value;
            case HEXADECIMAL:
                return this.toHexadecimal(value);
            default:
        }
        return "Error occurred converting number.";
    }

    // Numerical conversions ////////////////////
    public String toBinary(double value) {
        int intValue = (int) value;
        return Integer.toBinaryString(intValue);
    }

    public String toOctal(double value) {
        int intValue = (int) value;
        return Integer.toOctalString(intValue);
    }

    public String toHexadecimal(double value) {
        int intValue = (int) value;
        return Integer.toHexString(intValue);
    }
    /////////////////////////////////////////////

    public void prompt() {
        System.out.println("###################################");
        System.out.print("# You have entered The Calculator #\n");
        System.out.println("###################################");
    }

    public double getUserValue() {
        double input = 0;
        while(true) {
            try {
                input = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.print("Please enter numeric: ");
                continue;
            }
        }
        return input;
    }

    public int getUserOption() {
        int input = 0;
        while(true) {
            try {
                input = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.print("Please enter numeric: ");
                continue;
            }
        }
        return input;
    }

    public void printBasicOperation(double state, double value, char c, double method) {
        System.out.printf("%.2f %c %.2f = %.2f\n", state, c, value, method);;
    }

    public void printMainMenuOptions() {
        System.out.println("Please type an the number corresponding to the option below:");
        System.out.println("-----------------");
        System.out.println("1: Operations");
        System.out.println("2: Clear Display");
        System.out.println("3: Change State");
        System.out.println("4: Change mode");
        System.out.println("0: Exit Calculator\n");
        System.out.print("Enter option: ");
    }

    public void printOperationsMenu() {
        System.out.println("Please type a number corresponding to the option below:");
        System.out.println("1: Basic operations");
        System.out.println("2: Trigonometric functions");
        System.out.println("3: Logarithmic functions");
        System.out.println("0: Exit Calculator\n");
        System.out.print("Enter option: ");
    }

    public void printBasicOperationsMenu() {
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
        System.out.println("11: Cubed Root");
        System.out.println("0: Exit Calculator\n");
        System.out.print("Enter option: ");
    }

    public void printTrigFunctionsMenu() {
        System.out.println("Please choose a basic operation: ");
        System.out.println("1: Sine");
        System.out.println("2: Cosine");
        System.out.println("3: Tangent");
        System.out.println("4: Inverse Sine");
        System.out.println("5: Inverse Cosine");
        System.out.println("6: Inverse Tangent");
        System.out.println("7: Switch units [degree or radian]");
        System.out.println("0: Exit Calculator\n");
        System.out.print("Enter option: ");
    }

    public void printLogFunctionsMenu() {
        System.out.println("Please choose a basic operation: ");
        System.out.println("1: Logarithm");
        System.out.println("2: Inverse Logarithm");
        System.out.println("3: Natural Log");
        System.out.println("4: Inverse Natural Log");
        System.out.println("0: Exit Calculator\n");
        System.out.print("Enter option: ");
    }
}
