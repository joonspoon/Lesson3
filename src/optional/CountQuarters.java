package optional;

import junit.framework.TestCase;

/* Write a method called countQuarters(int money) that calculates the number of cents left over 
 * if you took out all the possible quarters. */

public class CountQuarters extends TestCase {
	
	public void test() throws Exception {
		assertEquals(2, countQuarters(64));
		assertEquals(3, countQuarters(1278));
	}

	private Object countQuarters(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}