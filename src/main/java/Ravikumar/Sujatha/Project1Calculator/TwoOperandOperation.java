package Ravikumar.Sujatha.Project1Calculator;

/**
 * Created by sujatharavikumar on 9/11/16.
 */
public class TwoOperandOperation {
    double result, number1;
    String hex_result;
    double operand1;


    Input input = new Input();
    Calculator calculator = new Calculator();

    public double performOperation(String operation){

        if (operation.equals("Sum") || (operation.equals("sum"))){
            number1 = input.getDouble();
            //number2 = input.getDouble();
            result = calculator.sumOfNumbers(operand1, number1);
        }
        else if (operation.equals("Difference") || (operation.equals("difference"))){
            number1 = input.getDouble();
            //number2 = input.getDouble();
            //result = calculator.difference(number1,number2);
            result = calculator.difference(operand1,number1);

        }
        else if (operation.equals("Product") || (operation.equals("product"))){
            number1 = input.getDouble();
            //number2 = input.getDouble();
            result = calculator.productOfNumbers(operand1,number1);
        }
        else if (operation.equals("Division") || (operation.equals("division"))){
            number1 = input.getDouble();
            //number2 = input.getDouble();
            //result = calculator.divide(number1,number2);
            result = calculator.divide(operand1, number1);
        }
        else if (operation.equals("Clear Display") || (operation.equals("clear display"))){
            operand1 = 0.0;
            result = operand1;

        }
        else if (operation.equals("Exponentiation") || (operation.equals("exponentiation"))){
            number1 = input.getDouble();
            //number2 = input.getDouble();
            result = Math.pow(operand1, number1);
        }
        else if (operation.equals("Square") || (operation.equals("square"))){
            //number1 = input.getDouble();
            //result = number1 * number1;
            result = operand1 * operand1;
        }
        else if (operation.equals("Sqrt") || (operation.equals("sqrt"))){
            //number1 = input.getDouble();
            //result = Math.sqrt(number1);
            result = Math.sqrt(operand1);
        }
        else if (operation.equals("Inverse") || (operation.equals("inverse"))){
            result = calculator.divide(1,operand1);
        }
        else if (operation.equals("Negate") || (operation.equals("negate"))){
            //number1 = input.getDouble();
            result = - operand1;
        }
        else if (operation.equals("Sine In Radians") || (operation.equals("sin in radians"))){
            //number1 = input.getDouble();
            result = Math.sin(operand1);
        }
        else if (operation.equals("Sine In Degrees") || (operation.equals("sin in degrees"))){
            //number1 = input.getDouble();
            result = Math.sin(Math.toRadians(operand1));
        }
        else if (operation.equals("Cosine In Radians") || (operation.equals("cos in radians"))){
            //number1 = input.getDouble();
            result = Math.cos(operand1);
        }
        else if (operation.equals("Cosine In Degrees") || (operation.equals("cos in degrees"))){
            result = Math.cos(Math.toRadians(operand1));
        }
        else if (operation.equals("Tangent In Radians") || (operation.equals("tan in radians"))){
            //number1 = input.getDouble();
            result = Math.tan(operand1);
        }
        else if (operation.equals("Tangent In Degrees") || (operation.equals("tan in degrees"))){
            //number1 = input.getDouble();
            result = Math.tan(Math.toRadians(operand1));
        }
        else if (operation.equals("Log") || (operation.equals("log"))){
            //number1 = input.getDouble();
            result = Math.log(operand1);
        }
        else if (operation.equals("Factorial") || (operation.equals("factorial"))){
            //number1 = input.getDouble();
            result = calculator.factorial(operand1);
        }
        /*else if (operation.equals("Switch Display mode") || operation.equals("switch display mode")){
            display.displayExpression(calculator.switchDisplayMode(operand1));
            //display.displayExpression(hex_result);
        }*/
        return result;
    }





}
