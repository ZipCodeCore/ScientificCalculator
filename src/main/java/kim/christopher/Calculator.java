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
        if((Double.parseDouble(y) != 0.0d) && NumberUtils.isNumber(y))
            return Double.toString(Double.parseDouble(x) / Double.parseDouble(y));
        else return "ERROR";
    }

    String power(String x, String y){
        if(NumberUtils.isNumber(y))
            return Double.toString(Math.pow(Double.parseDouble(x), Double.parseDouble(y)));
        else return "ERROR";
    }

    String negate(String x){
        return Double.toString(-Double.parseDouble(x));
    }

    String inverse(String x){
        return Double.toString(1 / Double.parseDouble(x));
    }

    String square(String x){
        return power(x, "2");
    }

    String sqrt(String x){
        if(Double.parseDouble(x) >= 0)
            return Double.toString(Math.sqrt(Double.parseDouble(x)));
        else return "ERROR";
    }

    String sin(String x){
        return Double.toString(Math.sin(Math.toRadians(Double.parseDouble(x))));
    }

    String cos(String x){
        return Double.toString(Math.cos(Math.toRadians(Double.parseDouble(x))));
    }

    String tan(String x){
        return Double.toString(Math.tan(Math.toRadians(Double.parseDouble(x))));
    }




}
