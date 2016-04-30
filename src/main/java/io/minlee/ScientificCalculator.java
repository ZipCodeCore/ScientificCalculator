package io.minlee;

import org.apache.commons.math3.special.Gamma;
/**
 * Created by minlee on 4/29/16.
 */
public class ScientificCalculator {

    public double calculateSum(double displayValue, double addValue){
        return displayValue + addValue;
    }
    public double calculateSubtraction(double displayValue, double subtractValue){
        return displayValue - subtractValue;
    }
    public double calculateMultiplication(double displayValue, double multiplyValue){
        return displayValue * multiplyValue;
    }
    public double calculateDivision(double displayValue, double divideValue){
        return displayValue / divideValue;
    }
    public double calculateSquare(double displayValue){
            return (displayValue * displayValue);
    }
    public double calculateSquareRoot(double displayValue){
        return Math.sqrt(displayValue);
    }
    public double calculateInverse(double displayValue){
        return (1 / displayValue);
    }
    public double calculateInvert(double displayValue){
        return (-1 * displayValue);
    }
    public double calculateLog(double displayValue){
        return Math.log10(displayValue);
    }
    public double calculateInverseLog(double displayValue){
        return Math.pow(10,displayValue);
    }
    public double calculateNaturalLog(double displayValue){
        return Math.log(displayValue);
    }
    public double calculateFactorial(double displayValue){
        return Gamma.gamma(displayValue+1);
    }
    //Calculate Sine in radians
    public double calculateSine(double displayValue){
        return Math.sin(displayValue);
    }
    //Calculate Cosine in radians
    public double calculateCosine(double displayValue){
        return Math.cos(displayValue);
    }
    //Calculate Tangent in radians
    public double calculateTangent(double displayValue){
        return Math.tan(displayValue);
    }
    //Calculate Inverse Sine in radians
    public double calculateInverseSine(double displayValue){
        return Math.asin(displayValue);
    }
    //Calculate Inverse Cosine in radians
    public double calculateInverseCosine(double displayValue){
        return Math.acos(displayValue);
    }
    //Calculate Inverse Tangent in radians
    public double calculateInverseTangent(double displayValue){
        return Math.atan(displayValue);
    }



}
