#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct student{
	int num;
	char name[10];
}; 
struct list{
	student stu;
	list* next;
};
int main(){
	list* p;
//	p=(list*)malloc(sizeof(list));
	p->next=NULL;
	printf("������ѧ����������ѧ��\n");
	scanf("%s %d",p->stu.name,&p->stu.num);
	while(p){
		printf("%s %d",p->stu.name,p->stu.num);
		p=p->next;
	}
} 
