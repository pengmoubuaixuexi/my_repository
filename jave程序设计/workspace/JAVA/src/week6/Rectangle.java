package week6;

public class Rectangle {
		double width;
		double length;
		public Rectangle() {
			this.length = 2;
			this.width = 1;
		}
		Rectangle(double width, double length) {
			super();
			this.width = width;
			this.length = length;
		}
		public double getArea() {
			double area = width*length;
			return area;
		}
		public double getPrimeter() {
			double primeter = 2*(width+length);
			return primeter;
		}
		
}
