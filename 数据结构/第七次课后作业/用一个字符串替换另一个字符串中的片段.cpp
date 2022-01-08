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
void strReplace(HString &P,HString Q, HString S){//将P中首次出现的Q串换成S串。 
	int i,flag=1;
	HString P1 = P;//L是为了P往后传的。 
	HString Q1 = Q;
	while(P1->next){
		if(P1->next->a == Q1->next->a){
			HString P2 = P1;//L2是专门用于适配后往后传的。这就是老师讲的回朔的算法，不过另设变量P2代表P1，用于后传就不需要回溯了 
			while(Q1->next){
				P2 = P2->next;
				Q1 = Q1->next;
				if(Q1->next){
					if(P2->next->a!=Q1->next->a){//用flag来表示是否完整的做完了这个周期，完整做完了说明有一样的字符串
													//没有则令flag=0，之后的替换工作取消，且在最后令flag=1，重新往下一个继续， 
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
	printf("请输入原来的字符串\n");
	inputHString(P);
	print(P);
	initHString(Q);
	printf("请输入要被替换的字符串\n");
	inputHString(Q);
	initHString(S);
	printf("请输入要替换成的字符串\n");
	inputHString(S);
	strReplace(P,Q,S);
	printf("下面是替换了之后后的字符串\n");
	print(P);
}

