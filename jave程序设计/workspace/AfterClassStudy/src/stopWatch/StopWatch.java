package stopWatch;

public class StopWatch {
	private int starTime = 0;
	private int endTime = 0;
	void start(int starTime) {
		this.starTime = starTime ;
	}
	void stop(int endTime) {
		this.endTime=endTime;
	}
	void getElapsedTime(){
		System.out.println(endTime-starTime);
	}
}
