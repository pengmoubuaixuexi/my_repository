package order;
public class PayInformation {
	int totalNumberOfProduction;
	double totalMoney;
	double getMoney;
	double returnMoney;
	static String[] ChocolatePaymentMethod = {"΢��֧��","֧����֧��","�ֽ�֧��","ˢ��֧��"};
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
		System.out.println("Ʒ���ܼ�"+"\t"+"\t"+"\t"+"\t"+totalNumberOfProduction);
		System.out.println("�ܼ�Ӧ��"+"\t"+"\t"+"\t"+"\t"+totalMoney);
		System.out.println("����"+"\t"+"\t"+"\t"+"\t"+getMoney);
		System.out.println("����"+"\t"+"\t"+"\t"+"\t"+returnMoney);
		System.out.println("-------------------------------------");
		System.out.println("������ϸ:");
		System.out.println(paymentMethod+"\t"+"\t"+"\t"+"\t"+getMoney);
	}
}
