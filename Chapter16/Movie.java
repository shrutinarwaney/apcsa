import java.util.Scanner;

public class Movie {
   
    public static void main( String [] args ) {
        
        Scanner input = new Scanner( System.in );
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter the time: ");
        int time = input.nextInt();
        double price;
        
        if( ( age >= 13 ) && ( time < 1700 ) ) {
            price = 5.00;
        } 
        else if ( ( age <=13 ) && ( time < 1700 ) ) {
            price = 2.00;
        } 
        else if ( ( age <= 13 ) && ( time >= 1700 ) ) {
            price = 4.00;
        } 
        else {
            price = 8.00;
        }

        System.out.println("Ticket price: " + price);
    
    }

}