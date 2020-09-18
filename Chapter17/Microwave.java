import java.util.Scanner;

public class Microwave {

	public static void main( String [] args ) {
		System.out.println( "Hello" );
		Scanner in = new Scanner( System.in );
		int newMinutes;
		int newSeconds;
		
		System.out.print( "How many items to heat: " );
		int items = in.nextInt();
		System.out.print( "Time for one item: " );
		int oGTime = in.nextInt();

		int minutes = oGTime / 100;
		int seconds = oGTime % 100;

		int totalSeconds = (int)( 60 * minutes ) + seconds;
		if( items == 1 ) {
			System.out.println( "Heat for " + minutes + " minutes " + seconds + " seconds" );
		}
		else if( items == 2 ) {
			totalSeconds = totalSeconds + totalSeconds/2;
			System.out.println( "Heat for " + totalSeconds / 60 + " minutes " + totalSeconds % 60 + " seconds" );
		}
		else if( items == 3 ) {
			totalSeconds = totalSeconds * 2;
			System.out.println( "Heat for " + totalSeconds / 60 + " minutes " + totalSeconds % 60 + " seconds" );
		}

	}

}