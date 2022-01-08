package selectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] beforelist = new int[] {8,2,5,6,9,1,3,7,4};
		for(int i=0;i<beforelist.length;i++) {
			int currentMin = beforelist[i];
				for(int j=i+1;j<beforelist.length;j++) {
					if(beforelist[j]<currentMin) {
						int cucun=0;
						cucun=beforelist[j];
						beforelist [j] =currentMin;
						beforelist[i]=cucun;
						currentMin = beforelist[i];
					}
				}
	}
		for(int a:beforelist)
			System.out.println(a);

}}
