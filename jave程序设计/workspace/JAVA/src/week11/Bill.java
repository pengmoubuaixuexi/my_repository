package week11;
public class Bill {
		ShopInformation s = new ShopInformation() ;
		ProductInformation pr;
		PayInformation pa;
		Bill(PayInformation pa,ProductInformation pr){//n����ѡ��֧����ʽ��
			this.pr = pr;
			this.pa = pa;
		}
		public void print() {
			s.print();
			System.out.println("��Ʒ����"+"\t"+"\t"+"����"+"\t"+"����"+"\t"+"���");
			System.out.println("-------------------------------------");
			pr.print();
			System.out.println("-------------------------------------");
			pa.print();
		}
}