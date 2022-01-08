package ftoCAndCtoF;
import java.text.DecimalFormat; 
public class FtoCAndCtoF {

	public static void main(String[] args) {
		double F1=0,C1=0;
		double C=40;
		DecimalFormat df= new DecimalFormat("0.0");
		System.out.println("父箆業\t鯖箆業\t\t鯖箆業\t父箆業");
		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				for(double F=120; F>30;F=F-10) {
					C--;
					F1=CtoF(C);
					C1=FtoC(F);
					System.out.println(C+"\t"+df.format(F1)+"\t\t"+F+"\t"+df.format(C1));
				}
			
	}
public static double FtoC(double F) {
	double  C=(F-32)*5/9;
	return C;
}
public static double CtoF(double C) {
	double F=C*5/9+32;
	return F;
}
}
