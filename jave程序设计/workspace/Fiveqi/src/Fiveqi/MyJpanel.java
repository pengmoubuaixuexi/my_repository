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
	int map[][] = new int[16][16]; // 棋盘
	int flag = 2; // 1为白 2为黑 黑白交替默认为黑
	int winer=0; //规定赢者
 
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
		// 窗体的常用设置
		this.setSize(750, 780);// 设置窗体的大小，宽度和高度，单位是像素
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);// 设置窗体关闭时主线程自动关闭
		this.setLocationRelativeTo(null);// 设置窗体出现的位置在显示器正中间
		this.setResizable(false);// 设置窗体固定大小
		this.setLayout(null);// 不启用布局管理器，改为手动布局
		this.setTitle("画图");
 
		// 添加面板到窗体
 
		pj = new PicJpanel(this);
		pj.addMouseListener(new MyMouse(this));// 给面板添加一个鼠标监听事件
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
		// 设定面板在窗体中的位置以及高度和宽度
		this.setBounds(0, 0, mj.getWidth(), mj.getHeight());
		this.mj = mj;
	}
 
	/**
	 * 画组件
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
				// 1为白
				if (map[i][j] == 1) {
					g.setColor(Color.WHITE);
					g.fillOval(50 * j, 50 * i, 50, 50);
				}
				g.setColor(Color.black);
				// 2为黑
				if (map[i][j] == 2) {
					g.setColor(Color.black);
					g.fillOval(50 * j, 50 * i, 50, 50);
				}
			}
		}
		
		
		// g.setColor(Color.RED);//设置画笔为红色
		// g.drawRect(50, 50, 100, 100);//画一个矩形.前面两个参数决定位置,后两个参数决定大小
		// g.setColor(Color.BLUE);
		// g.fillRect(200,50, 100, 100);//画一个实心的矩形
		// g.drawOval(50, 200, 100, 100);
		// g.fillOval(200, 200, 100, 100);
	}
 
}
