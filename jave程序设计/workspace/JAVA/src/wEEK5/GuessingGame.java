package wEEK5;
import java.util.Scanner;
public class GuessingGame {
//石头：—1；剪刀：0；布：1；
	public static void main(String[] args) {
		int count1 = 0;
		String[] temporarycount= new String[100];
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("请选择出石头剪刀或者布；如果不想玩了请输入bye");
			
			String sign = input.nextLine();
			String leaveSign="bye";
			if (sign.equals(leaveSign)) {
				System.out.println("恭喜你退出了游戏");
				input.close();
				break;}
			System.out.println("用户："+sign);
			int computersign = creatComputersign();
			int peopleSign = creatPeopleSign(sign);
			if(Math.abs(peopleSign-computersign)==1) {
				if(peopleSign>computersign) {
					temporarycount[count1] = "电脑获胜";
					System.out.println(temporarycount[count1]);
				}
				else {
					temporarycount[count1] = "用户获胜";
					System.out.println(temporarycount[count1]);
				}}
			else if(peopleSign == computersign) {
				temporarycount[count1] = "平局";
				System.out.println("平局");
			}
			else {
				if(peopleSign<computersign) {
					temporarycount[count1] = "电脑获胜";
					System.out.println(temporarycount[count1]);
				}
				else {
					temporarycount[count1] = "用户获胜";
					System.out.println(temporarycount[count1]);
			}
			}
					count1++;
					}
		input.close();
			String[] reallycount=new String[count1+1];
			System.arraycopy(temporarycount,0,reallycount,0,count1);
			reallycount[count1]="此后无比赛";
			for(int i=0;i<reallycount.length-1;i++) {
				System.out.println("第"+(i+1)+"局: "+reallycount[i]);
				if(i==reallycount.length-2) {
					System.out.println(reallycount[i+1]);
					System.out.println("总共进行了"+(i+1)+"局");
				}
			}
	}
public static int creatPeopleSign(String sign) {
	String a="石头";
	String b="剪刀";
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
		System.out.println("电脑：石头");
		return -1;
	}
	else if(sign < 1.0/3){
		System.out.println("电脑：剪刀");
		return 0;
	}
	else {
	System.out.println("电脑：布");
	return 1;
}}
}
