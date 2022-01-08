#include<stdio.h>
#include<stdlib.h>
int main(int argc,char *argv[]){
FILE *fp;
char string[81];
if((fp=fopen("argv.txt","r"))==NULL){
   printf("cannot open this file.\n");
   exit(0);
   }
   while(fgets(string,81,fp)!=NULL){
        printf("%s",string);
   }
    fclose(fp);
    return 0;
    }
