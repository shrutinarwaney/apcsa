import java.util.Scanner;
import java.util.Random;

public class MultiplicationQuiz {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		Random rand = new Random();

		int num1;
		int num2;
		int correct = 0;
		int i = 0;

		while( i < 10 ) {
			num1 = rand.nextInt( 9 ) + 1;
			num2 = rand.nextInt( 9 ) + 1;
		
			System.out.print( "What is " + num1 + " * " + num2 + "? " );
			
			if( ( num1 * num2 ) == input.nextDouble() ) {
				System.out.println( "Right!" );
				correct++;
			}
			else {
				System.out.println( "wrong. " + num1 + " * " + num2 + " is " + num1 * num2 );
			}
			i++;
		
		}

		System.out.println( "You got " + correct + " out of 10 questions correct!" );


	}

}