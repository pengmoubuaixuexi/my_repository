package order;
public class PayInformation {
	int totalNumberOfProduction;
	double totalMoney;
	double getMoney;
	double returnMoney;
	static String[] ChocolatePaymentMethod = {"微信支付","支付宝支付","现金支付","刷卡支付"};
	String paymentMethod;
	PayInformation(ProductInformation p,double getMoney,int n){
		totalNumberOfProduction = 0;
		for(int i = 0;i<p.productionNumber.length;i++) {
		totalNumberOfProduction = totalNumberOfProduction + p.productionNumber[i];}
		totalMoney = 0;
		for(int i = 0;i<p.amountOfMoney.length;i++) {
		totalMoney = totalMoney + p.amountOfMoney[i];}
		this.getMoney = getMoney;
		this.paymentMethod = ChocolatePaymentMethod[n+1];
		this.returnMoney = getMoney-totalMoney;
	}
	public void print() {
		System.out.println("品项总计"+"\t"+"\t"+"\t"+"\t"+totalNumberOfProduction);
		System.out.println("总计应付"+"\t"+"\t"+"\t"+"\t"+totalMoney);
		System.out.println("已收"+"\t"+"\t"+"\t"+"\t"+getMoney);
		System.out.println("找零"+"\t"+"\t"+"\t"+"\t"+returnMoney);
		System.out.println("-------------------------------------");
		System.out.println("付款明细:");
		System.out.println(paymentMethod+"\t"+"\t"+"\t"+"\t"+getMoney);
	}
}
