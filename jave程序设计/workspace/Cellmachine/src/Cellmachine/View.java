package Cellmachine;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JPanel {
	//定义一些不知道什么用途的常量
	private static final long serialVersionUID = -5258995676212660595L;
	private static final int GRID_SIZE = 16;
	
	//定义自己的变量
	private Field theField;
	
	//构造函数
	public View(Field field) {
		theField = field;
	}

	//@Override
	public void paint(Graphics g) {
		super.paint(g);//Invoked by Swing to draw components. 画出传入的图形
		
		//遍历传入的区域
		for ( int row = 0; row<theField.getHeight(); row++ ) 
		{
			for ( int col = 0; col<theField.getWidth(); col++ ) 
			{	
				//用细胞变量依次管理被遍历的 Cell对象
				Cell cell = theField.get(row, col);
				if ( cell != null ) //该区域有Cell的对象
				{//调用draw函数 对象为传入的 g, x=1x16,y=1x16,y=2x16...
					cell.draw(g, col*GRID_SIZE, row*GRID_SIZE, GRID_SIZE);
				}
			}
		}
	}//这个函数我没找到子那里被调用了，麻烦知道的人指点一下

	//@Override
	public Dimension getPreferredSize() {
		return new Dimension(theField.getWidth()*GRID_SIZE+1, theField.getHeight()*GRID_SIZE+1);
	}//Constructs a Dimension and initializesit to the specified width and specified height
	//创建一个维度，参数是长和宽,这个函数我也没有找到被调用的地方
	
	/*-----------------------以下是测试代码，不再写注释--------------------------------*/
//	public static void main(String[] args) {
//		Field field = new Field(10,10);
//		for ( int row = 0; row<field.getHeight(); row++ ) {
//			for ( int col = 0; col<field.getWidth(); col++ ) {
//				field.place(row, col, new Cell());
//			}
//		}
//		View view = new View(field);
//		JFrame frame = new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setResizable(false);
//		frame.setTitle("Cells");
//		frame.add(view);
//		frame.pack();
//		frame.setVisible(true);
//	}

}

