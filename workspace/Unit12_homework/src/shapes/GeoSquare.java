package shapes;

public class GeoSquare extends GeoRectangle {

	public void getSide() {
		super.getWidth();
	}

	public void setSide(double side) {
		//super(side, side);
		super.setWidth(side);
		super.setHeight(side);
		

	}

	public GeoSquare(double side) {
		// super.setWidth(0);
		// super.setHeight(0);
		super(side, side);

	}

}
