import java.util.Scanner;

public class SumOfOdds {
	
	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		System.out.print( "N: " );
		int n = input.nextInt();
		int sum = 0;
		int square = n * n;

		for( int i = 1; i < n; i += 2 ) {
			sum += i;
		}

		System.out.println( "Sum of odds: " + sum );
		System.out.println( "Square: " + square );
	}

}