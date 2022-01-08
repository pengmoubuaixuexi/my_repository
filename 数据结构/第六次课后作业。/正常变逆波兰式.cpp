#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>
#define Maxsize 100
char panduan[8][8] = {{'>','>','<','<','<','>','>','<'},
					  {'>','>','<','<','<','>','>','<'},
					  {'>','>','>','>','<','>','>','<'},
					  {'>','>','>','>','<','>','>','<'},
					  {'<','<','<','<','<','=','x','<'},
					  {'>','>','>','>','x','>','>','<'},
					  {'<','<','<','<','<','x','=','<'},
					  {'>','>','>','>','<','>','>','<'}
					  
};
char fuhao[8] = {'+','-','*','/','(',')','#','^'};
char bijiao(char zhannei,char zhanwai){
	int i,j;
	for(i=0;i<7;i++){
		if(fuhao[i]==zhannei) break;
	}
	for(j=0;j<7;j++){
		if(fuhao[j]==zhanwai) break;
	}
	return panduan[i][j];
}
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
float In(char a){
	if (47<a&&a<58){
		int b = a-'0';
		return b;
	}
	else return -1;//һ��ʼѡ��return 0 �������ں�������ʵ�����ܴ���30,�������ĵ����ж��������ִ��� 
}

void zhuanhuan(char suanshi[]){
	LinkStackChar S;
	InitStack(S);
	Push(S,'#');
	int i=0;
	while(S){
		if((In(suanshi[i])+1)!=0){
			printf("%c",suanshi[i]);
			i++;
		}
		else{
			switch(bijiao(getPop(S),suanshi[i])){
				case '<': Push(S,suanshi[i]);i++;break;
				case '>': printf("%c",Pop(S));break;
				case '=': Pop(S);i++;break;
			}
		}
	}
} 
int main(){
	char suanshi[Maxsize];
	int i;
	for(i=0;i<Maxsize;i++){
		scanf("%c",&suanshi[i]);
		if(suanshi[i] == '#') break;//����һ����뵽��#��β�Ͳ��ù̶��Լ�Ҫ�������λ���ˡ� 
	}
	zhuanhuan(suanshi);	
}
