package Order;

public class Shop {
    private static String ID;
    private static String name = "花花家粑粑坊";
    private static String location = "麦庐园校区";
    private static String phone = "18150336956";
    
    public Shop() {}//无参构造函数
    
    public Shop(String ID, String name, String location, String phone)//有参构造函数
    {
    	this.ID = ID;//店铺的ID其实不用体现在订单上
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
    	return ("商家："+this.name+"\n"+"位置："+this.location+"\n"+"电话："+this.phone);
    }
	public static void main(String[] args) {
	}
}