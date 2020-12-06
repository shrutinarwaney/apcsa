import java.io.*;
import java.util.*;

public class Sum {
	
	public static void main( String [] args ) {
		
		Scanner userInput = new Scanner( System.in );
		System.out.print( "What is the file name? " );

		File file = new File( userInput.nextLine() );
		int sum = 0;

		Scanner in;

		try {
			in = new Scanner( file );
			while( in.hasNextInt() ) {
				sum += in.nextInt();
			}
		}
		catch( Exception e ) {
			e.printStackTrace();
		}
		finally {
			System.out.println( "Sum: " + sum );
		}

	}

}