#include <stdio.h>
#include <stdlib.h>
#include <string.h>
FILE* Stu;
typedef struct{
	char num[10];
	char name[10];
	double score[5];
} Student;
Student std[4];
char* tostring(Student std){
	char s[100];
	sprintf(s,"%s/t%s/t%f/t%f/t%f/t%f/t%f/t%f\n",std.num,std.name,std.score[0],std.score[1],std.score[2],std.score[3],std.score[4]);
	return s;
}
int main(){
	int i;
	Stu = fopen("StudentGrade.txt","w");
	if(std==NULL){
		printf("无法创建文件");
	}
	fputs("学号/t名字/t第一科成绩/t第二科成绩/t第三科成绩/t第四科成绩/t第五科成绩\n",std);
	for(i=0;i<4;i++){
		scanf("%s %s %f %f %f %f %f %f",std[i].num,std[i].name,&std[i].score[0],&std[i].score[1],&std[i].score[2],&std[i].score[3],&std[i].score[4]);
	fputs(tostring(std[i]),Stu);
	}
	fclose(Stu);
	return 0;
}
