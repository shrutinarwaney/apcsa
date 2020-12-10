import java.io.*;
import java.util.*;

public class MakeList {

	public static void main(String[] args) {

		ObjectOutputStream out = null;

		try {
			out = new ObjectOutputStream(
			 new BufferedOutputStream(
			 new FileOutputStream( "OGList.dat" ) ));

			// TreeMap< String, Task > tasks = new TreeMap< String, Task >();
		
			TreeMap< Integer, String > tasks = new TreeMap< Integer, String >();
			tasks.put( 1, "hello" );
			Task task1 = new Task( "Make bed                                          ", false, 2, 11, 3, 1980 );
			// tasks.put( task1.getDescription(), task1 );

			// Task task2 = new Task( "Clean Bathroom                                    ", false, 1, 11, 3, 2021 );
			// tasks.put( task2.getDescription(), task2 );

			// Task task3 = new Task( "Clean bedroom                                     ", false, 5, 7, 2, 2021 );
			// tasks.put( task3.getDescription(), task3 );


			out.writeObject( tasks );
			out.close();
		}

		catch( Exception e ) {
			e.printStackTrace();
		}

	}

}