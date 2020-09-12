import java.util.Scanner;

public class CircleArea {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "Input the radius: " );
		int radius = input.nextInt();
		System.out.println( "The radius is: " + radius + " The area is: "  + ( radius * radius * Math.PI ) );

	}

}