package order;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShopInformation {
	static int oddNumber = 0;
	String shopName = "CoCo���� ӡ��ǵ�";
	String phoneNumber = "17770007272";
	Date time;
	String payment = "һ������";
	ShopInformation(){
		oddNumber++;
		this.time = new Date();
	}
	public void print() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String time1 = sdf.format(time);
		System.out.println("����:"+oddNumber);
		System.out.println(shopName+" �绰:"+phoneNumber);
		System.out.println("ʱ��:"+time1+" ����:"+payment);
	}
}
