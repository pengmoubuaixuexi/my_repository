package myTry;

import javax.swing.JFrame;

public class CellMachine {

	public static void main(String[] args) {
		Field field = new Field(30,30);
		for(int row = 0;row<field.getheight();row++) {
			for(int col = 0;col<field.getwidth();col++) {
					field.place(row, col, new Cell());
			}
	}
		for(int row = 0;row<field.getheight();row++) {
			for(int col = 0;col<field.getwidth();col++) {
				Cell cell = field.get(row, col);
				if(Math.random()<0.2){
					cell.reborn();
				}
			}
}		
		View view = new View(field);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("CellMachine");
		frame.add(view);
		frame.pack();
		frame.setVisible(true);
		for(int i = 0;i<1000;i++) {
			for(int row = 0;row<field.getheight();row++) {
				for(int col = 0;col<field.getwidth();col++) {
					Cell cell = field.get(row, col);
					Cell[] neighbour = field.getNeighbour(row, col);
					int n = 0;
					for(Cell o:neighbour) {
					if(o.isalive()) {
						n++;
					}
				}
					System.out.print("["+row+"]["+col+"]:");
					System.out.println(cell.isalive()?"live":"dead");
					System.out.print(":"+n+"-->");
					if ( cell.isalive() ) //如果细胞存活
					{
						if ( n <2 || n >3 )
						{
							cell.die(); //周围存活数量小于2大于3，细胞死亡
							System.out.print("die");//意思是，周围细胞为2或3的时候不用死
						}
					} 
					else if ( n == 3 ) //如果细胞是死亡的,周围存活数量为3
					{
						cell.reborn();//细胞可以复活
						System.out.print("reborn");
					}
					System.out.println();
			}
		}		System.out.println("UPDATE");
				frame.repaint();
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
		}}}