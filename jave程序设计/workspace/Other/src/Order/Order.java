package Order;

import java.util.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Order {
    private String payType;
    private String time;//生产日期
    private Shop shop;
    private static int numOrder = 0;
    private Product2[] pro2= {new Product2("巧克力粑粑糕",24.6),new Product2("芝士烤年糕", 16.0),new Product2("原味奶茶",9.0)};

    public Order() {this.numOrder++;}//无参构造函数
    
    public Order(String payType, Shop shop)//有单号和支付方式
    {
    	this.numOrder++;//无论调用的是无参还是有参，单号都会++
    	this.payType = payType;
    	this.shop = shop;
    	Date date = new Date();//在生成订单的时刻
    	SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd/HH:mm");
    	this.time = sdf.format(date);  
    } 
    public String toString()//没加上shop和product的信息
    {
    	return ("单号："+this.numOrder+"\n"+"订单创建时间："+this.time+"\n"+"支付方式："+this.payType);
    }
    
    public void print()//打印出订单、商家的信息（不包括商品）
    {
    	System.out.println(this);
    	System.out.println(this.shop);
    }
   public void print(String s, int num)//打印分割线
    {
    	for(int i = 0; i<num; i++)
    		System.out.print(s);
    	System.out.println("");
    }

   public void printAll()//打印菜单
    {
    	System.out.println("商品↓"+"\t\t"+"单价↓");
    	for(Product2 i : pro2)
    		System.out.println(i);
        System.out.println("012分别代表商品，您可以输入您想买的物品及数量：");
    }

   public void dianCan(String s)
    {
    	 String word[] = s.split(" ");
    	 if(word[0].equals("巧克力粑粑糕"))//我只写了一个先试试
    		 {
    		 System.out.print(pro2[0]+"x"+"份额："+word[1]+"  总价:"+pro2[0].getZongJia(Integer.parseInt(word[1])));   		 
    		 }
    }

public static void main(String[] args) {
        Order o1 = new Order("微信支付", (new Shop()));
        o1.print();
        o1.printAll();//pro2是没法拿到main里用的
        o1.print("-", 30);
        Scanner input = new Scanner(System.in);
        String words = input.nextLine();
        o1.dianCan(words);}}