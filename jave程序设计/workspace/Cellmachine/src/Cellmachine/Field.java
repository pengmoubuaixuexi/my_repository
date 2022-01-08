package Cellmachine;
import java.util.ArrayList;
public class Field {
	private int width;
	private int height;
	private Cell[][] field;//创建一个二维的Cell变量数组，用于储存细胞
	
	//构造函数
	public Field(int width, int height) {
		this.width = width;
		this.height = height;
		field = new Cell[height][width];//同时创造 宽乘高个细胞对象，放进field
	}
	
	/*--------------------这两个函数用于给外界使用-------------------*/
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	
	public Cell place(int row, int col, Cell o) {
		Cell ret = field[row][col];//把field某个位置上对细胞对象的管理权限赋给ret
		field[row][col] = o;//该位置去管理一个新的对象
		return ret;
	}
	
	public Cell get(int row, int col) {
		return field[row][col];//获取当前位置
	}
	
	public Cell[] getNeighbour(int row, int col) {
		ArrayList<Cell> list = new ArrayList<Cell>();//储存细胞
		
		//遍历周围方框
		for ( int i=-1; i<2; i++ ) {
			for ( int j=-1; j<2; j++ ) {
				
				int r = row+i;
				int c = col+j;//r,c为方位
				
				if ( r >-1 && r<height && c>-1 && c<width && !(r== row && c == col) )
				{//最上边 		最下边	  最左边		最右边           不计算当前位置存活
					list.add(field[r][c]);
				}
			}
		}
		return list.toArray(new Cell[list.size()]);//返回获取到的细胞数组
	}
	
	public void clear() {//清除所有细胞，目前没有看到被调用
		for ( int i=0; i<height; i++ ) {
			for ( int j=0; j<width; j++ ) {
				field[i][j] = null;
			}
		}
	}
}
