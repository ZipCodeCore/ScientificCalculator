package weisser.sarah;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sarahweisser on 4/29/17.
 */
public class TestDisplay {

    @Test
    public void testDisplayFirstValue() {

        //given
        CalculationValues values = new CalculationValues(5, 8, "+");
        Display display = new Display(values);

        //when
        display.displayFirstValue();

    }

    @Test
    public void testDisplaySecondValue() {

        //given
        CalculationValues values = new CalculationValues(5, 8, "+");
        Display display = new Display(values);

        //when
        display.displaySecondValue();

    }

    @Test
    public void testDisplayOperation() {

        //given
        CalculationValues values = new CalculationValues(5, 8, "+");
        Display display = new Display(values);

        //when
        display.displayOperation();

    }
}
