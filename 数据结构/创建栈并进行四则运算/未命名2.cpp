#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define Maxsize 100
char panduan[7][7] = {{'>','>','<','<','<','>','>'},
					  {'>','>','<','<','<','>','>'},
					  {'>','>','>','>','<','>','>'},
					  {'>','>','>','>','<','>','>'},
					  {'<','<','<','<','<','=','x'},
					  {'>','>','>','>','x','>','>'},
					  {'<','<','<','<','<','x','='},
};
char fuhao[7] = {'+','-','*','/','(',')','#'};
typedef struct StackNodeInt{
	float data;
	StackNodeInt *next;
}StackNodeInt,*LinkStackInt;
typedef struct StackNodeChar{
	char data;
	StackNodeChar *next;
}StackNodeChar,*LinkStackChar;
void InitStack(LinkStackInt &S){
	S=NULL;
}
void InitStack(LinkStackChar &S){
	S=NULL;
}
void Push(LinkStackInt &S , float e){
	StackNodeInt *p = new StackNodeInt;
	p->data = e;
	p->next = S;
	S=p;
}
void Push(LinkStackChar &S , char e){
	StackNodeChar *p = new StackNodeChar;
	p->data = e;
	p->next = S;
	S=p;
}
float Pop(LinkStackInt &S){
	if(!S) return 0;
	float e = S->data;
	LinkStackInt p=S;
	S =S->next;
	delete p;
	return e;
}
char Pop(LinkStackChar &S){
	if(!S) return '0';
	char e = S->data;
	LinkStackChar p=S;
	S =S->next;
	delete p;
	return e;
}
float getPop(LinkStackInt &S){
	if(S) return S->data;
} 
char getPop(LinkStackChar &S){
	if(S) return S->data;
}
int Judge(char suanshi[]){
	int i,flag=1;
	LinkStackChar S;
	InitStack(S);
	for(i=0;i<Maxsize;i++){
		if(suanshi[i]=='#') break;
		switch (suanshi[i]){
			case '(' : Push(S,suanshi[i]);break;
			case ')' : if(Pop(S)!='('){
						 flag = 0;
						 break;}
			case '{' : Push(S,suanshi[i]);break;
			case '}' : if(Pop(S)!='{'){
						 flag = 0;
						 break;}
			case '[' : Push(S,suanshi[i]);break;
			case ']' : if(Pop(S)!='['){
						 flag = 0;
						 break;}
		}
		if(!flag) break;
	}
	if(S) flag = 0;
	return flag;
}
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
float In(char a){
	if (47<a&&a<58){
		int b = a-'0';
		return b;
	}
	else return 0;
}
float jisuan(float first,char yunsuanfu, float second){
	switch(yunsuanfu){
		case '+':return (first+second);
		case '-':return (first-second);
		case '*':return (first*second);
		case '/':return (first/second);
	}
}
float yunsuan(char suanshi[]){
	LinkStackInt S0;
	LinkStackChar S1;
	InitStack(S0);
	InitStack(S1);
	Push(S1,'#');
	int i =0;
	while(S1){
		if(In(suanshi[i])){
			Push(S0,In(suanshi[i]));
			i++;
		}
		else{
			switch(bijiao(getPop(S1),suanshi[i])){
				case '<': Push(S1,suanshi[i]);i++;break;
				case '>': Push(S0,jisuan(Pop(S0),Pop(S1),Pop(S0)));break;
				case '=': Pop(S1);i++;break;
			}
		}
	}
	return Pop(S0);
}
int main(){
	char suanshi[Maxsize];
	int i;
	for(i=0;i<Maxsize;i++){
		scanf("%c",&suanshi[i]);
		if(suanshi[i] == '#') break;
	}
	int flag = Judge(suanshi);
//	if(flag){
//		yunsuan
//	}
	if(!flag){
		printf("输入的式子有问题");
	}
	else{
		float a=yunsuan(suanshi);
		printf("答案为%.2f",a);
	} 
}
//int main(){
//	LinkStackChar S;
//	InitStack(S);
//	Push(S,'p');
//	char e;
//	e = Pop(S);
//	printf("%c",e);
//}

