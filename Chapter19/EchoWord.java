import java.util.Scanner;

public class EchoWord {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "Enter a word: " );
		String word = input.nextLine();

		int i = 0;
		while( i < word.length() ) {

			System.out.println( word );
			i++;

		}

	}

}