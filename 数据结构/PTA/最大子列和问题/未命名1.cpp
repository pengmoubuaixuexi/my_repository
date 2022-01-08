#include <stdio.h>
#include <stdlib.h>

/*�����������������ֵ*/
int Max3 ( int A, int B, int C ) {
	return (A > B) ? (A > C ? A : C) : (B > C ? B : C);
}
/*���η���List[left]��List[right]��������к�*/
int DivideAndConquer ( int List[], int left, int right ) {
	int MaxLeftSum, MaxRightSum;    //�������������Ľ⡣
	int MaxLeftBorderSum, MaxRightBorderSum;    //��ſ�ֽ��ߵĽ����
	
	int LeftBorderSum, RightBorderSum;
	int center, i;
	
    /*�ݹ����ֹ����������ֻ��1������*/
	if ( left == right ) {
		if ( List[left] > 0 )	return List[left];
		else return 0;
	}
	
    /* ���֡��Ĺ��� */
	center = ( left + right ) / 2;    //�ҵ��зֵ㡣
	MaxLeftSum = DivideAndConquer ( List, left, center );    //�ݹ��������к͡�
	MaxRightSum = DivideAndConquer ( List, center+1, right );    //�ݹ��������к͡�
	
    /*���ֽ��ߵ�������к�*/
	MaxLeftBorderSum = 0;	LeftBorderSum = 0;
	for ( i = center; i >= left; i-- ) {
		LeftBorderSum += List[i];
		if ( LeftBorderSum > MaxLeftBorderSum )
			MaxLeftBorderSum = LeftBorderSum;
	}//���ɨ�������
	
	MaxRightBorderSum = 0;	RightBorderSum = 0;
	for ( i = center+1; i <= right; i++ ) {
		RightBorderSum += List[i];
		if ( RightBorderSum > MaxRightBorderSum )
			MaxRightBorderSum = RightBorderSum;
	}//�ұ�ɨ�������
	
    /*���ء��Ρ��Ľ��*/
	return Max3 ( MaxLeftSum, MaxRightSum, MaxLeftBorderSum + MaxRightBorderSum );
}
/*�˺������ڱ��ֽӿ���ͬ*/
int MaxSubseqSum3 ( int List[], int N ) {
	return DivideAndConquer ( List, 0, N-1 );
}
int main(){
	int List[10]={3,1,7,2,8,23,6,1,-6,1};
	printf("%d",MaxSubseqSum3 (List,10));
}
