package studentScore;

public class StudentScore {
		public static void main(String[] args) {
			int[][] AllScore = new int[][] {{2,4,3,4,5,8,8},{7,3,4,3,3,4,4},{3,3,4,3,3,2,2},{9,3,4,7,3,4,1},{3,5,4,3,6,3,8},{3,4,4,6,3,4,4},{3,7,4,8,3,8,4},{6,3,5,9,2,7,9}};
			for(int i=0;i<8;i++) {
				for(int j=0;j<7;j++) {
					System.out.print(AllScore[i][j]+" ");
		}System.out.println();}System.out.println("\n");
			change(AllScore);
		}

public static void change(int[][] AllScore) {
		int[] a= new int[7];
		int[] count =new int[8];
	for(int i=0;i<8;i++) {
		for(int j=0;j<7;j++) {
			count[i]=count[i]+AllScore[i][j];
		}}
	for(int i=0;i<8;i++) {
		int currentMin=count[i];
		for(int j=i+1;j<8;j++) {
	if(count[j]>currentMin) {
		for(int k=0;k<7;k++) {
			a[k] = AllScore[i][k];
			AllScore[i][k]=AllScore[j][k];
			AllScore[j][k]=a[k];
		}}
	}}
	for(int i=0;i<8;i++) {
	for(int j=0;j<7;j++) {
		System.out.print(AllScore[i][j]+" ");
	if(j==6)
		System.out.println();
	}}
}
} 