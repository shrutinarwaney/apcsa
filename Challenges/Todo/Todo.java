 import java.io.*;
 import java.util.*;

 public  class Todo {

 	public static void main(String[] args) {
 		
 		String taskName;
 		Task task;

 		Scanner userInput = new Scanner( System.in );
 		TreeMap< Integer, Task > taskList;
 		BufferedReader in;
 		PrintWriter out;

 		try {
 			
 			System.out.println( "What is the name of your data file that has your todo list? (include .dat) " );
 			String fileName = userInput.nextLine();

 			in = new ObjectInputStream( new BufferedInputStream( new FileInputStream( fileName ) ) );

 			taskList = (TreeMap) in.readObject();

 			while( true ) {

 				System.out.print( "\n" )

 			}
 		}

 	}

 	public static void display( Task currentTask ) {

 	}

 }