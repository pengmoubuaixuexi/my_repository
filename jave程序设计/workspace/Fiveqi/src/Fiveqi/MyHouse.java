package Fiveqi;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

class MyMouse extends MouseAdapter {
	MyJpanel mj;
 
	public MyMouse(MyJpanel mj) {
		super();
		this.mj = mj;
	}
 
	@Override
	public void mousePressed(MouseEvent e) {
		
		//����1
		if(mj.winer!=0){
			mj.setMap(new int[16][16]);
			mj.winer=0;
			mj.pj.repaint();
			return;
		}
		int map[][] = mj.map;
		Point p = e.getPoint();// ��ȡ�����µ�λ�õ�����
		// ���֮��mapֵ�����ı�
		int x = (int) p.getX() / (750 / 15);
		int y = (int) p.getY() / (750 / 15);
		System.out.println("x=" + p.getX() + "   y=" + p.getY());
		System.out.println("x=" + x + "   y=" + y);
 
		// �ı����ӵ���ɫ
		if (map[y][x] == 0) {
			map[y][x] = mj.flag;
		}
		
		// �ı�˳��
		if (mj.flag == 1) {
			mj.flag = 2;
		} else if(mj.flag==2){
			mj.flag = 1;
		}
 
 
		//�ж���Ӯ
		MyMouse mouse=new MyMouse(mj);
		if(mouse.isWin(y, x, map)){
			if(map[y][x]==1){
				mj.winer=1;
				mj.pj.repaint();
				//������ʤ��Ϣ
				JOptionPane.showMessageDialog(mj, "����ʤ");
				//����������ɫΪ����
				mj.flag=2;
			}
			if(map[y][x]==2){
				mj.winer=2;
				mj.pj.repaint();
				JOptionPane.showMessageDialog(mj, "����ʤ");
				//����������ɫΪ����
				mj.flag=2;
			}
		}
		
		//�ȵ������� �ڻ�ͼ
		mj.setMap(map);
		mj.pj.repaint();
		
				
		
	}
 
	public boolean isWin(int x, int y, int map[][]) {
		// ��ʤ���ж�
		// 4������ ���� ���� ��б ��б
		// ��һ�����ӵ�һ�������10�����ӽ����ж� �Ƿ�����5������
		// ����
		
		int num = 1;
		for (int i = 0; i < 14; i++) {
			if (map[x][i] != 0) {
				if (map[x][i] == map[x][i + 1]) {
					num++;
					if (num >= 5) {
						System.out.println("win");
						return true;
					}
				} else {
					num = 1;
				}
			}
		}
 
		// ����
		num = 1;
		for (int i = 0; i < 14; i++) {
			if (map[i][y] != 0) {
				if (map[i][y] == map[i + 1][y]) {
					num++;
					if (num >= 5) {
						System.out.println("win");
						return true;
					}
				} else {
					num = 1;
				}
			}
		}
 
		num=1;
		// ��б x-1 j+1
		for (int i = 0; i < map.length*2-1; i++) {
			for (int j = 1; j < map.length ; j++) {
				if (((i - j) >= 0) && ((i - j) < map.length)) {
					if(map[j][i-j]!=0){
						if(map[j][i-j]==map[j-1][i-j+1]){
							num++;
							if (num >= 5) {
								System.out.println("win");
								return true;
							}
						}else{
							num=1;
						}
					}
				}
			}
		}
		
		num=1;
		//��б x+1 y+1
		for (int i = -map.length; i < map.length; i++) {
			for (int j = 1; j < map.length; j++) {
				if(((i+j)>=0)&&((i+j)<map.length)){
					if(map[j][j+i]!=0){
						if(map[j][i+j]==map[j+1][i+j+1]){
							num++;
							if (num >= 5) {
								System.out.println("win");
								return true;
							}
						}else{
							num=1;
						}
					}
				}
			}
		}
		
		return false;
	}
 
}