import java.util.Scanner;

public class Ohm {

	public static void main( String [] args ) {
		Scanner input = new Scanner( System.in );

		System.out.print( "Enter the voltage: " );
		int v = input.nextInt();
		System.out.print( "Enter the resistance: " );
		int r = input.nextInt();
		System.out.println( "Current: " + ( v + 0.0 ) / r + " amps");

	}

}