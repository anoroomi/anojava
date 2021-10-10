package homework6;

public class Rectangle {
	private int width;
	private int height;
	private static int numberOfRectangles = 0;
	private int rectangleID;

	public Rectangle() {
		this.width = 1;
		this.height = 1;
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		rectangleID = ++numberOfRectangles;
	}

	public static int getNumberOfRectangles() {
		return numberOfRectangles;
	}

	public int getRectangleID() {
		return rectangleID;
	}

	public int getArea() {
		return width * height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
