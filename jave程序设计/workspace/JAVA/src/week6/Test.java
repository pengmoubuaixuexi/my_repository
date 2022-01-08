package week6;

public class Test {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(2);
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2,3);
		System.out.println("没有赋初值圆的半径为 "+c1.radius+" 面积为 "+c1.getArea()+" 周长为 "+c1.getPrimeter());
		System.out.println("赋初值为2的圆的半径为 "+c2.radius+" 面积为 "+c2.getArea()+" 周长为 "+c2.getPrimeter());
		System.out.println("没有赋初值矩形的长为 "+r1.length+" 宽为 "+r1.width+" 面积为 "+r1.getArea()+" 周长为 "+r1.getPrimeter());
		System.out.println("赋初值为2,3的矩形的长为 "+r2.length+" 宽为 "+r2.width+" 面积为 "+r2.getArea()+" 周长为 "+r2.getPrimeter());
	}

}
