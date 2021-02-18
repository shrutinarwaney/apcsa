public class Exercise3 {
	
	public static void main( String [] args ) {
		
		System.out.println( square( 5 ) );
		System.out.println( square( 3 ) );
		System.out.println( square( 75 ) );

	}

	public static int square( int x ) {

		if( x == 1 ) return 1;
		return square( x - 1 ) + ( 2 * x ) - 1;

	}

}