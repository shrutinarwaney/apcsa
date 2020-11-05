import java.util.Random;

public class Color {

	private int red;
	private int green;
	private int blue;
	Random rand = new Random();

	public Color() {

		red = rand.nextInt( 256 );
		green = rand.nextInt( 256 );
		blue = rand.nextInt( 256 );

	}

	public Color( int red, int green, int blue ) {

		this.red = red;
		this.green = green;
		this.blue = blue;

	}

	public Color( String hex ) {
		// include the # sign

		red = Integer.parseInt( hex.substring( 1, 3 ), 16 );
		green = Integer.parseInt( hex.substring( 3, 5 ), 16 );
		blue = Integer.parseInt( hex.substring( 5 ), 16 );

	}

	public void setRed( int red ) { 
		this.red = red; 
		clampNum();
	}
	public void setRed() { red = rand.nextInt( 256 ); }
	public int getRed() { return red; }

	public void setGreen( int green ) { 
		this.green = green; 
		clampNum();
	}
	public void setGreen() { green = rand.nextInt( 256 ); }
	public int getGreen() { return green; }

	public void setBlue( int blue ) { 
		this.blue = blue;
		clampNum();
	}
	public void setBlue() { blue = rand.nextInt( 256 ); }
	public int getBlue() { return blue; }

	public void brighten( double percent ) {
		
		red *= ( 1 + ( ( double )percent / 100 ) );
		green *= ( 1 + ( ( double )percent / 100 ) );
		blue *= ( 1 + ( ( double )percent / 100 ) );
		clampNum();

	}

	public void darken( double percent ) {
		red *= ( double )percent / 100;
		green *= ( double )percent / 100;
		blue *= ( double )percent / 100;
		clampNum();
	}

	public String toString() {
		return "[" + red + ", " + green + ", " + blue + "]";
	}

	private void clampNum( int color ) {
		if( red > 255 ) red = 255;
		if( red < 0 ) red = 0;
		if( green > 255 ) green = 255;
		if( green < 0 ) red = 0;
		if( blue > 255 ) blue = 255;
		if( blue < 0 ) blue = 0; 
	}


}