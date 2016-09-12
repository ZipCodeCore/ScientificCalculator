package lindsay.devon.Calculator;
import java.lang.Math;
/**
 * Created by devonlindsay on 9/12/16.
 */
public class LogarithmicCalculations {


    public double log(double newValue) {
        double result =  Math.log10(newValue);
        System.out.println(" log(" + newValue + ") = " + result);
        return  result;

    }

    public double log10x(double newValue) {
        double result =  Math.pow(Math.E,(Math.log10(newValue)));
        System.out.println(" log10x(" + newValue + ") = " + result);
        return  result;

    }
    public double logln(double newValue) {
        double result =  Math.log(newValue);
        System.out.println(" logln(" + newValue + ") = " + result);
        return  result;

    }

    public double logEx(double newValue) {
        double result =  Math.pow(Math.E,(Math.log(newValue)));
        System.out.println(" log(" + newValue + ") = " + result);
        return  result;

    }

}
