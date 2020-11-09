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
		this.amountPayed = 0.85 * ( wage * currentHrs );

		if( currentHrs > 100 || amountPayed > 1500 ) erroneous = true;
		else erroneous = false;
	}

	public String toString() {
		return String.format(  )
	}

}