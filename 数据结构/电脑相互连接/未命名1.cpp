#include <stdio.h>
#include <stdlib.h>
void init(int S[],int n){
	int i;
	for(i=0;i<n;i++){
		S[i] = -1;
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
void Input_connection(int S[]){
	int u,v;
	int root1,root2;
	scanf("%d %d",&u,&v);
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
	int S[100];
	int n;
	char in;
	scanf("%d",&n);
	init(S,n);
	do{	
		scanf("%c",&in);
		switch(in)
		{
		case 'I': Input_connection(S);break;
		case 'C': check_connection(S);break;
		case 'S': check_network(S,n);break;
		}
	}while( in !='S');
	return 0;
}
