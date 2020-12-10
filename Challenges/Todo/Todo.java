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

		int m;
		int d;
		int y;

 		Scanner userInput = new Scanner( System.in );
 		TreeMap< String, Task > taskList;
 		ObjectInputStream in;
 		ObjectOutputStream out = null;

 		final int descriptionLength = 50;

 		try {
 			
 			System.out.println( "\nWhat is the name of your data file that has your todo list? (include .dat) " );
 			String fileName = userInput.nextLine();

 			out = new ObjectOutputStream(
			 new BufferedOutputStream(
			 new FileOutputStream( "listOfTasks.dat" ) ));

 			in = new ObjectInputStream( new BufferedInputStream( new FileInputStream( fileName ) ) );

 			taskList = (TreeMap) in.readObject();

 			while( true ) {

 				for( int i = 1; i <= 5; i++ ) {
 					for( Map.Entry currentTask : taskList.entrySet() ) {
							Task t = (Task) currentTask.getValue();
							if( t.getPriority() == i ) {	
								display( t );
							}
						}
 				}

 				System.out.print( "\nEnter 1 to add a task, 2 to remove a task, 3 to modify a task, and 4 to clear the list " );
 				int menuOption = Integer.parseInt( userInput.nextLine() );

 				switch( menuOption ) {
 				
 					case 1:
 						System.out.print( "\nPlease enter the description of the task you would like to add: " );
 						description = userInput.nextLine();

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
						priority = Integer.parseInt( userInput.nextLine() );

 						System.out.print( "\nWhat is the due date year? (####) " );
						y = Integer.parseInt( userInput.nextLine() );
						System.out.print( "\nWhat is the due date month? " );
						m = Integer.parseInt( userInput.nextLine() );
						System.out.print( "\nWhat due date day? " );
						d = Integer.parseInt( userInput.nextLine() );

						Task newTask = new Task( description, done, priority, m, d, y );
						taskList.put( newTask.getDescription(), newTask );

 						break;

 					case 2:
 						System.out.print( "Please enter the description of the task you would like to remove: " );
 						removeDescription = userInput.nextLine();

 						if( removeDescription.length() > descriptionLength ) {
							throw new IllegalArgumentException();
						}

						while( removeDescription.length() < descriptionLength ) {
							removeDescription = removeDescription + " ";
						}

						taskList.remove( removeDescription );

 						break;

 					case 3:
 						System.out.print( "Please enter the description of the task you would like to modify: " );
 						removeDescription = userInput.nextLine();

 						if( removeDescription.length() > descriptionLength ) {
							throw new IllegalArgumentException();
						}

						while( removeDescription.length() < descriptionLength ) {
							removeDescription = removeDescription + " ";
						}

						taskList.remove( removeDescription );


						
						System.out.print( "Please enter the description of the task you would like to add: " );
 						description = userInput.nextLine();

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
						priority = Integer.parseInt( userInput.nextLine() );

 						System.out.print( "\nWhat is the due date year? (####) " );
						y = Integer.parseInt( userInput.nextLine() );
						System.out.print( "\nWhat is the due date month? " );
						m = Integer.parseInt( userInput.nextLine() );
						System.out.print( "\nWhat due date day? " );
						d = Integer.parseInt( userInput.nextLine() );

						newTask = new Task( description, done, priority, m, d, y );
						taskList.put( newTask.getDescription(), newTask );

 						break;

 					case 4:
 						taskList.clear();
 						break;
 				
 				}

 				System.out.print( "\nPlease enter 1 if you would like to continue modifying this list, and 2 if you would like to quit: " );
				switch( Integer.parseInt( userInput.nextLine() ) ) {
					case 1: 
						break;
					case 2:
						out.writeObject( taskList );
						System.exit(0);
						break;

 			}
 		}
 	}

 		catch( IOException e ) {
			System.out.println( "Error IOException" );
		}
		catch( IllegalArgumentException ex ) {
			System.out.println( "Entry must be " + descriptionLength + " or less characters" );
		}
		catch( ClassNotFoundException exe ) {
			System.out.println( "Error ClassNotFoundException" );
		}

 	}

 	public static void display( Task t ) {

		System.out.printf( "%-30s %-30s %-30s %-30s\n", t.getDescription(), t.getDone(), t.getPriority(), t.getDueDate() );

	}

 }