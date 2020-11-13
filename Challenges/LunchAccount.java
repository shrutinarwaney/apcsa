public class LunchAccount {
	
	private double balance;
	private static int studentsWhoAddedMoney = 0;
	private int studentID;
	private static int studentIDCount = 0;
	private int timesMoneyAdded = 0; //Make sure each student can get $20 only once
	private int numberOfMeals = 0;
	private double totalSpentOnLunches;


	public LunchAccount() {
		balance = 0;
		this.studentID = 1000 + studentIDCount;
		studentIDCount++; 
	}

	public LunchAccount( int balance ) {
		this.balance = balance;
		if( studentsWhoAddedMoney <= 100 && timesMoneyAdded == 0 ) { 
			this.balance += 20;
			studentsWhoAddedMoney++;
		}
		timesMoneyAdded++;
		this.studentID = 1000 + studentIDCount;
		studentIDCount++; 
	}

	public void setBalance( double balance ) { this.balance = balance; }
	public double getBalance() { return balance; }

	public void addMoney( int moneyAdd ) {
		this.balance += moneyAdd;
		if( studentsWhoAddedMoney <= 100 && timesMoneyAdded == 0 ) { 
			this.balance += 20;
			studentsWhoAddedMoney++; //inside if because first 100 students, not 100 purchases
		}
		timesMoneyAdded++;
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