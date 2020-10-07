public class SheepHerd {

	public static void main( String [] args ) {
		
		double numOfSheep = 0;
		double power = 1;
		
		for( int i = 0; i < 25; i++ ) {

			numOfSheep = 220 / ( 1.0 + 10 * power );
			System.out.print( "Number of sheep on year " + i + ": " + ( int )numOfSheep ); //Cast it to int because you can't have a part of a sheep
			if( numOfSheep > 80 ) System.out.print( ". Can maintain itself without supervision." );
			power *= 0.85;
			System.out.println(); 

		}

	}

}