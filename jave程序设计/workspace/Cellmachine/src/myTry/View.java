package myTry;

import java.awt.Graphics;

import javax.swing.JPanel;

public class View extends JPanel {
	private static final long serialVersionUID = -5258995676212660595L;
	private static final int GRID_SIZE = 16;
	private Field thefield;
	View(Field field){
		this.thefield = field;
	}
	public void paint(Graphics g) {
		super.paint(g);
		for(int row =0;row<thefield.getHeight;row++) {
			for(int col = 0;col<thefield.getWidth;col++) {
				Cell cell = thefield.get(row,col);
				if(cell!=null) {
					cell.draw(g, col*GIRD_SIZE, row*GIRD_SIZE,GIRD_SIZE);
				}
			}
		}		
	}
	
}
