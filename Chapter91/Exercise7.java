// unclear directions, doing triangle numbers and hoping that's what they want

public class Exercise7 {
	
	public static void main(String[] args) {
		
		System.out.println( triangle( 6 ) );
		System.out.println( triangle( 7 ) );
		System.out.println( triangle( 8 ) );

	}

	public static int triangle( int x ) {
	    if ( x == 1 || x == 0 ) return x;
	    return x + triangle( x - 1 );

	}

}