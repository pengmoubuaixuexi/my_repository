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
	printf("�����ÿճɹ�\n");
}
int emptyqueue(Linkqueue &Q){//1�����ǿ� 
	if(count!=0){
		if(Q->next == Q){
			printf("����Ϊ��\n");
			return 1;
		}
		else{
			printf("���в�Ϊ��\n");
			return 0;
		}
	}
	else printf("����δ�ÿն���\n");
}
void inputelem(Linkqueue &Q){
	if(count!=0){
	printf("��������Ҫ����е�Ԫ��\n");
	Linkqueue L = (Linkqueue)malloc(sizeof(Linkqueue));
	if (!L){
		printf("�ռ����ʧ��");
		exit(0);
	}
	scanf("%c",&L->elem);
	int c = getchar();
	printf("Ԫ��%c�ɹ����\n",L->elem);
	L->next = Q->next;
	Q->next = L; 
	Q = L;
	}
	else printf("����δ�ÿն���\n");
}
elementType outputelem(Linkqueue &Q){
	if(count!=0){
		if(emptyqueue(Q)){
			printf("����ʧ��\n");
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
	else printf("����δ�ÿն���\n");
}
void choose(Linkqueue &Q){
	char flag;
	printf("1.�����ն�\n2.�ж����ж����Ƿ�Ϊ��\n3.���\n4.����\n5.�˳�����\n\n����6ˢ����Ļ\n");
	scanf("%c",&flag);
	int c = getchar();
	switch(flag){
		case '1':{initCqueue(Q);count++;break;}
		case '2': emptyqueue(Q);break;
		case '3': inputelem(Q);break;
		case '4':{elementType e = outputelem(Q);if(e != '0'&&count!=0) printf("Ԫ��%c���ӳɹ�\n",e);break;}
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
