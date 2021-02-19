public class Exercise2 {
	
	public static void main(String[] args) {
		
		System.out.println( removeVowels( "counterrevolutionaries" ) );
		System.out.println( removeVowels( "AUDIOBOOK" ) );

	}

	public static String removeVowels(String s) {
	    if ( s.length() == 0 ) return s;
	    char c = s.charAt( 0 );
	    if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
	        return removeVowels( s.substring( 1 ) );
	    } else {
	        return c + removeVowels( s.substring( 1 ) );
	    }
	}

}