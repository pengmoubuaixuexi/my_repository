package Cellmachine;

import java.awt.Graphics;

public class Cell {
	private boolean alive = false;
	
	public void die() { alive = false; }
	public void reborn() { alive = true; }
	public boolean isAlive() { return alive; }
	
	public void draw(Graphics g, int x, int y, int size) {
		g.drawRect(x, y, size, size);//x y是坐标，size是大小，
									 //画一个位于x,y位置上，底色百色的色块
		if ( alive ) //如果存活，填充颜色，默认为黑色
		{
//			g.setColor(Color.yellow);//测试代码
			g.fillRect(x, y, size, size);//给色块填充颜色，参数与drawRect一样
		}
	}
}

