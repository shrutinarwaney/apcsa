public class Exercise4 {
	
	public static void main(String[] args) {
		
		System.out.println( log( 32 ) );
		System.out.println( log( 48 ) );

	}

	// Prompt says to only use integer math
	public static int log( int x ) {
		if( x == 1 ) return 0;
		return 1 + log( x / 2 );
	} 

}