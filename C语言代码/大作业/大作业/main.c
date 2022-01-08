#include <stdio.h>
#include <stdlib.h>//其中包含system函数
#include <conio.h>//定义了通过控制台进行 数据输入 和数据输出的函数，如getch函数。
#include <string.h>//定义字符数组
#include <math.h>
#define LEN sizeof(struct book)//有关图书信息的结构体
#define LEN1 sizeof(struct reader)//有关读者信息的结构体
#define LEN2 sizeof(struct land)//有关登录系统的结构体


struct book//图书信息
{
	char num[20],nam[20],aut[20],pub[20],cat[20];//书号，书名，作者，出版社，种类
	int  many;//库存量
	float price;//单价
	//struct book*next;
};

struct reader//读者借阅信息
{
	int jnum;
	char jnam[20],time[20],tsnam[20];
	struct reader *next;
};
struct land//登录信息
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
void loginInterface()//显示登录菜单
{
printf("\t\t           欢迎进入读者登录系统\n");
printf("\t\t**************************************************\n");//57-10 15-61
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**     1.登录系统;                               **\n");
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**     2.创建账号;                               **\n");
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**     3.修改密码;                               **\n");
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**     请按键选择，回车确定。                     **\n");
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
        printf("无法访问该文件");
    }
    while(!feof(fp)){
        c=fgetc(fp);
        if(c=='\n'){
            rows++;
        }
    }
    return rows;
}
void mainmenu(){//主菜单
    int i;
system ("cls");
printf("\t\t**************************************************\n");//57-10 15-61
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**     1.图书系统;                               **\n");
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**     2.借阅系统;                               **\n");
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**     3.退出系统;                               **\n");
for(i=0;i<2;i++){
    printf("\t\t**                                              **\n");
}
printf("\t\t**     请按键选择，回车确定。                     **\n");
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
    case 3:printf("已退出系统");break;
    case 1:bookmenu();break;
    case 2:readermenu();break;
    }
}
int main(){
mainmenu();}

