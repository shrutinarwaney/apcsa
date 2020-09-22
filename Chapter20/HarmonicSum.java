import java.util.Scanner;

public class HarmonicSum {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter n: " );
		int n = input.nextInt();

		int i = 1;
		double sum = 0;
		while( i <= n ) {
			sum += 1.0 / i;
			i++;
		}

		System.out.println( "Sum is: " + sum );

	}

}