package yangHuiDeArctangle;

public class YangHuiDeArctangle {
	public static void main(String[] args) {
		int level=7;//总共七行
		int count1,count2;//1是行的序号，2是列的
		int [][]yh=new int[level][level];
		yh[0][0]=1;
		try{for(count1=1;count1<level;count1++)
		{
			yh[count1][0]=1;
			for(count2=1;count2<=count1+100;count2++)
			{
				yh[count1][count2]=yh[count1-1][count2-1]+yh[count1-1][count2];
			}
		}}catch(Exception e) {
			System.out.println(e);
		}
		for(count1=0;count1<level;count1++)
		{
			for(count2=0;count2<=count1;count2++)
				System.out.print("  "+yh[count1][count2]);
			System.out.print("\n");
		}
	}
}
