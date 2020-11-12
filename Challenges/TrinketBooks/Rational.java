public class Rational {
	
	private int numerator;
	private int denominator;

	public Rational() {

		numerator = 0;
		denominator = 1;

	}

	public Rational( int numerator, int denominator ) {

		this.numerator = numerator;
		this.denominator = denominator;

	}

	public Rational( int numerator ) {
		this.numerator = numerator;
		this.denominator = 1;
	}

	public void setNum( int numerator ) { this.numerator = numerator; }
	public int getNum() { return numerator; }

	public void setDen( int denominator ) { this.denominator = denominator; }
	public int getDen() { return denominator; }

	public String printRational() {
		return numerator + "/" + denominator;
	}

	public String toString() {
        return numerator + "/" + denominator;
    }

    public void negate() {
        numerator *= -1;
    }

    public void invert() {
        int temp = denominator;
        denominator = numerator;
        numerator = temp;
    }

    public double toDouble() {
        return (double) numerator / (double) denominator;
    }

    private int findGCD( int num1, int num2 ) {
    	int gcd = 1;

    	for( int i = 1; i <= num1 && i <= num2; i++ ) {
            if( num1 % i == 0 && num2 % i == 0 )
                gcd = i;
        }

        return gcd;
    }

    public void reduce() {
    	int gcd = findGCD( numerator, denominator );

    	numerator /= gcd;
    	denominator /= gcd;
    }

    public Rational add( Rational that ) {

    	this.reduce();
    	that.reduce();
    	Rational sum = new Rational( this.getNum() * that.getDen() + that.getNum() * this.getDen() , this.getDen() * that.getDen() );
    	sum.reduce();
    	return sum;

    }


}