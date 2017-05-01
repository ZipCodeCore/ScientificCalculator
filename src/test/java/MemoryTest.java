/**
 * Created by danzygmund-felt on 4/30/17.
 */
import org.junit.*;

public class MemoryTest {

    @Test
    public void getMemoryTest() {
        //Given
        Memory memory = new Memory();
        memory.setMemory(18.81);
        double expected = 18.81;
        //When
        double actual = memory.getMemory();
        //Then
        Assert.assertEquals("18.81 is stored in memory", expected, actual, 0);
    }

    @Test
    public void resetMemoryTest() {
        //Given
        Memory memory = new Memory();
        memory.setMemory(21.12);
        memory.resetMemory();
        double expected = 0.0;
        //When
        double actual = memory.getMemory();
        //Then
        Assert.assertEquals("Memory was reset to 0.0", expected, actual, 0);
    }
}
