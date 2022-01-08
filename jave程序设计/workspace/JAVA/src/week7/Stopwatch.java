package week7;
import java.util.Date;
public class Stopwatch {
	Date startTime;
	Date endTime;
	Stopwatch(){
		startTime = new Date();
	}
	public void star(){
		Date nowTime = new Date();
		this.startTime = nowTime;
	}
	public void stop() {
		Date nowTime = new Date();
		this.endTime = nowTime;
	}
	public long getAllTime() {
		return endTime.getTime()-startTime.getTime();
	}
	}
