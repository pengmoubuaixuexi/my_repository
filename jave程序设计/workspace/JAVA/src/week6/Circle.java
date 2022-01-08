package week6;

public class Circle {
			double radius;
			final double PI = 3.14;
			Circle(){
				this.radius = 1;
			}
			Circle(int radius){
				this.radius = radius;
			}
			public double getArea() {
				double area = PI*radius*radius;
				return area;
			}
			public double getPrimeter() {
				double primeter = 2*PI*radius;
				return primeter;
			}
}
