package test;

import java.util.HashMap;
public class Product {
    private String ID;
    private double amount;//价格用double
    //如果用hash表这些就都不需要，因为都是手输！！
    private String name;
    private int num;//商品数目
    private double allAmount = num*amount;//总价
    public static HashMap<String,Double> item = new HashMap<String,Double>();//为啥非得包装类才行啊
    
    public Product() {
    	item.put("milk", 24.5);
    	item.put("cake", 16.0);
    	item.put("芝士烤年糕", 12.8);
    }//无参构造函数
    
	public Product(String iD, double amount, String name, int num)//有参构造函数
	{
		ID = iD;
		this.amount = amount;
		this.name = name;
		this.num = num;
	}

//	public void setItem(String s, double d)//初始化商品信息
//	{
//		item.put(s,d);
//	}
//	
    public String getName()
    {
        return this.name;
    }
    
    public double getAmount()
    {
    	return this.amount;
    }
    
    public int getNum()
    {
    	return this.num;
    }
    
    //得到value
    public double getValue(String s)
    {
    	return item.get(s);
    }
    
    public String toString()//override
    {
    	return ("商品："+this.name+"\n"+"单价："+this.amount+"\n"+"数目："+this.num+"\n"+"总价："+this.allAmount);
    }
	public static void main(String[] args) {
	}
	
//	private String[] name;
//	private int[] num;
//	private double[] amount;
//	private double[] allAmount;
//	public Product() {}//无参
//	public Product(String[] name, int[] num, double[] amount) {
//		super();
//		this.name = name;
//		this.num = num;
//		this.amount = amount;
//		for(int i = 0; i<name.length; i++)
//		{
//			allAmount[i] = amount[i]*num[i];
//		}
//	}
//	public Product(String[] name)
//	{
//		this.name = name;
//	}
//	public String toString() {
//		StringBuffer sb = new StringBuffer();
//		for(String one : name)
//			sb.append(one);
//		for(int two : num)
//			sb.append(two);
//		for(double three : amount)
//			sb.append(three);
//		for(double four : allAmount)
//		    sb.append(four);
//		return sb.toString();	
//	}
//	public static void main(String[] args) {
//	}
}