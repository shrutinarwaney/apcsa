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

	public Task( String description, boolean done, String date ) {

		this.description = description;
		this.done = done;
		this.priority = priority;
		dueDate.setDate( m, d, y );

	}

	public void setDescription( String description ) { this.description = description; }
	public String getDescription() { return description; }

	public void setArtist( String artist ) { this.artist = artist; }
	public String getArtist() { return artist; }

	public void setGenre( String genre ) { this.genre = genre; }
	public String getGenre() { return genre; }

	public void setDueDate( int m, int d, int y ) {
		dueDate.setDate( m, d, y );
	}
	public String getDueDate() {
		 return dueDate.getDate();
	}

}