public class LunchAccountTester {
	
	public static void main(String[] args) {
		
		LunchAccount bill = new LunchAccount();
		LunchAccount sally = new LunchAccount( 4.50 );
		LunchAccount cheater = new LunchAccount();

		System.out.println( bill ); //1000
		System.out.println( sally ); //1001
		System.out.println( cheater ); //1002

		bill.addMoney( 7.45 ); //should be 27.45
		sally.addMoney( 3.1 ); //should be 27.6 NOT 47.6
		cheater.addMoney( 0 ); //should not add 20

		System.out.println( bill );
		System.out.println( sally );
		System.out.println( cheater );

		bill.purchase( 10.50 );
		bill.purchase( 7.50 );
		sally.purchase( 30 ); //should not be able to purchase - exceeds balance amount
		cheater.purchase( -100 ); //should not work, still be 0

		System.out.println( bill );
		System.out.println( sally );
		System.out.println( cheater );

		LunchAccount[] testingPast100 = new LunchAccount[ 200 ];

		for( int i = 0; i < testingPast100.length; i++ ) {
			testingPast100[ i ] = new LunchAccount( 10.50 );
		}

		System.out.println( testingPast100[ 105 ] ); //#1108, should be $10.50
		System.out.println( testingPast100[ 33 ] );  //#1036, should be $30.5

	}

}