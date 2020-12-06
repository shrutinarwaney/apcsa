import java.io.*;
import java.util.*;

public class Exercise3 {
	
	public static void main(String[] args) {
		
		Scanner in = null;
		PrintWriter outNeg = null;
		PrintWriter outPos = null;
		Scanner userInput = new Scanner( System.in );

		System.out.print( "File with the numbers: " );
		String numFile = userInput.nextLine();
		System.out.print( "Positive number file: " );
		String posFile = userInput.nextLine();
		System.out.print( "Negative number file: " );
		String negFile = userInput.nextLine();

		try {
			in = new Scanner( new File( numFile ) );
			outNeg = new PrintWriter( new BufferedWriter( new FileWriter( negFile ) ) );
			outPos = new PrintWriter( new BufferedWriter( new FileWriter( posFile ) ) );

			while( in.hasNextInt() ) {
				int num = in.nextInt();
				if( num < 0 ) {
					outNeg.write( "" + num + "\n" );
				} 
				else {
					outPos.write( "" + num + "\n" );
				}
			}

			outPos.close();
			outNeg.close();
		} 
		catch( Exception e ) {
			e.printStackTrace();
		}

	}

}