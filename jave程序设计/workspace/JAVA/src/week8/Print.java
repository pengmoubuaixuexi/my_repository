package week8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Print {
	public static void main(String args[]) {
		System.out.println("������Ϣ������");
		System.out.print("JAVA�汾��");
		System.out.println(System.getProperty("java.version"));
		System.out.print("ϵͳ��");
		System.out.println(System.getProperty("os.name"));
		System.out.print("�û�����");
		System.out.println(System.getProperty("user.name"));
		SimpleDateFormat sdf = new SimpleDateFormat("zzzz:YYYY-MM-dd Ea hh:mm:ss ");
		String s = sdf.format(new Date());
		System.out.println("��ǰʱ�� :"+s);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy��MM��dd�� Eahhʱmm��ss��");
		String s1 = sdf1.format(new Date());
		System.out.println("��ǰʱ�� :"+s1);
}}