package lindsay.devon.Calculator;
import java.lang.Math;
/**
 * Created by devonlindsay on 9/12/16.
 */
public class BasicCalculations {

  // double currentValue = 0;




    public double add(double currentValue, double newValue) {
        double result =  currentValue + newValue;
        System.out.println(currentValue + " + " + newValue + " = " + result);
        return  result;

    }

    public double subtract(double currentValue, double newValue) {
        double result =  currentValue - newValue;
        System.out.println(currentValue + " - " + newValue + " = " + result);
        return  result;

    }

    public double multiply(double currentValue, double newValue) {
        double result =  currentValue * newValue;
        System.out.println(currentValue + " * " + newValue + " = " + result);
        return  result;

    }

    public double divide(double currentValue, double newValue) {
        double result =  currentValue / newValue;
        System.out.println(currentValue + " / " + newValue + " = " + result);
        return  result;

    }

    public double square(double newValue) {
        double result =  newValue * newValue;
        System.out.println("The square of " + newValue + " is: " + result);
        return  result;

    }

    public double squareRoot(double newValue) {
        double result = Math.sqrt(newValue);
        System.out.println("The square root of " + newValue + " is: " + result);
        return  result;

    }

    public double exponent(double currentValue, double newValue) {
        double result =  Math.pow(0,newValue);
        System.out.println(currentValue + " to the power of " + newValue + " = " + result);
        return  result;

    }

    public double inverse(double newValue) {
        double result = 1/newValue;
        System.out.println(result);
        return  result;

    }

    public double switchSign(double newValue) {
        double result =  -newValue;
        System.out.println(result);
        return  result;

    }




}
