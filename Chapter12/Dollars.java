import java.util.Scanner;

public class Dollars {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "Input the cents: " );
		int cents = input.nextInt();

		System.out.println( "That is " + cents / 100 + " dollars and " + cents % 100 + " cents." );

	}

}