package week14;

import java.util.Optional;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String args[]) {//大小写也要区分
		Scanner input = new Scanner(System.in);
		Output output = new Output();
		String num = output.toString();
		System.out.println(num);
		String num1 = JOptionPane.showInputDialog("请输入验证码");
		if(num1.equals(num)) {
			JOptionPane.showMessageDialog(null,"验证通过","验证码输入",JOptionPane.CLOSED_OPTION);
		}
		else {
			JOptionPane.showMessageDialog(null,"验证失败","验证码输入",0);
		}input.close();
	}
}
