import java.io.*;
import java.util.*;

public class Exercise2 {
	
	public static void main(String[] args) {
		
		Scanner in;
		Scanner userInput = new Scanner( System.in );
		System.out.print( "File name? " );
		String fileName = userInput.nextLine();
		int counter = 0;

		try {
			in = new Scanner( new File( fileName ) );
			String line = in.nextLine();
			int sum = 0;
			while( in.hasNextLine() ) {
				if( !in.hasNext( "next" ) ) {
					sum += in.nextInt();
				} else {
					counter++;
					System.out.println( "Sum of group " + counter + " is " + sum );
					sum = 0;
					in.next();
				}
			}
			System.out.println( "Sum of group " + (counter + 1) + " is " + sum );
		} catch( Exception e ) {
			e.printStackTrace();
		}

	}

}