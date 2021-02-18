import java.util.Scanner;
import java.io.*;

public class IO {
	
	public static void main( String [] args ) throws IOException {
		
		System.out.println( "Input/Output example" );

		PrintWriter output - new PrintWriter( "output.md" );

		output.println( "My new data" );
		Dog dog = new Dog( "Spot", "Terrier", 10 );
		output.println( dog );

		// File file;
		// Scanner scan;

		// try {
		// 	file = new File( "data.csv" );
		// 	scan = new Scanner( file );

		// 	String[] letters = scan.nextLine().split(",");

		// 	while( scan.hadsNextLine() ) {
		// 		String[] parameters = scan.nextLine().split(",");

		// 		Dog dog = new Dog( parameters[0], 
		// 							parameters[1], 
		// 							Integer.parseInt(parameters[2]) );

		// 		System.out.println( dog );
		// 	}

		// 	// // for each - front to back 1 by 1
		// 	// for( String letter : letters ) {
		// 	// 	System.out.println( letter );
		// 	// }

		// 	// // standard for loop - changable
		// 	// for( int i = 0; i < letters.length; i++ ) {
		// 	// 	System.out.println( letter );
		// 	// }

		// } catch( FileNotFoundException e ) {
		// 	e.printStackTrace();

		// } finally {
		// 	System.out.println( "Done" );
		// }

	}
}