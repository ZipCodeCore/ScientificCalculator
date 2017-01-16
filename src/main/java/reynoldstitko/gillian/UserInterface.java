package reynoldstitko.gillian;

import java.util.Scanner;

/**
 * Created by gillianreynolds-titko on 1/16/17.
 */
public class UserInterface {
    private Double userInputValue;
    private String operandValue;
    private Scanner scanner = new Scanner(System.in);


    //public Double captureUserInputValue(Double inputValue)
    public Double captureUserInputValue() {
        //System.out.print("Input your number: ");
        return userInputValue = scanner.nextDouble();
    }

    public Double setUserInputValue(){

        return userInputValue = scanner.nextDouble();
    }

    public String setUserOperandValue(){

        return operandValue = scanner.next();
    }

    //public String captureOperandValue(String operandValue)
    public String captureOperandValue() {
        //System.out.print("Input your operand (^, +, -, *, /, s (for sqrt)): ");
        return operandValue = scanner.next();
    }
}
