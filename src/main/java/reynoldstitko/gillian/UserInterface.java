package reynoldstitko.gillian;

import java.util.Scanner;

/**
 * Created by gillianreynolds-titko on 1/14/17.
 */
public class UserInterface {

    private Double userInputValue;
    private String operandValue;
    private Scanner scanner = new Scanner(System.in);


    public Double captureUserInputValue(Double inputValue) {
        System.out.print("Input your first value: ");
        return inputValue = scanner.nextDouble();
    }

    public Double setUserInputValue(){

        return userInputValue = scanner.nextDouble();
    }

    public String setUserOperandValue(){
        return operandValue = scanner.next();
    }

    public String captureOperandValue(String operandValue) {
        System.out.print("Input your operand (^, +, -, *, /, s (for sqrt))");
        return operandValue = scanner.next();
    }

}
