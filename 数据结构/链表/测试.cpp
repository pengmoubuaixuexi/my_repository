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
	printf("请输入学生的姓名和学号\n");
	scanf("%s %d",p->stu.name,&p->stu.num);
	while(p){
		printf("%s %d",p->stu.name,p->stu.num);
		p=p->next;
	}
} 
