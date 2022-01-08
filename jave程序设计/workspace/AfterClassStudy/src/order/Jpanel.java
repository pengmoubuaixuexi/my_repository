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
		//1.创建一个JFrame：myFrame
		JFrame myFrame = new JFrame();
		//2.设置myFrame的属性：可见、大小
		myFrame.setVisible(true);
		myFrame.setSize(200, 200);
		//3.创建一个JPanel：myPanel
		JPanel myPanel = new JPanel();
		//4.把myPanel放置在myFrame上
		myFrame.add(myPanel);
		//5.创建一个JButton：myButton
		JButton myButton = new JButton("开始点餐");
		//6。把myButton放置在myPanel上
		myPanel.add(myButton);
		
		//7.给myButton添加事件监听：内部类方式（仔细看，特别是标点符号）
		myButton.addMouseListener(new MouseListener() {
				
			public void mouseReleased(MouseEvent e) {}			
			public void mousePressed(MouseEvent e) {}			
			public void mouseExited(MouseEvent e) {}		
			public void mouseEntered(MouseEvent e) {}		
			public void mouseClicked(MouseEvent e) {
				//一个弹框，此处不细说其语法
				Bill[] bill = new Bill[1000];
				int count = 0;
				count++;
				System.out.println("今天的第"+count+"次服务");
				System.out.println("please look our menu to order");
				ProductInformation.printmenu();
				int[] n1=new int[3];
				myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				for(int i =0;i<ProductInformation.production.length;i++) {
					System.out.println("请告诉我你要"+ProductInformation.production[i].productionName+"几个");
					JFrame myFrame1 = new JFrame();
					//2.设置myFrame的属性：可见、大小
					myFrame.setVisible(true);
					myFrame.setSize(200, 200);
					//3.创建一个JPanel：myPanel
					JPanel panel02 = new JPanel();
					panel02.add(new JLabel("密 码"));
					panel02.add(new JPasswordField(10));
					myFrame1.add(panel02);
					n1[i] = input.nextInt();
				}
				System.out.println("now please tell me what you");
				ProductInformation pr = new ProductInformation(0,n1[0],1,n1[1],2,n1[2]);
				System.out.println("您的订单已经生成请选择付款方式进行付款并等待取餐");
				int n = input.nextInt();
				double getMoney = input.nextDouble();
				PayInformation pa = new PayInformation(pr, getMoney,n);
				if(pa.returnMoney<0) {
					System.out.println("您支付的金额不够请补"+Math.abs(pa.returnMoney));
					double getMoney1 = input.nextDouble();
					pa = new PayInformation(pr, getMoney1+getMoney, n);
				}
				if(pa.returnMoney<0) {
					System.out.println("您多次乱付款，我们将报警处理");
				}
				bill[count-1] = new Bill(pa, pr);
				bill[count-1].print();
				System.out.println("-------------------------------------");
			}
});				input.close();
}}