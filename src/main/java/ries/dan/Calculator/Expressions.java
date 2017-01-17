package ries.dan.Calculator;
import java.text.DecimalFormat;
/**
 * Created by danries on 1/13/17.
 */
public class Expressions {

    public static double add(double x,double y){
        return (x + y);
    }

    public static double multiply(double x, double y){
        return (x * y);
    }

    public static double divide(double x, double y){
        if(y == 0){
            System.out.print("Err");
            return 0;
        }
        return (x/y);
    }

    public static double subtract(double x, double y){
        return (x-y);
    }

    public static double square(double x){
        return (x*x);
    }

    public static double power(double x, double y){
        return Math.pow(x,y);
    }

    public static double inverse(double x){
        return divide(1, x);
    }

    public static double sine(double x){
        Convert.convertRadorDegree(x);
        return Math.sin(x);
    }

    public static double sineInverse(double x){
        Convert.convertRadorDegree(x);
        return Math.asin(x);
    }

    public static double cosine(double x){
        Convert.convertRadorDegree(x);
        return Math.cos(x);
    }

    public static double cosineInverse(double x){
        Convert.convertRadorDegree(x);
        return Math.acos(x);
    }

    public static double tangent(double x){
        Convert.convertRadorDegree(x);
        return Math.tan(x);
    }

    public static double tangentInverse(double x){
        Convert.convertRadorDegree(x);
        return Math.atan(x);
    }

    public static double base10(double x){
        return Math.pow(10,x);
    }

    public static double log(double x){
        return Math.log10(x);
    }

    public static double ln(double x){
        return Math.log(x);
    }

    public static double exp(double x){
        return Math.exp(x);
    }

    public static double factorial(double x){

        double answer = 1;

        for(int i = 1; i <= x; i++){
            answer *= i;
        }
        return answer;
    }



}
