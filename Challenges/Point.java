public class Point implements Comparable<Point> {
	
	private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point( double x, double y ) {
        this.x = x;
        this.y = y;
    }

    public double getx() { return x; }
    public double gety() { return y; }

    public Point getMidPoint( Point one) {
        return new Point( ( ( one.getx() + this.getx() ) / 2 ), ( one.gety() + this.gety() ) / 2 );
    }

    public double distanceToOrigin() {
    	return Math.sqrt( x * x + y * y );
    }

    public int compareTo( Point one ) {
    	return ( int ) ( distanceToOrigin() - ( (Point) one ).distanceToOrigin() );
    }



    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}