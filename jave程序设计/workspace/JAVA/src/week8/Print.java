package week8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Print {
	public static void main(String args[]) {
		System.out.println("我是信息管理器");
		System.out.print("JAVA版本：");
		System.out.println(System.getProperty("java.version"));
		System.out.print("系统：");
		System.out.println(System.getProperty("os.name"));
		System.out.print("用户名：");
		System.out.println(System.getProperty("user.name"));
		SimpleDateFormat sdf = new SimpleDateFormat("zzzz:YYYY-MM-dd Ea hh:mm:ss ");
		String s = sdf.format(new Date());
		System.out.println("当前时间 :"+s);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 Eahh时mm分ss秒");
		String s1 = sdf1.format(new Date());
		System.out.println("当前时间 :"+s1);
}}