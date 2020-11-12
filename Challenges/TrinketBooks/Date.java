public class Date {
	
	private int year;
	private int month;
	private int day;

	public Date( int year, int month, int day ) {

		this.year = year;
		this.month = month;
		this.day = day;

	}

	public Date() {
		year = 1960;
		month = 1;
		day = 1;
	}

	public String toString() {
        return month + "/" + day + "/" + year;
    }

}