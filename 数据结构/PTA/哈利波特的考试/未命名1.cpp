#include <stdio.h>
#include <stdlib.h>
int main(){
	int n,i,j,m,temp;
	scanf("%d %d",&m,&n);//m是动物数，也就是站点数,n为多少条咒语 
	int a[3][n];
	for(i=0;i<n;i++){
		scanf("%d %d %d",&a[0][i],&a[1][i],&a[2][i]);
	}
	for(j=0;j<n;j++){
		if(a[1][j]<a[0][j]){
			temp = a[0][j];
			a[0][j] = a[1][j];
			a[1][j] = temp;	
		}
	}
	for(i=0;i<2;i++){
		for(j=0;j<n;j++){
			printf("%d ",a[i][j]);
			}printf("\n");
		}
//	printf()
//	m=1
//	for(i=0;i<2;i++){
//		for(j=0;j<n;j++){
//			if(a[i][j]==m){
//				m = a[1-i][j];
//			}
//		}
//	}
} 
