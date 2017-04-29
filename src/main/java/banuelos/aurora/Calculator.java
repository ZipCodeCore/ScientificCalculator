package banuelos.aurora;


/**
 * Created by aurorabanuelos on 4/29/17.
 */


public class Calculator {


    UserInput input = new UserInput();
    MathEquations equation = new MathEquations();
    double result;



public void calculate(){

    String opCode = input.in.next();

    switch (opCode.toLowerCase()){
        case "add":
            result = equation.add(input.in.nextDouble(),input.in.nextDouble());
            break;

        case "subtract":
            result = equation.subtract(input.in.nextDouble(),input.in.nextDouble());
            break;

        case "multiply":
            result = equation.multiply(input.in.nextDouble(),input.in.nextDouble());
            break;

        case "divide":
            result = equation.divide(input.in.nextDouble(),input.in.nextDouble());
            break;

        default:
    }
}


    public double getResult(){
            return result;
    }


}
