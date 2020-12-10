 import java.io.*;
 import java.util.*;

 public  class Todo {

 	public static void main(String[] args) {
 		
 		Task task;

 		String description = "";
		boolean done;
		int priority;
		Date dueDate;
		String removeDescription;

		int m = 0;
		int d = 0;
		int y = 0;

 		Scanner userInput = new Scanner( System.in );
 		TreeMap< String, Task > taskList;
 		ObjectInputStream in;
 		ObjectOutputSteam outObj;
 		PrintWriter out;

 		final int descriptionLength = 50;

 		try {
 			
 			System.out.println( "What is the name of your data file that has your todo list? (include .dat) " );
 			String fileName = userInput.nextLine();

 			in = new ObjectInputStream( new BufferedInputStream( new FileInputStream( fileName ) ) );

 			taskList = (TreeMap) in.readObject();

 			while( true ) {

 				System.out.print( "\nEnter 1 to add a task, 2 to remove a task, 3 to modify a task, and 4 to clear the list" );
 				int menuOption = userInput.nextInt();

 				switch( menuOption ) {
 				
 					case 1:
 						System.out.print( "Please enter the description of the task you would like to add: " )
 						description = input.nextLine();

 						if( description.length() > descriptionLength ) {
 							throw new IllegalArgumentException();
 						}
 						while( description.length() < descriptionLength ) {
 							description += " ";
 						}

 						System.out.print( "Is this task done? (yes/no)" );
 						if( userInput.nextLine().equals( "yes" ) ) {
 							done = true;
 						}
 						else {
 							done = false;
 						}

 						System.out.print( "\nWhat is the priority? " );
						priority = userInput.nextInt();

 						System.out.print( "\nWhat is the due date year? (####) " );
						y = userInput.nextInt();
						System.out.print( "\nWhat is the due date month? " );
						m = userInput.nextInt();
						System.out.print( "\nWhat due date day? " );
						d = userInput.nextInt();

						Task newTask = new Task( description, done, priority, m, d, y );
						taskList.put( newTask.getDescription(), newTask );

 						break;

 					case 2:
 						System.out.print( "Please enter the description of the task you would like to remove: " );
 						removeDescription = input.nextLine();

 						if( removeDescription.length() > descriptionLength ) {
							throw new IllegalArgumentException();
						}

						while( removeDescription.length() < descriptionLength ) {
							removeDescription = removeDescription + " ";
						}

						taskList.remove( removeDescription );

 						break;
 				
 				}



 			}
 		}

 		catch( IOException e ) {
			System.out.println( "Error" );
		}
		catch( IllegalArgumentException ex ) {
			System.out.println( "Entry must be " + descriptionLength + " or less characters" );
		}
		catch( ClassNotFoundException exe ) {
			System.out.println( "Error" );
		}

 	}

 	public static void display( Task currentTask ) {

 	}

 }