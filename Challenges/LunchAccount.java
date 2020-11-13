public class LunchAccount {
	
	private double balance;
	private static int studentsWhoAddedMoney = 0;
	private int studentID;
	private static int studentIDCount = 0;
	private boolean moneyAdded = false;
	private int numberOfMeals = 0;
	private double totalSpentOnLunches;


	public LunchAccount() {
		balance = 0;
		this.studentID = 1000 + studentIDCount;
		studentIDCount++; 
	}

	public LunchAccount( int balance ) {
		addMoney( balance );
		this.studentID = 1000 + studentIDCount;
		studentIDCount++; 
	}

	public void setBalance( double balance ) { this.balance = balance; }
	public double getBalance() { return balance; }

	public void addMoney( int moneyAdd ) {
		this.balance += moneyAdd;
		if( studentsWhoAddedMoney <= 100 && !moneyAdded ) { 
			this.balance += 20;
			studentsWhoAddedMoney++;
			moneyAdded = true;
		}
	}

	public void purchase( double costOfMeal ) {
		if( canPurchase( costOfMeal ) ) {
			balance -= costOfMeal;
			numberOfMeals++;
			totalSpentOnLunches += costOfMeal;
		}
	}

	private boolean canPurchase( double costOfMeal ) {
		return balance >= costOfMeal;
	}

}