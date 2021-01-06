public class ArrayPractice {
	
	public static void main(String[] args) {
		
		int[] ogData = { 1, 4, 2, 5, 3, 5, 1010, 234, 23445, 32948 };
		int[] otherData = { 3, 2, 4, 5, 6, 7, 4, 2, 1 };

		System.out.println( "swapEnds" );
		display( swapEnds( ogData ) );

		System.out.println( "\n" );
		
		System.out.println( "hasSeven?" );
		System.out.println( hasSeven( ogData ) );

		System.out.println( "\n" );

		System.out.println( "hasSeven? should be true" );
		System.out.println( hasSeven( otherData ) );

		System.out.println( "\n" );
		
		System.out.println( "mean: " );
		System.out.println( mean( ogData ) );

		System.out.println( "\n" );

		System.out.println( "reverse" );
		display( reverse( ogData ) );

		System.out.println( "\n" );

	}

	public static int[] swapEnds( int[] data ) {

		int[] newArray = new int[ data.length ];
		newArray[ 0 ] = data[ data.length - 1 ];
		newArray[ newArray.length - 1 ] = data[ 0 ];
		for( int i = 1; i < data.length - 1; i++ ) {
			newArray[ i ] = data[ i ];
		}

		return newArray;

	}

	public static boolean hasSeven( int[] data ) {

		for( int x : data ) {
			if( x == 7 ) return true;
		}
		return false;

	}

	public static double mean( int[] data ) {

		double sum = 0;
		for( int x : data ) { sum += x; }
		return sum / ( double ) data.length;
	}

	public static int[] reverse( int[] data ) {

		int[] revArray = new int[ data.length ];
	
		int reverseCounter = data.length - 1;
		for( int i = 0; i < data.length; i++ ) {
			revArray[ reverseCounter ] = data[ i ];
			reverseCounter--;
		}

		return revArray;

	}

	public static void display( int[] data ) {
		for( int n : data ) {
			System.out.print( n + ", ");
		}
	}

}