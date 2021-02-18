public class Exercise5 {
	
	public static void main(String[] args) {
		
		System.out.println( pow( 5 ) );
		System.out.println( pow( 6 ) );

	}

	public static int pow( int x ) {

		if( x == 0 ) return 1;
		return 2 * ( pow( x - 1 ) );

	}

}