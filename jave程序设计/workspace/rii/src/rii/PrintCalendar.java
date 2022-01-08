package rii;

import java.util.Scanner;

public class PrintCalendar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份");
		int year=input.nextInt();
		System.out.println("请输入月份");
		int month= input.nextInt();
		printMonthBody(year,month);
		input.close();
	}
static boolean isLeapYear(int year) {
	boolean flag=false;
	if(year%4==0&&year%100!=0||year%400==0)
		flag=true;
	return flag;
}
static int getNumberOfDaysInMonth(int year,int mouth) {
	int days=0;
		switch (mouth) {
		case 1,3,5,7,8,10,12: {
			days=31;
			break;
		}
		case 2:{
			if(isLeapYear(year))
				days=28;
			else
				days=27;
			break;
		}
		case 4,6,9,11:{
			days=30;
			break;
		}
			default:
			{System.out.println("error,请重新运行!");
		}}return days;}
static int getTotalNumberOfDays(int year,int month) {
	int Totaldays=0;
	int TotalisLeapYear=0;
	for(int i=1800;i<year;i++) {
		if(isLeapYear(i))
			TotalisLeapYear++;}
	for(int i=1;i<=month;i++) {
		Totaldays=getNumberOfDaysInMonth(year,month)+Totaldays;}
	Totaldays=(year-1800)*365+1*TotalisLeapYear+Totaldays;
	return Totaldays;
}
static int getStarDay(int year,int mouth) {
	int starday;
	starday=getTotalNumberOfDays(year, mouth)%7;
	return starday;
}
static void printMonthBody(int year,int month) {
	printmonth(month);
	System.out.println(" "+year);
	System.out.println("---------------------------");
	System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	int i=0;
	int j=0;
	while(i <7) {
		i++;
		System.out.print("    ");
		if(getStarDay(year,month)==i) 
			break;}
			while(j<getNumberOfDaysInMonth(year,month))
				{j++;
				System.out.printf("%4d",j);
			if((j+i)%7==0)
				System.out.println();}
}
static void printmonth(int month) {
	switch(month) {
	case 1:{System.out.print("\tJanuary");break;}
	case 2:{System.out.print("\tFebruary");break;}
	case 3:{System.out.print("\tMarch");break;}
	case 4:{System.out.print("\tApril");break;}
	case 5:{System.out.print("\tMay");break;}
	case 6:{System.out.print("\tjune");break;}
	case 7:{System.out.print("\tJuly");break;}
	case 8:{System.out.print("\tAugust");break;}
	case 9:{System.out.print("\tSeptember");break;}
	case 10:{System.out.print("\tOctober");break;}
	case 11:{System.out.print("\tNovember");break;}
	case 12:{System.out.print("\tDecember");break;}
	}
}}