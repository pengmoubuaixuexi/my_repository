package week9;

public class Cat extends Animal{
		Cat(String name,int age){
			super(name,age);
			color = "��";
			System.out.println("����һֻ"+age+"���èè"+name);
		}
		Cat(){
			System.out.print("����һֻ������è");
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
