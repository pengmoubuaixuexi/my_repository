package test;

public class Animal {
    protected String name = "UNKNOWN";
    protected int age = 0;
    protected String color;
    public Animal()
    {
    System.out.print("Animal(no parameter)-----");
    }
    public Animal(String name, int age)
    {
    this.name = name;
    this.age = age;
    System.out.print("Animal(parameters)-----");
    }
    public void setColor(String solor)
    {
    this.color = color;
    }
public static void main(String[] args) {
         Cat c1 = new Cat();
         Cat c2 = new Cat("Tom", 3);
         System.out.println(c2);
         c1.eatFish();
         c2.catchMouse();
         System.out.println("----------------------------------------");
         Dog d1 = new Dog();
         Dog d2 = new Dog("GaoFei", 4);
         System.out.println(d2);
         d1.watchOver();
         d2.eatBone();        
}
}
class Dog extends Animal {
    static private String color = "coffee";
    public Dog()
    {
    System.out.println("����һֻ���ص���������");
    }    
    public Dog(String name, int age)
    {
    super(name, age);
    System.out.println("����һֻ"+this.age+"���"+"����"+this.name);
    }
    public void watchOver()//����

    {

    System.out.println(this.name+" is watching over your house...");

    }

    

    public void eatBone()//�Թ�ͷ

    {

    System.out.println(this.name+" is eating a bone.");

    }

    

    public String toString()
    {
    return ("����Dog: "+this.name+", its age: "+this.age);
    }
}
class Cat extends Animal{
    static private String color = "grey";//����è����ɫ���ǻ�ɫ
    public Cat()
    {
    System.out.println("����һֻ���ص�����èè");
    }
    public Cat(String name, int age)//�͸������һ����

    {

    super(name, age);

    System.out.println("����һֻ"+this.age+"���"+"èè"+this.name);

    }

    

    public void catchMouse()//ץ����

    {

    System.out.println(this.name+" catches a mouse!");

    }

    

    public void eatFish()//����

    {

    System.out.println(this.name+" is eating fish.");

    }

    

    public String toString()

    {

    return ("��Cat: "+this.name+", its age: "+this.age);

    }

}