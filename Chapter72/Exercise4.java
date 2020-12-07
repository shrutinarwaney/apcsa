import java.io.*;
import java.util.*;

public class Exercise4 {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner( System.in );

		int yTotal = 0;
		int xTotal = 0;

		try {
			System.out.print( "What is the file name? " );
			Scanner in = new Scanner( new File( userInput.nextLine() ) );
			while( in.hasNext() ) {
				if( in.hasNext( "x=" ) ) {
					in.next();
					xTotal += in.nextInt();
				} 
				else {
					in.next();
					yTotal += in.nextInt();
				}
			}

			System.out.println( "x: " + xTotal );
			System.out.println( "y: " + yTotal );
		}
		catch( Exception e ) {
			e.printStackTrace();
		}

	}

}