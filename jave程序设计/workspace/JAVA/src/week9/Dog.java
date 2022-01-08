package week9;

public class Dog extends Animal{
	Dog(){
		System.out.println("来了一只无名的狗");
	}
	Dog(String name , int age){
		super(name,age);
		color = "咖啡";
		System.out.println("来了一只"+age+"岁的狗狗"+name);
	}
	public void showSkill() {
		if(Math.random()>0.5) {
		System.out.println(name+" watch home");}
		else
			System.out.println(name+" eat bone");
	}
	public String toString() {
		return color+"Dog: "+name+age;
	}
}
