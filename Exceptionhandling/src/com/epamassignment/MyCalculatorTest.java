/*
 * @author KUSA VAMSHI
 */

/*
 * This is the Junit testcase for Hacherrank Java Exception handling problem
*/

package com.epamassignment;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MyCalculatorTest {
	@Test
	void test1() throws Exception  {
		MyCalculator test=new MyCalculator();
		assertEquals(243,test.power(3,5));
		assertEquals(16,test.power(2,4));
		Assertions.assertThrows(Exception.class, () -> test.power(0,0));
		Assertions.assertThrows(Exception.class, () -> test.power(-1,-2));
		Assertions.assertThrows(Exception.class, () -> test.power(-1,3));
	}
}