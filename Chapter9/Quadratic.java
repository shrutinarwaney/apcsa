import java.util.*;

public class Quadratic {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		System.out.println( "Equation is 3x2 - 8x + 4." );
		System.out.print( "What is the value of x? " );

		double x = input.nextDouble();
		double result = ( ( 3 * Math.pow( x, 2 ) ) - ( 8 * x ) + 4 );
		System.out.println( "Value is " + result );

	}

}