public class BoxTester {
   
   public static void main( String [] args ) {
        Box box = new Box( 2.5, 5.0, 6.0 ); 
        Box bigBox = Box.biggerBox( box );
        Box smallBox = Box.smallerBox( box );

        System.out.println( "Area: " + box.area() + "\tVolume: " + box.volume() + "\nLength: " + box.length() + "\tWidth: " + box.width() + "\tHeight: " + box.height() );
        System.out.println( "Does the box next into big box? " + box.nests(bigBox) + "\nDoes the box nest into small box? " + box.nests( smallBox  );
    }

}