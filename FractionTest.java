package fraction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * FractionTest is a jUnit test which test the methods found in the 
 * Fraction class to see if the method provides the desired results
 */
class FractionTest {
	/*
	 * test is a Fraction object that will be used in most of the test 
	 * as a base variable that will start off each test as the same
	 */
	Fraction test;
	/*
	 * The BeforeEach setup sets the test fraction to the
	 * new Fraction(-16,-20) so that at the start of every
	 * test the values in test will be 4 for the 
	 * numerator and 5 for the denominator
	 */
	@BeforeEach
	public void setup() throws Exception{
		//initial fraction
		test=new Fraction(-16,-20);
	}
	/*
	 * The testNumAndDen creates three new fractions and checks
	 * if the numerator and denominator values are correctly 
	 * assigned in the constructor as well as to see if the
	 * getNum and getDen methods correctly returns the 
	 * this.numerator and this.denominator value.
	 */
	@Test
	public void testNumAndDen() {
		Fraction f1= new Fraction(4,5);
		Fraction f2= new Fraction(-1,2);
		Fraction f3= new Fraction(-4,-5);
		assertEquals(4, f1.getNum());
		assertEquals(-1, f2.getNum());
		assertEquals(5, f1.getDen());
		assertEquals(2, f2.getDen());
		assertEquals(4, f3.getNum());
		assertEquals(5, f3.getDen());
	}
	/*
	 * The testNegatives test checks if the constructor handles
	 * passed in parameter of negatives in both the numerator
	 * and denominator as well as if the denominator only is 
	 * negative. If both numerator and denominator are 
	 * positive than both values should be changed into positive
	 * and if only the denominator is negative, then the 
	 * numerator should be changed to negative and the denominator
	 * should be changed into a positive.
	 */
	@Test
	public void testNegatives() {
		assertEquals(4, test.getNum());
		assertEquals(5, test.getDen());
		test=new Fraction(4,-5);
		assertEquals(-4, test.getNum());
		assertEquals(5, test.getDen());
	}
	/*
	 * the testProperReduction check if the constructor reduces the 
	 * fraction by the greatest common divisor so that the fraction
	 * should be at it's smallest form. This test check the reduction
	 * method and the GreatestCommonDivisor method as well.
	 */
	@Test
	public void testProperReduction() {
		assertEquals(4, test.getNum());
		assertEquals(5, test.getDen());
		test=new Fraction(121,11);
		assertEquals(11, test.getNum());
		assertEquals(1, test.getDen());
	}
	/*
	 * The testEquals checks if the value of two fraction are equal
	 * and returns a boolean value. If both numerator and denominator
	 * are the same in both fraction, than the method equals method
	 * will return a true value; otherwise, the method will return a
	 * false value.
	 */
	@Test
	public void testEquals() {
		assertFalse(test.equals(new Fraction(41,50)));
		assertTrue(test.equals(new Fraction(4000,5000)));
	}
	/*
	 * the testcompareTo method checks if the results of compareTo
	 * method are correct. If the value of the first fraction is 
	 * real value is greater than the second fraction's real value
	 * than the method returns a 2, if the second fraction's real
	 * value is greater than the method returns a -1, and if both
	 * values are the same than the method will return a 0.
	 */
	@Test
	public void testCompareTo() {
		assertEquals(2,test.compareTo(new Fraction(2,3)));
		assertEquals(-1,test.compareTo(new Fraction(5,6)));
		assertEquals(0,test.compareTo(new Fraction(40,50)));
	}
	/*
	 * The testAdd method test if the add method returns the 
	 * correct fraction. The add method adds the value of two
	 * fractions together and places those values into the 
	 * fraction constructor as a new fraction. The new fraction
	 * is then returned. If the fraction being added has 0 in 
	 * the numerator, than the method returns the original
	 * fraction without alterations.
	 */
	@Test
	public void testAdd() {
		test=test.add(new Fraction(4,5));
		assertEquals(8, test.getNum());
		assertEquals(5, test.getDen());
		test=test.add(new Fraction(0,5));
		assertEquals(8, test.getNum());
		assertEquals(5, test.getDen());
	}
	/*
	 * the testMultiplication checks if the multiply method returns
	 * the correct value. The multiply method multiplies two fraction's
	 * numerator and denominator respectively and places those values
	 * into a fraction constructor. The method then returns the 
	 * new fraction.
	 */
	@Test
	public void testMultiplication() {
		test=test.multiply(new Fraction(1,-2));
		assertEquals(-2,test.getNum());
		assertEquals(5,test.getDen());
		test=test.multiply(new Fraction(0,1));
		assertEquals(0, test.getNum());
		assertEquals(1, test.getDen());
	}
	/*
	 * The testToSTring test if the toString method returns the 
	 * correct value. The toString method should return the 
	 * numerator and the denominator split by a "/" without
	 * any whitespace in between.
	 */
	@Test
	public void testToSTring() {
		assertEquals("4/5",test.toString());
		test=new Fraction(-2,5);
		assertEquals("-2/5",test.toString());
		test=new Fraction(2,-5);
		assertEquals("-2/5",test.toString());
		test=new Fraction(2,5);
		assertEquals("2/5",test.toString());
	}
	/*
	 * The testRealNum check the realValue method to see if
	 * the method returns the correct value. The method returns
	 * a double value that is the numerator divided by the 
	 * denominator.
	 */
	@Test
	public void testRealNum() {
		double dtest=test.realValue();
		assertEquals(0.80,dtest);
	}
}
