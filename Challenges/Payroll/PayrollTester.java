public class PayrollTester {

	public static void main(String[] args) {
		
		Employee johnDoe = new Employee( "John Doe", "Cashier", 15.0 );
		johnDoe.work( 10 );
		johnDoe.work( 8 );
		johnDoe.work( 10 );

		System.out.println( johnDoe );

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

		Employee tk = new Employee( "TK Kim", ":P", 1.0 );

		System.out.println( tk );


	}

}