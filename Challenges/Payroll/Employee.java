public class Employee {
	
	private String name;
	private String position;
	private double wage;
	private int id;
	private int currentHrs;
	private int totalHrs;
	private Paycheck pc;

	public Employee( String name, String position, double wage, int id, int currentHrs, int totalHrs ) {

		this.name = name;
		this.position = position;
		this.wage = wage;
		this.id = id;
		this.currentHrs = currentHrs;
		this.totalHrs = totalHrs;

	}

	public void setName( String name ) { this.name = name; }
	public String getName() { return name; }

	public void setPosition( String position ) { this.position = position; }
	public String getPosition() { return position; }

	public void setWage( double wage ) { this.wage = wage; }
	public double getWage() { return wage; }

	public void setId( int id ) { this.id = id; }
	public int getId() { return id; }

	public void setCurrentHrs( int currentHrs ) { this.currentHrs = currentHrs; }
	public int getCurrentHrs() { return currentHrs; }

	public void setTotalHrs( int totalHrs ) { this.totalHrs = totalHrs; }
	public int getTotalHrs() { return totalHrs; }

	public void work( int hours ) {

		this.currentHrs += hours;
		this.totalHrs += hours;

	}

	public Paycheck requestPaycheck() {
		
		pc = new Paycheck( this );
		currentHrs = 0;
		return pc;

	}

}