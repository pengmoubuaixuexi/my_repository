package order;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
public class Jpanel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1.����һ��JFrame��myFrame
		JFrame myFrame = new JFrame();
		//2.����myFrame�����ԣ��ɼ�����С
		myFrame.setVisible(true);
		myFrame.setSize(200, 200);
		//3.����һ��JPanel��myPanel
		JPanel myPanel = new JPanel();
		//4.��myPanel������myFrame��
		myFrame.add(myPanel);
		//5.����һ��JButton��myButton
		JButton myButton = new JButton("��ʼ���");
		//6����myButton������myPanel��
		myPanel.add(myButton);
		
		//7.��myButton����¼��������ڲ��෽ʽ����ϸ�����ر��Ǳ����ţ�
		myButton.addMouseListener(new MouseListener() {
				
			public void mouseReleased(MouseEvent e) {}			
			public void mousePressed(MouseEvent e) {}			
			public void mouseExited(MouseEvent e) {}		
			public void mouseEntered(MouseEvent e) {}		
			public void mouseClicked(MouseEvent e) {
				//һ�����򣬴˴���ϸ˵���﷨
				Bill[] bill = new Bill[1000];
				int count = 0;
				count++;
				System.out.println("����ĵ�"+count+"�η���");
				System.out.println("please look our menu to order");
				ProductInformation.printmenu();
				int[] n1=new int[3];
				myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				for(int i =0;i<ProductInformation.production.length;i++) {
					System.out.println("���������Ҫ"+ProductInformation.production[i].productionName+"����");
					JFrame myFrame1 = new JFrame();
					//2.����myFrame�����ԣ��ɼ�����С
					myFrame.setVisible(true);
					myFrame.setSize(200, 200);
					//3.����һ��JPanel��myPanel
					JPanel panel02 = new JPanel();
					panel02.add(new JLabel("�� ��"));
					panel02.add(new JPasswordField(10));
					myFrame1.add(panel02);
					n1[i] = input.nextInt();
				}
				System.out.println("now please tell me what you");
				ProductInformation pr = new ProductInformation(0,n1[0],1,n1[1],2,n1[2]);
				System.out.println("���Ķ����Ѿ�������ѡ�񸶿ʽ���и���ȴ�ȡ��");
				int n = input.nextInt();
				double getMoney = input.nextDouble();
				PayInformation pa = new PayInformation(pr, getMoney,n);
				if(pa.returnMoney<0) {
					System.out.println("��֧���Ľ����벹"+Math.abs(pa.returnMoney));
					double getMoney1 = input.nextDouble();
					pa = new PayInformation(pr, getMoney1+getMoney, n);
				}
				if(pa.returnMoney<0) {
					System.out.println("������Ҹ�����ǽ���������");
				}
				bill[count-1] = new Bill(pa, pr);
				bill[count-1].print();
				System.out.println("-------------------------------------");
			}
});				input.close();
}}