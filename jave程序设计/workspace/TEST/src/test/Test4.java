package test;

public class Test4 {
	int id;
	String name;
	double price;
	int unit;//单价
	double total;
Test4(String name){
	System.out.print(name);
}

public double getPrice(double price) {
	this.price=price;
	return price;
}
public int getUnit(int unit) {
	this.unit=unit;
	return unit;
}
void getTotal(double total) {
	this.total=unit*price;
}
void show() {
	System.out.print(this.total);
}

public static void main(String[] args) {
	Test4 p1=new Test4("喜之郎果冻");
	p1.getPrice(4.0);
	p1.getUnit(2);
	p1.getTotal(3);
	p1.show();
}	
}