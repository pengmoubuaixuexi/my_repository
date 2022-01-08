package work9;

public abstract class shape {
		double x;
		double y;
		public shape(double x, double y) {
			super();
			this.x = x;
			this.y = y;
		}
		public double getX() {
			return x;
		}
		public double getY() {
			return y;
		}
		public void move(double dx,double dy) {
			x+=dx;
			y+=dy;
		}
		public double area() {
			return 0;
			
		}
		public abstract void resize(double newsize) throws Exception;
		public void testshape() {
			
		}
}
