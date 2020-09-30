import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "Enter X: " );
		float x = input.nextFloat();
		System.out.print( "Enter N: " );
		int n = input.nextInt();

		float result = 1;
		int i = 0;
		while( i < n ) {
			result *= x;
			i++;
		}

		System.out.println( x + " raised to the power " + n + " is: " + result ); 

	}

}