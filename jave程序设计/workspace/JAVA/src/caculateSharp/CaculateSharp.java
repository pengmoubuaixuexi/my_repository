package caculateSharp;
import java.util.Scanner;
public class CaculateSharp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入长度");
		double radiousOrSide = input.nextDouble();
		creatarea(radiousOrSide);
		System.out.println("如果你想要继续输出一个矩形，请再输入一个宽");
		System.out.println("如果不需要请输入0");
		double wideSide = input.nextDouble();
		if(wideSide==0) {
			input.close();
		}
		else {
		creatarea(radiousOrSide,wideSide);
		input.close();
	}}
	public static void creatarea(double radiousOrSide) {
		final double PI = 3.1415;
		System.out.println("以"+radiousOrSide+"为半径的圆面积为"+String.format("%.2f",(PI*radiousOrSide*radiousOrSide)));
		System.out.println("以"+radiousOrSide+"为边长的正方形面积为"+radiousOrSide*radiousOrSide);
	}
	public static void creatarea(double radiousOrSide , double wideSide) {
		if(radiousOrSide==wideSide) {
			System.out.println("这仍是个正方形，面积如上");
		}
		else {
		System.out.println("以"+radiousOrSide+"为长以"+wideSide+"宽的矩形面积为"+String.format("%.2f",(radiousOrSide*wideSide)));
	}}
}
