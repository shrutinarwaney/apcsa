public class Exercise6 {

	public static void main(String[] args) {
		
		System.out.println( pentagon( 1 ) );
		System.out.println( pentagon( 2 ) );
		System.out.println( pentagon( 3 ) );
		System.out.println( pentagon( 4 ) );
		System.out.println( pentagon( 5 ) );
		System.out.println( pentagon( 6 ) );

	}

	public static int pentagon( int x ) {

		if( x == 1 ) return 1;
		return pentagon( x - 1 ) + (2 * x) + ( x - 2 );

	}

}