package Cellmachine;
import javax.swing.JFrame;
public class CellMachine {

	//看懂代码从 main 函数开始，这是老师数次在课堂上强调的
	public static void main(String[] args) {
		//定义一个30x30的网格
		Field field = new Field(30,30);
		
		/*-------------遍历所有的网格，在每个网格里面放一个细胞的对象-------------*/
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				field.place(row, col, new Cell());
			}
		}
		
/*定义一个细胞的变量，这个变量依次管理所有的细胞对象，如果产生的随机数小于1/5,把这个细胞变活*/
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				Cell cell = field.get(row, col);
				if ( Math.random() < 0.2 ) {
					cell.reborn();
				}
			}
		}
		
		/*----------------------创建可视化界面----------------------*/
		View view = new View(field);//把 field作为参数放入 view 里面去
		JFrame frame = new JFrame();//创建frame框架
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口，停止程序
		frame.setResizable(false);//不可被拉伸
		frame.setTitle("Cells");//设置标题 Cells
		frame.add(view);//把 view 加进来显示(有点类似于ArrayList 也是储存的对象		
		/*
		 Causes this Window to be sized to fit the preferred 
		 size and layouts of its subcomponents
		上面是官方文档给的英文注释，他的意思是
		把窗口调整为推荐的大小，并自动排版子组件，学 java 要多查阅文档
		在 eclipse 里面你可以把光标放到这个方法上，他会自动加载出文档
		（如果能看懂英文可以直接读
		*/
		frame.pack();		
		frame.setVisible(true);//设置窗口课可见
		
		/*-----------这里是运行的主代码，代码比较多，一定要细细思考---------*/
		for ( int i=0; i<1000; i++ ) //做了1000次循环（也就是遍历了1000次区域，
		{							 //一个表格算一步的话,走路900,000步
			for ( int row = 0; row<field.getHeight(); row++ ) 
			{
				for ( int col = 0; col<field.getWidth(); col++ ) 
				{
					//上面两个 for 循环遍历了整个区域
					
					Cell cell = field.get(row, col);//定义一个细胞变量，依次管理每个细胞
					
					//定义细胞数组，获取邻居状况（没有定义数组上限是因为不需要，
					//在函数里面直接获取到了所有的邻居
					Cell[] neighbour = field.getNeighbour(row, col);
					
					//统计周围细胞的存活情况
					int numOfLive = 0;
					for (Cell c: neighbour ) {
						if ( c.isAlive() ) {
							numOfLive++;
						}
					}
					
					//输出当前遍历到的细胞存活情况
					System.out.print("["+row+"]["+col+"]:");
					//这是一个三目表达式，老师上课时没有讲过
					System.out.print(cell.isAlive()?"live":"dead");
					//输出邻居的存活数量
					System.out.print(":"+numOfLive+"-->");
					
					
					if ( cell.isAlive() ) //如果细胞存活
					{
						if ( numOfLive <2 || numOfLive >3 )
						{
							cell.die(); //周围存活数量小于2大于3，细胞死亡
							System.out.print("die");//意思是，周围细胞为2或3的时候不用死
						}
					} 
					else if ( numOfLive == 3 ) //如果细胞是死亡的,周围存活数量为3
					{
						cell.reborn();//细胞可以复活
						System.out.print("reborn");
					}
					System.out.println();
				}//第三层for循环
			}//第二层for循环
			System.out.println("UPDATE");//这个我不知道怎么清除掉的，应该输出1000遍才对
			frame.repaint();//Repaints this component. 更新表格数据
			
			//这里是异常，属于后面讲解的内容 Thread 与线程有关，这里不做讨论
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}//第一层for循环
	}

}

