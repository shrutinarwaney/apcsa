public class Date {
	
	private int month;
	private int day;
	private int year;

	public Date() { month = 0; day = 0; year = 0; } 
	public Date( int m, int d, int y ) {
		setMonth( m );
	 	setDay( d );
	 	setYear( y );
	}

	 public void setDate( int m, int d, int y ) {
	 	setMonth( m );
	 	setDay( d );
	 	setYear( y );
	 }

	public String getDate( ) {
		return month + "/" + day + "/" + year;
	}

	public int getMonth() { return month; }
 	public int getDay() { return day; }
 	public int getYear() { return year; }

	protected void setMonth( int m ) {
		if( month >= 1 && month <= 12 ) {
			this.month = m;
		}
		else {
			System.out.println( "Month must be 1-12 " );
		}
	}

	protected void setDay( int d ) {
		int [] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if( d >= 1 && d <= monthDays[ month - 1 ] ) {
			this.day = d;
		}
		else {
			System.out.println( "Day does not exist in the given month " );
		}
	}

	protected void setYear( int y ) {
		if( y >= 1 )
			this.year = y;
		else
			System.out.println( "Not a valid year " );
	}
}