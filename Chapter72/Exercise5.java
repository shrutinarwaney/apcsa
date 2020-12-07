import java.io.*;
import java.util.*;

public class Exercise5 {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner( System.in );
		PrintWriter out = null;
		System.out.print( "Name of file: " );
		String fileName = userInput.nextLine();
		Scanner in;

		try {
			out = new PrintWriter( new BufferedWriter( new FileWriter( "ex5_out.txt" ) ) );
			in = new Scanner( new File( fileName ) );
			while( in.hasNext() ) {
				String temp = in.nextLine();
				temp = removeWord( temp, "the" );
				temp = removeWord( temp, "a" );
				temp = removeWord( temp, "an" );
				out.write( temp );
			}

			out.close();
			in.close();
		}
		catch( Exception e ) {
			e.printStackTrace();
		}

	}

	public static String removeWord( String string, String word ) {
		String tempWord = word + " ";
		string = string.replaceAll( tempWord, "" );

		tempWord = " " + word;
		string = string.replaceAll( tempWord, "" );

		return string; 
	}

}