public class Tester {
	
	public static void main(String[] args) {
		
		Class_2 example = new Class_2( 2, 3, 4 );
		Class_1 example2 = new Class_2( 5, 6, 7 );

		example.print();
		example2.print();

		example.set( 11, 12, 13 );
		example.print();

	}

}