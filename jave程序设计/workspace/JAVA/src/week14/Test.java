package week14;

import java.util.Optional;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String args[]) {//��СдҲҪ����
		Scanner input = new Scanner(System.in);
		Output output = new Output();
		String num = output.toString();
		System.out.println(num);
		String num1 = JOptionPane.showInputDialog("��������֤��");
		if(num1.equals(num)) {
			JOptionPane.showMessageDialog(null,"��֤ͨ��","��֤������",JOptionPane.CLOSED_OPTION);
		}
		else {
			JOptionPane.showMessageDialog(null,"��֤ʧ��","��֤������",0);
		}input.close();
	}
}
