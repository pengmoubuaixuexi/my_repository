package week6;

public class Test {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(2);
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2,3);
		System.out.println("û�и���ֵԲ�İ뾶Ϊ "+c1.radius+" ���Ϊ "+c1.getArea()+" �ܳ�Ϊ "+c1.getPrimeter());
		System.out.println("����ֵΪ2��Բ�İ뾶Ϊ "+c2.radius+" ���Ϊ "+c2.getArea()+" �ܳ�Ϊ "+c2.getPrimeter());
		System.out.println("û�и���ֵ���εĳ�Ϊ "+r1.length+" ��Ϊ "+r1.width+" ���Ϊ "+r1.getArea()+" �ܳ�Ϊ "+r1.getPrimeter());
		System.out.println("����ֵΪ2,3�ľ��εĳ�Ϊ "+r2.length+" ��Ϊ "+r2.width+" ���Ϊ "+r2.getArea()+" �ܳ�Ϊ "+r2.getPrimeter());
	}

}
