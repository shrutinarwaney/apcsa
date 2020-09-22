import java.util.Scanner;

public class DotWords {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter first word: " );
		String first = input.nextLine();
		System.out.print( "Enter second word: " );
		String second = input.nextLine();

		while( first.length() + second.length() < 30 ) {
			first += ".";
		}
		System.out.println( first + second );

	}

}