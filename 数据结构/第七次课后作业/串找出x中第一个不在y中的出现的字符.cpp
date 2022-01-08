#include <stdio.h>
#include <stdlib.h>
#define maxsize 10000
typedef struct String{
	char a;
	struct String* next;
}*HString;
void initHString(HString &P){
	P = (HString)malloc(sizeof(HString));
	P->next = NULL; 
}
void inputHString(HString &P){
	int i;
	HString L = P;
	char temp;
	for(i=0;i<maxsize;i++){
		HString Q = (HString)malloc(sizeof(HString));
		scanf("%c",&temp);
		if(temp == '\n') break;
		Q->a = temp;
		L->next = Q;
		L = L->next;
	}
	L->next =NULL;
}
char findfirst(HString P, HString Q){
	P = P->next;
	HString Q1 = Q->next;
	int flag = 1;
	while(P->next){
		while(Q1){
			if(Q1->a == P->a){
				flag = 0;
				break;
			}
			Q1 = Q1->next;
		}
		if(flag==1) break;
		flag = 1;
		Q1 = Q->next;
		P = P->next;
	}
	return P->a;
} 
void print(HString P){
	HString Q = P->next;
	while(Q){
		printf("%c",Q->a);
		Q = Q->next;
	}
	printf("\n");
}
int main(){
	int i;
	HString P,Q;
	initHString(P);
	printf("请输入字符串x\n");
	inputHString(P);
	print(P);
	initHString(Q);
	printf("请输入字符串y\n");
	inputHString(Q);
	print(Q) ;
	printf("经过查找%c是第一个在x中不在y中的字符",findfirst(P,Q));
}

