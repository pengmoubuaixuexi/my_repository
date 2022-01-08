
#include"stdio.h"
#include"stdlib.h"
int main()
{
    int k=0,i=2,j,flag,h,a;
    for(i=2;i<1000;i++){
            flag=1;
    for(j=2;j<=i/2;j++)
    if(i%j==0){
        flag=0;
        break;}
     if(!flag)
        k++;
    else
        k=0;
    if(k==10){
        a=i;
        i=i-8;
        for(h=0;h<=9;h++){
     printf("%d ",a+h-9);
        if(h==9)
            printf("\n");
    }}}}
