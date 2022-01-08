#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define maxsize 100

typedef struct Sqlist{
	int *L;
	int length;
}; 
void initSqlist(Sqlist *p, int length){
	p->L = (int *)malloc(maxsize*sizeof(int));
	if(!p->L){
		printf("����ռ����");
		exit(0); 
	}
	int *Q = p->L;
	int i;
	for(i=0;i<length;i++){
		printf("�������%d�����ݵĻ���Ԫ��\n",i+1) ;
		scanf("%d",Q++);
	}
	p->length = length;
} 
void print(Sqlist *p){
	int i;
	int *Q = p->L;
	for(i=0;i<p->length;i++){
		printf("%d ",*(Q++));
	}
	printf("\n");
}
//���������Ƿǵݼ���˳�������С��
void insert(Sqlist *p,int e){
	int i,j;
	for(i=0;i<p->length;i++){
		if (i==p->length-1){
			p->L[p->length] = e;
		}
		if (e>=p->L[i]&&e<=p->L[i+1]){
			for(j=p->length;j>i+1;j--){
				p->L[j] = p->L[j-1];
			}
			p->L[i+1] = e;
			break; 
		}
	}
	p->length++;
} 
//������� 
void insert1(Sqlist *p,int e){
	if(p->length == maxsize){
		printf("�ռ�����쳣");
		exit(0);
	}
	p->L[p->length] = e;
	p->length++;
}
// �����λ�ò�,��������e���ǵڼ���Ԫ�� 
void insert2(Sqlist *p,int e,int weizhi){
	if(weizhi>=p->length||weizhi<=0){
		printf("λ�������쳣");
		exit(0);
	}
	if(p->length == maxsize){
		printf("�ռ�����쳣");
		exit(0);
	}
	int temp,i;
	temp = p->L[weizhi-1];
	for(i=p->length;i>=weizhi;i--){
		p->L[i] = p->L[i-1];
	}
	p->L[weizhi-1] = e;
	p->length++;
} 
int main(){
	Sqlist p;
	int length = 5,a,b;
	initSqlist(&p,length);
	print(&p);
	insert(&p,3);
	print(&p);
	insert1(&p,4);
	print(&p);
	printf("��������Ҫ��������ݼ�λ��\n");
	scanf("%d %d",&a,&b);
	insert2(&p,a,b);
	print(&p);
//2.0	printf("��������Ҫ�ӵڼ������ݿ�ʼɾ��������\n");
//	scanf("%d %d",&a,&b);
//	deleteelem(&p,a,b);
//	print(&p);
//3.0	nixuSqlist(&p);
//	print(&p);
}
