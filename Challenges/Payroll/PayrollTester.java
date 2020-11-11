public class PayrollTester {

	public static void main(String[] args) {
		
		Employee johnDoe = new Employee( "John Doe", "Cashier", 15.0 );
		johnDoe.work( 10 );
		johnDoe.work( 8 );
		johnDoe.work( 10 );

		System.out.println( johnDoe.getCurrentHrs() );
		System.out.println( johnDoe.getTotalHrs() );

		Paycheck firstPaycheck = johnDoe.requestPaycheck();

		System.out.println( firstPaycheck );

		System.out.println( johnDoe.getCurrentHrs() );
		System.out.println( johnDoe.getTotalHrs() );

		johnDoe.work( 10 );
		johnDoe.work( 10 );
		johnDoe.work( 10 );

		System.out.println( johnDoe.getCurrentHrs() );
		System.out.println( johnDoe.getTotalHrs() );

		Paycheck secondPaycheck = johnDoe.requestPaycheck();

		System.out.println( secondPaycheck );



	}

}