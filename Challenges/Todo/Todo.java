 import java.io.*;
 import java.util.*;

 public  class Todo {

 	public static void main(String[] args) {
 		
 		String taskName;
 		Task task;

 		Scanner userInput = new Scanner( System.in );
 		TreeMap< Integer, Task > taskList;
 		ObjectInputStream in;
 		ObjectOutputSteam outObj;
 		PrintWriter out;


 		try {
 			
 			System.out.println( "What is the name of your data file that has your todo list? (include .dat) " );
 			String fileName = userInput.nextLine();

 			in = new ObjectInputStream( new BufferedInputStream( new FileInputStream( fileName ) ) );

 			taskList = (TreeMap) in.readObject();

 			while( true ) {

 				System.out.print( "\nEnter 1 to add a task, 2 to modify a task, and 3 to clear the list" );
 				int menuOption = userInput.nextInt();

 				switch( menuOption ) {
 					case
 				}

 			}
 		}

 	}

 	public static void display( Task currentTask ) {

 	}

 }