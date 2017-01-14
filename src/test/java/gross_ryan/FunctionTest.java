package gross_ryan;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ryangross on 1/13/17.
 */
public class FunctionTest {

    @Test
    public void getCalculationCommandTest() {
        Function testFunction = new Function("/", 6);
        Assert.assertTrue((testFunction.getCalculatorCommand() == "/"));
        Assert.assertFalse((testFunction.getCalculatorCommand() == "*"));

    }

    @Test
    public void getNumberToCalculateWithTest() {
        Function testFunction = new Function("/", 6);
        Assert.assertTrue((testFunction.getNumberToCalculateWith() == 6));
        Assert.assertFalse((testFunction.getNumberToCalculateWith() == 5));

    }

}
