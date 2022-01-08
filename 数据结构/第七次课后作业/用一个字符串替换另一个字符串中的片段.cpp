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
void strReplace(HString &P,HString Q, HString S){//��P���״γ��ֵ�Q������S���� 
	int i,flag=1;
	HString P1 = P;//L��Ϊ��P���󴫵ġ� 
	HString Q1 = Q;
	while(P1->next){
		if(P1->next->a == Q1->next->a){
			HString P2 = P1;//L2��ר��������������󴫵ġ��������ʦ���Ļ�˷���㷨�������������P2����P1�����ں󴫾Ͳ���Ҫ������ 
			while(Q1->next){
				P2 = P2->next;
				Q1 = Q1->next;
				if(Q1->next){
					if(P2->next->a!=Q1->next->a){//��flag����ʾ�Ƿ�������������������ڣ�����������˵����һ�����ַ���
													//û������flag=0��֮����滻����ȡ�������������flag=1����������һ�������� 
						flag = 0;
						break;
					}
				}
			}
			if(flag){
				HString S1 = S;
				while(S1->next){
					S1 = S1->next;
				}
				S1->next = P2->next;
				P1->next = S->next;
				break; 
			}
		}
		P1 = P1->next; 
		Q1 = Q;
		flag =1;
	}
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
	HString P,Q,S;
	initHString(P);
	printf("������ԭ�����ַ���\n");
	inputHString(P);
	print(P);
	initHString(Q);
	printf("������Ҫ���滻���ַ���\n");
	inputHString(Q);
	initHString(S);
	printf("������Ҫ�滻�ɵ��ַ���\n");
	inputHString(S);
	strReplace(P,Q,S);
	printf("�������滻��֮�����ַ���\n");
	print(P);
}

