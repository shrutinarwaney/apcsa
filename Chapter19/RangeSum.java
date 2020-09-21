import java.util.Scanner;

public class RangeSum {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "Enter low: " );
		int low = input.nextInt();
		System.out.print( "Enter high: " );
		int high = input.nextInt();


		int formulaSum = ( high * ( high + 1 ) / 2 ) - ( low * ( low + 1 ) / 2 ) + low;

		int sum = 0;

		while( high >= low ) {
			sum = sum + high;
			high--;
		}

		System.out.println( "Loop Sum = " + sum );
		System.out.println( "Formula Sum = " + formulaSum );

	}

}