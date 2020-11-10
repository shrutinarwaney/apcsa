import java.util.*;

public class PerfectNum {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter upper bound: " );
		int bound = input.nextInt();

		for( int i = 1; i < bound; i++ ) {
			if( isPerfect( i ) ) {
				System.out.println( i );
			}
		}

	}

	public static boolean isPerfect( int num ) {

		int sum = 0;
		for( int i = 1; i <= ( num / 2 ); i++ ) {

			if( num % i == 0 ) {
				sum += i;
			}

		}

		return sum == num;

	}

}