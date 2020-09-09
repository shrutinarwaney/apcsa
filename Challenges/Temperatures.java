import java.util.*;

public class Temperatures {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

		int sun;
		int mon;
		int tue;
		int wed;
		int thr;
		int fri;
		int sat;

		try {
			System.out.print( "\nWhat is the temperature on Sunday? " );
			sun = input.nextInt();
			System.out.print( "\nWhat is the temperature on Monday? " );
			mon = input.nextInt();
			System.out.print( "\nWhat is the temperature on Tuesday? " );
			tue = input.nextInt();
			System.out.print( "\nWhat is the temperature on Wednesday? " );
			wed = input.nextInt();
			System.out.print( "\nWhat is the temperature on Thursday? " );
			thr = input.nextInt();
			System.out.print( "\nWhat is the temperature on Friday? " );
			fri = input.nextInt();
			System.out.print( "\nWhat is the temperature on Saturday? " );
			sat = input.nextInt();

			System.out.printf( "\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s \n", "Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat" );
			System.out.printf( "\n%-15d %-15d %-15d %-15d %-15d %-15d %-15d \n", sun, mon, tue, wed, thr, fri, sat );

		}
		catch( InputMismatchException e ) {

			System.out.println( "Oops please enter integers. Round bro." );

		}

	}

}