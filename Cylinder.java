
public class Cylinder extends Circle {
	// property
	private double height;

	// getter and setter
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	// CONSTRUCTORS

	// constructor #1
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		// this.height = height;
		setHeight(height);
	}

	// constructor #2
	public Cylinder(double radius, double height) {
		super(radius);
		setHeight(height);
	}

	// constructor #3
	public Cylinder(double radius) {
		super(radius);
		height = 1.0;
	}

	// constructor #4
	public Cylinder() {
		super();
		height = 1.0;
	}

	// Method get Volume
	public double getVolume() {
		double volume = getArea() * getHeight();
		return volume;
	}

	// Method print volume
	public void printVolume() {
		System.out.println(getVolume());
	}
// Overriding the getArea method so that you can correctly calculate area for a cylinder
	@Override
	public double getArea() {
		return ((2 * Math.PI * getRadius() * getHeight()) + 2 * Math.PI * getRadius() * getRadius());

	}

}
