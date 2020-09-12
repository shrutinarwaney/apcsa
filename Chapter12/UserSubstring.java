import java.util.Scanner;

public class UserSubstring {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

		System.out.println( "Enter a string:" );
		String bigString = input.nextLine();
		System.out.print( "Enter beginning index: " );
		int begin = input.nextInt();
		System.out.print( "Enter ending index: " );
		int end = input.nextInt();

		System.out.println( "\nOriginal string: " );
		System.out.println( bigString );
		System.out.println( "\nSubstring: " );
		System.out.println( bigString.substring( begin, end ) );

	}

}