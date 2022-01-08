package week7;

public class TestFan {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		System.out.println(fan1.toString());
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5);
		System.out.println(fan2.toString());
	}

}
