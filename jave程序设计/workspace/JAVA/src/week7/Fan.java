package week7;

public class Fan {
		static final int SLOW = 1,MEDIUM = 2,FAST = 3;
		private int speed;
		private boolean on;
		private double radius;
		String color;
		Fan(){
			speed = SLOW;
			on = false;
			radius = 5;
			color = "blue";
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public boolean isOn() {
			return on;
		}
		public void setOn(boolean on) {
			this.on = on;
		}
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
		public String toString() {
			if(on) {
			return "Fan [speed=" + speed + ", on=" + on + ", radius=" + radius + ", color=" + color + "]";
		}
			else {
				return "Fan is off" + " and Fan [color=" + color +",raiuds=" + radius + "]";
			}
}}
