package triangle2D;
public class MyPoint2D {
		 double x;
		 double y;
		public MyPoint2D(double x, double y) {
			super();
			this.x = x;
			this.y = y;
		}
		public MyPoint2D() {
			x=0;y=0;
		}
		public double distence() {
			return Math.sqrt(x*x+y*y);
		}
		public double distence(double x1,double y1) {
			return Math.sqrt(Math.pow((x1-x),2)+Math.pow((y1-y),2));
		}
		public static double distence(double x1,double y1,double x2,double y2) {
			return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		}
}
