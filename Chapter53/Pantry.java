class Pantry
{
  // Instance Variables
  private Jam  jar1 ;
  private Jam  jar2 ;
  private Jam  jar3 ;
  private Jam  selected ;

  // Constructors
  Pantry( Jam jar1, Jam jar2, Jam jar3 )
  {
    this . jar1 = jar1 ;
    this . jar2 = jar2 ;
    this . jar3 = jar3 ;
    selected = null ;
  }


  Pantry( Jam jar1, Jam jar2 ) {
    this . jar1 = jar1 ;
    this . jar2 = jar2 ;
    selected = null ;
    jar3 = null ;
  }

  Pantry( Jam jar1 ) {
    this . jar1 = jar1 ;
    jar2 = null ;
    jar3 = null ;
    selected = null ;
  }

  // Methods
  public String toString()
  {
    String str = "";
    str += "1: " +  jar1.toString()  + "\n";
    str += jar2 == null ? "" : "2: " +  jar2.toString()  + "\n";
    str += jar3 == null ? "" : "3: " +  jar3.toString()  + "\n";     
    return str;
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public boolean select( int jarNumber )
  {
    if ( jarNumber == 1 ) {
      selected =  jar1 ;
      return jar1 != null;
    }

    else if ( jarNumber == 2 ) {
      selected =  jar2 ;
      return jar2 != null;
    }

    else  {
      selected =  jar3 ;
      return jar3 != null;
    }
  }

  // spread the selected jam
  public void spread( int oz )
  {
    selected . spread( oz ) ;
  }

  public void replace( Jam j, int slot ) {

    switch( slot ) {

      case 1:
        jar1 = j;
        break;
      case 2:
        jar2 = j;
        break;
      case 3:
        jar3 = j;
        break;

    }

  }

  public void mixedFruit() {

    if( jar1.getCapacity() <= 2 && jar2.getCapacity() <= 2 && jar3.getCapacity() <= 2 ) {

      
      jar1 = new Jam( "Mixed Fruit", jar1.getDate(), jar1.getCapacity() + jar2.getCapacity() + jar3.getCapacity() );
      jar2 = null;
      jar3 = null;

    }

  }

}
