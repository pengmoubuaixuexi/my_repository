#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define Minsize -100
typedef struct LNode{
	float L;
	struct LNode *next;
}LNode,*LinkLNode; 
void initSqlist(LinkLNode &p, int length){
	LinkLNode q;
	p = new LNode;
	p->L = 0;
	LinkLNode L = p; 
	int i;
	if(!L){
		printf("����ռ����");
		exit(0);
	}
	for(i=0;i<length;i++){
		q = (LinkLNode)malloc(sizeof(LNode));
		printf("�������%d������\n",i+1);
		scanf("%f",&q->L);
		L->next = q;
		L = L->next;
		p->L++;
	}
	L->next = NULL;
}
void print(LinkLNode p){
	LinkLNode L = p->next;
	while(L){
		printf("%.2f ",L->L);
		L=L->next;
	}
	printf("\n"); 
}
float findmax(LinkLNode p){
	float max=0;
	if(p->next)
		max = findmax(p->next);
	if (max<p->L)
		max = p->L;
	return max;
} 
int qiunum(LinkLNode p){
	int num = 0;
	if(p->next)
		num = qiunum(p->next);
	num = num+1;
	return num;
} 
float qiusum(LinkLNode p){
	float sum=0;
	if(p->next)
		sum = qiusum(p->next);
	sum += p->L;
	return sum;
}
float qiuavg(LinkLNode p,int n){
	float avg =0;
	if(p->next)
		avg = qiuavg(p->next,n-1);
	avg = (avg*(n-1)+p->L)/n;
	return	avg;
} 
int main(){
	LinkLNode p;
	int length;
	printf("��������Ҫ��ͷ�������������\n");
	scanf("%d",&length);
	initSqlist(p,length);
	print(p);
	float max = findmax(p->next);//����ͷ����з�������ĳ��ȣ��������Ǵ�����������Ԫ��㿪ʼ������ֹ�������ȴ�������Ԫ�ض����µ����� 
	int num = qiunum(p->next);//�˴�ͬ������ֹ��ͷ���Ҳ���ϣ������Ҫ����ͷ�����Խ�nextȥ���� 
	float sum = qiusum(p->next);
	float avg = qiuavg(p->next,num);
	printf("max=%.2f\n",max);
	printf("num=%d\n",num); 
	printf("avg=%.2f/%d=%.2f",sum,num,avg);
	
}

