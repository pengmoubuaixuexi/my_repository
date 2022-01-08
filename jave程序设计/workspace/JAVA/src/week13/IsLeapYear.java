package week13;

import java.util.Calendar;
import java.util.Scanner;

public class IsLeapYear {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt(); 
		boolean trueorfalse = getYear(year);
		System.out.println(trueorfalse);
		input.close();
	}
	public static boolean getYear(int year) {
		Calendar c = Calendar.getInstance();
		c.set(year,1,28);
		c.add(Calendar.DAY_OF_MONTH,1);
		return (c.get(Calendar.DAY_OF_MONTH) == 29);
}}
