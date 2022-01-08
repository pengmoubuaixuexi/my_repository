package week6;
import java.util.Scanner;
/*由于这个递归需要从1开始到n；用方法抽取的话，得定义一个全局变量n
这个n即为递推到哪一项，而i的定义是由于递归需要的f（i+1）；否则无法递归；
然后因为n定义的全局变量，从main改同样可以影响到f块中，所以不需要加一个
setN的函数。*/
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
