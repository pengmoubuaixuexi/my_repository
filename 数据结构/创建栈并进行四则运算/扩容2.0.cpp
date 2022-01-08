#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>
#define Maxsize 100
//by ���Ρ� �˰汾�ʺ������㼰ʵ�����㣬��������������Ū�ˡ� 
//+ - * / ( ) #
char panduan[8][8] = {{'>','>','<','<','<','>','>','<'},
					  {'>','>','<','<','<','>','>','<'},
					  {'>','>','>','>','<','>','>','<'},
					  {'>','>','>','>','<','>','>','<'},
					  {'<','<','<','<','<','=','x','<'},
					  {'>','>','>','>','x','>','>','<'},
					  {'<','<','<','<','<','x','=','<'},
					  {'>','>','>','>','<','>','>','<'}
					  
};
float daan = 0;
char fuhao[8] = {'+','-','*','/','(',')','#','^'};
int Judge(char suanshi[]);
char bijiao(char zhannei,char zhanwai);
float jisuan(float first,char yunsuanfu, float second);
float In(char a);
int cha(int &i);
float yunsuan(char suanshi[]);
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
						 break;
			case '{' : Push(S,suanshi[i]);break;
			case '}' : if(Pop(S)!='{'){
						 flag = 0;
						 break;}
						 break;
			case '[' : Push(S,suanshi[i]);break;
			case ']' : if(Pop(S)!='['){
						 flag = 0;
						 break;}
						 break;//һ��ʼ��������Ҫbreak����Ϊ����if���и�break������ˣ�����debug�˺þ� 
			case '^' : if((((In(suanshi[i-1])+1)==0)&&(suanshi[i-1]!=')'))&&(((In(suanshi[i+1])+1)==0)&&(suanshi[i+1]!='('))){//�κ�һ����������д� 
						flag = 0;
						break;
			}
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
	else return -1;//һ��ʼѡ��return 0 �������ں�������ʵ�����ܴ���30,�������ĵ����ж��������ִ��� 
}
float jisuan(float first,char yunsuanfu, float second){
	switch(yunsuanfu){
		case '+':return (first+second);
		case '-':return (first-second);
		case '*':return (first*second);
		case '/': if (second==0) return 0;
				else return (first/second);//���second=0��Ϊinf��������´��ڳ���1#j�������룬�����ر��� 
		case '^':return pow(first,second);
	}
}
float cha(char suanshi[],int &j,int &i){
	int flag = j,k,flag1=1;
	float sum=0,sum1=0,sum2=0;
	if(((In(suanshi[i])+1)!=0||suanshi[i]=='.')&&((In(suanshi[i+1])+1)!=0||suanshi[i+1]=='.')){
		if(suanshi[i]=='.') flag1 = 0;
		if(flag1==1&&j==i) j++;
		i++;
		cha(suanshi,j,i);
	}
	int j1;
	if(i==j) j1 = j+1;//�����ж��Ƿ��м�ȥС������ռλ�Σ������ǻᵼ����������С������λ��ƫ� 
	else j1=j;
		for(k=flag;k<j1;k++){
			sum1 = 10*sum1 +In(suanshi[k]);
		}
	for(k=i;k>j;k--){
		sum2 = 0.1*sum2 +In(suanshi[k])*0.1;
	}
	sum = sum1+sum2;
	return sum;
}
float yunsuan(char suanshi[]){
	LinkStackInt S0;
	LinkStackChar S1;
	InitStack(S0);
	InitStack(S1);
	Push(S1,'#');
	int i =0,j;
	while(S1){
		j=i;
		if(((In(suanshi[i])+1)!=0)&&((In(suanshi[i+1])+1)==0&&suanshi[i+1]!='.')){
			Push(S0,In(suanshi[i]));
			i++;
		}
		else if ((In(suanshi[i])+1)!=0&&((In(suanshi[i+1])+1)!=0||suanshi[i+1]=='.')){
			Push(S0,cha(suanshi,j,i));
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
void yemian(char suanshi[],int num){
	system("cls");
	int i,j,k,flag=1;
	for(i=0;i<1;i++){
		for(j=0;j<20;j++)
		printf(" ");
		for(j=0;j<40;j++)
		printf("*");
		printf("\n");
	}
	for(i=0;i<20;i++){
		printf(" ");
	}
		printf("**************��Ȩ������ĳ**************");
		printf("\n");
	for(i=0;i<20;i++){
		printf(" ");
	}
		printf("****************����ؾ�****************");
		printf("\n");
	for(i=0;i<1;i++){
		for(j=0;j<20;j++)
		printf(" ");
		for(j=0;j<40;j++)
		printf("*");
		printf("\n");
	}
	for(i=0;i<1;i++){
		for(j=0;j<20;j++)
			printf(" ");
		for(j=0;j<4;j++)
			printf("*");
		for(j=0;j<32;j++)
			printf(" ");
		printf("****");
		printf("\n");
	}
	for(j=0;j<20;j++)
		printf(" ");
	printf("****   ");
	for(k=0;k<num;k++){
		if(suanshi[k]=='#') break;
			printf("%c",suanshi[k]);
	}
	if (daan!=0){
		printf("=%.2f",daan);
		for(k=0;k<10;k++){
			daan=daan/10;
			if((daan)<1) break;
		}
		k = k+5;
	}
	for(i=0;i<40-num-11-k;i++)
	printf(" ");
	printf("****\n");
		for(i=0;i<1;i++){
		for(j=0;j<20;j++)
			printf(" ");
		for(j=0;j<4;j++)
			printf("*");
		for(j=0;j<32;j++)
			printf(" ");
		printf("****");
		printf("\n");
	}
	for(i=0;i<2;i++){
		for(j=0;j<20;j++)
		printf(" ");
		for(j=0;j<40;j++)
		printf("*");
		printf("\n");
	}
	printf("                    ** _____   _____   _____              **                    ");
	printf("                    **     /   |   |  |    |      ��      **                    ");
	printf("                    **	  /    |___|  |____|   ________   **                    ");
	printf("                    **	 /     |   |       |              **                    ");    
	printf("                    **  /      |___|   ____|      ��      **                    ");
	printf("                    **         _____   _____              **                    ");
	printf("                    ** |    |  |       |        �v    �u  **                    ");
	printf("                    ** |____|  |____   |____      �v�u    **                    ");
	printf("                    **	    |       |  |    |     �u�v    **                    ");    
	printf("                    **      |  _____|  |____|   �u |  �v  **                    ");
	printf("                    **         _____   _____     __|__    **                    ");
	printf("                    **   |         |        |      |      **                    ");
	printf("                    **	 |     ____|   _____|      |      **                    ");    
	printf("                    **   |    |             |    ______   **                    ");
	printf("                    **   |    |_____   _____|             **                    ");
	for(i=0;i<1;i++){
	for(j=0;j<20;j++)
	printf(" ");
	for(j=0;j<40;j++)
	printf("*");
	printf("\n");
	}
}
int main(){
	system("color 0A");
	char suanshi[Maxsize];
	int i,flag=0;
	yemian(suanshi,i);
	while(1){
		if(flag!=0) i = getchar();
		for(i=0;i<Maxsize;i++){
			scanf("%c",&suanshi[i]);
			if(suanshi[i] == '#') break;//����һ����뵽��#��β�Ͳ��ù̶��Լ�Ҫ�������λ���ˡ� 
		}
		flag = Judge(suanshi);
		if(!flag){
			printf("�����ʽ��������");
		}
		else{
			daan=yunsuan(suanshi);
		}
		yemian(suanshi,i);
	}
}
