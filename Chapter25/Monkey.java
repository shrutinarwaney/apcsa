public class Monkey {

	public static void main( String [] args ) {
		
		String num = "";
		for( int i = 5; i > 0; i-- ) {

			switch( i ) {

				case 5:
					System.out.print( "Five" );
					break;
				case 4:
					System.out.print( "Four" );
					break;
				case 3:
					System.out.print( "Three" );
					break;
				case 2:
					System.out.print( "Two" );
					break;
				case 1:
					System.out.print( "One" );
					break;

			}

			System.out.println( " little monkeys swinging in a tree" );
			System.out.println( "Teasing Mr Crocodile \"you can't catch me\"" );
			System.out.println( "Along came the crocodile as quiet as can be" );
			System.out.println( "and SNAP!\n\n" );

		}

		System.out.println( "No little monkeys swinging in a tree\nNo little monkeys swinging in a tree" );

	}

}