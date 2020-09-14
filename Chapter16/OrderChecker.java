import java.util.Scanner;

public class OrderChecker {

	public static void main( String [] args ) {
			
		Scanner input = new Scanner( System.in );
		final int boltPrice = 5;
		final int nutPrice = 5;
		final int washerPrice = 1;

		System.out.print( "Number of bolts: " );
		int bolts = input.nextInt();

		System.out.print( "Number of nuts: " );
		int nuts = input.nextInt();

		System.out.print( "Number of washers: " );
		int washers = input.nextInt();

		if( nuts < bolts && ( 2 * washers ) < bolts ) {
			System.out.println( "Check the order: too few nuts" );
			System.out.println( "Check the order: too few washers" );
		}
		else if( nuts < bolts ) {
			System.out.println( "Check the order: too few nuts" );
		}
		else if( ( 2 * washers ) < bolts ) {
			System.out.println( "Check the order: too few washers" );
		}
		else{
			System.out.println( "Total cost: " + ( boltPrice * bolts ) + ( nutPrice * nuts ) + ( washerPrice * washers ) );
		}

	}

}