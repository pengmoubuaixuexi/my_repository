package week6;
import java.util.Scanner;
/*��������ݹ���Ҫ��1��ʼ��n���÷�����ȡ�Ļ����ö���һ��ȫ�ֱ���n
���n��Ϊ���Ƶ���һ���i�Ķ��������ڵݹ���Ҫ��f��i+1���������޷��ݹ飻
Ȼ����Ϊn�����ȫ�ֱ�������main��ͬ������Ӱ�쵽f���У����Բ���Ҫ��һ��
setN�ĺ�����*/
public class Recursion {
	static int i=1;
	static int n=0;
	public static void main(String[] args) {
		System.out.println("please input n:");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		double y = f(i);
		System.out.println(y);
		input.close();
	}
	public static double f(int i) {
		if(i<n) {
		double a = i+f(i+1);
		return 1/a;}
		else
			return 1.0/(n);
}}
