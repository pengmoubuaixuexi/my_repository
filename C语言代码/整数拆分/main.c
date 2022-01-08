#include <stdio.h>
#include <stdlib.h>

int f(int N,int M){
    if(N==0||N==1)
        return 1;
    if(M==0)
        return 0;
    if (M==1)
        return 1;{
    if(N>=M)
        return f(N,M/2)+f(N-M,M);//F(9,8)=F(9,4)+F(1,8);
    else
        return f(N,M/2);
}}
int main()
{
    int N,M=1,j;
    scanf("%d",&N);
        j=N;
    while(j>0){
        j=j/2;
        M=2*M;
    }
    int count = f(N,M/2);
    printf("%d %d",N,count);
}
