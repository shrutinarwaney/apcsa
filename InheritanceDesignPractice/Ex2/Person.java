public class Person {
	
	private String first;
	private String last;

	public Person() {
		first = "John";
		last = "Doe";
	}
	
	public Person( String first, String last ) {
		this.first = first;
		this.last = last;
	}

	public String getFirst() { return first; }
	public String getLast() { return last; }

	public void setName( String first, String last ) {
		this.first = first;
		this.last = last;
	}

	public void printLastFirst() {
		System.out.println( last + ", " + first );
	}

	public void print() {
		System.out.println( first + " " + last );
	}

	public String toString() {
		return first + " " + last;
	}

	public boolean equals( Object obj ) {
		if( obj instanceof Person ) {
			Person p = ( Person ) obj;
			return (p.getFirst().equals( this.first )) && (p.getLast().equals( this.last ));
		}
		return false;
	}

	public Person getCopy() {
		return new Person( first, last );
	}

	public void copy( Person p ) {
		this.first = p.getFirst();
		this.last = p.getLast();
	}

}