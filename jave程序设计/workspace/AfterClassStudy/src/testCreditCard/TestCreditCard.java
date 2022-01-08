package testCreditCard;

import java.util.Scanner;

public class TestCreditCard {

	public static void main(String[] args) {
		System.out.println("please input your CardNumber");
	Scanner input = new Scanner(System.in);
	String Card=input.nextLine();
	MathCaculete(Card);
	input.close();
	}
public static void MathCaculete(String Card){
		int length=Card.length();
		int sum=0;
	for(int i=(length-1);i>0;i=i-2) {		
		int number=Card.charAt(i-1)-'0';
		int Total=number*2;
		if(Total>=10) {
			Total=Total/10+Total%10;
			sum=Total+sum;}
		else
			sum=Total+sum;}
	for(int i=length;i>0;i=i-2) {
		int number=Card.charAt(i-1)-'0';
		int Total = 0;
		Total=Total+number;
		sum=Total+sum;
		}
	System.out.println(sum);
		if(sum%10!=0)
		System.out.println(Card+" is invalid");
		else
			System.out.println(Card+" is valid");
	}
}
