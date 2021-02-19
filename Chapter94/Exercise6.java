public class Exercise6 {
	
	public static void main(String[] args) {
		
		System.out.println( palindrome( "abba" ) );
		System.out.println( palindrome( "abbs" ) );

	}

	public static boolean palindrome( String word ) {
		if( word.length() <= 1 ) return true;
		return word.charAt( 0 ) == word.charAt( word.length() - 1 ) && palindrome( word.substring( 1, word.length() - 1 ) );
	}

}