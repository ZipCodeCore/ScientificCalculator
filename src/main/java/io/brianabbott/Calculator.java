package io.brianabbott;
import java.io.IOException;
import java.lang.Math;



/**
 * Created by brianabbott on 4/29/16.
 */
public class Calculator {

    MathTerms unitsMode = MathTerms.RADIANS;
    public int test = 5;

    /**
     * Add two double values together
     */
    public double sum(double valueA, double valueB){
        return valueA + valueB;
    }

    /**
     * Subtract one double from another
     */
    public double subtract(double valueA, double valueB){
        return valueA - valueB;
    }


    public double multiply(double valueA, double valueB){
        return valueA * valueB;
    }

    public double divide(double valueA, double valueB){
        return valueA / valueB;
    }

    public double square(double value){
        return value * value;
    }

    public double squareRoot(double value){
        return Math.sqrt(value);
    }

    /**
     * A for loop to derive exponent values
     */
    public double exponent(double valueA, double expo){
        double total = 1;
        for(int x = 0;x < expo;x++){
            total = total * valueA;
        }
        return total;
    }

    public double inverse(double value){
        return 1/value;
    }

    public double invertSign(double value){
        return value * -1;
    }

    /**
     * Use Math class to call derive sign, but function takes radians so conversion is required.
     */
    public double sine(double value){
        if(unitsMode == MathTerms.DEGREES){
            return Math.sin(convertToRadians(value)); //Math.sin takes radians as an argument
        }
        return Math.sin(value);  //by default Math takes radians
    }

    /**
     * Use Math class to call derive cosine, but function takes radians so conversion is required.
     */
    public double cosine(double value){
        if(unitsMode == MathTerms.DEGREES){
            return Math.cos(convertToRadians(value)); //Math.sin takes radians as an argument
        }
        return Math.cos(value);  //by default Math takes radians
    }

    /**
     * Use Math class to call derive tangent, but function takes radians so conversion is required.
     */
    public double tangent(double value){
        if(unitsMode == MathTerms.DEGREES){
            return Math.tan(convertToRadians(value)); //Math.sin takes radians as an argument
        }
        return Math.tan(value);  //by default Math takes radians
    }

    /**
     * Use Math class to call derive inverse sine.
     */
    public double inverseSine(double value){
        if(unitsMode == MathTerms.DEGREES){
            return Math.toDegrees(Math.asin(value)); //Math.sin takes radians as an argument
        }
        return Math.asin(value);  //by default Math takes radians
    }

    /**
     * Use Math class to call derive inverse cosine.
     */
    public double inverseCosine(double value){
        if(unitsMode == MathTerms.DEGREES){
            return Math.toDegrees(Math.acos(value)); //Math.sin takes radians as an argument
        }
        return Math.acos(value);  //by default Math takes radians
    }
    /**
     * Use Math class to call derive inverse sine.
     */
    public double inverseTangent(double value){
        if(unitsMode == MathTerms.DEGREES){
            return Math.toDegrees(Math.atan(value)); //Math.sin takes radians as an argument
        }
        return Math.atan(value);  //by default Math takes radians
    }

    public double log(double value){
        return Math.log10(value);
    }

    public double inverseLog(double value){
        return exponent(10,value);
    }

    public double naturalLog(double value){
        return Math.log(value);
    }

    public double inverseNaturalLog(double value){
        return exponent(2.71828182846,value);
    }

    /**
     *
     * @return calls itself to derive factorial through recursion
     */
    public double factorial(double value){
        if(value == 1){
            return 1;
        }
        return value * factorial(value-1);
    }

    public double timesPi(double value){
        return Math.PI * value;
    }

    public void switchUnitsMode(){
        if(unitsMode == MathTerms.DEGREES){
            unitsMode = MathTerms.RADIANS;
        } else {
            unitsMode = MathTerms.DEGREES;
        }
    }

    public void switchUnitsMode(MathTerms mode){
        unitsMode = mode;
    }

    public double convertToRadians(double value){
        return (value / 180)*Math.PI;
    }

    public double convertToDegrees(double value){
        return (value / Math.PI)*180;
    }

    public void openUpgrade() {
        Runtime rt = Runtime.getRuntime();
        String url = "http://www.google.com/#q=calculator";
        String[] args = {"osascript", "-e", "open location \"" + url + "\""};
        try {
             rt.exec(args);
        } catch (IOException e) {

        }
    }
}


