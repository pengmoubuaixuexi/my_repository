package order;
public class ProductInformation {
	static Production[] production = {new Production("ÄÃÌú¿§·È ", 18),new Production("ÏÊÓóÄÌ²è ",11),new Production("¿¨²¼ÆæÅµ ",20)};
//	static Producion[][] production = {{new Production("ÄÃÌú¿§·È ", 18),new Production("ÏÊÓóÄÌ²è ",11),new Production("¿¨²¼ÆæÅµ ",20)},{new Production("ÄÃÌú¿§·È ", 18),new Production("ÏÊÓóÄÌ²è ",11),new Production("¿¨²¼ÆæÅµ ",20)}};
	int[] productionNumber = new int[production.length];
	double[] amountOfMoney = new double[production.length];
	ProductInformation(int m1,int n1,int m2,int n2,int m3,int n3){//mÎªproduction,nÎª¶ÔÓ¦mµÄproductionNumber
			productionNumber[m1] = n1;
			productionNumber[m2] = n2;
			productionNumber[m3] = n3;
		for(int i=0;i<production.length;i++) {
			if(productionNumber[i] == 0) {
				
			}
			else {
		this.amountOfMoney[i] = production[i].productionPrice*productionNumber[i]; 
	}}}
	public void print() {
		for(int i = 0;i<production.length;i++) {
				if(productionNumber[i] == 0) {
					
				}
				else {
			System.out.println(production[i]+"\t"+productionNumber[i]+"\t"+amountOfMoney[i]);
		}}
		}
	public static void printmenu() {
		for(int i = 0;i<production.length;i++) {
			System.out.println(production[i]);
		}
	}
	public double[] getAmountOfMoney() {
		return amountOfMoney;
	}
}
