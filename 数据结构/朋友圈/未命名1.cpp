#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

#include <stdio.h>
#include <stdlib.h>
void init(int S[],int n){
	int i;
	for(i=0;i<n;i++){
		S[i] = -1;
	}
}
void init1(int S[],int n){
	int i;
	for(i=0;i<n;i++){
		S[i] = 0;
	}
}
//int Find(int S[],int x){
//	for(;S[x]>=0;x=S[x]);
//	return x;
//}
int Find(int S[],int x){
	if (S[x]>=0){
		return S[x] = Find(S,S[x]);
	}
	return x;
}
void Union(int S[],int root1,int root2){
	S[root2] = root1;
}
void Input_connection(int S[],int u,int v){
	int root1,root2;
	root1 = Find(S,u-1);
	root2 = Find(S,v-1);
	if(root1!=root2){
		if(-S[root1]>-S[root2]){
			Union(S,root1,root2);
		}
		else if(S[root1]==S[root2]){
			Union(S,root2,root1);
			S[root2]--;
		}
		else{
			Union(S,root2,root1);
		}
	}
} 
void check_connection(int S[]){
	int u,v;
	int root1,root2;
	scanf("%d %d",&u,&v);
	root1 = Find(S,u-1);
	root2 = Find(S,v-1);
	if(root1 == root2) printf("yes\n");
	else printf("no\n");
}
void check_network(int S[],int n){
	int i,count=0;
	for(i=0;i<n;i++) 
		if(S[i]<0)
			count++;
	if(count==1){
		printf("this network is connected");
	}
	else
		printf("there is %d components",count);
}
int main(){
	int n,m,i,j,k;
	scanf("%d %d",&n,&m);
	int a[m][n];
	for(i=0;i<m;i++){
		scanf("%d",&a[i][0]);
		for(j=1;j<=a[i][0];j++){
			scanf("%d",&a[i][j]);
		}
	
	}
	int S[n];
	init(S,n);
	for(i=0;i<m;i++){
		for(k=1;k<a[i][0];k++){
			for(j=k+1;j<=a[i][0];j++){
			Input_connection(S,a[i][k],a[i][j]);
			}
		}
	}
	for(i=0;i<n;i++){
		Find(S,i);
	}
	int S1[n];
	init1(S1,n);
	for(i=0;i<n;i++){
		if(S[i]>=0)
			S1[S[i]]++;
	}
	int max = 0;
	for(i=0;i<n;i++){
		if (S1[i]>max)
			max = S1[i];
	}
	printf("%d",max+1);
//	int b[n+1][n+1];
//	for(i=0;i<=n;i++){
//		for(j=0;j<=n;j++){
//			b[i][j]=0;
//		}
//	} 
//	for(i=0;i<m;i++){
//		for(j=1;j<=a[i][0];j++){
//			for(k=1;k<=a[i][0];k++){
//				b[a[i][k]][a[i][j]] = 1;
//				b[a[i][j]][a[i][k]] = 1;
//			}
//		}
//	}
}
