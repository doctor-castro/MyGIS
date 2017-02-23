package geometry;

public class geometrytest {
	
	//making model square
	static Square sq1 = new Square (4);
	
	//Testing for square
	static double sqarea = sq1.giveArea();
	static int sqdim = sq1.giveDimension();
	
	//Making model point
	static point pt1 = new point (3, 5);
	
	//Buffer tests
	static boolean buff1 = point.inBuffer (pt1, 2, 5, 2);
	static boolean buff2 = point.inBuffer (pt1, 5, 9, 2);
	
	//Prints
	public static void main (String [] args) {
		
		System.out.println("Dimension and area stuff test, using inputed square of side 4");
		System.out.println("Area of inputed square is " + sqarea);
		System.out.println("Number of dimensions of square " + sq1.giveDimension());
		
		System.out.println("\nPoint stuff test");
		System.out.println("Point inputted (" + pt1.getx() + " , " + pt1.gety() + ")");
		System.out.println("Number of dimensions of point " + pt1.giveDimension());
		
		System.out.println("\nPoint Buffers");
		System.out.println("Same point with buffer of 2. Is (2 , 5) inside buffer? " + buff1);
		System.out.println("Same point with buffer of 2. Is (5 , 9) inside buffer? " + buff2);
		
	}
	
	

}
