import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gregoryfletcher on 4/29/17.
 */
public class TestCoreCalculator {

CoreCalculator coreCalculator;

@Before
public void startup() {
	coreCalculator = new CoreCalculator();
}
	@Test
	public void testAdd() {
		coreCalculator.add(5, 8);
		assertEquals(13, UserInterface.display, 0);
	}

	@Test
	public void testSubtract() {
		coreCalculator.subtract(3, 1);
		assertEquals(2, UserInterface.display, 0);
	}

	@Test
	public void testMultiply() {
		coreCalculator.multiply(2, 7);
		assertEquals(14, UserInterface.display, 0);
	}

	@Test
	public void testDivideByZero() {
		coreCalculator.divide(3, 0);
		assertEquals("Err", UserInterface.error);
	}

	@Test
	public void testDivide() {
		coreCalculator.divide(1, 8);
		assertEquals(0.125, UserInterface.display, 3);
	}

	@Test
	public void testExponentiation() {
		coreCalculator.exponentiation(8, 9);
		assertEquals(134217728, UserInterface.display, 0);
	}

	@Test
	public void testSquare() {
		coreCalculator.square(5);
		assertEquals(25, UserInterface.display, 0);
	}

	@Test
	public void testSquareRoot() {
		coreCalculator.squareRoot(4);
		assertEquals(2, UserInterface.display, 0);
	}

	@Test
	public void testInverse() {
		coreCalculator.inverse(7);
		assertEquals(0.14285, UserInterface.display, 6);
	}

	@Test
	public void testInvertSign() {
		coreCalculator.invertSign(-8);
		assertEquals(8, UserInterface.display, 0);
	}
}
