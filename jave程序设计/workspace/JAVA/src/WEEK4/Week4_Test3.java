package WEEK4;

import javax.swing.JOptionPane;

public class Week4_Test3 {

	public static void main(String[] args) {
		final double PI=3.14159;
		String radius=JOptionPane.showInputDialog("please input the radius");
		double radius1=Double.parseDouble(radius);
		JOptionPane.showMessageDialog(null,"�뾶Ϊ "+radius1+" ��Բ���Ϊ \n"+"           "+(PI*radius1*radius1));
	}
}
