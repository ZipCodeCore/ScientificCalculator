package Main;

/**
 * Created by jennifermcginty on 4/29/17.
 */
public class AdvancedCalculator {
    Display display = new Display();

    public double square(double a){
        double results = a * a;
        display.printDouble(results);
        return results;
    }

    public  double squareRoot(double a){
        double results = Math.sqrt(a);
        display.printDouble(results);
        return results;
    }

    public double exponents(double a, double b){
        double results = Math.pow(a,b);
        display.printDouble(results);
        return results;
    }

    public int inverse(int a, int b){
        b = -1;
        int results = a * b;
        display.printNumber(results);
        return results;
    }
}
