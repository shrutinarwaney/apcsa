import java.io.*;
 import java.util.*;

public class Task implements Serializable {
	
	String description;
	boolean done;
	int priority;
	Date dueDate;

	public Task() {

		description = "";
		done = false;
		priority = 3;
		dueDate = new Date();

	}

	public Task( String description, boolean done, int priority, int m, int d, int y ) {

		this.description = description;
		this.done = done;
		this.priority = priority;
		dueDate.setDate( m, d, y );

	}

	public void setDescription( String description ) { this.description = description; }
	public String getDescription() { return description; }

	public void setDone( boolean done ) { this.done = done; }
	public boolean getDone() { return done; }

	public void setPriority( int priority ) { this.priority = priority; }
	public int getPriority() { return priority; }

	public void setDueDate( int m, int d, int y ) {
		dueDate.setDate( m, d, y );
	}
	public String getDueDate() {
		 return dueDate.getDate();
	}

}