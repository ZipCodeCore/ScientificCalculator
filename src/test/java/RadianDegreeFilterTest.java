/**
 * Created by danzygmund-felt on 4/30/17.
 */
import org.junit.*;
public class RadianDegreeFilterTest {

    @Test
    public void trigInputFilterRadiansTest() {
        //Given
        RadianDegreeFilter filter = new RadianDegreeFilter();
        double expected = Math.PI / 2;
        //When
        double actual = filter.trigInputFilter(Math.PI / 2);
        //Then
        Assert.assertEquals("pi/2 radians", expected, actual, 0.00001);
    }

    @Test
    public void trigOutputFilterRadiansTest() {
        //Given
        RadianDegreeFilter filter = new RadianDegreeFilter();
        double expected = Math.PI / 2;
        //When
        double actual = filter.trigOutputFilter(Math.PI / 2);
        //Then
        Assert.assertEquals("pi/2 radians", expected, actual, 0.00001);
    }

    @Test
    public void trigOutputFilterDegreesTest() {
        //Given
        RadianDegreeFilter filter = new RadianDegreeFilter();
        filter.setUnits("degrees");
        double expected = 45.0;
        //When
        double actual = filter.trigOutputFilter(Math.PI / 4);
        //Then
        Assert.assertEquals("pi/4 radians is 45 degrees", expected, actual, 0.00001);
    }

    @Test
    public void trigInputFilterDegreesTest() {
        //Given
        RadianDegreeFilter filter = new RadianDegreeFilter();
        filter.setUnits("degrees");
        double expected = Math.PI / 2;
        //When
        double actual = filter.trigInputFilter(90.0);
        //Then
        Assert.assertEquals("90 degrees is pi/2 radians", expected, actual, 0.00001);
    }
}
