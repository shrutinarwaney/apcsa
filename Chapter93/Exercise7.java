import java.util.Scanner;

public class Exercise7 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		System.out.print( "row: " );
		int row = input.nextInt();

		System.out.print( "col: " );
		int col = input.nextInt();

		System.out.println( tri( row, col ) );
	}

	public static int tri( int row, int col ) {
		if( col == 0 || row == col ) return 1;
		return tri( row - 1, col - 1 ) + tri( row - 1, col );
	}

}