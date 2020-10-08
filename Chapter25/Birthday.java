import java.util.Scanner;

public class Birthday {

	public static void main( String [] args ) {
		
		Scanner in = new Scanner( System.in );

		System.out.print( "Number of guests: " );
		int people = in.nextInt();
		double prob = 1;
		String majority = "";

		for( int i = 1; i < people; i++ ) {

			prob *= ( 365.0 - i ) / 365.0;

		}

		System.out.println( "Probability: " + prob * 100 );
		if( prob > 0.5 ) System.out.println( "More than a 50% chance" );

	}

}