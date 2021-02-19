public class Exercise1 {
	
	public static void main(String[] args) {
		
		System.out.println( countChar( "XaaaYaaaZaaaYaaaaY", 'Y' ) );
	}

	public static int countChar( String word, char x ) {
        if ( word.length() == 0 ) return 0;
        if ( word.charAt( 0 ) == x ) {
            return 1 + countChar( word.substring( 1 ), x );
        }
        return countChar( word.substring( 1 ), x );
    }

}