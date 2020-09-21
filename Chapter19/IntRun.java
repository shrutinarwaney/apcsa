import java.util.Scanner;

public class IntRun {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "Enter Start: " );
		int start = input.nextInt();

		System.out.print( "Enter End: " );
		int end = input.nextInt();
		while( start <= end ) {

			System.out.println( start++ );

		}

	}

}