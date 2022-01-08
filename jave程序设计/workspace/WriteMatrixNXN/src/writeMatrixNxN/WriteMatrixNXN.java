package writeMatrixNxN;

import java.util.Scanner;

public class WriteMatrixNXN {

	public static void main(String[] args) {
		System.out.println("请输入一个数代表几阶矩阵");
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		printMatrix(n);
	}
public static void printMatrix(int n) {
	int  random = 0;
	for(int i=0;i<n;i++) {
		System.out.println();
		for(int j=0;j<n;j++) {
			if(Math.random()<0.5)
				random=0;
			else 
				random=1;
		System.out.print(" "+random+" ");
	}}}
}
