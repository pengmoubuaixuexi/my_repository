package Order;

public class Shop {
    private static String ID;
    private static String name = "���������η�";
    private static String location = "��®԰У��";
    private static String phone = "18150336956";
    
    public Shop() {}//�޲ι��캯��
    
    public Shop(String ID, String name, String location, String phone)//�вι��캯��
    {
    	this.ID = ID;//���̵�ID��ʵ���������ڶ�����
    	this.name = name;
    	this.location = location;
    	this.phone = phone;
    }
    
    public String getName()
    {
    	return this.name;
    }
    
    public String getLocation()
    {
    	return this.location;
    }
    
    public String getPhone()
    {
    	return this.phone;
    }
    
    public String toString()//override
    {
    	return ("�̼ң�"+this.name+"\n"+"λ�ã�"+this.location+"\n"+"�绰��"+this.phone);
    }
	public static void main(String[] args) {
	}
}