package io.minlee;

import org.apache.commons.math3.special.Gamma;
/**
 * Created by minlee on 4/29/16.
 */
public class ScientificCalculator {

    public boolean isInRadians = true;

    public void setIsInRadians(boolean isInRadians) {
        this.isInRadians = isInRadians;
    }
    public boolean getIsInRadians(){
        return isInRadians;
    }

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
    public double calculateVariaableExponentiation(double displayValue, double expValue){
        return Math.pow(displayValue,expValue);
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
    public double calculateInverseNaturalLog(double displayValue){
        return Math.pow(Math.E,displayValue);
    }
    public double calculateFactorial(double displayValue){
        return Gamma.gamma(displayValue+1);
    }
    //Calculate Sine in radians
    public double calculateSine(double displayValue){
        if(isInRadians){
            return Math.sin(displayValue);
        }
        else{
            double displayValueInRadians = this.convertDegreesToRadians(displayValue);
            return Math.sin(displayValueInRadians);
        }
    }
    //Calculate Cosine in radians
    public double calculateCosine(double displayValue){
        if(isInRadians){
            return Math.cos(displayValue);
        }
        else{
            double displayValueInRadians = this.convertDegreesToRadians(displayValue);
            return Math.cos(displayValueInRadians);
        }
    }
    //Calculate Tangent in radians
    public double calculateTangent(double displayValue){
        if(isInRadians){
            return Math.tan(displayValue);
        }
        else{
            double displayValueInRadians = this.convertDegreesToRadians(displayValue);
            return Math.tan(displayValueInRadians);
        }    }
    //Calculate Inverse Sine in radians
    public double calculateInverseSine(double displayValue){
        if(isInRadians){
            return Math.asin(displayValue);
        }
        else{
            double displayValueInRadians = this.convertDegreesToRadians(displayValue);
            return Math.asin(displayValueInRadians);
        }    }
    //Calculate Inverse Cosine in radians
    public double calculateInverseCosine(double displayValue){
        if(isInRadians){
            return Math.acos(displayValue);
        }
        else{
            double displayValueInRadians = this.convertDegreesToRadians(displayValue);
            return Math.acos(displayValueInRadians);
        }    }
    //Calculate Inverse Tangent in radians
    public double calculateInverseTangent(double displayValue){
        if(isInRadians){
            return Math.atan(displayValue);
        }
        else{
            double displayValueInRadians = this.convertDegreesToRadians(displayValue);
            return Math.atan(displayValueInRadians);
        }    }

    public int calculateRoundToNearestInteger(double displayValue){
        int nearestInt;
        if(displayValue < 0){
            nearestInt = (int)Math.round(calculateInvert(displayValue));
        }
        else{
            nearestInt = (int)Math.round(displayValue);
        }
        return nearestInt;
    }

    public double convertDegreesToRadians(double displayValue){
        return Math.toRadians(displayValue);
    }
    public double convertRadiansToDegrees(double displayValue){
        return Math.toDegrees(displayValue);
    }

    public double calculateCompoundInterest(double displayValue, int interestRate, int numOfYears){

        double total = displayValue * Math.pow(1.0 + (interestRate/100), numOfYears);
        return total;
    }

}
