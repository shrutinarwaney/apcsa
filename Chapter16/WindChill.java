import java.util.Scanner;
import java.lang.Math;

public class WindChill {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "Enter Wind Speed: " );
		int v = input.nextInt();
		System.out.print( "Enter Temperature: " );
		int temp = input.nextInt();
		
		double windChill = ( v < 3 || temp > 50 ) ? temp : 35.74 + ( 0.6215 * temp ) - ( 35.75 * Math.pow( v, 0.16 ) ) + ( 0.4275 * temp * Math.pow( v, 0.16 ) );

		System.out.println( "Wind Chill: " + windChill );

	}

}