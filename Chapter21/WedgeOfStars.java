import java.util.Scanner;

public class WedgeOfStars {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "Initial number of stars: " );
		int stars = input.nextInt();

		while( stars > 0 ) {

			int i = 0;
			
			while( i < stars ) {

				System.out.print( "*" );
				i++;

			}
			
			System.out.println();
			stars--;

		}

	}

}