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

            if (operation.equals("M") || (operation.equals("m"))){
                mem = result;
                display.displayNumber(result);
            }
            else if (operation.equals("MRC")|| (operation.equals("mrc"))){
                display.displayNumber(mem);
            }
            else if (operation.equals("MC") || (operation.equals("mc"))){
                mem = 0;
                display.displayNumber(mem);
            }
            else if(operation.equals("exit") || (operation.equals("Exit"))){
                flag = false;
            }
            else if (operation.equals("Switch To Hex") || operation.equals("switch to hex")){
                hex_result = calculator.switchToHex(operand1);
                display.displayExpression(hex_result);
            }
            else if (operation.equals("Switch To Binary") || operation.equals("switch to binary")){
                binary_result = calculator.switchToBinary(operand1);
                display.displayExpression(binary_result);
            }
            else if (operation.equals("Switch To Octal") || operation.equals("switch to octal")){
                octal_result = calculator.switchToBinary(operand1);
                display.displayExpression(octal_result);
            }
            else{
                result = op.performOperation(operation);
                operand1 = result;
                display.displayNumber(result);

            }

        }

    }
}


