package Order;

public class Product2 {
    private String name;
    private double amount;
    
    public Product2() {}
    public Product2(String name, double d)
    {
    	this.name = name;
    	this.amount = d;
    }
    public String toString()
    {
    	return (this.name+"\t"+this.amount);
    			
    }
    public double getZongJia( int k)//�õ���Ʒ��Ŀ�������ܼ�
    {
    	return this.amount*k;
    }
}