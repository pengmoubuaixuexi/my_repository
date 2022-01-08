package test;

public class Recipe {
	public static void main(String args[]) {
		int[] a = {1,2,3};
		f(a);
		for(int b:a) {
			System.out.println(b);
		}
	}
	public static void f(int[] a) {
		System.out.println(a);
		a = null;
		System.out.println(a);
	}
}
