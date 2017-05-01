/*
 * Created by brianmullin on 4/28/17.
 */

import java.lang.Math;


public class CalcEngine {



    public double add(double firstNumber, double secondNumber) {

        return (firstNumber + secondNumber);
    }

    public double subtract(double firstNumber, double secondNumber) {

        return (firstNumber - secondNumber);

    }

    public double multiply(double firstNumber, double secondNumber) {

        return (firstNumber * secondNumber);
    }

    public double divide(double firstNumber, double secondNumber) {

        return (firstNumber / secondNumber);
    }

    public double square(double firstNumber) {

        return (firstNumber * firstNumber);
    }

    public double squareRoot(double firstNumber) {

        return (Math.sqrt(firstNumber));
    }



}
