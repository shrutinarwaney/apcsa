public class Cylinder {
	
	private double radius;
	private double height;

	public Cylinder( double radius, double height ) {
    	this.radius = radius;
    	this.height = height;
  	}

  	public Cylinder() {
  		radius = 0;
  		height = 0;
  	}

  	public void setRadius( double radius ) { this.radius = radius; }
  	public double getRadius( double radius ) { return radius; }

  	public void setHeight( double height ) { this.height = height; }
  	public double getHeight() { return height; }

  	public double volume() {
  		return Math.PI * radius * radius * height;
  	}

  	public double area() {
  		return ( 2 * Math.PI * radius * radius ) + ( 2 * Math.PI * radius * height );
  	}

}