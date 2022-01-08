package triangle2D;

public class MyTriangle2D {
	private  MyPoint2D p1;
	private  MyPoint2D p2;
	private  MyPoint2D p3;
	public MyTriangle2D() {
		p1 = new MyPoint2D(0,0);
		p2 = new MyPoint2D(1,1);
		p3 = new MyPoint2D(2,5);
	}
	public MyTriangle2D(MyPoint2D p1,MyPoint2D p2, MyPoint2D p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	public double getPerimeter() {
		double Perimeter = MyPoint2D.distence(p1.x,p1.y,p2.x,p2.y)+MyPoint2D.distence(p2.x,p2.y,p3.x,p3.y)+MyPoint2D.distence(p1.x,p1.y,p2.x,p2.y);
		return Perimeter;
	}
	public double getArea(MyPoint2D p1,MyPoint2D p2,MyPoint2D p3) {
		double Area=Math.sqrt((getPerimeter()-MyPoint2D.distence(p1.x,p1.y,p2.x,p2.y))*(getPerimeter()-MyPoint2D.distence(p1.x,p1.y,p3.x,p3.y))+(getPerimeter()-MyPoint2D.distence(p3.x,p3.y,p2.x,p2.y))*getPerimeter());
		return Area;
	}
	public boolean contains (MyPoint2D p) {
		if(((getArea(p, p1, p2))+getArea(p, p2, p3))<=getArea(p1,p2,p3))
		{return true;}
		return false;
	}
	public boolean contains (MyTriangle2D t ) {
		if(contains(t.p1)&&contains(t.p2)&&contains(t.p3))
			return true;
			return false;
	}
	public boolean overlaps(MyTriangle2D t) {
		if(contains(t))
			return false;
		else
			return true;
	}
	public static void main(String args[]) {
		MyTriangle2D T1 = new MyTriangle2D(new MyPoint2D(2.5,2),new MyPoint2D(4.2,3),new MyPoint2D(5,3.2));
		System.out.println(T1.getPerimeter());
		System.out.println(T1.getArea(T1.p1,T1.p2,T1.p3));
		System.out.println("判断（3,3）是否在T1三角形内"+T1.contains(new MyPoint2D(3,3)));
		MyTriangle2D T2 = new MyTriangle2D(new MyPoint2D(2.9,2),new MyPoint2D(4,1),new MyPoint2D(1,3.4));
		MyTriangle2D T3 = new MyTriangle2D(new MyPoint2D(2,2.5),new MyPoint2D(4, -3),new MyPoint2D(2,6.5));
		System.out.println("判断T2是否在T1内"+T1.contains(T2));
		System.out.println("判断T3是否与T1相交"+T1.overlaps(T3));
	}
}
