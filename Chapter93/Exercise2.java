// Exercise 2 and 3

public class Exercise2 {

	public static void main(String[] args) {
		
		int[] intArray = { 4, 2, 4, 53, 2, 11, 34 };
		System.out.println( sum( intArray ) );

	}

	public static int sum( int[] array ) {
		return sum( array, 0 );
	}

	public static int sum( int[] array, int index ) {

		if( index == array.length ) return 0;
		return array[ index ] + sum( array, index + 1 );

	}

}