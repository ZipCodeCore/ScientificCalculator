package ford.ford;
import java.lang.*;

/**
 * Created by rahmirford on 4/29/17.
 */
public class BasicMath {

    public static double add(double x, double y){ return x + y;}

    public static double divide(double x, double y) {
        if( y == 0) {
            return Float.NaN;
        } else {
            return x / y;
        }
    }

    public static double subtract(double x, double y){return x - y;}

    public static double multiply(double x, double y) {return x * y;}

    public static double findSquareRoot(double x) {return Math.sqrt(x);}

    public static double findSquare(double x){return x * x;}

    public static double findExponent(double x, double y){return Math.pow(x,y);}
}
