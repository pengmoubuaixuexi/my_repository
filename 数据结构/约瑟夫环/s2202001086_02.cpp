#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define maxsize 100
 
typedef struct LNode{
	int L;
	int mingzi; 
	LNode *next;
};
int siwangxulie[40],index = 0 ; 
void initSqlist(LNode *p, int length); 
void print(LNode *p);
int popPeople(LNode *Q);
void detelepeople(LNode *p ,int n);
void initSqlist(LNode *p, int length){
	if(length<=0){
		printf("初始化长度异常");
		exit(0);
	}
	LNode *q;
	printf("请输入第1个人的爆炸数字\n");
	scanf("%d",&p->L);
	LNode *L = p;
	p->mingzi = 1; 
	int i;
	if(!L){
		printf("申请空间出错");
		exit(0);
	}
	for(i=1;i<length;i++){
		q = (LNode*)malloc(sizeof(LNode));
		printf("请输入第%d个人的爆炸数字\n",i+1);
		q->mingzi = i+1;
		scanf("%d",&q->L);
		L->next = q;
		L = L->next;
	}
	L->next = p;
}
void print(LNode *p){
	LNode *L = p;
	printf("%d ",L->L);
	L = L->next;
	while(L!=p){
		printf("%d ",L->L);
		L=L->next;
	}
	printf("\n"); 
}
int popPeople(LNode *Q){
	int temp,count=0,siwangderen;
	LNode *L = Q;
	LNode *M = Q;
	while(L->next!=Q){
		L=L->next;
		count++;
	}
	if(count==0||count==-1){
		siwangxulie[index] = Q->mingzi;
		return 0;
	}
	L->next = Q->next;
	siwangderen = Q->mingzi;
	siwangxulie[index] = siwangderen;
	index++;
	temp = Q->L;
	Q = Q->next;
	printf("这一轮自杀的是%d号位选手，他的爆炸数字为%d\n",siwangderen,temp);
	printf("幸存者且当前的顺序为\n");
	print(Q);
	return temp;
}
void detelepeople(LNode *p ,int n){
	int i;
	LNode *Q = p;
	if(n<=0){
		printf("选择自杀的人异常");
		exit(0);
	}
	for(i=0;i<n-1;i++){
		Q = Q->next;
	}
	//删除此时位置的Q，同时detelepeople（Q->next,popPeople(Q)） 
	int a =popPeople(Q);
	if(a>0) 
		detelepeople(Q->next,a);
}
int main(){
	LNode p;
	printf("请输入有多少人开始游戏\n");
	int n,m; 
	scanf("%d",&n);
	initSqlist(&p,n);
	print(&p);
	printf("这是当前的顺序的爆炸数字，请选择从第几个开始自杀\n");
	scanf("%d",&m);
	detelepeople(&p,m);
	printf("最终死亡顺序为\n");
	for(index=0;index<n-1;index++)
		printf("%d ",siwangxulie[index]);
	printf("%d",siwangxulie[index]);
}

