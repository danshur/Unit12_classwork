package shapes;

public class GeoEquilateralTriangle extends GeoTriangle {

	public GeoEquilateralTriangle(double side) {
		super(side, side, side);
	}

	public double getSide() {
		return getSide1();
	}

	private double getSide1() {
		// TODO Auto-generated method stub
		return side;
	}

	public void setSide(double side) {
		setSide1(side);
		setSide2(side);
		setSide3(side);
	}

}
