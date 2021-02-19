public class Exercise5 {
	
	public static void main(String[] args) {
		
		System.out.println( leastRes( 20, 9 ) );

	}

	public static int leastRes( int a, int m ) {
		if( a > 0 && a < m ) return a;
		if( a >= m ) return leastRes( a - m, m );
		if( a > 0 ) return leastRes( a + m, m );
		return 0;
	}

}