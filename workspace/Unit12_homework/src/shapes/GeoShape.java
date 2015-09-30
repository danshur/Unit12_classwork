package shapes;
import java.awt.Color;

abstract public class GeoShape {
	private double originX;
	private double originY;
	private Color color;

	abstract public void drawShape();
	abstract public double[] getDrawingInstructions();

	public double getOriginY() {
		return originY;
	}

	public void setOriginY(double originY) {
		this.originY = originY;
	}

	public double getOriginX() {
		return originX;
	}

	public void setOriginX(double originX) {
		this.originX = originX;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
