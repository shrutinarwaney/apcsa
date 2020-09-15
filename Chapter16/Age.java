import java.util.Scanner;

public class Age {

	public static void main( String [] args ) {
		
		final int [] months = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		long lifetime = 2500000000L;
		
		Scanner input = new Scanner( System.in );

		System.out.print( "How many years old are you? " );
		int years = input.nextInt();

		int yearsToDays = years * 365;

		System.out.print( "How many months? " );
		int month = input.nextInt();
		
		int monthsToDays = 0;
		for( int i = 0; i < month; i++ ) {
			monthsToDays = monthsToDays + months[ i ];
		}

		System.out.print( "How many days? " );
		int days = input.nextInt();

		int secs = 86400 * ( yearsToDays + monthsToDays + days );
		double percent = ( double )secs / lifetime;
		System.out.println( "You are " + secs + " seconds old" );
		System.out.println( "You have lived " + percent * 100 + "% of your life" );


	}

}