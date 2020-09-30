import java.util.Scanner;

public class SquaresAndCubes {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "Upper limit: " );
		int limit = input.nextInt();

		int i = 0;
		long square = 0;
		long cube = 0;

		while( i <= limit ) {

			square += Math.pow( i, 2 );
			cube += Math.pow( i, 3 );
			i++;

		}

		System.out.println( "The sum of squares is " + square + ", and the sum of cubes is " + cube );

	}

}