package fraction;

public class Fraction {
	/*
	 * Fraction class that will get tested.
	 * establish a place to store the numerator and denominator 
	 * parameter that will be set in the constructor
	 */
	int numerator,denominator;
	/*
	 * 	The constructor takes a two int parameter which will
	 * be assigned into as a numerator or the denominator
	 * 	The constructor will check if both value are negative 
	 * and if so will negate the negation make the fraction
	 * positive.
	 * 	The constructor will also check if the numerator is 
	 * positive while the denominator is negative and if so
	 * will change the numerator to a negative and the 
	 * denominator into a positive.
	 * 	Else the constructor will assign the numerator as
	 * this.numerator and similarly with the denominator
	 *	Then the constructor will call the reduction method
	 *which will reduce the fraction to the smallest 
	 *variant
	 */
	public Fraction(int numerator,int denominator) {
		if(denominator == 0)
			throw new IllegalArgumentException("The denominator with the value of 0 is not permitted");
		if((numerator<0)&&(denominator<0)) {
			this.numerator=0-numerator;
			this.denominator=0-denominator;
		}else if((denominator<0)&&(numerator>0)){
			this.numerator=0-numerator;
			this.denominator=0-denominator;
		}else {
			this.numerator=numerator;
			this.denominator=denominator;
		}
		reduction(this.numerator,this.denominator);
	}
	/*
	 * the reduction method takes the parameter numerator and 
	 * denominator which is then passed to the GreatestCommonDivisor
	 * method which is used to find the greatest common
	 * divisor. if the numerator is negative, then
	 * the GreatestCommonDivisor takes the positive version
	 * of the numerator. The GreatestCommonDivisor then returns a 
	 * int value to the variable gcd. Then it set this.numerator
	 * with numerator/gcd and similarly with the denominator
	 */
	public void reduction(int numerator,int denominator) {
		int gcd;
		if(numerator<0) {
			gcd=GreatestCommonDivisor(0-numerator,denominator);
		}else {
			gcd=GreatestCommonDivisor(numerator,denominator);
		}
		this.numerator=numerator/gcd;
		this.denominator=denominator/gcd;
	}
	/*
	 * The GreatestCommonDivisor take the numerator set to 
	 * a and denominator set to b which is used to 
	 * calculate the greatest common divisor and returns
	 * a greatest common divisor as a int value
	 */
	public int GreatestCommonDivisor(int a,int b) {
		if(b==0)
			return a;
		return GreatestCommonDivisor(b,a%b);
	}
	/*
	 * the getNum() method will return the this.numerator
	 */
	public int getNum() {
		return this.numerator;
	}
	//the getDen() method will return the this.denominator
	public int getDen() {
		return this.denominator;
	}
	/*
	 * equals method checks if a passed in fraction is equal
	 * to the this. Fraction. The method checks if 
	 * this.getNum()==test.getNum()&&this.getDen()==test.getDen().
	 * This checks if the this fraction's numerator equals the 
	 * test numerator as well as the this fraction's denominator
	 * is tested against test denominator. If both numerator and
	 * denominator is equal then the method returns true 
	 * otherwise the method returns false.
	 */
	public boolean equals(Fraction test) {
		if(this.getNum()==test.getNum()&&this.getDen()==test.getDen()) {
			return true;
		}else {
		return false;	
		}
	}
	/*
	 * compareTo compares this fraction and test.
	 * the compareTo checks to see which of the two decimal values are greatest
	 * if this is greater return 2
	 * if test is greater return -1
	 * if they are the same return 0
	 */
	public int compareTo(Fraction test) {
		
		//preconditions
		if(test == null)
			throw new IllegalArgumentException("Error: test cannot be null");
		
		//create decimal values for the two fractions
		double thisDecimal = (double)this.getNum() / (double)this.getDen();
		double testDecimal = (double)test.getNum() / (double)test.getDen();
		
		//if this is greater return 2
		if(thisDecimal > testDecimal) 
		{
			return 2;
		}
		//if test is greater return -1
		else if(thisDecimal < testDecimal)
		{
			return -1;
		}
		//if they are the same return 0
		else 
		{
			return 0;
		}
	}
	/*
	 * The add method takes a fraction parameter and checks
	 * if the numerator is 0. If so the method returns a new
	 * fraction composed of the this.numerator and 
	 * this.denominator.
	 * Otherwise the method creates int variables num and den
	 * to hold the new numerator and denominator values.
	 * the num get this.numerator*test.denominator +
	 * this.denominator*test.numerator while the den gets
	 * this.denominator*test.denominator.
	 * The method returns new Fraction(num,den)
	 */
	public Fraction add(Fraction test){
		if(test == null)
			throw new IllegalArgumentException("Cannot perform math operations on a null fraction object!");
		if(test.getNum()==0) {
			Fraction result=new Fraction(this.numerator,this.denominator);
			return result;
		}
		int num,den;
		num=(this.getNum()*test.getDen())+(this.getDen()*test.getNum());
		den=this.getDen()*test.getDen();
		return new Fraction(num,den);
	}
	/*
	 * The multiply method multiply the this fraction and
	 * the test fraction passed in. The method initalizes
	 * int variable num and den. num gets this.numerator*
	 * test.numerator and the den variable gets 
	 * this.denominator*test.denominator.
	 * the method returns new Fraction(num,den);
	 */
	public Fraction multiply(Fraction test) {
		if(test == null)
		throw new IllegalArgumentException("Cannot perform math operations on a null fraction object!");
		int num,den;
		num=this.getNum()*test.getNum();
		den=this.getDen()*test.getDen();
		return new Fraction(num,den);
	}
	
	/*
	 *toString creates a simple string that includes the numerator and denominator with / in the middle
	 */
	public String toString() {
		//returns the numerator and denominator with / in the middle
		return this.getNum() + "/" + this.getDen();
	}
	
	/*
	 *realValue returns the result of the division as a decimal number
	 *it casts both numbers as a double then divides them
	 */
	public double realValue() {
		//casts both numbers as a double then divides them
		double thisDecimal = (double)this.getNum() / (double)this.getDen();
		//return the number
		return thisDecimal;
	}
	
}
