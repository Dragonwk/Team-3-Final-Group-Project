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
	 *	The Constructor will check if the numerator is 0 and if
	 *so will set both numerator and denominator to 0	
	 * The constructor will check if both value are negative 
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
		if(numerator==0) {
			this.numerator=numerator;
			this.denominator=numerator;
		}else if((numerator<0)&&(denominator<0)) {
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
	
	public boolean equals(Fraction test) {
		return false;
	}
	
	public int compareTo(Fraction test) {
		return 0;
	}
	
	public Fraction add(Fraction test){
		return null;
	}
	
	public Fraction multiply(Fraction test) {
		return null;
	}
	
	public String toString() {
		return null;
	}
	
	public double realValue() {
		return 0;
	}
	
}
