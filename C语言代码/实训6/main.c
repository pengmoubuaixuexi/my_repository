#include<stdio.h>
#include<stdlib.h>
#include<string.h>
FILE *Stu,*Stu1;
 typedef struct{
	int num;
	char name[10];
	float score[5];
	float ave;
} Student;
Student std1[3];
int count=4;
void DelyBySName(Student std[],char name[]){
	int i,j=0,k;
	for(i=0;i<4;i++){
		if(strcmp(name,std[i].name)==0){
			printf("%d\t%s\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t",std[i].num,std[i].name,std[i].score[0],std[i].score[1],std[i].score[2],std[i].score[3],std[i].score[4],std[i].ave);
				j++;
				for(k=0;k<i;k++){
					std1[k] = std[k];
				}
				for(k=i;k<count;k++){
					std1[k]=std[k+1];
				}
			}
		}
	if(j==0)
	printf("不存在该生成绩记录\n");
}
int main(){
	int i;
	Student std[4];
 	char name[10];
 	Stu=fopen("StudentGrade.dat","rb");
 	if(Stu==NULL){
 		printf("无法访问此文档");
	 }
	fread(&std[0],sizeof(Student),count,Stu);
	Stu1 = fopen("StudentGrade.dat","wb");
	while(strcmp(name,"q")!=0){
	printf("输入q结束程序\n");
	scanf("%s",name);
	DelyBySName(std,name);
	count--;
	fwrite(&std1[0],sizeof(Student),count,Stu1);
	}
	fclose(Stu);
	return 0;
}
