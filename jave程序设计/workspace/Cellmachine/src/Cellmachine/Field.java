package Cellmachine;
import java.util.ArrayList;
public class Field {
	private int width;
	private int height;
	private Cell[][] field;//����һ����ά��Cell�������飬���ڴ���ϸ��
	
	//���캯��
	public Field(int width, int height) {
		this.width = width;
		this.height = height;
		field = new Cell[height][width];//ͬʱ���� ��˸߸�ϸ�����󣬷Ž�field
	}
	
	/*--------------------�������������ڸ����ʹ��-------------------*/
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	
	public Cell place(int row, int col, Cell o) {
		Cell ret = field[row][col];//��fieldĳ��λ���϶�ϸ������Ĺ���Ȩ�޸���ret
		field[row][col] = o;//��λ��ȥ����һ���µĶ���
		return ret;
	}
	
	public Cell get(int row, int col) {
		return field[row][col];//��ȡ��ǰλ��
	}
	
	public Cell[] getNeighbour(int row, int col) {
		ArrayList<Cell> list = new ArrayList<Cell>();//����ϸ��
		
		//������Χ����
		for ( int i=-1; i<2; i++ ) {
			for ( int j=-1; j<2; j++ ) {
				
				int r = row+i;
				int c = col+j;//r,cΪ��λ
				
				if ( r >-1 && r<height && c>-1 && c<width && !(r== row && c == col) )
				{//���ϱ� 		���±�	  �����		���ұ�           �����㵱ǰλ�ô��
					list.add(field[r][c]);
				}
			}
		}
		return list.toArray(new Cell[list.size()]);//���ػ�ȡ����ϸ������
	}
	
	public void clear() {//�������ϸ����Ŀǰû�п���������
		for ( int i=0; i<height; i++ ) {
			for ( int j=0; j<width; j++ ) {
				field[i][j] = null;
			}
		}
	}
}
