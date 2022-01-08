package order;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShopInformation {
	static int oddNumber = 0;
	String shopName = "CoCo都可 印象城店";
	String phoneNumber = "17770007272";
	Date time;
	String payment = "一般收银";
	ShopInformation(){
		oddNumber++;
		this.time = new Date();
	}
	public void print() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String time1 = sdf.format(time);
		System.out.println("单号:"+oddNumber);
		System.out.println(shopName+" 电话:"+phoneNumber);
		System.out.println("时间:"+time1+" 收银:"+payment);
	}
}
