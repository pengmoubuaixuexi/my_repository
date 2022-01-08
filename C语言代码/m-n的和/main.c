#include <stdio.h>
#include <stdlib.h>
int sum(int a,int b);
int main()
{
    int m,n;

    scanf("%d %d",&m,&n);
    printf("sum=%d\n",sum(m,n));
}

int sum(int a,int b)
{
    int c,d=0;
 if(a<b){
    for(c=a;c<=b;c++)
        d=d+c;}
        if(a>b){
 for(c=b;c<=a;c++)
        d=d+c;}
    return d;
    }
