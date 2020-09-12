import java.util.Scanner;

public class Log2 {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter a double: " );
		double x = input.nextDouble();

		System.out.println( "Base 2 log of " + x + " is " + ( Math.log( x ) / Math.log( 2 ) ) );

	}

}