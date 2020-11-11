public class TileTester {

	public static void main( String [] args ) {
		
		Tile z10 = new Tile( 'z', 10 );
		printTile( z10 );

	}

	public static void printTile( Tile tile ) {

		System.out.printf( "%5s %5d\n", tile.getLetter(), tile.getValue() );

	}

}