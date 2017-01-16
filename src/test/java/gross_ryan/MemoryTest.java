package gross_ryan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/15/17.
 */
public class MemoryTest {

    Memory memoryTest;

    @Before
    public void setUp() {
        memoryTest = new Memory();
    }

    @Test
    public void addMemoryTest() {
        Assert.assertEquals(1, memoryTest.addMemory(1), 0);
    }
}
