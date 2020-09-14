import java.util.Scanner;

public class Pie {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "Enter pie weight: " );
		int weight = input.nextInt();

		String result = ( weight > 220 && weight < 280 ) ? "Within weight" : "Not within weight";
		System.out.println( result );

	}

}