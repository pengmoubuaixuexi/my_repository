package week9;

public class Dog extends Animal{
	Dog(){
		System.out.println("����һֻ�����Ĺ�");
	}
	Dog(String name , int age){
		super(name,age);
		color = "����";
		System.out.println("����һֻ"+age+"��Ĺ���"+name);
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
