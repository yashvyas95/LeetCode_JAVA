//sagokhal - Shraddha Gokhale
package com.LeetCode.Solutions.Fractions;

import java.time.chrono.MinguoEra;

public class MixedFraction extends Fraction {
    int naturalNumber;


    MixedFraction(int num, int den, int naturalNumber) {
        super(num, den);
        this.naturalNumber = naturalNumber;

    }

    public String toString() {
        String a = Integer.toString(numerator);
        String b = Integer.toString(denominator);
        String c = Integer.toString(this.naturalNumber) + a + "/" + b;
        return c;

    }

    public double toDecimal() {
        return (this.naturalNumber * denominator) + numerator / denominator;
    }

    public Fraction add(MixedFraction f) {

        Fraction f_clone = new MixedFraction(f.numerator, f.denominator, f.naturalNumber);
        f_clone.numerator = (f.denominator * f.naturalNumber) + f.numerator;

        Fraction f2_clone = new MixedFraction(this.numerator, this.denominator, this.naturalNumber);
        f2_clone.numerator = (this.denominator * this.naturalNumber) + this.numerator;
        Fraction f1 = new Fraction(f.numerator, f.denominator);

        Fraction f2 = new Fraction(this.numerator, this.denominator);

        return f1.add(f2);
    }

    public int findGcd(int numerator, int denominator) {
        if (numerator == 0) return 1;
        else if (denominator == 0) return numerator;
        else {
            return findGcd(denominator, numerator % denominator);
        }
    }
}
