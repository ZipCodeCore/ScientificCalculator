package Ravikumar.Sujatha.Project1Calculator;

/**
 * Created by sujatharavikumar on 9/11/16.
 */
public class ProjectCalculator {

    public static void main(String args[]){
        double result = 0;
        double operand1 = 0;
        boolean flag = true;
        double mem = 0;
        String hex_result = "";
        String binary_result = "";
        String octal_result = "";

        Display display = new Display();
        Input input = new Input();
        Calculator calculator = new Calculator();
        TwoOperandOperation op = new TwoOperandOperation();

        display.defaultDisplay();


        while(flag){
            op.operand1 = operand1;
            display.displayOperation2();
            System.out.println("Which operation do you want to perform?");
            String operation = input.getStringInput();

            switch(operation){
                case "M":
                    mem = result;
                    display.displayNumber(result);
                    break;
                case "MRC":
                    display.displayNumber(mem);
                    break;
                case "MC":
                    mem = 0;
                    display.displayNumber(mem);
                    break;
                case "Exit":
                    flag = false;
                    break;
                case "Switch To Hex":
                    hex_result = calculator.switchToHex(operand1);
                    display.displayExpression(hex_result);
                    break;
                case "Switch To Binary":
                    binary_result = calculator.switchToBinary(operand1);
                    display.displayExpression(binary_result);
                    break;
                case "Switch To Octal":
                    octal_result = calculator.switchToOctal(operand1);
                    display.displayExpression(octal_result);
                    break;
                default:
                    result = op.performOperation(operation);
                    operand1 = result;
                    display.displayNumber(result);
            }

        }

    }
}


