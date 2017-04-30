import org.junit.Assert;
import org.junit.Test;

/**
 * Created by luisgarcia on 4/29/17.
 */
public class DisplayOperartionTester
{
    DisplayOperation test = new DisplayOperation();

    @Test
    public void testDiplay()
    {
        //given
        String expected = "0.0";

        //when
        String actual = test.display();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAdd()
    {
        //given
        double expeted = 1.0;

        //when
        double acutal = test.add(1.0);

        //then
        Assert.assertEquals(expeted, acutal,0);

    }

    @Test
    public void testOperation()
    {
        //given
        double expected = 3;

        //when
        double actual = test.operation("ADD",3.0);

        //then
        Assert.assertEquals(expected, actual, 0);
    }





}
