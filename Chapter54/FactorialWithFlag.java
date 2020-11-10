import java.util.*;

public class FactorialWithFlag {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter a number: " );
		int num = input.nextInt();

		if( factorial( num ) == -1 ) {
			System.out.println( "Please make sure your output is between 0 and 20" );
		}
		else {
			System.out.println( factorial( num ) );
		}

	}

	public static int factorial( int i ) {
		if( i > 20 || i < 0 ) { return -1; }
		int sum = 1;
		for( int u = 1; u > 1; u-- ) {
			sum *= u;
		}

		return sum;
	}

}