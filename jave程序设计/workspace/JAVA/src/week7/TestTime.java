package week7;
public class TestTime {
	public static void main(String[] args) {
		int[] arraylist = new int[10000];
		Stopwatch watch = new Stopwatch();
		for(int i =0;i<10000;i++)
			arraylist[i] = (int) (Math.random()*10000);
		System.out.println("��������֮ǰ��");
		for(int one : arraylist)
			System.out.println(one+" ");
		int smallest = arraylist[0];
		watch.star();
		for(int i = 0;i<10000;i++) {
			for(int j =1;j<10000;j++) {
			if(arraylist[i]>arraylist[j]) {
				smallest = arraylist[j];
				arraylist[j] = arraylist[i];
				arraylist[i] = smallest;
			}
}}		watch.stop();
 		System.out.println("��������֮���");
		for(int one :arraylist)
			System.out.println(one+" ");
		long time =watch.getAllTime();
		System.out.println("����10000�����������ʱ "+time+" ����");
		}}
