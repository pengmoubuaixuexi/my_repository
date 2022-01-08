package week13;
abstract class Animal {
String name;
String color;
int age;
public abstract boolean equals(Object o);
}

public class Cat extends Animal {
Cat(String name,String color,int age){
this.name = name;
this.color = color;
this.age = age;
}
public String toString() {
	return this.name+this.color+this.age;
}
public boolean equals(Object o) {
// TODO Auto-generated method stub
if((this.toString()).equals(((Cat)o).toString()))
return true;
else
return false;
}}