#include <stdio.h>
#include <stdlib.h>//���а���system����
#include <conio.h>//������ͨ������̨���� �������� ����������ĺ�������getch������
#include <string.h>//�����ַ�����
#include <math.h>
#define LEN sizeof(struct book)//�й�ͼ����Ϣ�Ľṹ��
#define LEN1 sizeof(struct reader)//�йض�����Ϣ�Ľṹ��
#define LEN2 sizeof(struct land)//�йص�¼ϵͳ�Ľṹ��


struct book//ͼ����Ϣ
{
	char num[20],nam[20],aut[20],pub[20],cat[20];//��ţ����������ߣ������磬����
	int  many;//�����
	float price;//����
	//struct book*next;
};

struct reader//���߽�����Ϣ
{
	int jnum;
	char jnam[20],time[20],tsnam[20];
	struct reader *next;
};
struct land//��¼��Ϣ
{
	int zhanghao;
	char password[20];
	struct land*next;
};
void loginInterface();
void loginmain();
void mainmenu();
void bookmain();
void bookmenu();
void readermain();
void readermenu();
int numofbooks();
void loginInterface()//��ʾ��¼�˵�
{
printf("\t\t           ��ӭ������ߵ�¼ϵͳ\n");
printf("\t\t**************************************************\n");//57-10 15-61
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**     1.��¼ϵͳ;                               **\n");
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**     2.�����˺�;                               **\n");
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**     3.�޸�����;                               **\n");
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**     �밴��ѡ�񣬻س�ȷ����                     **\n");
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**************************************************\n");
return ;
}
void loginmain(){
    loginInterface();
    int n;
    scanf("%d",n);
    switch(n){
    case1: bookmain();break;
    case2: creatAccount();break;
    case3: changePassword();break;
    }
}
int numofbooks(){
    FILE *fp;
    char c;
    int rows=0;
    fp=fopen("library.txt","rt");
    if(fp==NULL){
        printf("�޷����ʸ��ļ�");
    }
    while(!feof(fp)){
        c=fgetc(fp);
        if(c=='\n'){
            rows++;
        }
    }
    return rows;
}
void mainmenu(){//���˵�
    int i;
system ("cls");
printf("\t\t**************************************************\n");//57-10 15-61
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**     1.ͼ��ϵͳ;                               **\n");
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**     2.����ϵͳ;                               **\n");
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**     3.�˳�ϵͳ;                               **\n");
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**     �밴��ѡ�񣬻س�ȷ����                     **\n");
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**************************************************\n");
return ;
}
void bookmain(){
    int n;
    bookmenu();
    scanf("%d",&n);
    switch(n){
    case 3:printf("���˳�ϵͳ");break;
    case 1:bookmenu();break;
    case 2:readermenu();break;
    }
}
int main(){
mainmenu();}

