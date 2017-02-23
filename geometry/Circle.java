package geometry;

public class Circle {
	
	//Dimensions
	public int giveDimension() {
		return 2;
	}
	
	//Making circle
	private double a;
	
	public Circle (double a) {
		this.a = a;
	}
	
	//Getting area
	public double giveArea() {
		return (Math.PI * a * a) ;
	}

}
