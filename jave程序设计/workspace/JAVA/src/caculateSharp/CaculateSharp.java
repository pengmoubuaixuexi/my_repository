package caculateSharp;
import java.util.Scanner;
public class CaculateSharp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����볤��");
		double radiousOrSide = input.nextDouble();
		creatarea(radiousOrSide);
		System.out.println("�������Ҫ�������һ�����Σ���������һ����");
		System.out.println("�������Ҫ������0");
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
		System.out.println("��"+radiousOrSide+"Ϊ�뾶��Բ���Ϊ"+String.format("%.2f",(PI*radiousOrSide*radiousOrSide)));
		System.out.println("��"+radiousOrSide+"Ϊ�߳������������Ϊ"+radiousOrSide*radiousOrSide);
	}
	public static void creatarea(double radiousOrSide , double wideSide) {
		if(radiousOrSide==wideSide) {
			System.out.println("�����Ǹ������Σ��������");
		}
		else {
		System.out.println("��"+radiousOrSide+"Ϊ����"+wideSide+"��ľ������Ϊ"+String.format("%.2f",(radiousOrSide*wideSide)));
	}}
}
