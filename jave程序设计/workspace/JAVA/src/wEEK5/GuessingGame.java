package wEEK5;
import java.util.Scanner;
public class GuessingGame {
//ʯͷ����1��������0������1��
	public static void main(String[] args) {
		int count1 = 0;
		String[] temporarycount= new String[100];
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("��ѡ���ʯͷ�������߲��������������������bye");
			
			String sign = input.nextLine();
			String leaveSign="bye";
			if (sign.equals(leaveSign)) {
				System.out.println("��ϲ���˳�����Ϸ");
				input.close();
				break;}
			System.out.println("�û���"+sign);
			int computersign = creatComputersign();
			int peopleSign = creatPeopleSign(sign);
			if(Math.abs(peopleSign-computersign)==1) {
				if(peopleSign>computersign) {
					temporarycount[count1] = "���Ի�ʤ";
					System.out.println(temporarycount[count1]);
				}
				else {
					temporarycount[count1] = "�û���ʤ";
					System.out.println(temporarycount[count1]);
				}}
			else if(peopleSign == computersign) {
				temporarycount[count1] = "ƽ��";
				System.out.println("ƽ��");
			}
			else {
				if(peopleSign<computersign) {
					temporarycount[count1] = "���Ի�ʤ";
					System.out.println(temporarycount[count1]);
				}
				else {
					temporarycount[count1] = "�û���ʤ";
					System.out.println(temporarycount[count1]);
			}
			}
					count1++;
					}
		input.close();
			String[] reallycount=new String[count1+1];
			System.arraycopy(temporarycount,0,reallycount,0,count1);
			reallycount[count1]="�˺��ޱ���";
			for(int i=0;i<reallycount.length-1;i++) {
				System.out.println("��"+(i+1)+"��: "+reallycount[i]);
				if(i==reallycount.length-2) {
					System.out.println(reallycount[i+1]);
					System.out.println("�ܹ�������"+(i+1)+"��");
				}
			}
	}
public static int creatPeopleSign(String sign) {
	String a="ʯͷ";
	String b="����";
	if(a.equals(sign)) {
		return -1;
	}
	else if(b.equals(sign)) {
		return 0;
	}
	else {
		return 1;
	}
}
public static int creatComputersign() {
	double sign;
	sign = Math.random();
	if(sign > 2.0/3 ) {
		System.out.println("���ԣ�ʯͷ");
		return -1;
	}
	else if(sign < 1.0/3){
		System.out.println("���ԣ�����");
		return 0;
	}
	else {
	System.out.println("���ԣ���");
	return 1;
}}
}
