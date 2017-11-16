package Kim;

/**
 * Created by andykim on 1/14/17.
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExponentialOperatorsTest{
        ExponentialOperators secondTest;
        @Before
        public void setUp(){
            secondTest = new ExponentialOperators();
        }

        @Test
        public void square(){
            double expected = 9;
            double actual = secondTest.square(3);
            assertEquals(expected, actual, 0);
        }

        @Test
        public void squareRoot(){
            double expected = 2;
            double actual = secondTest.squareRoot(4);
            assertEquals(expected, actual, 0);
        }
        @Test
        public void toPower(){
            double expected = 100;
            double actual = secondTest.toPower(10, 2);
            assertEquals(expected, actual, 0);
        }
        @Test
        public void inversePower(){
            double expected = .1;
            double actual = secondTest.inversePower(10);
            assertEquals(expected, actual, 0);
        }


}
