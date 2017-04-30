package kim.christopher;

import org.apache.commons.lang3.math.NumberUtils;

public class Calculator {

    InputReader reader;

    public Calculator(){
        reader = new InputReader();
    }

    String add(String x, String y) {
        if(NumberUtils.isNumber(y))
            return Double.toString(Double.parseDouble(x) + Double.parseDouble(y));
        else return "ERROR";
    }

    String subtract(String x, String y){
        if(NumberUtils.isNumber(y))
            return Double.toString(Double.parseDouble(x) - Double.parseDouble(y));
        else return "ERROR";
    }

    String multiply(String x, String y){
        if(NumberUtils.isNumber(y))
            return Double.toString(Double.parseDouble(x) * Double.parseDouble(y));
        else return "ERROR";
    }

    String divide(String x, String y){
        if(Double.parseDouble(y) == 0.0 || !NumberUtils.isNumber(y))
            return "ERROR";
        else return Double.toString(Double.parseDouble(x) / Double.parseDouble(y));
    }

    String power(String x, String y){
        if(NumberUtils.isNumber(y))
            return Double.toString(Math.pow(Double.parseDouble(x), Double.parseDouble(y)));
        else return "ERROR";
    }

    String negate(String x){
        if(NumberUtils.isNumber(x))
            return Double.toString(-Double.parseDouble(x));
        else return "ERROR";
    }

    String inverse(String x){
        if(NumberUtils.isNumber(x))
            return Double.toString(1 / Double.parseDouble(x));
        else return "ERROR";
    }

    String square(String x){
        if(NumberUtils.isNumber(x))
            return power(x, "2");
        else return "ERROR";
    }

    String sqrt(String x){
        if(NumberUtils.isNumber(x))
            return Double.toString(Math.sqrt(Double.parseDouble(x)));
        else return "ERROR";
    }




}
