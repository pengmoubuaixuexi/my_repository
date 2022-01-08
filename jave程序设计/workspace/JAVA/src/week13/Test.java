package week13;
public class Test{
public static void main(String args[]){
Cat cat1 = new Cat("Tom", "blue", 2);
Cat cat2 = new Cat("Jim","yellow",1);
Cat cat3 = new Cat("Tom","blue",2);
System.out.println(cat1.equals(cat3));
System.out.println(cat1.equals(cat2));
}}
