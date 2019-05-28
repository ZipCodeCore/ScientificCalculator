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
    double a = -x;
        if(a == (long)a) {
            return String.format("%d", (long)a);
        }
        return String.format("%s",a);

    }
    public String sine(double x){
        double s = Math.toRadians(x);
        double m = Math.sin(x * (Math.PI/180));
        if(m == (long)m) {
            return String.format("%d", (long)m);
        }
        return String.format("%s",m);
    }

    public String cosine(double x){
        double c = Math.toRadians(x);
        double m = Math.cos(c);
        if(m == (long)m) {
            return String.format("%d",(long)m);
        }
        return String.format("%s",m);
    }
    public String tangent(double x){
        double s = Math.toRadians(x);
        double m = Math.sin(s);
        if(m == (long)m) {
            return String.format("%d", (long)m);
        }
        return String.format("%s",m);
    }
    public String inverseSine(double x){
        double s = Math.toRadians(x);
        double m = 1/(Math.sin(s));
        if(m == (long)m) {
            return String.format("%d", (long)m);
        }
        return String.format("%s",m);
    }

    public String inverseCosine(double x){
        double s = Math.toRadians(x);
        double m = 1/(Math.cos(s));
        if(m == (long)m) {
            return String.format("%d", (long)m);
        }
        return String.format("%s",m);
    }
    public String inverseTangent(double x){
        double s = Math.toRadians(x);
        double m = Math.round(1/(Math.tan(s)));
        if(m == (long)m) {
            return String.format("%d", (long)m);
        }
        return String.format("%s",m);
    }
    public String factorial(double x){
        double fact = 1;

        for (int i = 2; i <= x; i++) {
            fact = fact * i;
        }
        if(fact == (long)fact) {
            return String.format("%d", (long)fact);
        }
        return String.format("%s",fact);
    }

    public String log(double x){
       double a = Math.log10(x);
       if(a == (long)a) {
           return String.format("%d", (long)a);
       }
       return String.format("%s",a);
    }

    public String inverseLog(double x){
        double a = Math.pow(10,x);
        if(a == (long)a) {
            return String.format("%d", (long)a);
        }
        return String.format("%s",a);
    }

    public String naturalLog(double x){
        double a = Math.log(x);
        if(a == (long)a) {
            return String.format("%d", (long)a);
        }
        return String.format("%s",a);
    }

    public String inverseNaturalLogarith(double x){
        double a = Math.exp(x);
        System.out.println(a);
        if(a == (long)a) {
            return String.format("%d", (long)a);
        }
        return String.format("%s",a);
    }

}
