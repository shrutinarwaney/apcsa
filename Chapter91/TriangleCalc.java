// From exercise 1, no use because of exercise 2

class TriangleCalc
{
  public int Triangle( int N )
  {
    if ( N == 1 )
      return 1;
    else
      return N + Triangle( N-1 );
  }
}