package geometry;

public class point implements BasicGeometry {
	
	//For the BasicGeometry interface
	public int giveDimension() {
		return 0;
	}
	
	//Creating points
	private int xcord, ycord;
	
	public point(int xcord, int ycord){
		this.xcord = xcord;
		this.ycord = ycord;
	}
	
	public int getx () {
		return xcord;
	}
	public int gety () {
		return ycord;
	}
	
	//Buffer test. Just used distance formula to simplify buffer since buffer only needed for a point
	public static boolean inBuffer (point ori, int xtest, int ytest, int buff) {
		double pointdist = Math.sqrt(Math.pow((ori.getx() - xtest), 2) + Math.pow((ori.gety() - ytest), 2));
		if (pointdist < buff) {
			return true;
		}
		else {
			return false;
		}
	}

}
