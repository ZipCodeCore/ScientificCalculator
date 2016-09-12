package lindsay.devon.Calculator;

/**
 * Created by devonlindsay on 9/12/16.
 */
public class TrigCalculations {

    double currentValue = 0
            ;

    public double sine(double newValue) {
        double result =  Math.sin(newValue);
        System.out.println("The sine of " + newValue + " is: " + result);
        return  result;

    }

    public double cosine(double newValue) {
        double result =  Math.cos(newValue);
        System.out.println("The cosine of " + newValue + " is: " + result);
        return  result;

    }
    public double tangent(double newValue) {
        double result =  Math.tan(newValue);
        System.out.println("The tangent of " + newValue + " is: " + result);
        return  result;

    }
    public double inverseSine(double newValue) {
        double result =  Math.sinh(newValue);
        System.out.println("The inverse sine of " + newValue + " is: " + result);
        return  result;

    }
    public double inverseCosine(double newValue) {
        double result =  Math.cosh(newValue);
        System.out.println("The inverse cosine of " + newValue + " is: " + result);
        return  result;

    }
    public double inverseTangent(double newValue) {
        double result =  Math.tanh(newValue);
        System.out.println("The inverse tangent of " + newValue + " is: " + result);
        return  result;

    }
}
