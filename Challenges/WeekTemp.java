import java.util.*;

public class WeekTemp {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		int [] temps = new int[ 7 ];

		try {
			System.out.print( "\nWhat is the temperature on Sunday? " );
			temps[ 0 ] = input.nextInt();
			System.out.print( "\nWhat is the temperature on Monday? " );
			temps[ 1 ] = input.nextInt();
			System.out.print( "\nWhat is the temperature on Tuesday? " );
			temps[ 2 ] = input.nextInt();
			System.out.print( "\nWhat is the temperature on Wednesday? " );
			temps[ 3 ] = input.nextInt();
			System.out.print( "\nWhat is the temperature on Thursday? " );
			temps[ 4 ] = input.nextInt();
			System.out.print( "\nWhat is the temperature on Friday? " );
			temps[ 5 ] = input.nextInt();
			System.out.print( "\nWhat is the temperature on Saturday? " );
			temps[ 6 ] = input.nextInt();

			System.out.printf( "\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s \n", "Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat" );
			System.out.printf( "\n%-15d %-15d %-15d %-15d %-15d %-15d %-15d \n", temps[ 0 ], temps[ 1 ], temps[ 2 ], temps[ 3 ], temps[ 4 ], temps[ 5 ], temps[ 6 ] );
			
			double average = ( temps[ 0 ] + temps[ 1 ] + temps[ 2 ] + temps[ 3 ] + temps[ 4 ] + temps[ 5 ] + temps[ 6 ]) / 7.0;

			System.out.println( "Average: " + average );

		}
		catch( InputMismatchException e ) {

			System.out.println( "Oops please enter integers. Round bro." );

		}

	}

}