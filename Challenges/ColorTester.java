public class ColorTester {

	public static void main( String [] args ) {
		
		Color redIsh = new Color( 166, 131, 131 );
		Color surpriseMe = new Color();
		Color fave = new Color( "#efefef" );
		
		System.out.println( redIsh );
		System.out.println( surpriseMe );
		System.out.println( fave );

		redIsh.brighten( 30 );
		surpriseMe.darken( 10 );

		System.out.println( redIsh );
		System.out.println( surpriseMe );
		System.out.println( fave );

		redIsh.setGreen();
		surpriseMe.setBlue( 155 );
		fave.setRed( -10 );

		System.out.println( redIsh );
		System.out.println( surpriseMe );
		System.out.println( fave ); 

		System.out.println( surpriseMe.getGreen() );
		System.out.println( redIsh.getRed() );
		System.out.println( fave.getBlue() );


	}


}