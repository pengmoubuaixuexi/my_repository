package order;

public class Production {
	String productionName;
	double productionPrice;
	Production(String productionName,double productionPrice){
		this.productionName = productionName;
		this.productionPrice = productionPrice;
	}
	@Override
	public String toString() {
		return productionName +"\t"+ productionPrice;
	}
}
