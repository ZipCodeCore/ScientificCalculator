
/**
 * Created by luisgarcia on 4/29/17.
 */
public class Calculator
{

    public double add(double x, double y)
    {
        return x + y;
    }

    public double subtract(double x, double y)
    {
        return x - y;
    }

    public double multiply(double x, double y)
    {
        return x * y;
    }

    public double divide(double x, double y)
    {
        if(y == 0)
        {
            return Double.NaN;
        }
        return x / y;
    }

    public double square(double x)
    {
        return x * x;
    }

    public double squareRoot(double x)
    {
        return Math.sqrt(x);
    }

    public double variableExp(double x, double y)
    {
        return Math.pow(x, y);
    }

    public double inverse(double x)
    {
        return 1 / x;
    }

    public double invert(double x)
    {
        return x * -1;
    }






}
