import java.util.Scanner;

public class SumOfDivisors {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "N: " );
		int n = input.nextInt();
		int sum = 0;

		for( int i = 1; i < n; i++ ) {
			if( n % i == 0 ) sum += i;
		}

		System.out.println( "Sum of divisors: " + sum );
		if( n == sum ) System.out.println( "Perfect Number" );

	}

}