package fraction;
/*
 * Team 3
 * Andrew Brown
 * Allen Chang
 * Firomsa Abdurahman
 * 
 * Description:
 * This is the IllegalArgument jUnit test. This file test for the Fraction
 * constructor, add method, and the multiply method throwing the correct
 * exception. These three should throw an IllegalArgumentException with the
 * desired message that was provided for the assignment. Further more 
 * descriptive description will be above each individual test.
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
	/*
	 * the IllegalArgument jUnit test checks if the 
	 * IllegalArgumentException is thrown correctly and 
	 * if the messages are correct.
	 */
class IllegalArgument {
	/*
	 * The testFraction test the constructor to see if it throws an
	 * IllegalArgumentException when the denominator passed in is
	 * 0 and if the message match the one below.
	 */
	@Test
	void testFraction() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->{
			Fraction test=new Fraction(1,0);});
		assertEquals("The denominator with the value of 0 is not permitted",exception.getMessage());
	}
	/*
	 * The testAdd test the add method to see if it throws an 
	 * IllegalArgumentException when the test fraction passed in
	 * is null and if the message is the same as the one below.
	 */
	@Test
	void testAdd() {
		Fraction test=new Fraction(1,1);
		Fraction test2=null;
		IllegalArgumentException exception=  assertThrows(IllegalArgumentException.class,()->{
			test.add(test2);});
		assertEquals("Cannot perform math operations on a null fraction object!",exception.getMessage());
	}
	/*
	 * the testMultiply tests the multiply method to see if the 
	 * method throws an IllegalArgumentException if the test 
	 * fraction passed in is null and if the message passed is the
	 * same as the message below.
	 */
	@Test
	void testMultiply() {
		Fraction test=new Fraction(1,1);
		Fraction test2=null;
		IllegalArgumentException exception= assertThrows(IllegalArgumentException.class,()->{
			test.multiply(test2);});
		assertEquals("Cannot perform math operations on a null fraction object!",exception.getMessage());
	}
}
