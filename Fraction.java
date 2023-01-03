public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction() {
		numerator = 1;
		denominator = 1;
	}

	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}

	public Fraction add(Fraction fraction1, Fraction fraction2) {
		int denominator2 = fraction2.denominator; 
		int numerator2 = fraction2.numerator;
		int numerator = fraction1.numerator;
		int denominator = fraction1.denominator;
		
		int finalDemoninator;
		int finalNumerator;

		if (denominator == denominator2) {
			finalDemoninator = denominator;
			finalNumerator = numerator + numerator2;

		} else {
			finalNumerator = (numerator * denominator2) + (numerator2 * denominator);
			finalDemoninator = denominator * denominator2;
		}

		return new Fraction(finalNumerator, finalDemoninator);
	}

	public Fraction simplifyFraction(int numerator, int denominator) {
		for (int i = 2; i < (numerator > denominator ? numerator : denominator); i++) {
			if (numerator % i == 0 && denominator % i == 0) {
				numerator /= i;
				denominator /= i;
			}
		}
		return new Fraction(numerator, denominator);
	}
}
