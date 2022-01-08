#include <stdio.h>
#include <stdlib.h>

/*返回三个整数的最大值*/
int Max3 ( int A, int B, int C ) {
	return (A > B) ? (A > C ? A : C) : (B > C ? B : C);
}
/*分治法球List[left]到List[right]的最大子列和*/
int DivideAndConquer ( int List[], int left, int right ) {
	int MaxLeftSum, MaxRightSum;    //存放左右子问题的解。
	int MaxLeftBorderSum, MaxRightBorderSum;    //存放跨分界线的结果。
	
	int LeftBorderSum, RightBorderSum;
	int center, i;
	
    /*递归的终止条件，子列只有1个数字*/
	if ( left == right ) {
		if ( List[left] > 0 )	return List[left];
		else return 0;
	}
	
    /* “分”的过程 */
	center = ( left + right ) / 2;    //找到中分点。
	MaxLeftSum = DivideAndConquer ( List, left, center );    //递归求左子列和。
	MaxRightSum = DivideAndConquer ( List, center+1, right );    //递归求右子列和。
	
    /*求跨分界线的最大子列和*/
	MaxLeftBorderSum = 0;	LeftBorderSum = 0;
	for ( i = center; i >= left; i-- ) {
		LeftBorderSum += List[i];
		if ( LeftBorderSum > MaxLeftBorderSum )
			MaxLeftBorderSum = LeftBorderSum;
	}//左边扫描结束。
	
	MaxRightBorderSum = 0;	RightBorderSum = 0;
	for ( i = center+1; i <= right; i++ ) {
		RightBorderSum += List[i];
		if ( RightBorderSum > MaxRightBorderSum )
			MaxRightBorderSum = RightBorderSum;
	}//右边扫描结束。
	
    /*返回“治”的结果*/
	return Max3 ( MaxLeftSum, MaxRightSum, MaxLeftBorderSum + MaxRightBorderSum );
}
/*此函数用于保持接口相同*/
int MaxSubseqSum3 ( int List[], int N ) {
	return DivideAndConquer ( List, 0, N-1 );
}
int main(){
	int List[10]={3,1,7,2,8,23,6,1,-6,1};
	printf("%d",MaxSubseqSum3 (List,10));
}
