#include <stdio.h>
#include <string.h>
#include <stdlib.h>
typedef struct{
	char name[10];
	int score;
	char number[10];
	
}Student;
typedef struct List{
	Student Data;
	List* Next;
}list; 
List *Ptrl;
list* initList(){
	int i;
	list* p=(list*)malloc(sizeof(list));
	list* temp = p;
	for(i=0;i<2;i++){
		list* a=(list*)malloc(sizeof(list));
		a->Next=NULL;
		temp->Next = a;
		temp = temp->Next;
	}
	return p;
}
int main(){
	List *chuandi;
	char name[10];
	int score;
	char number[10];
	Ptrl = initList();
	chuandi = Ptrl;
	int i=0;
	while(1){
	i++;
	printf("请输入两个学生的信息\n");
	printf("请输入第%d个学生的姓名\n",i);
	scanf("%s",name);
	strcpy(chuandi->Data.name,name);
	printf("请输入第%d个学生的学号\n",i);
	scanf("%s",number);
	strcpy(chuandi->Data.number,number);
	printf("请输入第%d个学生的成绩\n",i);
	scanf("%d",&score);
	chuandi->Data.score=score;
	chuandi=chuandi->Next; 
	if(i==2) 
		break;
}
chuandi = Ptrl;//Ptel是用来储存链表头部，因为链表是单向的。 
i=0;
	while(chuandi->Next!=NULL){
	i++;
	chuandi=chuandi->Next;
	}//计算这个链表有多少个数据 
	int j;
	printf("学号\t姓名\t成绩\n"); 
	for(j=0;j<i;j++){
		printf("%s\t%s\t%d\n",Ptrl->Data.number,Ptrl->Data.name,Ptrl->Data.score);
		Ptrl=Ptrl->Next;
	}
	return 0;
}
//#include<stdio.h>
//#include<stdlib.h>
//#include<string.h>
//typedef struct {
//    int num;
//    char name[10];
//}student; 
//typedef struct{
//    student stu;
//    struct list* next;
//}list;
//int main(){
//    list* p;
//    p=(list*)malloc(sizeof(list));
//    p->next=NULL;
//    printf("请输入学生的姓名和学号\n");
//    strcpy(p->stu.name," 彭涛");
//    p->stu.num=201086;
//    while(p){
//        printf("%s %d",p->stu.name,p->stu.num);
//        p=p->next;
//    }
//}
