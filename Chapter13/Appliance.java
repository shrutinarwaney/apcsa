import java.util.Scanner;

public class Appliance {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		System.out.println( "Enter cost per kilowatt-hour in cents" );
		double cost = input.nextDouble();
		System.out.println( "Enter kilowatt-hours used per year" );
		int hours = input.nextInt();
		System.out.println( "Annual cost: " + cost * hours / 100 );

	}

}