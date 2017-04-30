import org.junit.Assert;
import org.junit.Test;

/**
 * Created by luisgarcia on 4/29/17.
 */
public class DisplayTester
{
    Display show = new Display();

    @Test
    public void testDisplay()
    {
        //given
        String expected = "0.0";

        //when
        String actual = show.display();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDisplay_NaN()
    {
        //given
        show.setCurrentNum(Double.NaN);
        String expected = "Err";

        //when
        String actual = show.display();

        //then
        Assert.assertEquals(expected, actual);
    }


}
