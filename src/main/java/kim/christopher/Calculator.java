package kim.christopher;

/**
 * Created by christopherkim on 4/28/17.
 */
public class Calculator {

    InputReader reader;

    public Calculator(){
        reader = new InputReader();
    }

    double add(double x, double y){
        return x + y;
    }

    double subtract(double x, double y){
        return x - y;
    }

    double multiply(double x, double y){
        return x * y;
    }

    double divide(double x, double y){
        if(y == 0.0)
            return Double.NaN;
        else return x / y;
    }
}
