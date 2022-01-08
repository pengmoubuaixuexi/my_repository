package test;

public class Test2 {
		public static void main(String args[]) {
			int[] a = {1,2,3};
			System.out.println(a);
			f(a);
			System.out.println(a);
		}
		public static void f(int[] a) {
			System.out.println(a);
			a = null;
			System.out.println(a);
		}
}
