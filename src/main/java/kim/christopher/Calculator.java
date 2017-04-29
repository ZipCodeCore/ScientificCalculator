package kim.christopher;

/**
 * Created by christopherkim on 4/28/17.
 */
public class Calculator {

    InputReader reader;

    public Calculator(){
        reader = new InputReader();
    }

    String add(String x, String y) {
        return Double.toString(Double.parseDouble(x) + Double.parseDouble(y));
    }

    String subtract(String x, String y){
        return Double.toString(Double.parseDouble(x) - Double.parseDouble(y));
    }

    String multiply(String x, String y){
        return Double.toString(Double.parseDouble(x) * Double.parseDouble(y));
    }

    String divide(String x, String y){
        if(Double.parseDouble(y) == 0.0)
            return "ERROR";
        else return Double.toString(Double.parseDouble(x) / Double.parseDouble(y));
    }

    String negate(String x){
        return Double.toString(0);
    }
}
