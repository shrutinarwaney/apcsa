public class Paycheck {

	private Employee current;
	private int currentHrs;
	private double amountPayed;
	private double wage;
	private boolean erroneous;

	public Paycheck( Employee current ) {
		this.current = current;
		this.currentHrs = current.getCurrentHrs();
		this.wage = current.getWage();

		if( currentHrs > 100 || amountPayed > 1500 ) erroneous = true;
		else erroneous = false;

		if( erroneous ) amountPayed = 0;
		else {
			this.amountPayed = 0.85 * ( wage * currentHrs );
		}
	}

	public void setEmployee( Employee current ) {
		this.current = current;
		this.currentHrs = current.getCurrentHrs();
		this.wage = current.getWage();
		
	}

	public Employee getEmployee() { return Employee; }


	public String toString() {
		return current.getName() + " was paid " + amountPayed;
	}

}