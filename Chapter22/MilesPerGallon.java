import java.util.Scanner;

public class MilesPerGallon {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		double init;
		double fin;
		double gallons;
		boolean keepGoing = true;

		while( keepGoing ){
			System.out.print( "Initial miles: " );
			init = input.nextDouble();

			if( init < 0 ) {
				System.out.println( "bye" );
				break;
			}

			System.out.print( "Final miles: " );
			fin = input.nextDouble();

			System.out.print( "Gallons: " );
			gallons = input.nextDouble();

			System.out.println( "Miles per gallon: " + ( fin - init ) / gallons + "\n" );

		}

	}

}