
public class Circle {
	// PROPERTIES
	private double radius;
	private String color;

	// CONSTRUCTORS
	// Constructor #1
	public Circle(double radius, String color) {
		setRadius(radius);
		setColor(color);
	}

	// Constructor #2
	public Circle(double radius) {
		setRadius(radius);
		setColor("red");
	}

	// Constructor #3
	public Circle() {
		setRadius(1.0);
		setColor("red");
	}

	// GETTERS AND SETTERS

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// METHOD GET AREA
	public double getArea() {
		double area = ((radius * radius) * Math.PI);
		return area;
	}

	// Method
	public void printArea() {
		System.out.println(getArea());
	}
}
