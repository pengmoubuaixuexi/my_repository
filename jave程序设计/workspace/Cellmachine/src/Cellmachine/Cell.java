package Cellmachine;

import java.awt.Graphics;

public class Cell {
	private boolean alive = false;
	
	public void die() { alive = false; }
	public void reborn() { alive = true; }
	public boolean isAlive() { return alive; }
	
	public void draw(Graphics g, int x, int y, int size) {
		g.drawRect(x, y, size, size);//x y�����꣬size�Ǵ�С��
									 //��һ��λ��x,yλ���ϣ���ɫ��ɫ��ɫ��
		if ( alive ) //����������ɫ��Ĭ��Ϊ��ɫ
		{
//			g.setColor(Color.yellow);//���Դ���
			g.fillRect(x, y, size, size);//��ɫ�������ɫ��������drawRectһ��
		}
	}
}

