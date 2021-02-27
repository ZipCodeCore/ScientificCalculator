package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    public Calculator() {
    }

    public void drawScreen(double d){
        Console.println("");
        Console.println("|------------------------------------------------|");
        Console.println("| Current Number:                            %s |",d);
        Console.println("|------------------------------------------------|");
        Console.println("| Add      Subtract      Multiply      Divide    |");
        Console.println("| Square   Square Root   Exponential   Inverse   |");
        Console.println("| Log      Log-1         Ln            Ln-1      |");
        Console.println("| Sine     Cosine        Tangent       Factorial |");
        Console.println("| Sine-1   Cosine-1      Tangent-1               |");
        Console.println("|------------------------------------------------|");
    }

    public double performOperation(String op, double num){
        double returnAns;

        if(op.equalsIgnoreCase("sine")){
            returnAns = this.sine(num);
        }
        else if(op.equalsIgnoreCase("cosine")){
            returnAns = this.cosine(num);
        }
        else if(op.equalsIgnoreCase("tangent")){
            returnAns = this.tangent(num);
        }
        else if(op.equalsIgnoreCase("sine-1")){
            returnAns = this.inverseSine(num);
        }
        else if(op.equalsIgnoreCase("cosine-1")){
            returnAns = this.inverseCosine(num);
        }
        else if(op.equalsIgnoreCase("tangent-1")){
            returnAns = this.inverseTangent(num);
        }
        else if(op.equalsIgnoreCase("factorial")){
            returnAns = this.factorial(num);
        }
        else if(op.equalsIgnoreCase("log")){
            returnAns = this.log(num);
        }
        else if(op.equalsIgnoreCase("log-1")){
            returnAns = this.inverseLog(num);
        }
        else if(op.equalsIgnoreCase("ln")){
            returnAns = this.naturalLog(num);
        }
        else if(op.equalsIgnoreCase("ln-1")){
            returnAns = this.inverseNaturalLog(num);
        }
        //below is placeholder
        else {
            returnAns = 69;
        }
        return returnAns;
    }

    private double sine(double x){
        double ans = Math.sin(x);
        return ans;
    }

    private double cosine(double x){
        double ans = Math.cos(x);
        return ans;
    }

    private double tangent(double x){
        double ans = Math.tan(x);
        return ans;
    }

    private double inverseSine(double x){
        double ans = Math.asin(x);
        return ans;
    }

    private double inverseCosine(double x){
        double ans = Math.acos(x);
        return ans;
    }

    private double inverseTangent(double x){
        double ans = Math.atan(x);
        return ans;
    }

    private double toRadians(double x){
        double ans = Math.toRadians(x);
        return ans;
    }

    private double toDegrees(double x){
        double ans = Math.toDegrees(x);
        return ans;
    }

    private double factorial(double x){
        double ans = 1;
        for(int i=1;i<=x;i++){
            ans *= i;
        }
        return ans;
    }

    private double log(double x){
        double ans = Math.log10(x);
        return ans;
    }

    private double inverseLog(double x){
        double ans = Math.pow(10,x);
        return ans;
    }

    private double naturalLog(double x){
        double ans = Math.log(x);
        return ans;
    }

    private double inverseNaturalLog(double x){
        double ans = Math.exp(x);
        return ans;
    }

    private String err(){
        return "Err";
    }

}
