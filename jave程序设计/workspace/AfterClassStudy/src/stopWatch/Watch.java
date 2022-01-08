package stopWatch;

public class Watch {

	public static void main(String[] args) {
		StopWatch watch = new StopWatch();
		watch.start(12);
		watch.stop(51);
		watch.getElapsedTime();
	}
}
