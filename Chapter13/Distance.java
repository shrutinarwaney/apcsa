import java.util.Scanner;

public class Distance {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter the number of seconds: " );
		double sec = input.nextDouble();
		System.out.println( "Distance: " + ( sec * sec * 32.174 * 0.5 ) );

	}

}