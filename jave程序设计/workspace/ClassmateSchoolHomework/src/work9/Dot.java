package work9;

public class Dot extends shape{

	public Dot(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public double area() {
		return 0.0;
	}
	public void resize(double newsize) throws Exception {
		throw new Exception("a dot cannot resize");
	}
}
