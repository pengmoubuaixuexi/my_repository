package myTry;
import java.util.ArrayList;
public class Field {
		private int width;
		private int height;
		private Cell[][] field;
		public Field(int width,int height) {
			this.width = width;
			this.height = height;
			field = new Cell[height][width];
		}
		public int getwidth() {return width;
		}
		public int getheight() {return height;
		}
		public Cell place(int row,int col,Cell o) {
			Cell ret = field[row][col];
			field[row][col]=o;
			return ret;
		}
		public Cell get(int row ,int col) {
			return field[row][col];
		}
		public Cell[] getNeighbour(int row,int col) {
			ArrayList<Cell> list = new ArrayList<Cell>();
			for(int i = -1;i<2;i++) {
				for(int j = -1;j<2;j++) {
					int r = row+i;
					int c = col+j;//r,c为方位
					
					if ( r >-1 && r<height && c>-1 && c<width && !(r== row && c == col) )
					{//最上边 		最下边	  最左边		最右边           不计算当前位置存活
						list.add(field[r][c]);
				}
				
			}
		}return list.toArray(new Cell[list.size()]);}public void clear() {//清除所有细胞，目前没有看到被调用
			for ( int i=0; i<height; i++ ) {
				for ( int j=0; j<width; j++ ) {
					field[i][j] = null;
				}
			}
		}}
		
