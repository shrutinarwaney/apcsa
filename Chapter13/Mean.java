import java.util.Scanner;

public class Mean {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter X: " );
		double x = input.nextDouble();
		System.out.print( "Enter Y: " );
		double y = input.nextDouble();

		System.out.println( "Arithmetic mean: " + ( x + y ) / 2.0 );
		System.out.println( "Harmonic mean: " + 2.0 / ( ( 1.0 / ( double )x ) + ( 1.0 / ( double )y ) ) );

	}

}