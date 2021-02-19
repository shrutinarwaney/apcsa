public class Exercise4 {

	public static void main(String[] args) {
		
		int[] intArray = { 4, 2, 4, 53, 2, 11, 34 };
		System.out.println( maximum( intArray, intArray.length ) );

	}

	public static int maximum(int[] array, int n) { 
      if( n == 1 ) return array[0]; 
          
       return Math.max( array[ n - 1 ], maximum( array, n - 1 ) ); 
    }

}