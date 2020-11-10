import java.util.*;

public class Unlucky {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter a number: " );
		long num = input.nextLong();
		if( isUnlucky( num ) ) {
			System.out.println( num + " is unlucky" );
		}
		else {
			System.out.println( num + " is safe" );
		}
	}

	public static boolean isUnlucky( long num ) {
		String numFinder = String.valueOf( num );
		return numFinder.contains( "13" );
	}

}