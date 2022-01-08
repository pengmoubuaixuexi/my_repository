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
    System.out.println("来了一只神秘的无名狗狗");
    }    
    public Dog(String name, int age)
    {
    super(name, age);
    System.out.println("来了一只"+this.age+"岁的"+"狗狗"+this.name);
    }
    public void watchOver()//看家

    {

    System.out.println(this.name+" is watching over your house...");

    }

    

    public void eatBone()//吃骨头

    {

    System.out.println(this.name+" is eating a bone.");

    }

    

    public String toString()
    {
    return ("咖啡Dog: "+this.name+", its age: "+this.age);
    }
}
class Cat extends Animal{
    static private String color = "grey";//所有猫的颜色都是灰色
    public Cat()
    {
    System.out.println("来了一只神秘的无名猫猫");
    }
    public Cat(String name, int age)//和父类的是一样的

    {

    super(name, age);

    System.out.println("来了一只"+this.age+"岁的"+"猫猫"+this.name);

    }

    

    public void catchMouse()//抓老鼠

    {

    System.out.println(this.name+" catches a mouse!");

    }

    

    public void eatFish()//吃鱼

    {

    System.out.println(this.name+" is eating fish.");

    }

    

    public String toString()

    {

    return ("灰Cat: "+this.name+", its age: "+this.age);

    }

}