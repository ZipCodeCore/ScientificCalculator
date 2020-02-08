package com.zipcodewilmington.scientificcalculator;

public class ScientificFunctions {

    public ScientificFunctions(){

    }

    public boolean isaNumber(Double input) {
        return true;
    }

    /*public class convertToDouble {
        private String number1;
        double convertedNumber = Double.parseDouble(number1);
    }*/
    public Double add(Double a, Double b) {
        Double sum = a + b;
        return sum;
    }

    public Double subtract(Double a, Double b) {
        Double sum = a - b;
        return sum;
    }

    public Double multiply(Double a, Double b) {
        Double sum = a * b;
        return sum;
    }

    public Double divide(Double a, Double b) {
        if (b == 0){
            // tell user division by 0 is not allowed and to re enter input
        }
        else {
            Double sum = a / b;
            return sum;
        }
    }

    public Double squareRoot(Double a) {
        Double sum = Math.sqrt(a);
        return sum;
    }

    public Double square(Double a) {
        Double sum = a*a;
        return sum;
    }
    // Add all inverses?  Multiplicative/additive/
    public Double inverse(Double a) {
        Double sum = (1/a);
        return sum;
    }
    // reset memory to 0?
    public void Clear() {

    }

    public Double exponent(Double a, Double e){
        Double sum = Math.pow(a, e);
        return sum;
    }

    public Double changeSign(Double a){
        if(a < 0){
            Double value = Math.abs(a);
        }
        else{
            Double value = value - (value*2);
        }
        return value;
    }

    // returns sine
    public Double sine(Double input){
        Double number = input;
        return Math.sin(number);
    }
    // returns cosine
    public Double cosine(Double input){
        Double number = input;
        return Math.cos(number);
    }
    // returns tangent
    public Double tangent(Double input){
        Double number = input;
        return Math.tan(number);
    }
    // inverse sine
    public Double inverseSine(Double input){
        Double number = input;
        return Math.asin(number);
    }
    // inverse cosine
    public Double inverseCosine(Double input){
        Double number = input;
        return Math.acos(number);
    }
    // inverse tangent
    public Double inverseTangent(Double input){
        Double number = input;
        return Math.atan(number);
    }

    // to radians

    public Double radian(Double input){
        Double number = input;
        return Math.toRadians(number);
    }

    // to degrees
    public Double degree(Double input){
        Double number = input;
        return Math.toDegrees(number);
    }

    // calc natural log
    public Double naturalLog(Double input){
        Double number = input;
        return Math.log(number);
    }

    // calc base log
    public Double baseLog(Double input){
        Double number = input;
        return Math.log10(number);
    }
    // calc inverse log
    public Double inverseLog(Double input){
        Double number = Math.pow(10, input);
        return number;
    }

    // calc inverse natural log
    public Double inverseNaturalLog(Double input){
        Double number = Math.pow(Math.E, input);
        return number;
    }

}
