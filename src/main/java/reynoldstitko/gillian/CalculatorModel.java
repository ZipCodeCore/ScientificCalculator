package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/14/17.
 */

public class CalculatorModel {

    private Double result;
    public Controller controller = new Controller();

    //public enum Operations { +, -, *, /, "sqrt", ^}

    public void performBinaryOperation(Double firstInputValue, char operandType, Double secondInputValue){
        //perform +, /, *, - x^x (input 1 + 1, 2-1, 1/x, x ^ x, x ^ y)
        switch (operandType) {
            case '+':
                result = firstInputValue + secondInputValue;
                break;
            case '-':
                result = firstInputValue - secondInputValue;
                break;
            case '/':
                if(secondInputValue == 0)
                    //set display to ERR
                    controller.captureErrorMessage();
                else {
                    result = firstInputValue / secondInputValue;
                }
                break;
            case '*':
                result = firstInputValue * secondInputValue;
                break;
            case '^':

        }

    }

    public void performUnaryOperation(Double inputValue, char operandType){
        //perform x^2, sqrt, +/- (input 3^3; 2 sqrt)
        switch (operandType){
            case '^':
                result = inputValue * inputValue;
                break;
            case 's':
                result = Math.sqrt(inputValue);
        }
    }

    public void performTrigFunctions(Double inputValue, String operandType){
        //Cos, Sin (input 4 cos; 2 sin)
    }

    public void performOtherFunctions(Double firstInputValue, Double secondInputValue){
        //x^y
    }
}
