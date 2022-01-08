package week9;

public abstract class Animal {
		String name = "null";
		int age = 0;;
		String color = "null";
		Animal(){
		System.out.println("----Animal----");
		}
		Animal(String name,int age){
			this.name = name;
			this.age = age;
			System.out.println("----Animal----");
		}
		public abstract void showSkill();
		public static void main(String agrs[]) {
			Dog dog = new Dog("gaofei",1);
			System.out.println(dog);
			dog.showSkill();
			Cat cat = new Cat("Tom",1);
			System.out.println(cat);
			cat.showSkill();
		}
}
