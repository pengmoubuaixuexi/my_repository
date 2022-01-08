package week11;
public class Bill {
		ShopInformation s = new ShopInformation() ;
		ProductInformation pr;
		PayInformation pa;
		Bill(PayInformation pa,ProductInformation pr){//n用于选择支付方式；
			this.pr = pr;
			this.pa = pa;
		}
		public void print() {
			s.print();
			System.out.println("商品名称"+"\t"+"\t"+"单价"+"\t"+"数量"+"\t"+"金额");
			System.out.println("-------------------------------------");
			pr.print();
			System.out.println("-------------------------------------");
			pa.print();
		}
}