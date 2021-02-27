package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    public Calculator() {
    }

    public double sine(int x){
        double ans = Math.sin(x);
        return ans;
    }
    public double sine(double x){
        double ans = Math.sin(x);
        return ans;
    }
    public double cosine(int x){
        double ans = Math.cos(x);
        return ans;
    }
    public double cosine(double x){
        double ans = Math.cos(x);
        return ans;
    }
    public double tangent(int x){
        double ans = Math.tan(x);
        return ans;
    }
    public double tangent(double x){
        double ans = Math.tan(x);
        return ans;
    }
    public double inverseSine(int x){
        double ans = Math.asin(x);
        return ans;
    }
    public double inverseSine(double x){
        double ans = Math.asin(x);
        return ans;
    }
    public double inverseCosine(int x){
        double ans = Math.acos(x);
        return ans;
    }
    public double inverseCosine(double x){
        double ans = Math.acos(x);
        return ans;
    }
    public double inverseTangent(int x){
        double ans = Math.atan(x);
        return ans;
    }
    public double inverseTangent(double x){
        double ans = Math.atan(x);
        return ans;
    }

    public double toRadians(int x){
        double ans = Math.toRadians(x);
        return ans;
    }
    public double toRadians(double x){
        double ans = Math.toRadians(x);
        return ans;
    }
    public double toDegrees(int x){
        double ans = Math.toDegrees(x);
        return ans;
    }
    public double toDegrees(double x){
        double ans = Math.toDegrees(x);
        return ans;
    }

    public int factorial(int x){
        int ans = 1;
        for(int i=1;i<=x;i++){
            ans*=i;
        }
        return ans;
    }

}
