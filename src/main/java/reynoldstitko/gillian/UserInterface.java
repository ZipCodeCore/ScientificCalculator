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
        System.out.print("Input your first operand: ");
        return inputValue;
    }

    public String getOperandValue(String operandValue) {
        return operandValue;
    }

}
