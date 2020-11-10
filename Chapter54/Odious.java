import java.util.*;

public class Odious {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		System.out.println( "Enter a nonnegative integer: " );
		int value = input.nextInt();

		System.out.println( value + " is " + ( isOdious( value ) ? "odious" : "evil" ) );

	}

	public static boolean isOdious( int value ) {

		int total = 1;
		while( value / 2 != 0 ) {
			total += ( value % 2 );
			value /= 2;
		}

		return total % 2 == 1;

	}


}