import java.util.Scanner;

public class SquareTriangle {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		System.out.print( "Upper limit: " );
		int lim = input.nextInt();

		for( int i = 0; i < lim; i++ ) {

			if( ( Math.sqrt( ( double ) i ) % 1 == 0 ) & triangular( i ) )
				System.out.println( i + " is both square and triangular." );

		}

	}

	public static boolean triangular( int test ) {

		int sum = 0;
		for( int i = 0; sum <= test; i++ ) {

			sum += i;
			if( sum == test ) return true;

		}
		return false;

	}

}