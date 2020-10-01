import java.util.Scanner;

public class InRangeAdder {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Low end of range: " );
		int low = input.nextInt();

		System.out.print( "High end of range: " );
		int high = input.nextInt();
		int data;
		int rangeSum = 0;
		int sum = 0;

		do {
			System.out.print( "Enter data: " );
			data = input.nextInt();

			if( data == 0 ) break;
			if( data >= low && data <= high ) {
				rangeSum += data;
			}
			else {
				sum += data;
			}

		} while( true );

		System.out.println( "Sum of in range values: " + rangeSum );
		System.out.println( "Sum of out of range values: " + sum ); 

	}

}