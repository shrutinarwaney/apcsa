public class ComparisonSorts {
	
	public static void main( String[] args ) {
		
		int[] ogData = { 1, 4, 2, 5, 3, 5, 1010, 234, 23445, 32948 };
		int[] otherData = { 3, 2, 4, 5, 6, 7, 4, 2, 1 };

		System.out.println( "Original data set 1" );
		display( ogData );
		System.out.println( "Original data set 2" );
		display( otherData );

		System.out.println( "selectionSort data 1" );
		display( selectionSort( ogData ) );

		System.out.println( "selectionSort data 2" );
		display( selectionSort( otherData ) );

		System.out.println( "insertionSort data 1" );
		display( insertionSort( ogData ) );

		System.out.println( "insertionSort data 2" );
		display( insertionSort( otherData ) );

		System.out.println( "bubbleSort data 1" );
		display( bubbleSort( ogData ) );

		System.out.println( "bubbleSort data 2" );
		display( bubbleSort( otherData ) );

	}

	public static void display( int[] data ) {
		
		for( int n : data ) {
			System.out.print( n + " ");
		}
		System.out.println();
	
	}

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