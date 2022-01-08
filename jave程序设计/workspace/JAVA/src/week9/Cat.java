package week9;

public class Cat extends Animal{
		Cat(String name,int age){
			super(name,age);
			color = "灰";
			System.out.println("来了一只"+age+"岁的猫猫"+name);
		}
		Cat(){
			System.out.print("来了一只无名的猫");
		}
		public void showSkill() {
			if(Math.random()>0.5) {
			System.out.println(name+" catch a mouse");}
			else
				System.out.println(name+" eat a fish");
		}
		public String toString() {
			return color+"Cat: "+name+age;
		}

}
