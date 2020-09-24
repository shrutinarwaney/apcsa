import java.util.Scanner;

public class AverageStandard {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		System.out.print( "How many numbers: " );
		// int num = input.nextInt();
		double [] numArray = new double [ input.nextInt() ];
		double [] diff = new double[ numArray.length ];

		int x = 0;
		while( x < numArray.length ) {
			System.out.print( "What is your " + ( x + 1 ) + " number? " );
			numArray[ x ] = input.nextDouble();
			x++;
		}

		double mean = 0;
		for( int i = 0; i < numArray.length; i++ ) {
			mean += numArray[ i ];
		}
		mean = mean / numArray.length;
		System.out.println( "Mean is " + mean );
		double diffSum = 0;

		for( int i = 0; i < numArray.length; i++ ) {
			diff[ i ] = Math.pow( ( double )( numArray[ i ] - mean ), 2 );
			diffSum += diff[ i ];
		}

		diffSum = Math.sqrt( diffSum / numArray.length );


		System.out.println( "Standard Deviation: " + diffSum );

	}

}