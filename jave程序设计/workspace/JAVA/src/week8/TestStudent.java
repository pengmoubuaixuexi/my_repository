package week8;
public class TestStudent{

	public static void main(String[] args) throws CloneNotSupportedException {
		Student stu1 = new Student("Tom",new Birthday(2003,2,2));
		Student stu2 = (Student)stu1.clone();
		System.out.println(stu1.toString());
		System.out.println(stu2.toString());
		System.out.println("now change the stu2");
		stu2.setName("James");
		stu1.birthday.setDay(7);
		stu1.birthday.setMonth(9);
		stu1.birthday.setYear(2002);
		System.out.println(stu1.toString());
		System.out.println(stu2.toString());
		Birthday b1 = new Birthday(2004,2,2);
		Birthday b2 = (Birthday) b1.clone();
		b1.setDay(20);
		System.out.println(b1.toString());
		System.out.println(b2.toString());
}}
