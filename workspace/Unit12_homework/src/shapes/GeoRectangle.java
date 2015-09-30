package shapes;
public class GeoRectangle extends GeoShape {
	private double width;
	private double height;

	public GeoRectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	// Complete the accessors for this class as an exercise
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void drawShape() {
		System.out.println("drawing a rectangle");
	}

	@Override
	public double[] getDrawingInstructions() {
		double width = getWidth();
		double height = getHeight();
		double[] instructions = {width, 90, height, 90, width, 90, height};
		return instructions;
	}
}
