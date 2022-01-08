package work9;

public class Circle extends shape {
		double radius;
		final double PI = 3.14;
	public Circle(double x, double y,double radius) {
		super(x, y);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}
	public double area() {
		return PI*radius*radius;
	}
	public void resize(double newRadius) {
		this.radius = newRadius;
	}
	public void testCircle() {
		
	}
}
