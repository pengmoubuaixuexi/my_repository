package rii;

public class tset {
	public static void main(String args[]){
	Object circlel = new Circle();
	Circle circle2 = new Circle();

	Circle circle3 = new Circle();
	System. out.println (circlel.equals (circle2));
	System.out.println (circle2.equals(circle3));
	}
}	class Circle {
		double radius;
		public boolean equals (Object circle){
		return this.radius == ((Circle)circle).radius;}}
