#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define maxsize 100

typedef struct LNode{
	int L;
	LNode *next;
}; 
void print(LNode *p);
void initSqlist(LNode *p, int length){
	LNode *q;
	p->L = 0;
	LNode *L = p; 
	int i;
	if(!L){
		printf("申请空间出错");
		exit(0);
	}
	for(i=0;i<length;i++){
		q = (LNode*)malloc(sizeof(LNode));
		printf("请输入第%d个数据\n",i+1);
		scanf("%d",&q->L);
		L->next = q;
		L = L->next;
		p->L++;
	}
	L->next = NULL;
}
void push(LNode *p,int e){
	LNode *Q = new LNode;
	Q->L = e;
	Q->next = p;
	p = Q;
	print(p);
}
void print(LNode *p){
	LNode *L = p;
	while(L){
		printf("%d ",L->L);
		L=L->next;
	}
	printf("\n"); 
}
////最后插入 
//void insert1(LNode *p,int e){
//	LNode *L = p->next;
//	LNode *Q = new LNode;
//	Q->next = NULL;
//	Q->L = e; 
//	while(L->next){
//		L = L->next;
//	}
//	L->next = Q; 
//	p->L++;
//}
////插到那，这个数据就是第几个 
//void insert2(LNode *p,int e ,int weizhi){
//	if(weizhi>p->L+1||weizhi<=0){
//		printf("位置输入异常");
//		exit(0);
//	}
//	LNode *L = p;
//	LNode *Q = new LNode;
//	Q->L = e;
//	int i;
//	for(i=0;i<weizhi-1;i++){
//		L=L->next;
//	}
//	Q->next = L->next;
//	L->next = Q;
//	p->L++;
//}
////删除，从第几个开始包括他，删掉后面的k个，不包括第k+n个数据
//void deleteelem(LNode *p,int weizhi,int k ){
//	LNode *L = p;
//	int i;
//	if(weizhi>L->L||weizhi<=0){
//		printf("位置输入异常" );
//		exit(0);
//	}
//	if (weizhi+k>p->L){
//		for(i=0;i<weizhi-1;i++){
//			L=L->next;
//		}
//		L->next=NULL;
//	}
//	else{
//		for(i=0;i<weizhi-1;i++){
//			L = L->next;
//		}
//		LNode *Q = L;
//		for(i=0;i<k;i++){
//			Q = Q->next;
//		}
//		L->next = Q->next;
//		p->L = p->L - k;
//	}
//} 
void deleteelement(LNode *p){
	LNode *L = p->next;
	while(L->next){
		if(L->L==L->next->L){
			LNode *Q = L->next;
			L->next = L->next->next;
			free(Q);
		}
		else{
		L = L->next; 
		}
	}
} 
void nixuSqlist(LNode *p){
	if(p->L>=3){
		LNode *first=p->next;
		LNode *second=first->next;
		LNode *temp=second->next;
		first->next = NULL;
		while(temp){
			second->next = first;
			first = second;
			second = temp;
			temp = temp->next;
		}
		second->next = first;
		p->next = second;
	}
	else{
		LNode *first=p->next,*second=first->next;
		first->next=NULL;
		second->next = first;
		p->next = second;
	}
}
void maopaoSorted(LNode *p){
	LNode *L = p->next;
	int count=1,i,j;
	while(L->next){
		L = L->next;
		count++;
	}
	for(i=0;i<count-1;i++){
		L = p->next;
		LNode *Q = p;
		LNode *R = L->next;
		for(j=0;j<count-1-i;j++){
			if(R->L<L->L){
				Q->next = R;
				L->next = R->next;
				R->next = L;
				Q = Q->next;
				R=L->next;
			}
			else{
				R = R->next;
				L = L->next;
				Q = Q->next;
			}
		}
	}
}
int main(){
	LNode p;
	int a,b;
	initSqlist(&p,2);
	push(&p,5);
	print(&p);
	maopaoSorted(&p);
	print(&p);
	deleteelement(&p);
	print(&p);
//	insert1(&p,3);
//	print(&p);
//	printf("请输入需要插入的数据和位置\n");
//	scanf("%d %d",&a,&b);
//	insert2(&p,a,b);
//	print(&p);
////	printf("请输入需要从第几个数据开始删除k个数据\n");
////	scanf("%d %d",&a,&b);
////	deleteelem(&p,a,b);
////	print(&p);
	nixuSqlist(&p);
	print(&p);
}
