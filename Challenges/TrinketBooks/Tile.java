public class Tile {

	private char letter;
	private int value;

	public Tile( char letter, int value ) {

		this.letter = letter;
		this.value = value;

	}

	public void setLetter( char letter ) { this.letter = letter; }
	public char getLetter() { return letter; }

	public void setValue( int value ) { this.value = value; }
	public int getValue() { return value; }

	public boolean equals( Tile that ) {
		return this.getLetter() == that.getLetter() && this.getValue() == that.getValue();
	}

	public String toString() {

		return String.format( "%5c %5v", this.getLetter(), this.getValue() );

	}

}