package week11;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
	static int a = 0;;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
		Bill[] bill = new Bill[1000];
		int count = 0;
		if(a==4) {
			break;
		}
		while(true){
		System.out.println("---------------------");
		System.out.println("1.��ʼ���");
		System.out.println("2.���Ĳ˵�");
		System.out.println("3.ˢ�µ���");
		System.out.println("4.�ػ�");
		System.out.println("---------------------");
		a = input.nextInt();
		if(a>4&&a<=0) {
			System.out.println("��������������");
			a = input.nextInt();
		}else {
		switch (a) {
		case 1: {break;
		}//case 2,���������������˵��������������õĻ���һά����,��δ��������ʹ�ô˹���
		case 2: {
			//ProductInformation.production = new Production[] {new Production("ha",20)};
		break;
		}
		case 3:{
			count=0;break;
		}
		default:
		break;	
		}}
		if(a==4||a==2) {
			break;
		}
		Date d1 = new Date();
		if(count == 0) {
			
		}
		else {
		if(isSameDay(d1,bill[count-1].s.time)) {
			
		}
		else {
			break;
		}}
		count++;
		System.out.println("����ĵ�"+count+"�η���");
		System.out.println("please look our menu to order");
		ProductInformation.printmenu();
		int[] n1=new int[3];
		for(int i =0;i<ProductInformation.production.length;i++) {
			System.out.println("���������Ҫ"+ProductInformation.production[i].productionName+"����");
			n1[i] = input.nextInt();
		}
		System.out.println("now please tell me what you");
		ProductInformation pr = new ProductInformation(0,n1[0],1,n1[1],2,n1[2]);
		System.out.println("���Ķ����Ѿ�������ѡ�񸶿ʽ���и���ȴ�ȡ��");
		int n = input.nextInt();
		double getMoney = input.nextDouble();
		PayInformation pa = new PayInformation(pr, getMoney,n);
		if(pa.returnMoney<0) {
			System.out.println("��֧���Ľ����벹"+Math.abs(pa.returnMoney));
			double getMoney1 = input.nextDouble();
			pa = new PayInformation(pr, getMoney1+getMoney, n);
		}
		if(pa.returnMoney<0) {
			System.out.println("������Ҹ�����ǽ���������");
		}
		bill[count-1] = new Bill(pa, pr);
		bill[count-1].print();
		System.out.println("-------------------------------------");
	}	
		}input.close();
}
	public static boolean isSameDay(Date d1,Date d2) {
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		 String strDate1 = format.format(d1);
		 String strDate2 = format.format(d2);
		 return strDate1.equalsIgnoreCase(strDate2);
		}
}