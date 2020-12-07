import java.io.*;
import java.util.*;

public class Exercise6 {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner( System.in );
		System.out.print( "What is the file name? " );
		String fileName = userInput.nextLine();
		PrintWriter out = null;
		Scanner in = null;

		try {
			in = new Scanner( new File( fileName ) );
			out = new PrintWriter( new BufferedWriter( new FileWriter( "ex6out.txt" ) ) );
			while( in.hasNext() ) {
				String temp = in.next();
				if( temp.lastIndexOf( '@' ) + 1 < temp.lastIndexOf( '.' ) ) {
					out.write( temp + "\n" );
				}
			}
			out.close();
		}
		catch( Exception e ) {
			e.printStackTrace();
		}

	}

}