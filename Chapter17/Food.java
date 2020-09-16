import java.util.Scanner;

public class Food {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "Enter the item: " );
		String name = input.nextLine();
		System.out.print( "Enter the price: " );
		double price = input.nextDouble();
		System.out.print( "Overnight delivery (0==no, 1==yes): " );
		int delivery = input.nextInt();

		double total = price;
		double dPrice = 0;
		if( price < 10 ) { 
			total += 2;
			dPrice += 2;
		}
		if( delivery == 1 ) {
			total += 3;
			dPrice += 3;
		}

		System.out.println( "Invoice:" );
		System.out.println( "\tdelivery" + "\t" + dPrice );
		System.out.println( "\ttotal" + "\t\t" + total );

	}

}