
import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;

public class clock {
	private int hour;
	private int minute;
	private int second;

	public clock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void tick() {
		for (;;) {
			second++;
			if (second == 60) {
				minute++;
				second = 0;
			}
			if (minute == 60) {
				hour++;
				minute = 0;
			}
			if (hour == 24)
				hour = 0;
		}
	}


 public static void main(String[] args) { // TODO Auto-generated method stub 
	 Scanner in=new Scanner(System.in); 
	 clock clock=newclock(in.nextInt(),in.nextInt(),in.nextInt());
	 clock.tick();
	 System.out.println(clock); 
	 in.close(); }
 }
 } 