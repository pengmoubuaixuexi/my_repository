#include <stdio.h>
#include <stdlib.h>
#define elementType char 
typedef struct queue{
	elementType elem;
	struct queue* next;
}queue,*Linkqueue;
int count=0;
void initCqueue(Linkqueue &Q){
	Q = (Linkqueue)malloc(sizeof(Linkqueue));
	Q->next = Q;
	printf("队列置空成功\n");
}
int emptyqueue(Linkqueue &Q){//1代表是空 
	if(count!=0){
		if(Q->next == Q){
			printf("队列为空\n");
			return 1;
		}
		else{
			printf("队列不为空\n");
			return 0;
		}
	}
	else printf("您还未置空队列\n");
}
void inputelem(Linkqueue &Q){
	if(count!=0){
	printf("请输入你要入队列的元素\n");
	Linkqueue L = (Linkqueue)malloc(sizeof(Linkqueue));
	if (!L){
		printf("空间分配失败");
		exit(0);
	}
	scanf("%c",&L->elem);
	int c = getchar();
	printf("元素%c成功入队\n",L->elem);
	L->next = Q->next;
	Q->next = L; 
	Q = L;
	}
	else printf("您还未置空队列\n");
}
elementType outputelem(Linkqueue &Q){
	if(count!=0){
		if(emptyqueue(Q)){
			printf("出队失败\n");
			return '0';	
		} 
		elementType e = Q->next->next->elem;
		Linkqueue P = Q->next->next;
		if(Q->next->next!=Q) Q->next->next = P->next;
		else{
		Q->next->next = P->next;
		Q=P->next;
		}
		free(P);
		return e;
	}
	else printf("您还未置空队列\n");
}
void choose(Linkqueue &Q){
	char flag;
	printf("1.创建空队\n2.判断现有队列是否为空\n3.入队\n4.出队\n5.退出程序\n\n输入6刷新屏幕\n");
	scanf("%c",&flag);
	int c = getchar();
	switch(flag){
		case '1':{initCqueue(Q);count++;break;}
		case '2': emptyqueue(Q);break;
		case '3': inputelem(Q);break;
		case '4':{elementType e = outputelem(Q);if(e != '0'&&count!=0) printf("元素%c出队成功\n",e);break;}
		case '5': exit(0);break;
		case '6': system("cls");break;
	}
}
int main(){
	Linkqueue Q;
	while(1){
		choose(Q);
	}
}
