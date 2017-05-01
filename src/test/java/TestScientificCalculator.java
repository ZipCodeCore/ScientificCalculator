import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gregoryfletcher on 4/29/17.
 */
public class TestScientificCalculator {

ScientificCalculator scientificCalculator;

@Before
public void startup() {
	scientificCalculator = new ScientificCalculator();
}
	@Test
	public void setMemoryTest() {
		scientificCalculator.setMemory(7);
		assertEquals(7, scientificCalculator.getMemory(), 0);
	}

	@Test
	public void addMemoryTest() {
		scientificCalculator.setMemory(3);
		UserInterface.display = 4;
		scientificCalculator.addMemory();
		assertEquals(7, scientificCalculator.getMemory(), 0);
	}

	@Test
	public void clearMemoryTest() {
		scientificCalculator.setMemory(8);
		scientificCalculator.clearMemory();
		assertEquals(0, scientificCalculator.getMemory(), 0);
	}

}
