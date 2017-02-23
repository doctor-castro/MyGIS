package geometry;

public class Rectangle implements flatShapes {
	
	//Rectangle dimension
	public int giveDimension() {
		return 2;
	}
	
	//Creating rectangle
	private double a, b;
	
	public Rectangle (double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	//Give Area
	public double giveArea() {
		return a*b;
	}
	

}
