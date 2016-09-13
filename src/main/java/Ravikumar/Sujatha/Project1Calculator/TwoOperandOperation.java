package Ravikumar.Sujatha.Project1Calculator;

/**
 * Created by sujatharavikumar on 9/11/16.
 */
public class TwoOperandOperation {
    double result, number1;
    double operand1;


    Input input = new Input();
    Calculator calculator = new Calculator();

    public double performOperation(String operation){

        switch(operation){
            case "Sum":
                number1 = input.getDouble();
                result = calculator.sumOfNumbers(operand1, number1);
                break;
            case "Difference":
                number1 = input.getDouble();
                result = calculator.difference(operand1, number1);
                break;
            case "Product":
                number1 = input.getDouble();
                result = calculator.productOfNumbers(operand1,number1);
                break;
            case "Division":
                number1 = input.getDouble();
                result = calculator.divide(operand1, number1);
                break;
            case "Clear Display":
                operand1 = 0.0;
                result = operand1;
                break;
            case "Exponentiation":
                number1 = input.getDouble();
                result = Math.pow(operand1, number1);
                break;
            case "Square":
                result = operand1 * operand1;
                break;
            case "Sqrt":
                result = Math.sqrt(operand1);
                break;
            case "Inverse":
                result = calculator.divide(1,operand1);
                break;
            case "Negate":
                result = - operand1;
                break;
            case "Sine In Radians":
                result = Math.sin(operand1);
                break;
            case "Sine In Degrees":
                result = Math.sin(Math.toRadians(operand1));
                break;
            case "Cosine In Radians":
                result = Math.cos(operand1);
                break;
            case "Cosine In Degrees":
                result = Math.cos(Math.toRadians(operand1));
                break;
            case "Tangent In Radians":
                result = Math.tan(operand1);
                break;
            case "Tangent In Degrees":
                result = Math.tan(Math.toRadians(operand1));
                break;
            case "Log":
                result = Math.log(operand1);
                break;
            case "Factorial":
                result = calculator.factorial(operand1);
                break;

        }

        return result;
    }





}
