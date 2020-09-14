import java.util.Scanner;

public class Discount {

	public static void main( String [] args ) {
			
		Scanner input = new Scanner( System.in );

		System.out.print( "Enter amount of purchases: " );
		int amount = input.nextInt();
		if( amount > 1000 ) { System.out.println( "Discounted price: " + ( int )( 0.9 * amount ) ); }
		else { System.out.println( "No discount. Amount: " + amount ); }

	}

}