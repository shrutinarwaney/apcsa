public class StringTrim {

	public static void main( String [] args ) {
		
		String first = new String( "    In a Hole    in the ground there lived a Hobbit.   " );
		String second = first.trim();
		System.out.println( first );
		System.out.println( second );

	}

}