package week11;
//可建立一个二维的菜单用于换季的时候更换菜单。
public class ProductInformation {
		static Production[] production = {new Production("拿铁咖啡 ", 18),new Production("鲜芋奶茶 ",11),new Production("卡布奇诺 ",20)};
//		static Producion[][] production = {{new Production("拿铁咖啡 ", 18),new Production("鲜芋奶茶 ",11),new Production("卡布奇诺 ",20)},{new Production("拿铁咖啡 ", 18),new Production("鲜芋奶茶 ",11),new Production("卡布奇诺 ",20)}};
		int[] productionNumber = new int[production.length];
		double[] amountOfMoney = new double[production.length];
		ProductInformation(int m1,int n1,int m2,int n2,int m3,int n3){//m为production,n为对应m的productionNumber
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
