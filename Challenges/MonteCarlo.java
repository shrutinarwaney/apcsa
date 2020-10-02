import java.util.Scanner;
import java.util.Random;

public class MonteCarlo {

	public static void main( String [] args v) {
		
		Scanner input = new Scanner( System.in );
		Random rand = new Random();	

		System.out.print( "How many times would you like to run this simulation? " );
		int n = input.nextInt();

		int i = 0;
		int diceOne = rand.nextInt( 6 ) + 1;
		int diceTwo = rand.nextInt( 6 ) + 1;
		int totalSum = 0;
		int instantTurns = 0;
		int totalTurns = 0;
		int fourRolls = 0;

		while( i < n ) { // Run it n times

			instantTurns = 0;

			do {

				totalTurns += 1;
				instantTurns += 1;
				totalSum += ( diceOne + diceTwo );

				diceOne = rand.nextInt( 6 ) + 1;
				diceTwo = rand.nextInt( 6 ) + 1;


			} while( diceOne != 1 && diceTwo != 1 );

			if( instantTurns > 4 ) { fourRolls++; }

			i++;

		}

		System.out.println( "Average number of rolls: " + totalTurns / ( double )n );
		System.out.println( "Average score: " + totalSum / ( double )n );
		System.out.println( "% of plays with more than 4 rolls: " + fourRolls / ( double )n * 100 );

	}

}