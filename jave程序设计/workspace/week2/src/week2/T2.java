package week2;
//filename:T2.java

public class T2 {
public static void main(String args[]) {
	int a=25,b=7;
	//boolean 只有两个值 true and false 
	boolean x=a<b; //x=false
	System.out.println("a<b="+x);
	int e=3;
	boolean y=a/e>5; //y=true
	System.out.println("x^y="+(x^y));
	if(b<0&e!=0)//&是位运算符，表示按位与运算，&&是逻辑运算符，表示逻辑与（and）
		//如1&1=1 1&0=0 0&1=0 0&0=0
		System.out.println("b/0="+b/0);
	else 
		System.out.println("a%e="+a%e);
	int f=0;
	 if(f!=0&&a/f>5)//f!=0同时a/f>5;
		 System.out.println("a/f="+a/f);
	 else
		 System.out.println("f= "+f);
	 String c="abc";
	 c=c+"de";
	 e=e+1;
	 int d=3;
	 d+=1;
	 System.out.println("c="+c+"d="+d);
	 
}
}

