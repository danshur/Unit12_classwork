package shapes;
/*
 */

public class GeoTriangle extends GeoShape {
	private double length1;
	private double length2;
	private double length3;

	public double getLength1() {
		return length1;
	}

	public void setLenght1(double lenght1) {
		this.length1 = lenght1;
	}

	public double getLength2() {
		return length2;
	}

	public void setLenght2(double length2) {
		this.length2 = length2;
	}

	public double getLenght3() {
		return length3;
	}

	public void setLenght3(double length3) {
		this.length3 = length3;
	}

	public GeoTriangle(double length1, double length2, double length3) {
		this.length1 = length1;
		this.length2 = length2;
		this.length3 = length3;
	}

	@Override
	public void drawShape() {
		System.out.println("drawing a triangle");
	}

	@Override
	public double[] getDrawingInstructions() {
		
		double alpha = Math.toDegrees(Math.acos((Math.pow(length1, 2) + Math.pow(length3, 2) - Math.pow(length2, 2)) / (2 * length1 * length3)));
		double beta = Math.toDegrees(Math.acos((Math.pow(length1, 2) + Math.pow(length2, 2) - Math.pow(length2, 2)) / (2 * length1 * length2)));
		double gamma = Math.toDegrees(Math.acos((Math.pow(length3, 2) + Math.pow(length2, 2) - Math.pow(length1, 2)) / (2 * length3 * length2))); 
		
		//double[] instructions = {alpha, length1, beta, length2, gamma, lenght3};
		double[] instructions = {length1, beta, length2, gamma, length3, alpha};
		return instructions; 
	}

}
