package ford.ford;
import java.lang.*;

/**
 * Created by rahmirford on 4/29/17.
 */
public class BasicMath {

    public double add(double x, double y){ return x + y;}

    public double divide(double x, double y) {
        if( y == 0) {
            return Float.NaN;
        } else{
            return x / y;
        }
    }

    public double subtract(double x, double y){return x - y;}

    public double multiply(double x, double y) {return x * y;}

    public double findSquareRoot(double x) {return Math.sqrt(x);}

    public double findSquare(double x){return x * x;}

}
