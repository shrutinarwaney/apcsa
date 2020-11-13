public class LunchAccount {
	
	private double balance;
	private static int studentsWhoAddedMoney = 0;
	private int studentID;
	private static int studentIDCount = 0;
	private boolean moneyAdded = false;
	private int numberOfMeals;
	private double totalSpentOnLunches;


	public LunchAccount() {
		balance = 0;
		this.studentID = 1000 + studentIDCount;
		studentIDCount++; 
		numberOfMeals = 0;
		totalSpentOnLunches = 0;
	}

	public LunchAccount( double balance ) {
		addMoney( balance );
		this.studentID = 1000 + studentIDCount;
		studentIDCount++; 
		numberOfMeals = 0;
		totalSpentOnLunches = 0;
	}

	public void setBalance( double balance ) { this.balance = balance; }
	public double getBalance() { return balance; }

	public int getId() { return studentID; }

	public void addMoney( double moneyAdd ) {
		this.balance += moneyAdd;
		if( studentsWhoAddedMoney <= 100 && !moneyAdded && moneyAdd > 0 ) { 
			this.balance += 20;
			studentsWhoAddedMoney++;
			moneyAdded = true;
		}
	}

	public void purchase( double costOfMeal ) {
		if( canPurchase( costOfMeal ) && costOfMeal > 0 ) {
			balance -= costOfMeal;
			numberOfMeals++;
			totalSpentOnLunches += costOfMeal;
		}
	}

	private boolean canPurchase( double costOfMeal ) {
		return balance >= costOfMeal;
	}

	public String toString() {
		return "Student " + studentID + " has $" + balance + " in their account. \nThey have purchased " + numberOfMeals + " meals and spent a total of $" + totalSpentOnLunches + " on lunches.\n";
	}

}