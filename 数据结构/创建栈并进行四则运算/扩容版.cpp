#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>
#define Maxsize 100
//by 彭涛。 此版本适合幂运算及实数运算，变量计算器不想弄了。 
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
						 break;//一开始忘记这里要break，因为看到if里有个break就疏忽了，导致debug了好久 
			case '^' : if((((In(suanshi[i-1])+1)==0)&&(suanshi[i-1]!=')'))&&(((In(suanshi[i+1])+1)==0)&&(suanshi[i+1]!='('))){//任何一个出错代表有错。 
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
	else return -1;//一开始选择return 0 ，但是在后来出现实数可能存在30,，这样的导致判断条件出现错误。 
}
float jisuan(float first,char yunsuanfu, float second){
	switch(yunsuanfu){
		case '+':return (first+second);
		case '-':return (first-second);
		case '*':return (first*second);
		case '/': if (second==0) return 0;
				else return (first/second);//如果second=0答案为inf，无穷，导致存在出现1#j这种乱码，所以特别定义 
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
	if(i==j) j1 = j+1;//用于判断是否有减去小数点所占位次，不考虑会导致整数或者小数出现位次偏差。 
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
int main(){
	char suanshi[Maxsize];
	int i;
	for(i=0;i<Maxsize;i++){
		scanf("%c",&suanshi[i]);
		if(suanshi[i] == '#') break;//想了一会才想到以#结尾就不用固定自己要输入多少位数了。 
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

