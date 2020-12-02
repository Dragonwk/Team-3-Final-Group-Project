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
	
	public void reduction(int numerator,int denominator) {
		int gcd=GreatestCommonDivisor(this.numerator,this.denominator);
		this.numerator=numerator/gcd;
		this.denominator=denominator/gcd;
	}
	
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
