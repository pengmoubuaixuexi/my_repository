package Fiveqi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 
public class MyJpanel extends JFrame {
	PicJpanel pj;
	int map[][] = new int[16][16]; // ����
	int flag = 2; // 1Ϊ�� 2Ϊ�� �ڰ׽���Ĭ��Ϊ��
	int winer=0; //�涨Ӯ��
 
	public int[][] getMap() {
		return map;
	}
 
	public void setMap(int[][] map) {
		this.map = map;
	}
 
	public MyJpanel() {
		init();
	}
 
	private void init() {
		// ����ĳ�������
		this.setSize(750, 780);// ���ô���Ĵ�С����Ⱥ͸߶ȣ���λ������
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);// ���ô���ر�ʱ���߳��Զ��ر�
		this.setLocationRelativeTo(null);// ���ô�����ֵ�λ������ʾ�����м�
		this.setResizable(false);// ���ô���̶���С
		this.setLayout(null);// �����ò��ֹ���������Ϊ�ֶ�����
		this.setTitle("��ͼ");
 
		// �����嵽����
 
		pj = new PicJpanel(this);
		pj.addMouseListener(new MyMouse(this));// ��������һ���������¼�
		this.add(pj);
 
		this.setVisible(true);
	}
 
	public static void main(String[] args) {
		new MyJpanel();
	}
}
 
class PicJpanel extends JPanel {
	MyJpanel mj;
 
	public PicJpanel(MyJpanel mj) {
		// �趨����ڴ����е�λ���Լ��߶ȺͿ��
		this.setBounds(0, 0, mj.getWidth(), mj.getHeight());
		this.mj = mj;
	}
 
	/**
	 * �����
	 */
	@Override
	protected void paintComponent(Graphics g) {
 
		try {
			BufferedImage bi = ImageIO.read(new File("img/bj.jpg"));
			g.drawImage(bi, 0, 0, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
 
		int map[][] = mj.map;
 
		g.setColor(Color.yellow);
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				g.drawRect(50 * i, 50 * j, 50, 50);
				// 1Ϊ��
				if (map[i][j] == 1) {
					g.setColor(Color.WHITE);
					g.fillOval(50 * j, 50 * i, 50, 50);
				}
				g.setColor(Color.black);
				// 2Ϊ��
				if (map[i][j] == 2) {
					g.setColor(Color.black);
					g.fillOval(50 * j, 50 * i, 50, 50);
				}
			}
		}
		
		
		// g.setColor(Color.RED);//���û���Ϊ��ɫ
		// g.drawRect(50, 50, 100, 100);//��һ������.ǰ��������������λ��,����������������С
		// g.setColor(Color.BLUE);
		// g.fillRect(200,50, 100, 100);//��һ��ʵ�ĵľ���
		// g.drawOval(50, 200, 100, 100);
		// g.fillOval(200, 200, 100, 100);
	}
 
}
