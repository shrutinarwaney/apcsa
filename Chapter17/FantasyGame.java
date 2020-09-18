import java.util.Scanner;

public class FantasyGame {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		System.out.println( "Welcome to Yertle's Quest" );
		System.out.print( "Enter the name of your character: " );
		String name = input.nextLine();
		System.out.print( "Enter strength (1-10): " );
		int strength = input.nextInt();
		System.out.print( "Enter health (1-10): " );
		int health = input.nextInt();
		System.out.print( "Enter luck (1-10): " );
		int luck = input.nextInt();

		if( strength + health + luck > 15 ) {
			System.out.println( "You have give your character too many points!  Default values have been assigned: strength: 5, health: 5, luck: 5" );
			strength = 5;
			luck = 5;
			health = 5;
		}

	}

}