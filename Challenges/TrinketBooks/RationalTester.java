public class RationalTester {

	public static void main( String [] args ) {
		
		Rational quarter = new Rational( 3, 12 );
		System.out.println( quarter ); // 3/12
		quarter.negate();
		System.out.println( quarter ); // -3/12
		quarter.negate();
		quarter.invert();
		System.out.println( quarter ); // 12/3
		quarter.invert();
		quarter.reduce(); 
		System.out.println( quarter );// 1/4
		Rational sum = quarter.add( new Rational( 4, 12 ) );
		System.out.println( sum ); // 7/12

	}

}