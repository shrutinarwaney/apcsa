public class ColorTester {

	public static void main( String [] args ) {
		
		Color redIsh = new Color( 166, 131, 131 );
		Color surpriseMe = new Color();
		
		System.out.println( redIsh.display() );
		System.out.println( surpriseMe.display() );

		redIsh.brighten( 30 );
		surpriseMe.darken( 10 );

		System.out.println( redIsh.display() );
		System.out.println( surpriseMe.display() );
	}

}