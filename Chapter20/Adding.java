import java.util.Scanner;

public class Adding {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		System.out.print( "How many integers will be added: " );
		int num = input.nextInt();

		int i = 0;
		int sum = 0;
		while( i < num ) {
			System.out.print( "Enter an integer: " );
			sum += input.nextInt();
			i++;
		}

		System.out.println( "The sum is " + sum );

	}

}