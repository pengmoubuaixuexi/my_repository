package Test2;

import java.util.Scanner;
//��ػ���̭�ˣ�
public class Test2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("please input people number");
		int NumberPeople=input.nextInt();//����
		System.out.println("please input the Number");
		int Number=input.nextInt();//����
		System.out.println("please input the first man");
		int FirstPeople=input.nextInt();//��һ����
		input.close();
		int record=0;//����
		int[] SerialNumber;
		int firstrecord=Number+FirstPeople-1;
		SerialNumber = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13};
		System.out.println("the people of dying out is:");
		for(int i=0;i<13;i++) {
			if(i>=1) {
				FirstPeople=0;}
			record=record+Number+FirstPeople-1;
			if(record>NumberPeople) {
				while(record>NumberPeople)
				record=record-NumberPeople;}
			System.out.println("��"+(i+1)+"����̭���ǣ�"+SerialNumber[record-1]);
			NumberPeople--;
			for(int j=record-1;j<NumberPeople;j++) {
				SerialNumber[j]=SerialNumber[j+1];
			}
		}}}