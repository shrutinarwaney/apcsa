import java.util.Scanner;

public class DrugPotency {

	public static void main( String [] args ) {
		
		double effectiveness = 100;
		int month = 0;
		while( effectiveness > 50 ) {

			System.out.print( "\nMonth: " + month + "\tEffectiveness: " + effectiveness );
			month++;
			effectiveness *= 0.96;

		}

		System.out.println( "\nMonth: " + month + "\tEffectiveness: " + effectiveness + " DISCARDED\n" );

	}

}