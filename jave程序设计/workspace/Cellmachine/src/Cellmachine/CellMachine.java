package Cellmachine;
import javax.swing.JFrame;
public class CellMachine {

	//��������� main ������ʼ��������ʦ�����ڿ�����ǿ����
	public static void main(String[] args) {
		//����һ��30x30������
		Field field = new Field(30,30);
		
		/*-------------�������е�������ÿ�����������һ��ϸ���Ķ���-------------*/
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				field.place(row, col, new Cell());
			}
		}
		
/*����һ��ϸ���ı���������������ι������е�ϸ��������������������С��1/5,�����ϸ�����*/
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				Cell cell = field.get(row, col);
				if ( Math.random() < 0.2 ) {
					cell.reborn();
				}
			}
		}
		
		/*----------------------�������ӻ�����----------------------*/
		View view = new View(field);//�� field��Ϊ�������� view ����ȥ
		JFrame frame = new JFrame();//����frame���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ��ڣ�ֹͣ����
		frame.setResizable(false);//���ɱ�����
		frame.setTitle("Cells");//���ñ��� Cells
		frame.add(view);//�� view �ӽ�����ʾ(�е�������ArrayList Ҳ�Ǵ���Ķ���		
		/*
		 Causes this Window to be sized to fit the preferred 
		 size and layouts of its subcomponents
		�����ǹٷ��ĵ�����Ӣ��ע�ͣ�������˼��
		�Ѵ��ڵ���Ϊ�Ƽ��Ĵ�С�����Զ��Ű��������ѧ java Ҫ������ĵ�
		�� eclipse ��������԰ѹ��ŵ���������ϣ������Զ����س��ĵ�
		������ܿ���Ӣ�Ŀ���ֱ�Ӷ�
		*/
		frame.pack();		
		frame.setVisible(true);//���ô��ڿοɼ�
		
		/*-----------���������е������룬����Ƚ϶࣬һ��Ҫϸϸ˼��---------*/
		for ( int i=0; i<1000; i++ ) //����1000��ѭ����Ҳ���Ǳ�����1000������
		{							 //һ�������һ���Ļ�,��·900,000��
			for ( int row = 0; row<field.getHeight(); row++ ) 
			{
				for ( int col = 0; col<field.getWidth(); col++ ) 
				{
					//�������� for ѭ����������������
					
					Cell cell = field.get(row, col);//����һ��ϸ�����������ι���ÿ��ϸ��
					
					//����ϸ�����飬��ȡ�ھ�״����û�ж���������������Ϊ����Ҫ��
					//�ں�������ֱ�ӻ�ȡ�������е��ھ�
					Cell[] neighbour = field.getNeighbour(row, col);
					
					//ͳ����Χϸ���Ĵ�����
					int numOfLive = 0;
					for (Cell c: neighbour ) {
						if ( c.isAlive() ) {
							numOfLive++;
						}
					}
					
					//�����ǰ��������ϸ��������
					System.out.print("["+row+"]["+col+"]:");
					//����һ����Ŀ���ʽ����ʦ�Ͽ�ʱû�н���
					System.out.print(cell.isAlive()?"live":"dead");
					//����ھӵĴ������
					System.out.print(":"+numOfLive+"-->");
					
					
					if ( cell.isAlive() ) //���ϸ�����
					{
						if ( numOfLive <2 || numOfLive >3 )
						{
							cell.die(); //��Χ�������С��2����3��ϸ������
							System.out.print("die");//��˼�ǣ���Χϸ��Ϊ2��3��ʱ������
						}
					} 
					else if ( numOfLive == 3 ) //���ϸ����������,��Χ�������Ϊ3
					{
						cell.reborn();//ϸ�����Ը���
						System.out.print("reborn");
					}
					System.out.println();
				}//������forѭ��
			}//�ڶ���forѭ��
			System.out.println("UPDATE");//����Ҳ�֪����ô������ģ�Ӧ�����1000��Ŷ�
			frame.repaint();//Repaints this component. ���±������
			
			//�������쳣�����ں��潲������� Thread ���߳��йأ����ﲻ������
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}//��һ��forѭ��
	}

}

