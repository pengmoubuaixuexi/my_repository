#include <stdio.h>
#include <stdlib.h>
#include <string.h> 
typedef struct StackNodeChar{
	char data;
	StackNodeChar *next;
}StackNodeChar,*LinkStackChar;
void InitStack(LinkStackChar &S){
	S=NULL;
}
void Push(LinkStackChar &S , char e){
	StackNodeChar *p = new StackNodeChar;
	p->data = e;
	p->next = S;
	S=p;
}
char Pop(LinkStackChar &S){
	if(!S) return '0';
	char e = S->data;
	LinkStackChar p=S;
	S =S->next;
	delete p;
	return e;
}
char getPop(LinkStackChar &S){
	if(S) return S->data;
}
void judgehuiwen(char a[],int n){
	LinkStackChar S;
	InitStack(S);
	int j;
	for(j=(n+1)/2;j<n;j++){
		Push(S,a[j]);
	}
	int flag=0;
	for(j=0;j<n/2;j++){
		if(Pop(S)!=a[j]){
			flag++;
			break;
		}
	}
	if(flag==0){
		printf("是回文数");
	}
	else printf("不是回文数"); 
}
int main(){
	char a[100];
	int i;
	for(i=0;i<100;i++){
		scanf("%c",&a[i]);
		if(a[i]=='\n') break;
	}
	judgehuiwen(a,i);
} 
