package banuelos.aurora;


/**
 * Created by aurorabanuelos on 4/29/17.
 */


public class Calculator {


    UserInput input = new UserInput();
    MathEquations equation = new MathEquations();
    double result;

//    double firstOperand;
//    double secondOperand;
//    String opCode;
//
//    public void setFirstOperand (double firstOperand) {this.firstOperand = firstOperand}
//    public void setSecondOperand (double secondOperand) {this.secondOperand = secondOperand}
//    public void setFirstOperand (String opCode) {this.opCode = opCode}



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
