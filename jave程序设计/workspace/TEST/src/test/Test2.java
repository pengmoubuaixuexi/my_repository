package test;

import javax.swing.JOptionPane;

public class Test2 {

	public static void main(String[] args) {
		Integer a = 145;
		Integer b = 145;
		System.out.println(a==b);
		String input = JOptionPane.showInputDialog("ÏûÏ¢");
		int num1 = Integer.parseInt(input);
		System.out.println(num1);
	}
}
