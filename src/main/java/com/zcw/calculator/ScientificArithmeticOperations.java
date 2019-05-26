package com.zcw.calculator;

public class ScientificArithmeticOperations extends ArithmeticOperations {
    public String square(double x){
        double squa = Math.pow(x, 2);
        if(squa == (long)squa) {
            return String.format("%d",(long)squa);
        }
        return String.format("%s",squa);
    }

    public String squareRoot(double sr){
        double root = Math.sqrt(sr);
        if(root == (long)root) {
            return String.format("%d", (long)root);
        }
        return String.format("%s", root);
    }

    public String inverse(double i){
        double inv = 1/i;
        if(inv == (long)inv) {
            return String.format("%d",(long)inv);
        }
        return String.format("%s",inv);

    }
    public String switchSign(double x){
    return null;
    }
    public String sine(double x){
        return null;
    }
    public String cosine(double x){
        return null;
    }
    public String tangent(double x){
        return null;
    }
    public String inverseSine(double x){
        return null;
    }

    public String inverseCosine(double x){
        return null;
    }
    public String inverseTangent(double x){
        return null;
    }
    public String factorial(double x){
        return null;
    }
    public String log(double x){
        return null;
    }
    public String inverseLog(double x){
        return null;
    }
    public String naturalLog(double x){
        return null;
    }
    public String inverseNaturalLogarith(double x){
        return null;
    }

}
