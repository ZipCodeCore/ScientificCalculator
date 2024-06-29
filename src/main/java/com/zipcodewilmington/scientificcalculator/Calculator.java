//CLASS
public class Calculator {

    // CONSTRUCTOR
    public Calculator(){

    }

    //METHODS know also as a FUNCTION's
    public double add(double a, double b){
        return a + b;
    }

    public double subtract(double a, double b){
        return a - b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double divide(double a, double b){
        return a / b;
    }

    public double modulo(double a, double b){
        return a % b;
    }

    public double square(double a){
        return a * a;
    }

    public double squareRoot(double a){
        if (a < 0){
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    public double varExpnt(double a, double b){
        return Math.pow(a, b);
    }

    public double inverse(double a){
        if (a == 0.0){
            return Double.NaN; //System.out.println("You cannot inverse 0");
        }
        return 1.0 / a;
    }
