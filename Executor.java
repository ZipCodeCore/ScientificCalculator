package Ragonese.Ken.ScientificCalculator;

/**
 * Created by kenragonese on 9/10/16.
 */

public class Executor {

    public double add(double x, double y){
        return x + y;
    }

    public double subtract(double x, double y){
        return x - y;
    }

    public double multiply(double x, double y){
        return x*y;
    }

    public double divide(double x, double y){
        if(y == 0){
            System.out.println("Error, cannot divide by zero!");
            return 0;
        }
        else{
            return x/y;
        }
    }
    public double square(double x){
        return x*x;

    }
    public double sqRoot(double x){
        return Math.sqrt(x);
    }
    public double exponent(double x, double y){
        return Math.pow(x,y);
    }
    public double inverse(double x){
        if(x==0){
            System.out.println("Error, cannot divide by zero!");
            return 0;
        }
        else{
            return 1/x;
        }
    }
    public double invertSign(double x){
        if(x>0){
            return -x;
        }
        else if(x<0){
            return Math.abs(x);
        }
        else{
            return 0;
        }
    }
    public double sine(double x){
        return Math.sin(x);
    }
    public double cosine(double x){
        return Math.cos(x);
    }
    public double tangent(double x){
        return Math.tan(x);
    }
    public double inverseSine(double x){
        return Math.asin(x);
    }
    public double inverseCosine(double x){
        return Math.acos(x);
    }
    public double inverseTangent(double x){
        return Math.atan(x);
    }
    public double log(double x){
        return Math.log10(x);
    }
    public double naturalLog(double x){
        return Math.log(x);
    }
    public double inverseLog(double x){
        return Math.log1p(x);
    }
    public double inverseNaturalLog(double x){
        return Math.exp(x);
    }
    public double factorial(double x){
        for (int i = 1; i <= x; i++) {
           x = x * i;
        }
        return x;
    }

}
