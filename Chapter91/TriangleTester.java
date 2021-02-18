// Exercise 1 and 2

import java.util.Scanner;

public class TriangleTester
{
  public static void main ( String[] args)
  {
    
  	Scanner input = new Scanner( System.in );
  	System.out.print( "Enter the number: " );
  	int x = input.nextInt();

  	if( x > 0 ) {
  		// TriangleCalc tri = new TriangleCalc();
    	// int result = tri.Triangle( x );
    	int result = triangle( x );
   		System.out.println("Triangle(" + x + ") is " + result );
  	} else {
  		System.out.println( "Please enter a positive num" );
  	}

  }

  public static int triangle( int N )
  {
    if ( N == 1 )
      return 1;
    else
      return N + triangle( N-1 );
  }
}