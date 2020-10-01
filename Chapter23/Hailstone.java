import java.util.Scanner;

public class Hailstone {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		int numSteps = 0;
		System.out.print( "N: " );
		int val = input.nextInt();

		while( val != 1 ) {

			System.out.println( val );
			if( val % 2 == 0 ){ val /= 2;}
			else{ val = 3 * val + 1;}

			numSteps++;

		}
		System.out.println( "To reach 1, it took " + numSteps + " steps" );

	}

}