#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define SElemType int
#define Error 0
typedef struct{
int top[2],bot[2];                      //ջ����ջ��ָ��
SElemType *V;                          //ջ����
int m = 20;                                //ջ��������Ԫ�ظ���
}DblStack;
void init(DblStack &S){
	S.V = new SElemType[S.m];
	S.top[0] = S.bot[0] = -1;
	S.top[1] = S.bot[1] = S.m;
} 
int isEmpty(DblStack &S,int zhan){
	int flag=0;
	if(zhan==0){
		if(S.top[0]==-1){
			printf("0��ջΪ��ջ\n"); 
			flag=1;
		}
	}
	if(zhan==1){
		if(S.top[1]==S.m){
			printf("1��ջΪ��ջ\n");
			flag=1;
		}
	}
	return flag;
}
int isFull(DblStack &S){
	int flag = 0;
	if(S.top[0]==S.top[1]){
		printf("ջ��\n");
		return 1;
	}
	else return 0;
} 
void push(DblStack &S,int zhan,SElemType e){
	if(isFull(S)) ;
	else{ 
		if(zhan==0){
			S.V[++S.top[0]] = e;
		}
		else if(zhan==1){
			S.V[--S.top[1]] = e;
		}
		else printf("�����ջ������\n"); 
	} 
}
SElemType pop(DblStack &S,int zhan){
	if(zhan==0||zhan==1){
		if(isEmpty(S,zhan)){
			printf("%d��ջΪ�գ��޷�popԪ��\n",zhan);
			return Error;
		}
		else{
			if(zhan==0) return S.V[S.top[0]--];
			else return S.V[S.top[1]++];
		}
	}
	else{
		printf("û�д�ջ\n");
		return Error; 
	} 
} 
int main(){
	DblStack S;
	init(S);
	isEmpty(S,0);
	isEmpty(S,1);
//	push(S,0,5);
//	push(S,1,5);
//	push(S,0,5);
//	push(S,1,5);
//	push(S,0,5);
//	push(S,0,5);
//	push(S,1,5);
//	push(S,0,5);
//	push(S,1,5);
//	push(S,0,5);
//	push(S,1,5);
//	push(S,0,5);
//	push(S,1,5);
//	push(S,0,5);
//	push(S,1,5);
//	push(S,0,5);
//	push(S,1,5);
//	push(S,0,5);
//	push(S,1,5);
//	push(S,0,5);
//	push(S,1,5);
//	push(S,0,5);
//	push(S,1,5);
//	isFull(S);
//	push(S,1,5);
}
