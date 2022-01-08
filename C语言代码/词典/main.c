#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAXSIZE 10000
FILE *dic,*ord,*tran;
typedef struct {
    char dicvalue[10];
    char dickey[10];
}Diction;
void sortDic(Diction diction[],int size){
    int i,j,min;
    Diction bufdic;
    for(i=0;i<size-1;i++){
            min=i;
        for(j=i+1;j<size;j++){
            if(strcmp(diction[min].dickey,diction[j].dickey)>0){
                bufdic = diction[i];
                diction[i]=diction[j];
                diction[j] = bufdic;
            }
        }
    }
}
int findDic(Diction diction[],char* key,int size){
        int low=0,high =size-1,mid ;
        while(low<high){
                mid = (low+high)/2;
            if(strcmp(diction[mid].dickey,key)==0){
        		return mid;
    }		else if(strcmp(diction[mid].dickey,key)>0){
    			high=mid-1;
    }
    		else{
        		low=mid+1;
    }
            }
            return -1;
}
int main(){
    int i,d_n=1;
    char buf[81],bufkey[10];
    char c;
    Diction diction[MAXSIZE];
    dic = fopen("dic.txt","r");
    if(dic==NULL){
        printf("dic.txt文件不存在");
    }
    ord = fopen("ord.txt","r");
    if(dic==NULL){
        printf("ord.txt文件不存在");
    }
    tran = fopen("tran.txt","w+");
    if(dic==NULL){
        printf("tran.txt文件不能创建");
    }
    while(!feof(dic)){
        c = fgetc(dic);
        if(c=='\n'){
            d_n++;
    }}
    printf("d_n=%d\n",d_n);
    rewind(dic);
    for(i=0;i<d_n;i++){
            fgets(buf,81,dic);
        sscanf(buf, "%s %s" , diction[i].dicvalue,diction[i].dickey);
    }
    sortDic(diction,d_n);
    for(i=0;i<d_n;i++){
        printf("%s %s\n",diction[i].dicvalue,diction[i].dickey);
    }
    while(fscanf(ord,"%s",bufkey)==1){
        int c = findDic(diction,bufkey,d_n);
        printf("单词%s 位置在%d\n",bufkey,c+1);
        if(c != -1){
            fputs(diction[c].dicvalue,tran);
            fputc('\n',tran);
        }
        else
            fputs("eh\n",tran);
    }
    fclose(dic);
    fclose(ord);
    fclose(tran);
    return 0;
}
