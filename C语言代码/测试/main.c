#include <stdio.h>
int main()
{
    int a,b,count=0;
    for(a=0;a<5;a++){
        for(b=0;b<5;b++){

        if(a+b==0)
        continue;
        else{
            count++;
        printf("%d\n",count);
        printf("%d+%d=%d\n",a,b,a+b);
}}}}
