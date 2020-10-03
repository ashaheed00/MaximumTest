// TC1.2

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MaximumTestTest {
	
	@Test
	public void testMaximumNumber() {
		assertEquals((Integer) 4, MaximumTest.maxNumber(2, 4, -9));
	}

}
