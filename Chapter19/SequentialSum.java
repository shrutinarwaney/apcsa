import java.util.Scanner;

public class SequentialSum {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "Enter N: " );
		int n = input.nextInt();

		int formulaSum = ( n * ( n + 1 ) / 2.0 );

		int sum = 0;

		while( n > 0 ) {
			sum = sum + n;
			n--;
		}

		System.out.println( "Loop Sum = " + sum );
		System.out.println( "Formula Sum = " + formulaSum );

	}

}