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
		printf("��ʼ�������쳣");
		exit(0);
	}
	LNode *q;
	printf("�������1���˵ı�ը����\n");
	scanf("%d",&p->L);
	LNode *L = p;
	p->mingzi = 1; 
	int i;
	if(!L){
		printf("����ռ����");
		exit(0);
	}
	for(i=1;i<length;i++){
		q = (LNode*)malloc(sizeof(LNode));
		printf("�������%d���˵ı�ը����\n",i+1);
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
	printf("��һ����ɱ����%d��λѡ�֣����ı�ը����Ϊ%d\n",siwangderen,temp);
	printf("�Ҵ����ҵ�ǰ��˳��Ϊ\n");
	print(Q);
	return temp;
}
void detelepeople(LNode *p ,int n){
	int i;
	LNode *Q = p;
	if(n<=0){
		printf("ѡ����ɱ�����쳣");
		exit(0);
	}
	for(i=0;i<n-1;i++){
		Q = Q->next;
	}
	//ɾ����ʱλ�õ�Q��ͬʱdetelepeople��Q->next,popPeople(Q)�� 
	int a =popPeople(Q);
	if(a>0) 
		detelepeople(Q->next,a);
}
int main(){
	LNode p;
	printf("�������ж����˿�ʼ��Ϸ\n");
	int n,m; 
	scanf("%d",&n);
	initSqlist(&p,n);
	print(&p);
	printf("���ǵ�ǰ��˳��ı�ը���֣���ѡ��ӵڼ�����ʼ��ɱ\n");
	scanf("%d",&m);
	detelepeople(&p,m);
	printf("��������˳��Ϊ\n");
	for(index=0;index<n-1;index++)
		printf("%d ",siwangxulie[index]);
	printf("%d",siwangxulie[index]);
}

