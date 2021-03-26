//sagokhal - Shraddha Gokhale

package com.LeetCode.Solutions.Fractions;

public class Fraction {

    int numerator;
    int denominator;

    Fraction() {
        this.numerator = 1;
        this.denominator = 1;

    }

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString() {
        String a = Integer.toString(numerator);
        String b = Integer.toString(denominator);
        String c = a + "/" + b;
        return c;

    }

    public double toDecimal() {
        return (double) this.numerator / this.denominator;
    }
	
	/*
	public Fraction add(Fraction f) {
/*		this.numerator = f.numerator;
//		this.denominator = f.denominator;
		if(this.denominator!=0 || f.denominator!=0){
			int factor = findGcd(this.numerator,this.denominator);
			this.numerator = this.numerator/factor;
			this.denominator = this.denominator/factor;
			int factor2 = findGcd(f.numerator,f.denominator);
			f.numerator = f.numerator/factor2;
			f.denominator = f.denominator/factor2;
			int den3 = findGcd(this.denominator,f.denominator);
			den4 = (this.denominator*f.denominator)/den3;
			num1 = this.numerator+f.numerator;
			String s = Integer.toString(num1)+"/"+Integer.toString(den4);
		}
		else{

		}

		return f;


		return null;
	}

	 */

    public Fraction add(Fraction f) {

        Fraction f_clone = new Fraction(f.numerator, f.denominator);
        int factor_1 = this.findGcd(f.numerator, f.denominator);
        f_clone.numerator = f.numerator / factor_1;
        f_clone.denominator = f.denominator / factor_1;
        int factor_2 = this.findGcd(this.numerator, this.denominator);
        this.numerator = this.numerator / factor_2;
        this.denominator = this.denominator / factor_2;
        f_clone.numerator = (f.numerator * this.denominator) + (f.denominator * this.numerator);
        f_clone.denominator = (f.denominator * this.denominator);

        return f_clone;
    }

    public int findGcd(int numerator, int denominator) {
        if (numerator == 0) return 1;
        else if (denominator == 0) return numerator;
        else {
            return findGcd(denominator, numerator % denominator);
        }
    }

}
