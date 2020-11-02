import java.util.Scanner;

public class PantryTester
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner( System.in );
    int type;
    int amount;

    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    Pantry hubbard = new Pantry( goose, apple, rhub );

    while( true ) {
      
      System.out.println( "Welcome to Mother Hubbard's Pantry!\n" );
      
      
      System.out.println( hubbard );
      System.out.println( "Enter your selection (1, 2, or 3): " );
      type = input.nextInt();
      if( type == -1 ) break;

      System.out.println( "Enter amount to spread: " );
      amount = input.nextInt();

      hubbard.select( type );
      hubbard.spread( amount );
      System.out.println( hubbard + "\n" );
    
    }
    System.out.println( "Good-by" );

  }
}