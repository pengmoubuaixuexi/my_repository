package test;

import java.util.HashMap;
public class Product {
    private String ID;
    private double amount;//�۸���double
    //�����hash����Щ�Ͷ�����Ҫ����Ϊ�������䣡��
    private String name;
    private int num;//��Ʒ��Ŀ
    private double allAmount = num*amount;//�ܼ�
    public static HashMap<String,Double> item = new HashMap<String,Double>();//Ϊɶ�ǵð�װ����а�
    
    public Product() {
    	item.put("milk", 24.5);
    	item.put("cake", 16.0);
    	item.put("֥ʿ�����", 12.8);
    }//�޲ι��캯��
    
	public Product(String iD, double amount, String name, int num)//�вι��캯��
	{
		ID = iD;
		this.amount = amount;
		this.name = name;
		this.num = num;
	}

//	public void setItem(String s, double d)//��ʼ����Ʒ��Ϣ
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
    
    //�õ�value
    public double getValue(String s)
    {
    	return item.get(s);
    }
    
    public String toString()//override
    {
    	return ("��Ʒ��"+this.name+"\n"+"���ۣ�"+this.amount+"\n"+"��Ŀ��"+this.num+"\n"+"�ܼۣ�"+this.allAmount);
    }
	public static void main(String[] args) {
	}
	
//	private String[] name;
//	private int[] num;
//	private double[] amount;
//	private double[] allAmount;
//	public Product() {}//�޲�
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