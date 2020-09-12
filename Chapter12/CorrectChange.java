import java.util.Scanner;

public class CorrectChange {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "Input the cents: " );
		int cents = input.nextInt();

		System.out.println( "Your change is: " + cents / 100 + " dollars and " + ( cents % 100 ) / 25 + " quarters and " + ( ( cents % 100 ) % 25) / 10 + " dimes and " + ( ( ( cents % 100 ) % 25) % 10 ) / 5 + " nickels and " + ( ( ( cents % 100 ) % 25) % 10 ) % 5 + " pennies.") ;

	}

}