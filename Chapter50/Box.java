public class Box {
	
	private double width, height, length;

	public Box( double width, double height, double length ) {
		this.width = width;
		this.height = height;
		this.length = length;
	}

	public Box( double side ) {
		this.width = side;
		this.height = side;
		this.length = side;
	}

	public void setWidth( double width ) { this.width = width; }
	public double width() { return width; }

	public void setHeight( double height ) { this.height = height; }
	public double height() { return height; }

	public void setLength( double length ) { this.length = length; }
	public double length() { return length; }

	public double volume() {
		return length * width * height;
	}

	private double faceArea() {
        return length * height;
    }

    private double sideArea() {
        return height * width;
    }

    private double topArea() {
        return length * width;
    }

    public double area() {
        return 2 * faceArea() + 2 * sideArea() + 2 * topArea();
    }

}