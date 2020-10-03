// TC1.1

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MaximumTestTest {
	
	@Test
	public void testMaximumNumber() {
		assertEquals((Integer) 4, MaximumTest.maxNumber(4, 2, -9));
	}

}
