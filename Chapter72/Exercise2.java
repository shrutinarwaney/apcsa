import java.io.*;
import java.util.*;

public class Exercise2 {
	
	public static void main( String [] args ) {
		
		Scanner userInput = new Scanner( System.in );
		System.out.print( "What is the file name? " );
		File file = new File( userInput.nextLine() );
		double sum = 0;
		double sumSQ = 0;
		int counter = 0;
		Scanner in;

		try {
			in = new Scanner( file );
			while( in.hasNextDouble() ) {
				double temp = in.nextDouble();
				sum += temp;
				sumSQ += temp * temp;
				counter++;
			}
		}
		catch( Exception e ) {
			e.printStackTrace();
		}
		finally {
			double avg = sum / counter;
			double avgSQ = sumSQ / counter;
			double variation = avgSQ - ( avg * avg );
			System.out.println( "Avg: " + avg );
			System.out.println( "SD: " + Math.sqrt( variation ) );
		}

	}

}