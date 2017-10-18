package weisser.sarah;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CalculationValues values = new CalculationValues(6, 9, "+");
        Calculator calculator = new Calculator();
        double result = calculator.add(values.getValue1(), values.getValue2());
        System.out.println(result);
    }
}
