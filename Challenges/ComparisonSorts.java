import java.util.Random;

public class ComparisonSorts {

	public static Random random = new Random();
	public static final int NUM_TESTS = 10000;
	public static final int TEST_DATA_SIZE = 10;
	public static final int RANDOM_RANGE = 100;
	
	public static void main( String[] args ) {
		
		// int[] ogData = { 1, 4, 2, 5, 3, 5, 1010, 234, 23445, 32948 };
		// int[] otherData = { 3, 2, 4, 5, 6, 7, 4, 2, 1 };

		// System.out.println( "Original data set 1" );
		// display( ogData );
		// System.out.println( "Original data set 2" );
		// display( otherData );

		// System.out.println( "selectionSort data 1" );
		// display( selectionSort( ogData ) );

		// System.out.println( "selectionSort data 2" );
		// display( selectionSort( otherData ) );

		// System.out.println( "insertionSort data 1" );
		// display( insertionSort( ogData ) );

		// System.out.println( "insertionSort data 2" );
		// display( insertionSort( otherData ) );

		// System.out.println( "bubbleSort data 1" );
		// display( bubbleSort( ogData ) );

		// System.out.println( "bubbleSort data 2" );
		// display( bubbleSort( otherData ) );

		testSort( "selection", NUM_TESTS );
		testSort( "insertion", NUM_TESTS );
		testSort( "bubble", NUM_TESTS );

	}

	public static void testSort( String method, int times ) {

		for( int test = 0; test < times; test++ ) {

			int[] data = createTestData( TEST_DATA_SIZE );
			int[] orig = duplicate( data );

			sortUsing( data, method );

			if( !isSortedAsc( data ) ) {
				printSortErrorMessage( method, data, orig );
				return;
			}

		}

		System.out.println( "All tests sorted correctly for " + method + "\n" );

	}

	public static void sortUsing( int[] data, String method ) {

		if( method.toLowerCase().equals( "selection" ) ) {
			selectionSort(data);
		} else if( method.toLowerCase().equals( "insertion" ) ) {
			insertionSort( data );
		} else {
			bubbleSort( data );
		}

	}

	public static void printSortErrorMessage( String method, int[] data, int[] orig ) {
		System.out.println( "Error, during " + method );
		System.out.println( "Original data: " );
		print( orig );
		System.out.println( "After sorting; " );
		print( data );
		System.out.println();
	}

	public static int[] createTestData( int amount ) {
		int[] data = new int[ amount ];
		for( int i = 0; i < data.length; i++ ) {
			data[ i ] = random.nextInt( RANDOM_RANGE );
		}
		return data;
	}

	public static int[] duplicate( int[] data ) {
		int[] dup = new int[ data.length ];
		for( int i = 0; i < data.length; i++ ) {
			dup[ i ] = data[ i ];
		}
		return dup;
	}

	public static void print( int[] data ) {
		System.out.print( "[" );
		for( int i = 0; i < data.length; i++ ) {
			System.out.print( data[ i ] );
			if( i < data.length - 1 ) {
				System.out.print( "," );
			}
		}
		System.out.print( "]\n" );
	}

	public static boolean isSortedAsc( int[] data ) {
		for( int i = 0; i < data.length - 1; i++ ) {
			if( data[ i + 1 ] < data[ i ] ) {
				return false;
			}
		}

		return true;
	}

	// public static void display( int[] data ) {
		
	// 	for( int n : data ) {
	// 		System.out.print( n + " ");
	// 	}
	// 	System.out.println();
	
	// }

	public static int[] selectionSort( int[] data ) {

		for( int i = 0; i < data.length - 1; i++ ) {

			int lowIndex = i;
			for( int j = i + 1; j < data.length; j++ ) {
				if (data[ j ] < data[ lowIndex ] ) {  
                    lowIndex = j;
                }
			}

			int small = data[ lowIndex ];
			data[ lowIndex ] = data[ i ];
			data[ i ] = small;

		}

		return data;

	}

	public static int[] insertionSort( int[] data ) {

		for( int i = 1; i < data.length; i++ ) {

			int current = data[ i ];
			int j = i - 1;

			while( j >= 0 && data[ j ] > current ) {
				data[ j + 1 ] = data[ j ]; 
                j--; 
			}

			data[ j + 1 ] = current;

		}

		return data;

	}

	public static int[] bubbleSort( int[] data ) {

		for( int i = 0; i < data.length - 1; i++ ) {

			for( int j = 0; j < data.length - i - 1; j++ ) {
				
				if( data[ j ] > data[ j + 1 ] ) {
					
					int temp = data[ j ]; 
                    data[ j ] = data[ j + 1 ]; 
                    data[ j + 1 ] = temp; 
				
				}
			}

		}

		return data;

	}

}